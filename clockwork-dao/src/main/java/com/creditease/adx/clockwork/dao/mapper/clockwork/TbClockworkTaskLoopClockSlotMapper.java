package com.creditease.adx.clockwork.dao.mapper.clockwork;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskLoopClockSlot;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskLoopClockSlotExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbClockworkTaskLoopClockSlotMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_loop_clock_slot
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    long countByExample(TbClockworkTaskLoopClockSlotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_loop_clock_slot
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int deleteByExample(TbClockworkTaskLoopClockSlotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_loop_clock_slot
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_loop_clock_slot
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int insert(TbClockworkTaskLoopClockSlot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_loop_clock_slot
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int insertSelective(TbClockworkTaskLoopClockSlot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_loop_clock_slot
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    List<TbClockworkTaskLoopClockSlot> selectByExample(TbClockworkTaskLoopClockSlotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_loop_clock_slot
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    TbClockworkTaskLoopClockSlot selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_loop_clock_slot
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbClockworkTaskLoopClockSlot record, @Param("example") TbClockworkTaskLoopClockSlotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_loop_clock_slot
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByExample(@Param("record") TbClockworkTaskLoopClockSlot record, @Param("example") TbClockworkTaskLoopClockSlotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_loop_clock_slot
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByPrimaryKeySelective(TbClockworkTaskLoopClockSlot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_loop_clock_slot
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByPrimaryKey(TbClockworkTaskLoopClockSlot record);
}