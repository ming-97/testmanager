package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CourseChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseChapterExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCcIdIsNull() {
            addCriterion("cc_id is null");
            return (Criteria) this;
        }

        public Criteria andCcIdIsNotNull() {
            addCriterion("cc_id is not null");
            return (Criteria) this;
        }

        public Criteria andCcIdEqualTo(Long value) {
            addCriterion("cc_id =", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotEqualTo(Long value) {
            addCriterion("cc_id <>", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdGreaterThan(Long value) {
            addCriterion("cc_id >", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cc_id >=", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLessThan(Long value) {
            addCriterion("cc_id <", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdLessThanOrEqualTo(Long value) {
            addCriterion("cc_id <=", value, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdIn(List<Long> values) {
            addCriterion("cc_id in", values, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotIn(List<Long> values) {
            addCriterion("cc_id not in", values, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdBetween(Long value1, Long value2) {
            addCriterion("cc_id between", value1, value2, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcIdNotBetween(Long value1, Long value2) {
            addCriterion("cc_id not between", value1, value2, "ccId");
            return (Criteria) this;
        }

        public Criteria andCcCidIsNull() {
            addCriterion("cc_cid is null");
            return (Criteria) this;
        }

        public Criteria andCcCidIsNotNull() {
            addCriterion("cc_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCcCidEqualTo(Long value) {
            addCriterion("cc_cid =", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidNotEqualTo(Long value) {
            addCriterion("cc_cid <>", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidGreaterThan(Long value) {
            addCriterion("cc_cid >", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cc_cid >=", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidLessThan(Long value) {
            addCriterion("cc_cid <", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidLessThanOrEqualTo(Long value) {
            addCriterion("cc_cid <=", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidIn(List<Long> values) {
            addCriterion("cc_cid in", values, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidNotIn(List<Long> values) {
            addCriterion("cc_cid not in", values, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidBetween(Long value1, Long value2) {
            addCriterion("cc_cid between", value1, value2, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidNotBetween(Long value1, Long value2) {
            addCriterion("cc_cid not between", value1, value2, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcInsidIsNull() {
            addCriterion("cc_insid is null");
            return (Criteria) this;
        }

        public Criteria andCcInsidIsNotNull() {
            addCriterion("cc_insid is not null");
            return (Criteria) this;
        }

        public Criteria andCcInsidEqualTo(Long value) {
            addCriterion("cc_insid =", value, "ccInsid");
            return (Criteria) this;
        }

        public Criteria andCcInsidNotEqualTo(Long value) {
            addCriterion("cc_insid <>", value, "ccInsid");
            return (Criteria) this;
        }

        public Criteria andCcInsidGreaterThan(Long value) {
            addCriterion("cc_insid >", value, "ccInsid");
            return (Criteria) this;
        }

        public Criteria andCcInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("cc_insid >=", value, "ccInsid");
            return (Criteria) this;
        }

        public Criteria andCcInsidLessThan(Long value) {
            addCriterion("cc_insid <", value, "ccInsid");
            return (Criteria) this;
        }

        public Criteria andCcInsidLessThanOrEqualTo(Long value) {
            addCriterion("cc_insid <=", value, "ccInsid");
            return (Criteria) this;
        }

        public Criteria andCcInsidIn(List<Long> values) {
            addCriterion("cc_insid in", values, "ccInsid");
            return (Criteria) this;
        }

        public Criteria andCcInsidNotIn(List<Long> values) {
            addCriterion("cc_insid not in", values, "ccInsid");
            return (Criteria) this;
        }

        public Criteria andCcInsidBetween(Long value1, Long value2) {
            addCriterion("cc_insid between", value1, value2, "ccInsid");
            return (Criteria) this;
        }

        public Criteria andCcInsidNotBetween(Long value1, Long value2) {
            addCriterion("cc_insid not between", value1, value2, "ccInsid");
            return (Criteria) this;
        }

        public Criteria andCcNameIsNull() {
            addCriterion("cc_name is null");
            return (Criteria) this;
        }

        public Criteria andCcNameIsNotNull() {
            addCriterion("cc_name is not null");
            return (Criteria) this;
        }

        public Criteria andCcNameEqualTo(String value) {
            addCriterion("cc_name =", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotEqualTo(String value) {
            addCriterion("cc_name <>", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameGreaterThan(String value) {
            addCriterion("cc_name >", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameGreaterThanOrEqualTo(String value) {
            addCriterion("cc_name >=", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameLessThan(String value) {
            addCriterion("cc_name <", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameLessThanOrEqualTo(String value) {
            addCriterion("cc_name <=", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameLike(String value) {
            addCriterion("cc_name like", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotLike(String value) {
            addCriterion("cc_name not like", value, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameIn(List<String> values) {
            addCriterion("cc_name in", values, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotIn(List<String> values) {
            addCriterion("cc_name not in", values, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameBetween(String value1, String value2) {
            addCriterion("cc_name between", value1, value2, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcNameNotBetween(String value1, String value2) {
            addCriterion("cc_name not between", value1, value2, "ccName");
            return (Criteria) this;
        }

        public Criteria andCcCreateByIsNull() {
            addCriterion("cc_create_by is null");
            return (Criteria) this;
        }

        public Criteria andCcCreateByIsNotNull() {
            addCriterion("cc_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCcCreateByEqualTo(String value) {
            addCriterion("cc_create_by =", value, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateByNotEqualTo(String value) {
            addCriterion("cc_create_by <>", value, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateByGreaterThan(String value) {
            addCriterion("cc_create_by >", value, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("cc_create_by >=", value, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateByLessThan(String value) {
            addCriterion("cc_create_by <", value, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateByLessThanOrEqualTo(String value) {
            addCriterion("cc_create_by <=", value, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateByLike(String value) {
            addCriterion("cc_create_by like", value, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateByNotLike(String value) {
            addCriterion("cc_create_by not like", value, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateByIn(List<String> values) {
            addCriterion("cc_create_by in", values, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateByNotIn(List<String> values) {
            addCriterion("cc_create_by not in", values, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateByBetween(String value1, String value2) {
            addCriterion("cc_create_by between", value1, value2, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateByNotBetween(String value1, String value2) {
            addCriterion("cc_create_by not between", value1, value2, "ccCreateBy");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeIsNull() {
            addCriterion("cc_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeIsNotNull() {
            addCriterion("cc_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("cc_create_time =", value, "ccCreateTime");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("cc_create_time <>", value, "ccCreateTime");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("cc_create_time >", value, "ccCreateTime");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cc_create_time >=", value, "ccCreateTime");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("cc_create_time <", value, "ccCreateTime");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cc_create_time <=", value, "ccCreateTime");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("cc_create_time in", values, "ccCreateTime");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("cc_create_time not in", values, "ccCreateTime");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cc_create_time between", value1, value2, "ccCreateTime");
            return (Criteria) this;
        }

        public Criteria andCcCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cc_create_time not between", value1, value2, "ccCreateTime");
            return (Criteria) this;
        }

        public Criteria andCcModifyByIsNull() {
            addCriterion("cc_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andCcModifyByIsNotNull() {
            addCriterion("cc_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andCcModifyByEqualTo(String value) {
            addCriterion("cc_modify_by =", value, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyByNotEqualTo(String value) {
            addCriterion("cc_modify_by <>", value, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyByGreaterThan(String value) {
            addCriterion("cc_modify_by >", value, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("cc_modify_by >=", value, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyByLessThan(String value) {
            addCriterion("cc_modify_by <", value, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyByLessThanOrEqualTo(String value) {
            addCriterion("cc_modify_by <=", value, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyByLike(String value) {
            addCriterion("cc_modify_by like", value, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyByNotLike(String value) {
            addCriterion("cc_modify_by not like", value, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyByIn(List<String> values) {
            addCriterion("cc_modify_by in", values, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyByNotIn(List<String> values) {
            addCriterion("cc_modify_by not in", values, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyByBetween(String value1, String value2) {
            addCriterion("cc_modify_by between", value1, value2, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyByNotBetween(String value1, String value2) {
            addCriterion("cc_modify_by not between", value1, value2, "ccModifyBy");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeIsNull() {
            addCriterion("cc_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeIsNotNull() {
            addCriterion("cc_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("cc_modify_time =", value, "ccModifyTime");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("cc_modify_time <>", value, "ccModifyTime");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("cc_modify_time >", value, "ccModifyTime");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cc_modify_time >=", value, "ccModifyTime");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("cc_modify_time <", value, "ccModifyTime");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cc_modify_time <=", value, "ccModifyTime");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("cc_modify_time in", values, "ccModifyTime");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("cc_modify_time not in", values, "ccModifyTime");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cc_modify_time between", value1, value2, "ccModifyTime");
            return (Criteria) this;
        }

        public Criteria andCcModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cc_modify_time not between", value1, value2, "ccModifyTime");
            return (Criteria) this;
        }

        public Criteria andCcDeleteIsNull() {
            addCriterion("cc_delete is null");
            return (Criteria) this;
        }

        public Criteria andCcDeleteIsNotNull() {
            addCriterion("cc_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCcDeleteEqualTo(Boolean value) {
            addCriterion("cc_delete =", value, "ccDelete");
            return (Criteria) this;
        }

        public Criteria andCcDeleteNotEqualTo(Boolean value) {
            addCriterion("cc_delete <>", value, "ccDelete");
            return (Criteria) this;
        }

        public Criteria andCcDeleteGreaterThan(Boolean value) {
            addCriterion("cc_delete >", value, "ccDelete");
            return (Criteria) this;
        }

        public Criteria andCcDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cc_delete >=", value, "ccDelete");
            return (Criteria) this;
        }

        public Criteria andCcDeleteLessThan(Boolean value) {
            addCriterion("cc_delete <", value, "ccDelete");
            return (Criteria) this;
        }

        public Criteria andCcDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("cc_delete <=", value, "ccDelete");
            return (Criteria) this;
        }

        public Criteria andCcDeleteIn(List<Boolean> values) {
            addCriterion("cc_delete in", values, "ccDelete");
            return (Criteria) this;
        }

        public Criteria andCcDeleteNotIn(List<Boolean> values) {
            addCriterion("cc_delete not in", values, "ccDelete");
            return (Criteria) this;
        }

        public Criteria andCcDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("cc_delete between", value1, value2, "ccDelete");
            return (Criteria) this;
        }

        public Criteria andCcDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cc_delete not between", value1, value2, "ccDelete");
            return (Criteria) this;
        }

        public Criteria andCcVersionIsNull() {
            addCriterion("cc_version is null");
            return (Criteria) this;
        }

        public Criteria andCcVersionIsNotNull() {
            addCriterion("cc_version is not null");
            return (Criteria) this;
        }

        public Criteria andCcVersionEqualTo(Integer value) {
            addCriterion("cc_version =", value, "ccVersion");
            return (Criteria) this;
        }

        public Criteria andCcVersionNotEqualTo(Integer value) {
            addCriterion("cc_version <>", value, "ccVersion");
            return (Criteria) this;
        }

        public Criteria andCcVersionGreaterThan(Integer value) {
            addCriterion("cc_version >", value, "ccVersion");
            return (Criteria) this;
        }

        public Criteria andCcVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("cc_version >=", value, "ccVersion");
            return (Criteria) this;
        }

        public Criteria andCcVersionLessThan(Integer value) {
            addCriterion("cc_version <", value, "ccVersion");
            return (Criteria) this;
        }

        public Criteria andCcVersionLessThanOrEqualTo(Integer value) {
            addCriterion("cc_version <=", value, "ccVersion");
            return (Criteria) this;
        }

        public Criteria andCcVersionIn(List<Integer> values) {
            addCriterion("cc_version in", values, "ccVersion");
            return (Criteria) this;
        }

        public Criteria andCcVersionNotIn(List<Integer> values) {
            addCriterion("cc_version not in", values, "ccVersion");
            return (Criteria) this;
        }

        public Criteria andCcVersionBetween(Integer value1, Integer value2) {
            addCriterion("cc_version between", value1, value2, "ccVersion");
            return (Criteria) this;
        }

        public Criteria andCcVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("cc_version not between", value1, value2, "ccVersion");
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