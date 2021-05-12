/**
 * This file is automatically generated by MyBatis Generator, do not modify.
 */
package com.creditease.adx.clockwork.common.entity.gen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbClockworkDagRangeCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TbClockworkDagRangeCheckExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDagIdIsNull() {
            addCriterion("dag_id is null");
            return (Criteria) this;
        }

        public Criteria andDagIdIsNotNull() {
            addCriterion("dag_id is not null");
            return (Criteria) this;
        }

        public Criteria andDagIdEqualTo(Integer value) {
            addCriterion("dag_id =", value, "dagId");
            return (Criteria) this;
        }

        public Criteria andDagIdNotEqualTo(Integer value) {
            addCriterion("dag_id <>", value, "dagId");
            return (Criteria) this;
        }

        public Criteria andDagIdGreaterThan(Integer value) {
            addCriterion("dag_id >", value, "dagId");
            return (Criteria) this;
        }

        public Criteria andDagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dag_id >=", value, "dagId");
            return (Criteria) this;
        }

        public Criteria andDagIdLessThan(Integer value) {
            addCriterion("dag_id <", value, "dagId");
            return (Criteria) this;
        }

        public Criteria andDagIdLessThanOrEqualTo(Integer value) {
            addCriterion("dag_id <=", value, "dagId");
            return (Criteria) this;
        }

        public Criteria andDagIdIn(List<Integer> values) {
            addCriterion("dag_id in", values, "dagId");
            return (Criteria) this;
        }

        public Criteria andDagIdNotIn(List<Integer> values) {
            addCriterion("dag_id not in", values, "dagId");
            return (Criteria) this;
        }

        public Criteria andDagIdBetween(Integer value1, Integer value2) {
            addCriterion("dag_id between", value1, value2, "dagId");
            return (Criteria) this;
        }

        public Criteria andDagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dag_id not between", value1, value2, "dagId");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("`operator` is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("`operator` is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("`operator` =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("`operator` <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("`operator` >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("`operator` >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("`operator` <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("`operator` <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("`operator` like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("`operator` not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("`operator` in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("`operator` not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("`operator` between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("`operator` not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andTaskInfoIsNull() {
            addCriterion("task_info is null");
            return (Criteria) this;
        }

        public Criteria andTaskInfoIsNotNull() {
            addCriterion("task_info is not null");
            return (Criteria) this;
        }

        public Criteria andTaskInfoEqualTo(String value) {
            addCriterion("task_info =", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotEqualTo(String value) {
            addCriterion("task_info <>", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoGreaterThan(String value) {
            addCriterion("task_info >", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoGreaterThanOrEqualTo(String value) {
            addCriterion("task_info >=", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoLessThan(String value) {
            addCriterion("task_info <", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoLessThanOrEqualTo(String value) {
            addCriterion("task_info <=", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoLike(String value) {
            addCriterion("task_info like", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotLike(String value) {
            addCriterion("task_info not like", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoIn(List<String> values) {
            addCriterion("task_info in", values, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotIn(List<String> values) {
            addCriterion("task_info not in", values, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoBetween(String value1, String value2) {
            addCriterion("task_info between", value1, value2, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotBetween(String value1, String value2) {
            addCriterion("task_info not between", value1, value2, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andIsRangeIsNull() {
            addCriterion("is_range is null");
            return (Criteria) this;
        }

        public Criteria andIsRangeIsNotNull() {
            addCriterion("is_range is not null");
            return (Criteria) this;
        }

        public Criteria andIsRangeEqualTo(Boolean value) {
            addCriterion("is_range =", value, "isRange");
            return (Criteria) this;
        }

        public Criteria andIsRangeNotEqualTo(Boolean value) {
            addCriterion("is_range <>", value, "isRange");
            return (Criteria) this;
        }

        public Criteria andIsRangeGreaterThan(Boolean value) {
            addCriterion("is_range >", value, "isRange");
            return (Criteria) this;
        }

        public Criteria andIsRangeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_range >=", value, "isRange");
            return (Criteria) this;
        }

        public Criteria andIsRangeLessThan(Boolean value) {
            addCriterion("is_range <", value, "isRange");
            return (Criteria) this;
        }

        public Criteria andIsRangeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_range <=", value, "isRange");
            return (Criteria) this;
        }

        public Criteria andIsRangeIn(List<Boolean> values) {
            addCriterion("is_range in", values, "isRange");
            return (Criteria) this;
        }

        public Criteria andIsRangeNotIn(List<Boolean> values) {
            addCriterion("is_range not in", values, "isRange");
            return (Criteria) this;
        }

        public Criteria andIsRangeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_range between", value1, value2, "isRange");
            return (Criteria) this;
        }

        public Criteria andIsRangeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_range not between", value1, value2, "isRange");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_clockwork_dag_range_check
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}