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

package com.creditease.adx.clockwork.api.service.impl;

import com.creditease.adx.clockwork.api.service.ITaskService;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTask;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskDependencyScript;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskDependencyScriptExample;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskExample;
import com.creditease.adx.clockwork.common.enums.TaskDelayStatus;
import com.creditease.adx.clockwork.common.enums.TaskStatus;
import com.creditease.adx.clockwork.common.enums.TaskTakeEffectStatus;
import com.creditease.adx.clockwork.common.enums.TaskTriggerModel;
import com.creditease.adx.clockwork.common.pojo.TbClockworkTask4PagePojo;
import com.creditease.adx.clockwork.common.pojo.TbClockworkTaskPojo;
import com.creditease.adx.clockwork.common.util.PojoUtil;
import com.creditease.adx.clockwork.common.util.StringUtil;
import com.creditease.adx.clockwork.dao.mapper.TaskMapper;
import com.creditease.adx.clockwork.dao.mapper.clockwork.TbClockworkTaskDependencyScriptMapper;
import com.creditease.adx.clockwork.dao.mapper.clockwork.TbClockworkTaskMapper;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "taskService")
public class TaskService implements ITaskService {

    private static final Logger LOG = LoggerFactory.getLogger(TaskService.class);

    @Autowired
    private TbClockworkTaskMapper tbClockworkTaskMapper;

    @Autowired
    private TaskMapper taskMapper;

    @Autowired
    private TbClockworkTaskDependencyScriptMapper tbClockworkTaskDependencyScriptMapper;

    @Override
    public TbClockworkTaskMapper getMapper() {
        return this.tbClockworkTaskMapper;
    }

    /**
     * 获得任务运行需要替换的脚本文件信息
     *
     * @param taskId
     * @return
     */
    @Override
    public List<TbClockworkTaskDependencyScript> getDependencyScriptFileByTaskId(Integer taskId) {
        TbClockworkTaskDependencyScriptExample example = new TbClockworkTaskDependencyScriptExample();
        example.createCriteria().andTaskIdEqualTo(taskId);
        return tbClockworkTaskDependencyScriptMapper.selectByExample(example);
    }

    /**
     * 获取任务，根据taskStatusList
     *
     * @param statusList status list
     * @return
     */
    @Override
    public List<TbClockworkTaskPojo> getTaskListByStatusList(List<String> statusList) {
        TbClockworkTaskExample example = new TbClockworkTaskExample();
        example.createCriteria().andStatusIn(statusList).andOnlineEqualTo(TaskTakeEffectStatus.ONLINE.getValue());
        List<TbClockworkTask> TbClockworkTasks = tbClockworkTaskMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(TbClockworkTasks)) {
            return null;
        }
        return PojoUtil.convertList(TbClockworkTasks, TbClockworkTaskPojo.class);
    }

    @Override
    public List<TbClockworkTask> getTbClockworkTasksByIds(List<Integer> ids) {
        TbClockworkTaskExample TbClockworkTaskExample = new TbClockworkTaskExample();
        TbClockworkTaskExample.createCriteria().andIdIn(ids).andOnlineEqualTo(TaskTakeEffectStatus.ONLINE.getValue());
        List<TbClockworkTask> TbClockworkTasks = tbClockworkTaskMapper.selectByExample(TbClockworkTaskExample);
        if (CollectionUtils.isEmpty(TbClockworkTasks)) {
            return null;
        }
        return TbClockworkTasks;
    }

    /**
     * 根据主键查询Task
     *
     * @param taskId id
     */
    @Override
    public TbClockworkTaskPojo getTaskById(Integer taskId) {
        TbClockworkTask TbClockworkTask = tbClockworkTaskMapper.selectByPrimaryKey(taskId);
        if (TbClockworkTask != null) {
            return PojoUtil.convert(TbClockworkTask, TbClockworkTaskPojo.class);
        }
        LOG.error("[TaskService]getTaskById return is null. taskId = {}", taskId);
        return null;
    }

    /**
     * 根据name查询Task
     *
     * @param name name
     */
    @Override
    public TbClockworkTaskPojo getTaskByName(String name) {
        TbClockworkTaskExample example = new TbClockworkTaskExample();
        example.createCriteria().andNameEqualTo(name);
        example.setLimitStart(0);
        example.setLimitEnd(1);
        List<TbClockworkTask> tbClockworkTasks = tbClockworkTaskMapper.selectByExample(example);
        if (tbClockworkTasks != null && tbClockworkTasks.size() == 1) {
            return PojoUtil.convert(tbClockworkTasks.get(0), TbClockworkTaskPojo.class);
        }
        LOG.error("[TaskService]getTaskByName return is null. name = {}", name);
        return null;
    }

    /**
     * 根据状态查询task
     *
     * @param status task status
     */
    @Override
    public List<TbClockworkTaskPojo> getTaskByStatus(String status) {
        TbClockworkTaskExample example = new TbClockworkTaskExample();
        example.createCriteria().andStatusEqualTo(status);

        // 如果是enable 则需要算上成功的
        if (TaskStatus.ENABLE.getValue().equalsIgnoreCase(status)) {
            ArrayList<String> list = new ArrayList<>();
            list.add(status);
            list.add(TaskStatus.SUCCESS.getValue());

            example = new TbClockworkTaskExample();
            example.createCriteria().andStatusIn(list);
        }

        List<TbClockworkTask> tbClockworkTasks = tbClockworkTaskMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(tbClockworkTasks)) {
            LOG.info("getTaskByStatus, tbClockworkTasks.size = {}", tbClockworkTasks.size());
            return PojoUtil.convertList(tbClockworkTasks, TbClockworkTaskPojo.class);
        }
        return null;
    }

    /**
     * 根据状态查询online task
     *
     * @param status task status
     */
    @Override
    public List<TbClockworkTaskPojo> getTaskOnlineByStatus(String status) {
        TbClockworkTaskExample example = new TbClockworkTaskExample();
        example.createCriteria().andOnlineEqualTo(true).andStatusEqualTo(status);
        List<TbClockworkTask> tbClockworkTasks = tbClockworkTaskMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(tbClockworkTasks)) {
            LOG.info("getTaskOnlineByStatus, status = {}, tbClockworkTasks.size = {}", status, tbClockworkTasks.size());
            return PojoUtil.convertList(tbClockworkTasks, TbClockworkTaskPojo.class);
        }
        return null;
    }

    /**
     * 根据失败状态查询一段时间内失败的task
     *
     * @param status task status
     */
    @Override
    public List<TbClockworkTaskPojo> getTaskByRunFailedStatus(List<String> status, String beforeDateStr, String currentDateStr) {
        Map<String, String> param = new HashMap<>();
        param.put("status", StringUtil.convertListToString(status));
        param.put("beforeDateStr", beforeDateStr);
        param.put("currentDateStr", currentDateStr);
        List<TbClockworkTaskPojo> tbClockworkTasks = taskMapper.selectTaskByRunFailedStatus(param);
        if (CollectionUtils.isNotEmpty(tbClockworkTasks)) {
            LOG.info("getTaskByRunFailedStatus, status = {}, beforeDateStr = {}, currentDateStr = {}, tbClockworkTasks.size = {}",
                    status, beforeDateStr, currentDateStr, tbClockworkTasks.size());
            return tbClockworkTasks;
        }
        LOG.info("getTaskByRunFailedStatus, status = {}, beforeDateStr = {}, currentDateStr = {}, tbClockworkTasks.size 0",
                status, beforeDateStr, currentDateStr);
        return null;
    }

    /**
     * 根据delayStatus查询taskList
     *
     * @param delayStatus delay status
     */
    @Override
    public List<TbClockworkTaskPojo> getTaskByDelayStatus(int delayStatus) {
        TbClockworkTaskExample example = new TbClockworkTaskExample();
        // 父延迟或者父延迟恢复，只会发生在时间&依赖触发类型的任务上
        if (TaskDelayStatus.FATHER_DELAY.getCode() == delayStatus
                || TaskDelayStatus.FATHER_DELAYED_RECOVERY.getCode() == delayStatus) {
            example.createCriteria()
                    .andDelayStatusEqualTo(delayStatus)
                    .andTriggerModeEqualTo(TaskTriggerModel.TIME_AND_DEPENDENCY.getValue());
        } else {
            example.createCriteria().andDelayStatusEqualTo(delayStatus);
        }
        // 查询
        List<TbClockworkTask> tbClockworkTasks = tbClockworkTaskMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(tbClockworkTasks)) {
            LOG.info("getTaskByDelayStatus, delayStatus = {},tbClockworkTasks.size = {}",
                    delayStatus, tbClockworkTasks.size());
            return PojoUtil.convertList(tbClockworkTasks, TbClockworkTaskPojo.class);
        }
        return null;
    }

    /**
     * 根据dagId 查询all task
     *
     * @param dagId dagId
     */
    @Override
    public List<TbClockworkTaskPojo> getTasksByDagId(int dagId) {
        TbClockworkTaskExample example = new TbClockworkTaskExample();
        example.createCriteria().andDagIdEqualTo(dagId).andOnlineEqualTo(true);

        List<TbClockworkTask> tbClockworkTasks = tbClockworkTaskMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(tbClockworkTasks)) {
            LOG.info("getTasksByDagId dagId = {}, task.size = {}", dagId, tbClockworkTasks.size());
            return PojoUtil.convertList(tbClockworkTasks, TbClockworkTaskPojo.class);
        }
        return null;
    }

    /**
     * 根据GroupId查询Task
     *
     * @param groupId Group id
     */
    @Override
    public List<TbClockworkTaskPojo> getTasksByGroupId(int groupId) {
        TbClockworkTaskExample example = new TbClockworkTaskExample();
        example.createCriteria().andGroupIdEqualTo(groupId).andOnlineEqualTo(true);

        List<TbClockworkTask> tbClockworkTasks = tbClockworkTaskMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(tbClockworkTasks)) {
            LOG.info("getTasksByGroupId groupId = {}, task.size = {}", groupId, tbClockworkTasks.size());
            return PojoUtil.convertList(tbClockworkTasks, TbClockworkTaskPojo.class);
        }
        return null;
    }

    /**
     * 获取task列表
     *
     * @param taskGroupId taskGroupId
     * @return
     */
    @Override
    public List<TbClockworkTask> getTaskByTaskGroupId(int taskGroupId) {
        TbClockworkTaskExample example = new TbClockworkTaskExample();
        example.createCriteria().andGroupIdEqualTo(taskGroupId);
        List<TbClockworkTask> tbClockworkTasks = tbClockworkTaskMapper.selectByExample(example);
        LOG.info("getTaskByTaskGroupId, tasks.size = {}", tbClockworkTasks.size());
        return tbClockworkTasks;
    }

    /**
     * 获取task列表
     *
     * @param ids
     * @return
     */
    @Override
    public List<TbClockworkTask> getTaskByTaskIds(List<Integer> ids) {
        TbClockworkTaskExample example = new TbClockworkTaskExample();
        example.createCriteria().andIdIn(ids);
        return tbClockworkTaskMapper.selectByExample(example);
    }

    /**
     * 根据taskNames查询task
     *
     * @param names task name
     */
    @Override
    public List<TbClockworkTask> getTaskByNames(List<String> names) {
        TbClockworkTaskExample example = new TbClockworkTaskExample();
        example.createCriteria().andNameIn(names);
        return tbClockworkTaskMapper.selectByExample(example);
    }

    @Override
    public List<TbClockworkTask4PagePojo> getAllTaskByCondition(TbClockworkTask4PagePojo tbClockworkTask) {
        if (tbClockworkTask == null) {
            tbClockworkTask = new TbClockworkTask4PagePojo();
        }
        return taskMapper.selectAllTaskByCondition(tbClockworkTask);
    }

    @Override
    public List<TbClockworkTask4PagePojo> getAllTaskUsedByAutoComplete(String idOrNameSegment) {
        return taskMapper.selectAllTaskUsedByAutoComplete(idOrNameSegment);
    }

    /**
     * 查询当前task的状态
     *
     * @param taskId taskId
     */
    @Override
    public String getTaskStatusById(int taskId) {
        TbClockworkTask clockworkTask = tbClockworkTaskMapper.selectByPrimaryKey(taskId);
        return clockworkTask != null ? clockworkTask.getStatus() : null;
    }

    /**
     * 根据表名，获得产出这张表对应调度任务的状态
     *
     * @param businessInfo 业务保留字段
     * @return
     */
    @Override
    public Map<String, Map<Integer, String>> getTaskStatusByTableName(String businessInfo) {
        Map<String, Map<Integer, String>> result = null;
        if (StringUtils.isEmpty(businessInfo)) {
            return result;
        }

        String[] tableNames = StringUtils.split(businessInfo, ",");
        if (tableNames == null || tableNames.length < 1) {
            return result;
        }
        result = new HashMap<>();

        for (String tableName : tableNames) {
            TbClockworkTaskExample TbClockworkTaskExample = new TbClockworkTaskExample();
            TbClockworkTaskExample.createCriteria()
                    .andBusinessInfoEqualTo(tableName)
                    .andOnlineEqualTo(TaskTakeEffectStatus.ONLINE.getValue());
            List<TbClockworkTask> TbClockworkTasks = tbClockworkTaskMapper.selectByExample(TbClockworkTaskExample);
            if (CollectionUtils.isEmpty(TbClockworkTasks)) {
                continue;
            }
            // 防止一个表名有多个任务对应，用map结构，key为任务id，value为任务状态
            Map<Integer, String> taskIdAndStatus = new HashMap<Integer, String>();
            for (TbClockworkTask TbClockworkTask : TbClockworkTasks) {
                taskIdAndStatus.put(TbClockworkTask.getId(), TbClockworkTask.getStatus());
            }
            // 设置当前表名的对应任务的状态
            result.put(tableName, taskIdAndStatus);
        }
        // 打印
        for (Map.Entry<String, Map<Integer, String>> entry : result.entrySet()) {
            for (Map.Entry<Integer, String> valueEntry : entry.getValue().entrySet()) {
                LOG.info("[TaskService-getTaskStatusByTableName]tableName = {},taskId = {},status = {}",
                        entry.getKey(), valueEntry.getKey(), valueEntry.getValue());
            }
        }
        return result;
    }


    /**
     * 根据dagId 查询all task which task is online
     *
     * @param dagId dagId
     */
    @Override
    public List<TbClockworkTaskPojo> getTasksByDagIdWhereTaskIsOnline(int dagId) {
        TbClockworkTaskExample example = new TbClockworkTaskExample();
        example.createCriteria().andDagIdEqualTo(dagId).andOnlineEqualTo(true);

        List<TbClockworkTask> tbClockworkTasks = tbClockworkTaskMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(tbClockworkTasks)) {
            LOG.info("getTasksByDagId dagId = {}, task.size = {}", dagId, tbClockworkTasks.size());
            return PojoUtil.convertList(tbClockworkTasks, TbClockworkTaskPojo.class);
        }
        return null;
    }
}
