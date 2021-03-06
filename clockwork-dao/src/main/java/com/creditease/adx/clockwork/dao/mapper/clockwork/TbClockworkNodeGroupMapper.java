/**
 * This file is automatically generated by MyBatis Generator, do not modify.
 */
package com.creditease.adx.clockwork.dao.mapper.clockwork;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkNodeGroup;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkNodeGroupExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbClockworkNodeGroupMapper {
    long countByExample(TbClockworkNodeGroupExample example);

    int deleteByExample(TbClockworkNodeGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbClockworkNodeGroup record);

    int insertSelective(TbClockworkNodeGroup record);

    List<TbClockworkNodeGroup> selectByExample(TbClockworkNodeGroupExample example);

    TbClockworkNodeGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbClockworkNodeGroup record, @Param("example") TbClockworkNodeGroupExample example);

    int updateByExample(@Param("record") TbClockworkNodeGroup record, @Param("example") TbClockworkNodeGroupExample example);

    int updateByPrimaryKeySelective(TbClockworkNodeGroup record);

    int updateByPrimaryKey(TbClockworkNodeGroup record);
}