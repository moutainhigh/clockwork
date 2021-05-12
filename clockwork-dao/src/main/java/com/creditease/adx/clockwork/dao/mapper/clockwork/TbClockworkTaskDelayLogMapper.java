/**
 * This file is automatically generated by MyBatis Generator, do not modify.
 */
package com.creditease.adx.clockwork.dao.mapper.clockwork;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskDelayLog;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskDelayLogExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbClockworkTaskDelayLogMapper {
    long countByExample(TbClockworkTaskDelayLogExample example);

    int deleteByExample(TbClockworkTaskDelayLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbClockworkTaskDelayLog record);

    int insertSelective(TbClockworkTaskDelayLog record);

    List<TbClockworkTaskDelayLog> selectByExample(TbClockworkTaskDelayLogExample example);

    TbClockworkTaskDelayLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbClockworkTaskDelayLog record, @Param("example") TbClockworkTaskDelayLogExample example);

    int updateByExample(@Param("record") TbClockworkTaskDelayLog record, @Param("example") TbClockworkTaskDelayLogExample example);

    int updateByPrimaryKeySelective(TbClockworkTaskDelayLog record);

    int updateByPrimaryKey(TbClockworkTaskDelayLog record);
}