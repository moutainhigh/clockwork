package com.creditease.adx.clockwork.api.service;

import com.creditease.adx.clockwork.api.service.impl.TaskOperationService;
import com.creditease.adx.clockwork.common.entity.TaskGroupAndTasks;
import com.creditease.adx.clockwork.common.enums.TaskSource;
import com.creditease.adx.clockwork.common.enums.TaskTriggerModel;
import com.creditease.adx.clockwork.common.pojo.TbClockworkTaskGroupPojo;
import com.creditease.adx.clockwork.common.pojo.TbClockworkTaskPojo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ Author     ：XuanDongTang
 * @ Date       ：Created in 9:51 上午 2020/12/21
 * @ Description：
 * @ Modified By：
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class TestTaskOperationService {

    @Autowired
    private TaskOperationService taskOperationService;


    @Test
    public void addTaskListTest() {

        TaskGroupAndTasks taskGroupAndTasks = new TaskGroupAndTasks();

        List<TbClockworkTaskPojo> tasks = new ArrayList<>();
        TbClockworkTaskGroupPojo taskGroup = new TbClockworkTaskGroupPojo();
        taskGroup.setName("g_04");
        taskGroup.setDescription("g_04");

        TbClockworkTaskPojo task = new TbClockworkTaskPojo();
        task.setExternalSystemTaskId("666");    // 外部系统id
        task.setAliasName("taskListTest_01");
        task.setName("taskListTest_01");
        task.setDescription("taskListTest_01");
        task.setLocation("/user/adx/clockwork/dfs/shell/");
        task.setScriptName("test.sh");
        task.setRunEngine("hive");
        task.setTriggerMode(TaskTriggerModel.DEPENDENCY.getValue());
        task.setTaskFatherIdsCrossTaskGroup("12199,12188"); // 跨组依赖
        task.setCreateUser("xuandongtang");
        task.setOperatorName("xuandongtang");
        task.setIsPrivate(true);
        task.setEmailList("xuandongtang@clockwork.com");
        task.setCreateTime(new Date());
        task.setUpdateTime(new Date());
        task.setNodeGid(1);
        task.setSource(TaskSource.ADX_CLOCKWORK.getValue());
        tasks.add(task);

        TbClockworkTaskPojo task2 = new TbClockworkTaskPojo();
        task2.setExternalSystemTaskId("667");    // 外部系统id
        task2.setExternalSystemTaskDependencyId("666"); // 依赖的外部系统id，本组依赖
        task2.setAliasName("taskListTest_02");
        task2.setName("taskListTest_02");
        task2.setDescription("taskListTest_02");
        task2.setLocation("/user/adx/clockwork/dfs/shell/");
        task2.setScriptName("test.sh");
        task2.setRunEngine("hive");
        task2.setTriggerMode(TaskTriggerModel.DEPENDENCY.getValue());
        task2.setCreateUser("xuandongtang");
        task2.setOperatorName("xuandongtang");
        task2.setIsPrivate(true);
        task2.setEmailList("xuandongtang@clockwork.com");
        task2.setCreateTime(new Date());
        task2.setUpdateTime(new Date());
        task2.setNodeGid(1);
        task2.setSource(TaskSource.ADX_CLOCKWORK.getValue());
        tasks.add(task2);

        // taskGroupAndTasks
        taskGroupAndTasks.setOperator("xuandongtang@clockwork.com");
        taskGroupAndTasks.setTaskGroup(taskGroup);
        taskGroupAndTasks.setTasks(tasks);

        taskOperationService.addTaskList(taskGroupAndTasks);

    }




    @Test
    public void updateTaskListTest() {

        TaskGroupAndTasks taskGroupAndTasks = new TaskGroupAndTasks();

        List<TbClockworkTaskPojo> tasks = new ArrayList<>();
        TbClockworkTaskGroupPojo taskGroup = new TbClockworkTaskGroupPojo();
        taskGroup.setId(557);
        taskGroup.setName("g_04");
        taskGroup.setDescription("g_04");

        TbClockworkTaskPojo task = new TbClockworkTaskPojo();
        task.setId(12206);
        task.setGroupId(557);
        task.setExternalSystemTaskId("666");    // 外部系统id
        task.setAliasName("taskListTest_01");
        task.setName("taskListTest_01");
        task.setDescription("taskListTest_01");
        task.setLocation("/user/adx/clockwork/dfs/shell/");
        task.setScriptName("test.sh");
        task.setRunEngine("hive");
        task.setTriggerMode(TaskTriggerModel.DEPENDENCY.getValue());
        task.setTaskFatherIdsCrossTaskGroup("12201"); // 跨组依赖
        task.setCreateUser("xuandongtang");
        task.setOperatorName("xuandongtang");
        task.setIsPrivate(true);
        task.setEmailList("xuandongtang@clockwork.com");
        task.setCreateTime(new Date());
        task.setUpdateTime(new Date());
        task.setNodeGid(1);
        task.setSource(TaskSource.ADX_CLOCKWORK.getValue());
        tasks.add(task);

        TbClockworkTaskPojo task2 = new TbClockworkTaskPojo();
        task2.setId(12207);
        task2.setGroupId(557);
        task2.setExternalSystemTaskId("667");    // 外部系统id
        task2.setExternalSystemTaskDependencyId("666"); // 依赖的外部系统id，本组依赖
        task2.setAliasName("taskListTest_02");
        task2.setName("taskListTest_02");
        task2.setDescription("taskListTest_02");
        task2.setLocation("/user/adx/clockwork/dfs/shell/");
        task2.setScriptName("test.sh");
        task2.setRunEngine("hive");
        task2.setTriggerMode(TaskTriggerModel.DEPENDENCY.getValue());
        task2.setCreateUser("xuandongtang");
        task2.setOperatorName("xuandongtang");
        task2.setIsPrivate(true);
        task2.setEmailList("xuandongtang@clockwork.com");
        task2.setCreateTime(new Date());
        task2.setUpdateTime(new Date());
        task2.setNodeGid(1);
        task2.setSource(TaskSource.ADX_CLOCKWORK.getValue());
        tasks.add(task2);

        // taskGroupAndTasks
        taskGroupAndTasks.setOperator("xuandongtang@clockwork.com");
        taskGroupAndTasks.setTaskGroup(taskGroup);
        taskGroupAndTasks.setTasks(tasks);

        taskOperationService.updateTaskList(taskGroupAndTasks);


//TbClockworkTaskPojo{"id":"58664","name":"12721_98515_[loan_account_audit_log_car_merchant_mb09q]","aliasName":"loan_account_audit_log_car_merchant_mb09q","description":"12721_98515_[loan_account_audit_log_car_merchant_mb09q]","dagId":"null","groupId":"10825","nodeGId":"1","location":"/user/adx/triangle/runTimeDir/shell/dataworks","scriptName":"table-event.sh","scriptParameter":"http://adx.apigateway-core.jishu.idc/clockwork/api/task/getTaskStatusForTableCheck?businessInfo":"loan_account_audit_log_car_merchant_mb09q","command":"null","parameter":"null","triggerMode":"null","cronExp":"null","triggerTime":"Fri Jan 15 07:55:00 CST 2021","nextTriggerTime":"null","timeType":"day","runFrequency":"1","dependencyId":"null","expiredTime":"null","failedRetries":"1","status":"null","delayStatus":"null","online":"null","lastStartTime":"null","lastEndTime":"null","runTimeout":"180","runEngine":"null","isPrivate":"null","isFirst":"null","source":"3","proxyUser":"null","businessInfo":"null","createUser":"zuyuanma@creditease.cn","operatorName":"zuyuanma@creditease.cn","emailList":"zuyuanma@creditease.cn","createTime":"null","updateTime":"null","externalSystemTaskId":"3f400eedcfc2a3e998cac62ff20a54c7","externalSystemTaskDependencyId":"null}
//TbClockworkTaskPojo{"id":"58665","name":"12721_98521_[esc_carshope_get_time]","aliasName":"esc_carshope_get_time","description":"12721_98521_[esc_carshope_get_time]","dagId":"null","groupId":"10825","nodeGId":"1","location":"/user/adx/triangle/runTimeDir/shell/moonbox","scriptName":"moonbox-submit.sh","scriptParameter":"/user/adx/triangle/runTimeDir/shell/moonbox -n12721_98521_[esc_carshope_get_time] -shttp://moonbox1.adx.jishu.idc:9090 -uadx@p53 -pF1B2452DA84551FC91DB93425B6A20D9 -dc4p53_default -lmql -f/user/adx/triangle/runTimeDir/shell/dataworks/batch/53/12721/98521/98521.mql -Cspark.executor.memory":"6g,spark.driver.memory":"6g,spark.driver.cores":"2,spark.executor.cores":"2,spark.executor.instances":"10,spark.sql.shuffle.partitions":"32","command":"null","parameter":"null","triggerMode":"null","cronExp":"null","triggerTime":"null","nextTriggerTime":"null","timeType":"null","runFrequency":"0","dependencyId":"null","expiredTime":"null","failedRetries":"1","status":"null","delayStatus":"null","online":"null","lastStartTime":"null","lastEndTime":"null","runTimeout":"180","runEngine":"moonbox","isPrivate":"null","isFirst":"null","source":"3","proxyUser":"null","businessInfo":"esc_carshop_get_time","createUser":"zuyuanma@creditease.cn","operatorName":"zuyuanma@creditease.cn","emailList":"zuyuanma@creditease.cn","createTime":"null","updateTime":"null","externalSystemTaskId":"c77211771eef7bbc9370e630ff2693c4","externalSystemTaskDependencyId":"3f400eedcfc2a3e998cac62ff20a54c7"}
//TbClockworkTaskPojo{"id":"58666","name":"12721_98520_[esc_carshop_all_info]","aliasName":"esc_carshop_all_info","description":"12721_98520_[esc_carshop_all_info]","dagId":"null","groupId":"10825","nodeGId":"1","location":"/user/adx/triangle/runTimeDir/shell/moonbox","scriptName":"moonbox-submit.sh","scriptParameter":"/user/adx/triangle/runTimeDir/shell/moonbox -n12721_98520_[esc_carshop_all_info] -shttp://moonbox1.adx.jishu.idc:9090 -uadx@p53 -pF1B2452DA84551FC91DB93425B6A20D9 -dc4p53_default -lmql -f/user/adx/triangle/runTimeDir/shell/dataworks/batch/53/12721/98520/98520.mql -Cspark.executor.memory":"6g,spark.driver.memory":"6g,spark.driver.cores":"2,spark.executor.cores":"2,spark.executor.instances":"10,spark.sql.shuffle.partitions":"32","command":"null","parameter":"null","triggerMode":"null","cronExp":"null","triggerTime":"null","nextTriggerTime":"null","timeType":"null","runFrequency":"0","dependencyId":"null","expiredTime":"null","failedRetries":"1","status":"null","delayStatus":"null","online":"null","lastStartTime":"null","lastEndTime":"null","runTimeout":"180","runEngine":"moonbox","isPrivate":"null","isFirst":"null","source":"3","proxyUser":"null","businessInfo":"esc_carshop_all_info","createUser":"zuyuanma@creditease.cn","operatorName":"zuyuanma@creditease.cn","emailList":"zuyuanma@creditease.cn","createTime":"null","updateTime":"null","externalSystemTaskId":"c461a49a18941faffcd9b797b457e2e5","externalSystemTaskDependencyId":"c77211771eef7bbc9370e630ff2693c4,3f400eedcfc2a3e998cac62ff20a54c7"}
//TbClockworkTaskPojo{"id":"58667","name":"12721_98518_[esc_carshop_all_info1]","aliasName":"esc_carshop_all_info1","description":"12721_98518_[esc_carshop_all_info1]","dagId":"null","groupId":"10825","nodeGId":"1","location":"/user/adx/triangle/runTimeDir/shell/moonbox","scriptName":"moonbox-submit.sh","scriptParameter":"/user/adx/triangle/runTimeDir/shell/moonbox -n12721_98518_[esc_carshop_all_info1] -shttp://moonbox1.adx.jishu.idc:9090 -uadx@p53 -pF1B2452DA84551FC91DB93425B6A20D9 -dc4p53_default -lmql -f/user/adx/triangle/runTimeDir/shell/dataworks/batch/53/12721/98518/98518.mql -Cspark.executor.memory":"6g,spark.driver.memory":"6g,spark.driver.cores":"2,spark.executor.cores":"2,spark.executor.instances":"10,spark.sql.shuffle.partitions":"32","command":"null","parameter":"null","triggerMode":"null","cronExp":"null","triggerTime":"null","nextTriggerTime":"null","timeType":"null","runFrequency":"0","dependencyId":"null","expiredTime":"null","failedRetries":"1","status":"null","delayStatus":"null","online":"null","lastStartTime":"null","lastEndTime":"null","runTimeout":"180","runEngine":"moonbox","isPrivate":"null","isFirst":"null","source":"3","proxyUser":"null","businessInfo":"esc_carshop_all_info1","createUser":"zuyuanma@creditease.cn","operatorName":"zuyuanma@creditease.cn","emailList":"zuyuanma@creditease.cn","createTime":"null","updateTime":"null","externalSystemTaskId":"b78e826d593458e0eea63be5b529dea1","externalSystemTaskDependencyId":"c461a49a18941faffcd9b797b457e2e5"}
//TbClockworkTaskPojo{"id":"58668","name":"12721_98522_[esc_carshope_split_code]","aliasName":"esc_carshope_split_code","description":"12721_98522_[esc_carshope_split_code]","dagId":"null","groupId":"10825","nodeGId":"1","location":"/user/adx/triangle/runTimeDir/shell/moonbox","scriptName":"moonbox-submit.sh","scriptParameter":"/user/adx/triangle/runTimeDir/shell/moonbox -n12721_98522_[esc_carshope_split_code] -shttp://moonbox1.adx.jishu.idc:9090 -uadx@p53 -pF1B2452DA84551FC91DB93425B6A20D9 -dc4p53_default -lmql -f/user/adx/triangle/runTimeDir/shell/dataworks/batch/53/12721/98522/98522.mql -Cspark.executor.memory":"6g,spark.driver.memory":"6g,spark.driver.cores":"2,spark.executor.cores":"2,spark.executor.instances":"10,spark.sql.shuffle.partitions":"32","command":"null","parameter":"null","triggerMode":"null","cronExp":"null","triggerTime":"null","nextTriggerTime":"null","timeType":"null","runFrequency":"0","dependencyId":"null","expiredTime":"null","failedRetries":"1","status":"null","delayStatus":"null","online":"null","lastStartTime":"null","lastEndTime":"null","runTimeout":"180","runEngine":"moonbox","isPrivate":"null","isFirst":"null","source":"3","proxyUser":"null","businessInfo":"esc_carshop_split_code1","createUser":"zuyuanma@creditease.cn","operatorName":"zuyuanma@creditease.cn","emailList":"zuyuanma@creditease.cn","createTime":"null","updateTime":"null","externalSystemTaskId":"cee46c58c25079d7c348ddc6aa2d5540","externalSystemTaskDependencyId":"b78e826d593458e0eea63be5b529dea1"}
//TbClockworkTaskPojo{"id":"58669","name":"12721_98517_[esc_carshop_picture_code1]","aliasName":"esc_carshop_picture_code1","description":"12721_98517_[esc_carshop_picture_code1]","dagId":"null","groupId":"10825","nodeGId":"1","location":"/user/adx/triangle/runTimeDir/shell/moonbox","scriptName":"moonbox-submit.sh","scriptParameter":"/user/adx/triangle/runTimeDir/shell/moonbox -n12721_98517_[esc_carshop_picture_code1] -shttp://moonbox1.adx.jishu.idc:9090 -uadx@p53 -pF1B2452DA84551FC91DB93425B6A20D9 -dc4p53_default -lmql -f/user/adx/triangle/runTimeDir/shell/dataworks/batch/53/12721/98517/98517.mql -Cspark.executor.memory":"6g,spark.driver.memory":"6g,spark.driver.cores":"2,spark.executor.cores":"2,spark.executor.instances":"10,spark.sql.shuffle.partitions":"32","command":"null","parameter":"null","triggerMode":"null","cronExp":"null","triggerTime":"null","nextTriggerTime":"null","timeType":"null","runFrequency":"0","dependencyId":"null","expiredTime":"null","failedRetries":"1","status":"null","delayStatus":"null","online":"null","lastStartTime":"null","lastEndTime":"null","runTimeout":"180","runEngine":"moonbox","isPrivate":"null","isFirst":"null","source":"3","proxyUser":"null","businessInfo":"esc_carshop_picture_code1","createUser":"zuyuanma@creditease.cn","operatorName":"zuyuanma@creditease.cn","emailList":"zuyuanma@creditease.cn","createTime":"null","updateTime":"null","externalSystemTaskId":"9bfe8ca5342613985582566adde0b8fd","externalSystemTaskDependencyId":"cee46c58c25079d7c348ddc6aa2d5540}
//TbClockworkTaskPojo{"id":"58670","name":"12721_98514_[esc_carshope_picture_code2]","aliasName":"esc_carshope_picture_code2","description":"12721_98514_[esc_carshope_picture_code2]","dagId":"null","groupId":"10825","nodeGId":"1","location":"/user/adx/triangle/runTimeDir/shell/moonbox","scriptName":"moonbox-submit.sh","scriptParameter":"/user/adx/triangle/runTimeDir/shell/moonbox -n12721_98514_[esc_carshope_picture_code2] -shttp://moonbox1.adx.jishu.idc:9090 -uadx@p53 -pF1B2452DA84551FC91DB93425B6A20D9 -dc4p53_default -lmql -f/user/adx/triangle/runTimeDir/shell/dataworks/batch/53/12721/98514/98514.mql -Cspark.executor.memory":"6g,spark.driver.memory":"6g,spark.driver.cores":"2,spark.executor.cores":"2,spark.executor.instances":"10,spark.sql.shuffle.partitions":"32","command":"null","parameter":"null","triggerMode":"null","cronExp":"null","triggerTime":"null","nextTriggerTime":"null","timeType":"null","runFrequency":"0","dependencyId":"null","expiredTime":"null","failedRetries":"1","status":"null","delayStatus":"null","online":"null","lastStartTime":"null","lastEndTime":"null","runTimeout":"180","runEngine":"moonbox","isPrivate":"null","isFirst":"null","source":"3","proxyUser":"null","businessInfo":"esc_carshop_picture_code2","createUser":"zuyuanma@creditease.cn","operatorName":"zuyuanma@creditease.cn","emailList":"zuyuanma@creditease.cn","createTime":"null","updateTime":"null","externalSystemTaskId":"3252732f7c8531c7da4187904c601413","externalSystemTaskDependencyId":"9bfe8ca5342613985582566adde0b8fd}
//TbClockworkTaskPojo{"id":"58671","name":"12721_98519_[esc_carshope_all_code1]","aliasName":"esc_carshope_all_code1","description":"12721_98519_[esc_carshope_all_code1]","dagId":"null","groupId":"10825","nodeGId":"1","location":"/user/adx/triangle/runTimeDir/shell/moonbox","scriptName":"moonbox-submit.sh","scriptParameter":"/user/adx/triangle/runTimeDir/shell/moonbox -n12721_98519_[esc_carshope_all_code1] -shttp://moonbox1.adx.jishu.idc:9090 -uadx@p53 -pF1B2452DA84551FC91DB93425B6A20D9 -dc4p53_default -lmql -f/user/adx/triangle/runTimeDir/shell/dataworks/batch/53/12721/98519/98519.mql -Cspark.executor.memory":"6g,spark.driver.memory":"6g,spark.driver.cores":"2,spark.executor.cores":"2,spark.executor.instances":"10,spark.sql.shuffle.partitions":"32","command":"null","parameter":"null","triggerMode":"null","cronExp":"null","triggerTime":"null","nextTriggerTime":"null","timeType":"null","runFrequency":"0","dependencyId":"null","expiredTime":"null","failedRetries":"1","status":"null","delayStatus":"null","online":"null","lastStartTime":"null","lastEndTime":"null","runTimeout":"180","runEngine":"moonbox","isPrivate":"null","isFirst":"null","source":"3","proxyUser":"null","businessInfo":"esc_carshop_all_code1","createUser":"zuyuanma@creditease.cn","operatorName":"zuyuanma@creditease.cn","emailList":"zuyuanma@creditease.cn","createTime":"null","updateTime":"null","externalSystemTaskId":"bfe4835be76b28ee600fc5feb5f844db","externalSystemTaskDependencyId":"3252732f7c8531c7da4187904c601413}
//TbClockworkTaskPojo{"id":"58672","name":"12721_98516_[esc_carshope_ht]","aliasName":"esc_carshope_ht","description":"12721_98516_[esc_carshope_ht]","dagId":"null","groupId":"10825","nodeGId":"1","location":"/user/adx/triangle/runTimeDir/shell/moonbox","scriptName":"moonbox-submit.sh","scriptParameter":"/user/adx/triangle/runTimeDir/shell/moonbox -n12721_98516_[esc_carshope_ht] -shttp://moonbox1.adx.jishu.idc:9090 -uadx@p53 -pF1B2452DA84551FC91DB93425B6A20D9 -dc4p53_default -lmql -f/user/adx/triangle/runTimeDir/shell/dataworks/batch/53/12721/98516/98516.mql -Cspark.executor.memory":"6g,spark.driver.memory":"6g,spark.driver.cores":"2,spark.executor.cores":"2,spark.executor.instances":"10,spark.sql.shuffle.partitions":"32","command":"null","parameter":"null","triggerMode":"null","cronExp":"null","triggerTime":"null","nextTriggerTime":"null","timeType":"null","runFrequency":"0","dependencyId":"null","expiredTime":"null","failedRetries":"1","status":"null","delayStatus":"null","online":"null","lastStartTime":"null","lastEndTime":"null","runTimeout":"180","runEngine":"moonbox","isPrivate":"null","isFirst":"null","source":"3","proxyUser":"null","businessInfo":"esc_carshop_ht","createUser":"zuyuanma@creditease.cn","operatorName":"zuyuanma@creditease.cn","emailList":"zuyuanma@creditease.cn","createTime":"null","updateTime":"null","externalSystemTaskId":"7ea592d6accb4c2409ef045f32afebdc","externalSystemTaskDependencyId":"bfe4835be76b28ee600fc5feb5f844db}

    }


}
