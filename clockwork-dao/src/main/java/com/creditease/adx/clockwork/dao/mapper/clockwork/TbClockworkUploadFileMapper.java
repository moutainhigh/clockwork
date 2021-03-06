package com.creditease.adx.clockwork.dao.mapper.clockwork;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkUploadFile;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkUploadFileExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbClockworkUploadFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    long countByExample(TbClockworkUploadFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int deleteByExample(TbClockworkUploadFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int insert(TbClockworkUploadFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int insertSelective(TbClockworkUploadFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    List<TbClockworkUploadFile> selectByExample(TbClockworkUploadFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    TbClockworkUploadFile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbClockworkUploadFile record, @Param("example") TbClockworkUploadFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByExample(@Param("record") TbClockworkUploadFile record, @Param("example") TbClockworkUploadFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByPrimaryKeySelective(TbClockworkUploadFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_upload_file
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByPrimaryKey(TbClockworkUploadFile record);
}