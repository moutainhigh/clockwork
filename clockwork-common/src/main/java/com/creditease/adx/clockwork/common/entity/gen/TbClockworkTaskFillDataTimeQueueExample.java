package com.creditease.adx.clockwork.common.entity.gen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbClockworkTaskFillDataTimeQueueExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    protected Integer limitStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    protected Integer limitEnd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public TbClockworkTaskFillDataTimeQueueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
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

        public Criteria andFillDataTypeIsNull() {
            addCriterion("fill_data_type is null");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeIsNotNull() {
            addCriterion("fill_data_type is not null");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeEqualTo(String value) {
            addCriterion("fill_data_type =", value, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeNotEqualTo(String value) {
            addCriterion("fill_data_type <>", value, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeGreaterThan(String value) {
            addCriterion("fill_data_type >", value, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fill_data_type >=", value, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeLessThan(String value) {
            addCriterion("fill_data_type <", value, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeLessThanOrEqualTo(String value) {
            addCriterion("fill_data_type <=", value, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeLike(String value) {
            addCriterion("fill_data_type like", value, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeNotLike(String value) {
            addCriterion("fill_data_type not like", value, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeIn(List<String> values) {
            addCriterion("fill_data_type in", values, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeNotIn(List<String> values) {
            addCriterion("fill_data_type not in", values, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeBetween(String value1, String value2) {
            addCriterion("fill_data_type between", value1, value2, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTypeNotBetween(String value1, String value2) {
            addCriterion("fill_data_type not between", value1, value2, "fillDataType");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeIsNull() {
            addCriterion("fill_data_time is null");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeIsNotNull() {
            addCriterion("fill_data_time is not null");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeEqualTo(String value) {
            addCriterion("fill_data_time =", value, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeNotEqualTo(String value) {
            addCriterion("fill_data_time <>", value, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeGreaterThan(String value) {
            addCriterion("fill_data_time >", value, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeGreaterThanOrEqualTo(String value) {
            addCriterion("fill_data_time >=", value, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeLessThan(String value) {
            addCriterion("fill_data_time <", value, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeLessThanOrEqualTo(String value) {
            addCriterion("fill_data_time <=", value, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeLike(String value) {
            addCriterion("fill_data_time like", value, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeNotLike(String value) {
            addCriterion("fill_data_time not like", value, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeIn(List<String> values) {
            addCriterion("fill_data_time in", values, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeNotIn(List<String> values) {
            addCriterion("fill_data_time not in", values, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeBetween(String value1, String value2) {
            addCriterion("fill_data_time between", value1, value2, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andFillDataTimeNotBetween(String value1, String value2) {
            addCriterion("fill_data_time not between", value1, value2, "fillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeIsNull() {
            addCriterion("upper_fill_data_time is null");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeIsNotNull() {
            addCriterion("upper_fill_data_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeEqualTo(String value) {
            addCriterion("upper_fill_data_time =", value, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeNotEqualTo(String value) {
            addCriterion("upper_fill_data_time <>", value, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeGreaterThan(String value) {
            addCriterion("upper_fill_data_time >", value, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeGreaterThanOrEqualTo(String value) {
            addCriterion("upper_fill_data_time >=", value, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeLessThan(String value) {
            addCriterion("upper_fill_data_time <", value, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeLessThanOrEqualTo(String value) {
            addCriterion("upper_fill_data_time <=", value, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeLike(String value) {
            addCriterion("upper_fill_data_time like", value, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeNotLike(String value) {
            addCriterion("upper_fill_data_time not like", value, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeIn(List<String> values) {
            addCriterion("upper_fill_data_time in", values, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeNotIn(List<String> values) {
            addCriterion("upper_fill_data_time not in", values, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeBetween(String value1, String value2) {
            addCriterion("upper_fill_data_time between", value1, value2, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andUpperFillDataTimeNotBetween(String value1, String value2) {
            addCriterion("upper_fill_data_time not between", value1, value2, "upperFillDataTime");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberIsNull() {
            addCriterion("rerun_batch_number is null");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberIsNotNull() {
            addCriterion("rerun_batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberEqualTo(Long value) {
            addCriterion("rerun_batch_number =", value, "rerunBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberNotEqualTo(Long value) {
            addCriterion("rerun_batch_number <>", value, "rerunBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberGreaterThan(Long value) {
            addCriterion("rerun_batch_number >", value, "rerunBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("rerun_batch_number >=", value, "rerunBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberLessThan(Long value) {
            addCriterion("rerun_batch_number <", value, "rerunBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberLessThanOrEqualTo(Long value) {
            addCriterion("rerun_batch_number <=", value, "rerunBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberIn(List<Long> values) {
            addCriterion("rerun_batch_number in", values, "rerunBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberNotIn(List<Long> values) {
            addCriterion("rerun_batch_number not in", values, "rerunBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberBetween(Long value1, Long value2) {
            addCriterion("rerun_batch_number between", value1, value2, "rerunBatchNumber");
            return (Criteria) this;
        }

        public Criteria andRerunBatchNumberNotBetween(Long value1, Long value2) {
            addCriterion("rerun_batch_number not between", value1, value2, "rerunBatchNumber");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated do_not_delete_during_merge Tue Aug 04 15:51:46 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_clockwork_task_fill_data_time_queue
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
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