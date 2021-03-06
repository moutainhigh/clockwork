package com.creditease.adx.clockwork.dao.mapper.clockwork;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkUploadFileAndNodeRelation;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkUploadFileAndNodeRelationExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbClockworkUploadFileAndNodeRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file_and_node_relation
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    long countByExample(TbClockworkUploadFileAndNodeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file_and_node_relation
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int deleteByExample(TbClockworkUploadFileAndNodeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file_and_node_relation
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file_and_node_relation
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int insert(TbClockworkUploadFileAndNodeRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file_and_node_relation
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int insertSelective(TbClockworkUploadFileAndNodeRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file_and_node_relation
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    List<TbClockworkUploadFileAndNodeRelation> selectByExample(TbClockworkUploadFileAndNodeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file_and_node_relation
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    TbClockworkUploadFileAndNodeRelation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file_and_node_relation
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbClockworkUploadFileAndNodeRelation record, @Param("example") TbClockworkUploadFileAndNodeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file_and_node_relation
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByExample(@Param("record") TbClockworkUploadFileAndNodeRelation record, @Param("example") TbClockworkUploadFileAndNodeRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file_and_node_relation
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByPrimaryKeySelective(TbClockworkUploadFileAndNodeRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file_and_node_relation
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByPrimaryKey(TbClockworkUploadFileAndNodeRelation record);
}