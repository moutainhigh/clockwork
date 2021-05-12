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

package com.creditease.adx.clockwork.api.util;

import com.alibaba.fastjson.JSONArray;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.creditease.adx.clockwork.common.pojo.TbClockworkTaskPojo;
import com.creditease.adx.clockwork.common.util.DataUtil;

/**
 * @ Author     ：XuanDongTang
 * @ Date       ：Created in 11:07 上午 2020/5/14
 * @ Description：
 * @ Modified By：
 */
public class JsonTest {


    @Test
    public void testJson1() {
        TbClockworkTaskPojo taskPojo = new TbClockworkTaskPojo();
        String command = "sh /user/adx/clockwork/dfs/shell/dataworks/batch/115/4559/27391/moonbox-submit.sh /user/adx/clockwork/dfs/shell/dataworks/batch/115/4559/27391 -n4559_27391_[sql-1] -shttp://moonbox1.adx.jishu.idc:9090 -uadx@p115 -p7416F25DB77C73AC2CC50586D9F65452 -dc4p115_default -lmql -f/user/adx/clockwork/dfs/shell/dataworks/batch/115/4559/27391/27391.mql -Cspark.executor.memory=6g,spark.driver.memory=6g,spark.driver.cores=2,isSetting=yes,spark.executor.extraLibraryPath=\"/usr/hdp/2.6.5.0-292/hadoop/lib/native\",spark.executor.cores=2,spark.executor.instances=10,spark.sql.shuffle.partitions=32";
        taskPojo.setCommand(command);
        String task = JSONObject.toJSONString(taskPojo);
        System.out.println(task);
        TbClockworkTaskPojo tbClockworkTask = JSONObject.parseObject(task, TbClockworkTaskPojo.class);
        System.out.println(JSONObject.toJSONString(tbClockworkTask));
    }


    @Test
    public void testJson() {
        String task = "{\"aliasName\":\"sql-1\",,\"isPrivate\":1,\"businessInfo\":\"rsc_month_loan_test_mysql_p115\",\"createTime\":1589022658000,\"cronExp\":\"0 5 * * *\",\"dependencyId\":\"11770,11772,11771,11773\",\"description\":\"4626_27846_[sql-1]\",\"emailList\":\"jiahuizhang10@clockwork.com\",\"failedRetries\":1,\"id\":11775,\"isFirst\":0,\"lastEndTime\":1589404085000,\"operatorName\":\"jiahuizhang10@clockwork.com\",\"lastStartTime\":1589403604000,\"location\":\"/user/adx/clockwork/dfs/shell/dataworks/batch/115/4626/27846\",\"name\":\"4626_27846_[sql-1]\",\"online\":1,\"operatorName\":\"xuandongtang@clockwork.com\",\"operatorType\":\"adx\",\"parameter\":\"\",\"runEngine\":\"moonbox\",\"runFrequency\":1,\"command\":\"sh /user/adx/clockwork/dfs/shell/dataworks/batch/115/4559/27391/moonbox-submit.sh /user/adx/clockwork/dfs/shell/dataworks/batch/115/4559/27391 -n4559_27391_[sql-1] -shttp://moonbox1.adx.jishu.idc:9090 -uadx@p115 -p7416F25DB77C73AC2CC50586D9F65452 -dc4p115_default -lmql -f/user/adx/clockwork/dfs/shell/dataworks/batch/115/4559/27391/27391.mql -Cspark.executor.memory=6g,spark.driver.memory=6g,spark.driver.cores=2,isSetting=yes,spark.executor.extraLibraryPath=\"/usr/hdp/2.6.5.0-292/hadoop/lib/native\",spark.executor.cores=2,spark.executor.instances=10,spark.sql.shuffle.partitions=32\",\"runTimeout\":180,\"scriptName\":\"moonbox-submit.sh\",\"scriptParameter\":\"/user/adx/clockwork/dfs/shell/dataworks/batch/115/4626/27846 -n4626_27846_[sql-1] -shttp://moonbox1.adx.jishu.idc:9090 -uadx@p115 -p7416F25DB77C73AC2CC50586D9F65452 -dc4p115_default -lmql -f/user/adx/clockwork/dfs/shell/dataworks/batch/115/4626/27846/27846.mql -Cspark.executor.memory=6g,spark.driver.memory=6g,spark.driver.cores=2,isSetting=yes,spark.executor.extraLibraryPath=\"/usr/hdp/2.6.5.0-292/hadoop/lib/native\",spark.executor.cores=2,spark.executor.instances=10,spark.sql.shuffle.partitions=32\",\"source\":0,\"status\":\"killed\",\"groupId\":5936,\"timeType\":\"day\",\"triggerMode\":2,\"triggerTime\":1589490000000,\"updateTime\":1589423270000,\"userName\":\"jiahuizhang10@clockwork.com\"}";
        TbClockworkTaskPojo tbClockworkTask = JSONObject.parseObject(DataUtil.specialCharHandle(task), TbClockworkTaskPojo.class);
        System.out.println(JSONObject.toJSONString(tbClockworkTask));
    }



    @Test
    public void testJsonId() {
        String task = "";
        JSONObject jsonObject = JSONObject.parseObject(task);
        JSONArray data = jsonObject.getJSONArray("data");
        for (Object datum : data) {
            System.out.print(JSONObject.parseObject(datum.toString()).get("id")+",");
        }
    }




}
