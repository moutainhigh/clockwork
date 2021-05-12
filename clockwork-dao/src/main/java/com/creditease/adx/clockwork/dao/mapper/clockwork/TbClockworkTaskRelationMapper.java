/**
 * This file is automatically generated by MyBatis Generator, do not modify.
 */
package com.creditease.adx.clockwork.dao.mapper.clockwork;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskRelation;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbClockworkTaskRelationMapper {
    long countByExample(TbClockworkTaskRelationExample example);

    int deleteByExample(TbClockworkTaskRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbClockworkTaskRelation record);

    int insertSelective(TbClockworkTaskRelation record);

    List<TbClockworkTaskRelation> selectByExample(TbClockworkTaskRelationExample example);

    TbClockworkTaskRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbClockworkTaskRelation record, @Param("example") TbClockworkTaskRelationExample example);

    int updateByExample(@Param("record") TbClockworkTaskRelation record, @Param("example") TbClockworkTaskRelationExample example);

    int updateByPrimaryKeySelective(TbClockworkTaskRelation record);

    int updateByPrimaryKey(TbClockworkTaskRelation record);

    int batchInsert(List<TbClockworkTaskRelation> records);
}