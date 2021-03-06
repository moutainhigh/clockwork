package com.creditease.adx.clockwork.dao.mapper.clockwork;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkLockRecord;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkLockRecordExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbClockworkLockRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_lock_record
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    long countByExample(TbClockworkLockRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_lock_record
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int deleteByExample(TbClockworkLockRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_lock_record
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_lock_record
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int insert(TbClockworkLockRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_lock_record
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int insertSelective(TbClockworkLockRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_lock_record
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    List<TbClockworkLockRecord> selectByExample(TbClockworkLockRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_lock_record
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    TbClockworkLockRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_lock_record
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbClockworkLockRecord record, @Param("example") TbClockworkLockRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_lock_record
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByExample(@Param("record") TbClockworkLockRecord record, @Param("example") TbClockworkLockRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_lock_record
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByPrimaryKeySelective(TbClockworkLockRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_lock_record
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByPrimaryKey(TbClockworkLockRecord record);
}