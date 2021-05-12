package com.creditease.adx.clockwork.dao.mapper.clockwork;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskLogFlow;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskLogFlowExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbClockworkTaskLogFlowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_log_flow
     *
     * @mbg.generated Tue Aug 04 17:33:56 CST 2020
     */
    long countByExample(TbClockworkTaskLogFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_log_flow
     *
     * @mbg.generated Tue Aug 04 17:33:56 CST 2020
     */
    int deleteByExample(TbClockworkTaskLogFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_log_flow
     *
     * @mbg.generated Tue Aug 04 17:33:56 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_log_flow
     *
     * @mbg.generated Tue Aug 04 17:33:56 CST 2020
     */
    int insert(TbClockworkTaskLogFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_log_flow
     *
     * @mbg.generated Tue Aug 04 17:33:56 CST 2020
     */
    int insertSelective(TbClockworkTaskLogFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_log_flow
     *
     * @mbg.generated Tue Aug 04 17:33:56 CST 2020
     */
    List<TbClockworkTaskLogFlow> selectByExample(TbClockworkTaskLogFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_log_flow
     *
     * @mbg.generated Tue Aug 04 17:33:56 CST 2020
     */
    TbClockworkTaskLogFlow selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_log_flow
     *
     * @mbg.generated Tue Aug 04 17:33:56 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbClockworkTaskLogFlow record, @Param("example") TbClockworkTaskLogFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_log_flow
     *
     * @mbg.generated Tue Aug 04 17:33:56 CST 2020
     */
    int updateByExample(@Param("record") TbClockworkTaskLogFlow record, @Param("example") TbClockworkTaskLogFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_log_flow
     *
     * @mbg.generated Tue Aug 04 17:33:56 CST 2020
     */
    int updateByPrimaryKeySelective(TbClockworkTaskLogFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_log_flow
     *
     * @mbg.generated Tue Aug 04 17:33:56 CST 2020
     */
    int updateByPrimaryKey(TbClockworkTaskLogFlow record);
}