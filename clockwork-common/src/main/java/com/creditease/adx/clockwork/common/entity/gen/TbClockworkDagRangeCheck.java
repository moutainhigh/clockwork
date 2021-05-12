/**
 * This file is automatically generated by MyBatis Generator, do not modify.
 */
package com.creditease.adx.clockwork.common.entity.gen;

import java.util.Date;

public class TbClockworkDagRangeCheck {
    /**
     * 库表唯一Id
     */
    private Integer id;

    /**
     * DAG_ID
     */
    private Integer dagId;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 成环任务(成环任务,用'|'号分割)
     */
    private String taskInfo;

    /**
     * 是否成环
     */
    private Boolean isRange;

    /**
     * 检测时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 库表唯一Id
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 库表唯一Id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * DAG_ID
     *
     * @return dagId
     */
    public Integer getDagId() {
        return dagId;
    }

    /**
     * DAG_ID
     *
     * @param dagId
     */
    public void setDagId(Integer dagId) {
        this.dagId = dagId;
    }

    /**
     * 操作人
     *
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 操作人
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 成环任务(成环任务,用'|'号分割)
     *
     * @return taskInfo
     */
    public String getTaskInfo() {
        return taskInfo;
    }

    /**
     * 成环任务(成环任务,用'|'号分割)
     *
     * @param taskInfo
     */
    public void setTaskInfo(String taskInfo) {
        this.taskInfo = taskInfo == null ? null : taskInfo.trim();
    }

    /**
     * 是否成环
     *
     * @return isRange
     */
    public Boolean getIsRange() {
        return isRange;
    }

    /**
     * 是否成环
     *
     * @param isRange
     */
    public void setIsRange(Boolean isRange) {
        this.isRange = isRange;
    }

    /**
     * 检测时间
     *
     * @return createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 检测时间
     *
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     *
     * @return updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbClockworkDagRangeCheck other = (TbClockworkDagRangeCheck) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDagId() == null ? other.getDagId() == null : this.getDagId().equals(other.getDagId()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getTaskInfo() == null ? other.getTaskInfo() == null : this.getTaskInfo().equals(other.getTaskInfo()))
            && (this.getIsRange() == null ? other.getIsRange() == null : this.getIsRange().equals(other.getIsRange()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDagId() == null) ? 0 : getDagId().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getTaskInfo() == null) ? 0 : getTaskInfo().hashCode());
        result = prime * result + ((getIsRange() == null) ? 0 : getIsRange().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dagId=").append(dagId);
        sb.append(", operator=").append(operator);
        sb.append(", taskInfo=").append(taskInfo);
        sb.append(", isRange=").append(isRange);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}