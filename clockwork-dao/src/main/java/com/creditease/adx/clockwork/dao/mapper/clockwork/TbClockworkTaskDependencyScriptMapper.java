/**
 * This file is automatically generated by MyBatis Generator, do not modify.
 */
package com.creditease.adx.clockwork.dao.mapper.clockwork;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskDependencyScript;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskDependencyScriptExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbClockworkTaskDependencyScriptMapper {
    long countByExample(TbClockworkTaskDependencyScriptExample example);

    int deleteByExample(TbClockworkTaskDependencyScriptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbClockworkTaskDependencyScript record);

    int insertSelective(TbClockworkTaskDependencyScript record);

    List<TbClockworkTaskDependencyScript> selectByExample(TbClockworkTaskDependencyScriptExample example);

    TbClockworkTaskDependencyScript selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbClockworkTaskDependencyScript record, @Param("example") TbClockworkTaskDependencyScriptExample example);

    int updateByExample(@Param("record") TbClockworkTaskDependencyScript record, @Param("example") TbClockworkTaskDependencyScriptExample example);

    int updateByPrimaryKeySelective(TbClockworkTaskDependencyScript record);

    int updateByPrimaryKey(TbClockworkTaskDependencyScript record);
}