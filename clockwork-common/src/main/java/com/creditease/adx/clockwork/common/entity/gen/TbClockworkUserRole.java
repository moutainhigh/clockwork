/**
 * This file is automatically generated by MyBatis Generator, do not modify.
 */
package com.creditease.adx.clockwork.common.entity.gen;

public class TbClockworkUserRole {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 角色Id
     */
    private Integer roleId;

    /**
     * 主键
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户id
     *
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     *
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 角色Id
     *
     * @return roleId
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 角色Id
     *
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
        TbClockworkUserRole other = (TbClockworkUserRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append("]");
        return sb.toString();
    }
}