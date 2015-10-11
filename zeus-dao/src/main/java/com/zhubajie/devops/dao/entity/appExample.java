package com.zhubajie.devops.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class appExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public appExample() {
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Long value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Long value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Long value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Long value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Long value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Long value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Long> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Long> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Long value1, Long value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Long value1, Long value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andScmUrlIsNull() {
            addCriterion("scm_url is null");
            return (Criteria) this;
        }

        public Criteria andScmUrlIsNotNull() {
            addCriterion("scm_url is not null");
            return (Criteria) this;
        }

        public Criteria andScmUrlEqualTo(String value) {
            addCriterion("scm_url =", value, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmUrlNotEqualTo(String value) {
            addCriterion("scm_url <>", value, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmUrlGreaterThan(String value) {
            addCriterion("scm_url >", value, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmUrlGreaterThanOrEqualTo(String value) {
            addCriterion("scm_url >=", value, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmUrlLessThan(String value) {
            addCriterion("scm_url <", value, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmUrlLessThanOrEqualTo(String value) {
            addCriterion("scm_url <=", value, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmUrlLike(String value) {
            addCriterion("scm_url like", value, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmUrlNotLike(String value) {
            addCriterion("scm_url not like", value, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmUrlIn(List<String> values) {
            addCriterion("scm_url in", values, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmUrlNotIn(List<String> values) {
            addCriterion("scm_url not in", values, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmUrlBetween(String value1, String value2) {
            addCriterion("scm_url between", value1, value2, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmUrlNotBetween(String value1, String value2) {
            addCriterion("scm_url not between", value1, value2, "scmUrl");
            return (Criteria) this;
        }

        public Criteria andScmTypeIsNull() {
            addCriterion("scm_type is null");
            return (Criteria) this;
        }

        public Criteria andScmTypeIsNotNull() {
            addCriterion("scm_type is not null");
            return (Criteria) this;
        }

        public Criteria andScmTypeEqualTo(String value) {
            addCriterion("scm_type =", value, "scmType");
            return (Criteria) this;
        }

        public Criteria andScmTypeNotEqualTo(String value) {
            addCriterion("scm_type <>", value, "scmType");
            return (Criteria) this;
        }

        public Criteria andScmTypeGreaterThan(String value) {
            addCriterion("scm_type >", value, "scmType");
            return (Criteria) this;
        }

        public Criteria andScmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("scm_type >=", value, "scmType");
            return (Criteria) this;
        }

        public Criteria andScmTypeLessThan(String value) {
            addCriterion("scm_type <", value, "scmType");
            return (Criteria) this;
        }

        public Criteria andScmTypeLessThanOrEqualTo(String value) {
            addCriterion("scm_type <=", value, "scmType");
            return (Criteria) this;
        }

        public Criteria andScmTypeLike(String value) {
            addCriterion("scm_type like", value, "scmType");
            return (Criteria) this;
        }

        public Criteria andScmTypeNotLike(String value) {
            addCriterion("scm_type not like", value, "scmType");
            return (Criteria) this;
        }

        public Criteria andScmTypeIn(List<String> values) {
            addCriterion("scm_type in", values, "scmType");
            return (Criteria) this;
        }

        public Criteria andScmTypeNotIn(List<String> values) {
            addCriterion("scm_type not in", values, "scmType");
            return (Criteria) this;
        }

        public Criteria andScmTypeBetween(String value1, String value2) {
            addCriterion("scm_type between", value1, value2, "scmType");
            return (Criteria) this;
        }

        public Criteria andScmTypeNotBetween(String value1, String value2) {
            addCriterion("scm_type not between", value1, value2, "scmType");
            return (Criteria) this;
        }

        public Criteria andPkgNameIsNull() {
            addCriterion("pkg_name is null");
            return (Criteria) this;
        }

        public Criteria andPkgNameIsNotNull() {
            addCriterion("pkg_name is not null");
            return (Criteria) this;
        }

        public Criteria andPkgNameEqualTo(String value) {
            addCriterion("pkg_name =", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotEqualTo(String value) {
            addCriterion("pkg_name <>", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameGreaterThan(String value) {
            addCriterion("pkg_name >", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameGreaterThanOrEqualTo(String value) {
            addCriterion("pkg_name >=", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLessThan(String value) {
            addCriterion("pkg_name <", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLessThanOrEqualTo(String value) {
            addCriterion("pkg_name <=", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLike(String value) {
            addCriterion("pkg_name like", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotLike(String value) {
            addCriterion("pkg_name not like", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameIn(List<String> values) {
            addCriterion("pkg_name in", values, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotIn(List<String> values) {
            addCriterion("pkg_name not in", values, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameBetween(String value1, String value2) {
            addCriterion("pkg_name between", value1, value2, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotBetween(String value1, String value2) {
            addCriterion("pkg_name not between", value1, value2, "pkgName");
            return (Criteria) this;
        }

        public Criteria andCompileStyleIsNull() {
            addCriterion("compile_style is null");
            return (Criteria) this;
        }

        public Criteria andCompileStyleIsNotNull() {
            addCriterion("compile_style is not null");
            return (Criteria) this;
        }

        public Criteria andCompileStyleEqualTo(String value) {
            addCriterion("compile_style =", value, "compileStyle");
            return (Criteria) this;
        }

        public Criteria andCompileStyleNotEqualTo(String value) {
            addCriterion("compile_style <>", value, "compileStyle");
            return (Criteria) this;
        }

        public Criteria andCompileStyleGreaterThan(String value) {
            addCriterion("compile_style >", value, "compileStyle");
            return (Criteria) this;
        }

        public Criteria andCompileStyleGreaterThanOrEqualTo(String value) {
            addCriterion("compile_style >=", value, "compileStyle");
            return (Criteria) this;
        }

        public Criteria andCompileStyleLessThan(String value) {
            addCriterion("compile_style <", value, "compileStyle");
            return (Criteria) this;
        }

        public Criteria andCompileStyleLessThanOrEqualTo(String value) {
            addCriterion("compile_style <=", value, "compileStyle");
            return (Criteria) this;
        }

        public Criteria andCompileStyleLike(String value) {
            addCriterion("compile_style like", value, "compileStyle");
            return (Criteria) this;
        }

        public Criteria andCompileStyleNotLike(String value) {
            addCriterion("compile_style not like", value, "compileStyle");
            return (Criteria) this;
        }

        public Criteria andCompileStyleIn(List<String> values) {
            addCriterion("compile_style in", values, "compileStyle");
            return (Criteria) this;
        }

        public Criteria andCompileStyleNotIn(List<String> values) {
            addCriterion("compile_style not in", values, "compileStyle");
            return (Criteria) this;
        }

        public Criteria andCompileStyleBetween(String value1, String value2) {
            addCriterion("compile_style between", value1, value2, "compileStyle");
            return (Criteria) this;
        }

        public Criteria andCompileStyleNotBetween(String value1, String value2) {
            addCriterion("compile_style not between", value1, value2, "compileStyle");
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