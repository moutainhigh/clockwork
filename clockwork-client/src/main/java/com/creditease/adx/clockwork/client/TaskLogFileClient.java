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

package com.creditease.adx.clockwork.client;

import com.creditease.adx.clockwork.common.entity.LogFileParam;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(value = "${api.service.name}")
public interface TaskLogFileClient {

    @PostMapping(value = "/clockwork/api/task/log/file/catLogFileContent")
    Map<String, Object> catLogFileContent(@RequestBody LogFileParam logFileParam);

}

