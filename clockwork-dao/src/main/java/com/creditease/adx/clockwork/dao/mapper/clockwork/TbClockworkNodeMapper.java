/**
 * This file is automatically generated by MyBatis Generator, do not modify.
 */
package com.creditease.adx.clockwork.dao.mapper.clockwork;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkNode;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkNodeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbClockworkNodeMapper {
    long countByExample(TbClockworkNodeExample example);

    int deleteByExample(TbClockworkNodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbClockworkNode record);

    int insertSelective(TbClockworkNode record);

    List<TbClockworkNode> selectByExample(TbClockworkNodeExample example);

    TbClockworkNode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbClockworkNode record, @Param("example") TbClockworkNodeExample example);

    int updateByExample(@Param("record") TbClockworkNode record, @Param("example") TbClockworkNodeExample example);

    int updateByPrimaryKeySelective(TbClockworkNode record);

    int updateByPrimaryKey(TbClockworkNode record);
}