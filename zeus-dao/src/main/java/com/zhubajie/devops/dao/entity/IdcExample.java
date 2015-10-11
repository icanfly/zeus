package com.zhubajie.devops.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IdcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IdcExample() {
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

        public Criteria andIdcIdIsNull() {
            addCriterion("idc_id is null");
            return (Criteria) this;
        }

        public Criteria andIdcIdIsNotNull() {
            addCriterion("idc_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdcIdEqualTo(Long value) {
            addCriterion("idc_id =", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdNotEqualTo(Long value) {
            addCriterion("idc_id <>", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdGreaterThan(Long value) {
            addCriterion("idc_id >", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("idc_id >=", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdLessThan(Long value) {
            addCriterion("idc_id <", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdLessThanOrEqualTo(Long value) {
            addCriterion("idc_id <=", value, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdIn(List<Long> values) {
            addCriterion("idc_id in", values, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdNotIn(List<Long> values) {
            addCriterion("idc_id not in", values, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdBetween(Long value1, Long value2) {
            addCriterion("idc_id between", value1, value2, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcIdNotBetween(Long value1, Long value2) {
            addCriterion("idc_id not between", value1, value2, "idcId");
            return (Criteria) this;
        }

        public Criteria andIdcNameIsNull() {
            addCriterion("idc_name is null");
            return (Criteria) this;
        }

        public Criteria andIdcNameIsNotNull() {
            addCriterion("idc_name is not null");
            return (Criteria) this;
        }

        public Criteria andIdcNameEqualTo(String value) {
            addCriterion("idc_name =", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameNotEqualTo(String value) {
            addCriterion("idc_name <>", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameGreaterThan(String value) {
            addCriterion("idc_name >", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameGreaterThanOrEqualTo(String value) {
            addCriterion("idc_name >=", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameLessThan(String value) {
            addCriterion("idc_name <", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameLessThanOrEqualTo(String value) {
            addCriterion("idc_name <=", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameLike(String value) {
            addCriterion("idc_name like", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameNotLike(String value) {
            addCriterion("idc_name not like", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameIn(List<String> values) {
            addCriterion("idc_name in", values, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameNotIn(List<String> values) {
            addCriterion("idc_name not in", values, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameBetween(String value1, String value2) {
            addCriterion("idc_name between", value1, value2, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameNotBetween(String value1, String value2) {
            addCriterion("idc_name not between", value1, value2, "idcName");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNull() {
            addCriterion("raw_add_time is null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNotNull() {
            addCriterion("raw_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeEqualTo(Date value) {
            addCriterion("raw_add_time =", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotEqualTo(Date value) {
            addCriterion("raw_add_time <>", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThan(Date value) {
            addCriterion("raw_add_time >", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_add_time >=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThan(Date value) {
            addCriterion("raw_add_time <", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_add_time <=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIn(List<Date> values) {
            addCriterion("raw_add_time in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotIn(List<Date> values) {
            addCriterion("raw_add_time not in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeBetween(Date value1, Date value2) {
            addCriterion("raw_add_time between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_add_time not between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNull() {
            addCriterion("raw_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNotNull() {
            addCriterion("raw_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeEqualTo(Date value) {
            addCriterion("raw_update_time =", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotEqualTo(Date value) {
            addCriterion("raw_update_time <>", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThan(Date value) {
            addCriterion("raw_update_time >", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_update_time >=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThan(Date value) {
            addCriterion("raw_update_time <", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_update_time <=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIn(List<Date> values) {
            addCriterion("raw_update_time in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotIn(List<Date> values) {
            addCriterion("raw_update_time not in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("raw_update_time between", value1, value2, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_update_time not between", value1, value2, "rawUpdateTime");
            return (Criteria) this;
        }
    }

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