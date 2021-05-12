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

package com.creditease.adx.clockwork.dao.mapper;

import com.creditease.adx.clockwork.common.pojo.TbClockworkTask4PagePojo;
import com.creditease.adx.clockwork.common.pojo.TbClockworkTaskFillDataPojo;
import com.creditease.adx.clockwork.common.pojo.TbClockworkTaskLogPojo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
@Mapper
public interface TaskFillDataMapper {

    List<TbClockworkTaskFillDataPojo> selectAllTaskFillDataByPageParam(HashMap<String, Object> param);

    int countAllTaskFillDataByPageParam(HashMap<String, Object> param);

    List<TbClockworkTask4PagePojo> selectTasksByReRunBatchNumber(Long rerunBatchNumber);

    List<TbClockworkTaskLogPojo> selectTaskLogsByReRunBNAndTaskId(HashMap<String, Object> param);

    int updateTaskFillDataSuccessCount(Long rerunBatchNumber);


}
