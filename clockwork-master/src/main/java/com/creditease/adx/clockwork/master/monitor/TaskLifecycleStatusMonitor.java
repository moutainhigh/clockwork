/*-
 *  
 * Clockwork
 *  
 * Copyright (C) 2019 - 2020 adx
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  
 */

package com.creditease.adx.clockwork.master.monitor;

import com.creditease.adx.clockwork.client.service.LockRecordClientService;
import com.creditease.adx.clockwork.client.service.TaskOperationClientService;
import com.creditease.adx.clockwork.common.enums.NodeType;
import com.creditease.adx.clockwork.common.enums.TaskSource;
import com.creditease.adx.clockwork.common.enums.UniqueValueRecordType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 处理状态是 failed 的作业
 *
 * @ Author     ：XuanDongTang
 * @ Date       ：Created in 17:58 2019-09-29
 * @ Description：
 * @ Modified By：
 */
@Service
public class TaskLifecycleStatusMonitor {

    private static final Logger LOG = LoggerFactory.getLogger(TaskLifecycleStatusMonitor.class);

    @Resource(name = "taskOperationClientService")
    private TaskOperationClientService taskOperationClientService;

    @Resource(name = "lockRecordClientService")
    private LockRecordClientService lockRecordClientService;

    @Value("${spring.cloud.client.ipAddress}")
    protected String nodeIp;

    @Value("${server.port}")
    protected String nodePort;

    /**
     * 处理失败的作业
     */
    @Scheduled(cron = "${monitor.task.life.cycle.cron.exp}")
    public void resetLifecycleStatusMonitor() {
        try {
            LOG.info("[TaskFailedMonitor-resetLifecycleStatusMonitor] start ...");

            // 获取执行权限
            boolean toResetLifeCycleStatus = lockRecordClientService.getLockAndRecord(
                    UniqueValueRecordType.MASTER_LIFECYCLE_MONITOR.getValue(), nodeIp, Integer.parseInt(nodePort));

            if (!toResetLifeCycleStatus) {
                LOG.debug("[TaskFailedMonitor-resetLifecycleStatusMonitor]The current thread authority {}.", false);
                return;
            }

            boolean result = taskOperationClientService.resetTaskLifecycleStatusBySource(TaskSource.DDS_2.getValue());
            if (result) {
                LOG.info("[TaskFailedMonitor-resetLifecycleStatusMonitor] result = true");
            } else {
                LOG.error("[TaskFailedMonitor-resetLifecycleStatusMonitor] result = false");
            }

        } catch (Exception e) {
            LOG.error("[TaskFailedMonitor-resetLifecycleStatusMonitor]", e);
        } finally {
            LOG.info("[TaskFailedMonitor-resetLifecycleStatusMonitor] end.");
        }
    }

}
