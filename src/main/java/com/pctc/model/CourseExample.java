package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Long value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Long value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Long value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Long value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Long value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Long> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Long> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Long value1, Long value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Long value1, Long value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCInsidIsNull() {
            addCriterion("c_insid is null");
            return (Criteria) this;
        }

        public Criteria andCInsidIsNotNull() {
            addCriterion("c_insid is not null");
            return (Criteria) this;
        }

        public Criteria andCInsidEqualTo(Long value) {
            addCriterion("c_insid =", value, "cInsid");
            return (Criteria) this;
        }

        public Criteria andCInsidNotEqualTo(Long value) {
            addCriterion("c_insid <>", value, "cInsid");
            return (Criteria) this;
        }

        public Criteria andCInsidGreaterThan(Long value) {
            addCriterion("c_insid >", value, "cInsid");
            return (Criteria) this;
        }

        public Criteria andCInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("c_insid >=", value, "cInsid");
            return (Criteria) this;
        }

        public Criteria andCInsidLessThan(Long value) {
            addCriterion("c_insid <", value, "cInsid");
            return (Criteria) this;
        }

        public Criteria andCInsidLessThanOrEqualTo(Long value) {
            addCriterion("c_insid <=", value, "cInsid");
            return (Criteria) this;
        }

        public Criteria andCInsidIn(List<Long> values) {
            addCriterion("c_insid in", values, "cInsid");
            return (Criteria) this;
        }

        public Criteria andCInsidNotIn(List<Long> values) {
            addCriterion("c_insid not in", values, "cInsid");
            return (Criteria) this;
        }

        public Criteria andCInsidBetween(Long value1, Long value2) {
            addCriterion("c_insid between", value1, value2, "cInsid");
            return (Criteria) this;
        }

        public Criteria andCInsidNotBetween(Long value1, Long value2) {
            addCriterion("c_insid not between", value1, value2, "cInsid");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCCreateByIsNull() {
            addCriterion("c_create_by is null");
            return (Criteria) this;
        }

        public Criteria andCCreateByIsNotNull() {
            addCriterion("c_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCCreateByEqualTo(String value) {
            addCriterion("c_create_by =", value, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateByNotEqualTo(String value) {
            addCriterion("c_create_by <>", value, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateByGreaterThan(String value) {
            addCriterion("c_create_by >", value, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("c_create_by >=", value, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateByLessThan(String value) {
            addCriterion("c_create_by <", value, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateByLessThanOrEqualTo(String value) {
            addCriterion("c_create_by <=", value, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateByLike(String value) {
            addCriterion("c_create_by like", value, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateByNotLike(String value) {
            addCriterion("c_create_by not like", value, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateByIn(List<String> values) {
            addCriterion("c_create_by in", values, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateByNotIn(List<String> values) {
            addCriterion("c_create_by not in", values, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateByBetween(String value1, String value2) {
            addCriterion("c_create_by between", value1, value2, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateByNotBetween(String value1, String value2) {
            addCriterion("c_create_by not between", value1, value2, "cCreateBy");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNull() {
            addCriterion("c_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNotNull() {
            addCriterion("c_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("c_create_time =", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_create_time <>", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("c_create_time >", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_create_time >=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("c_create_time <", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_create_time <=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("c_create_time in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_create_time not in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_create_time between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_create_time not between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCModifyByIsNull() {
            addCriterion("c_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andCModifyByIsNotNull() {
            addCriterion("c_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andCModifyByEqualTo(String value) {
            addCriterion("c_modify_by =", value, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyByNotEqualTo(String value) {
            addCriterion("c_modify_by <>", value, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyByGreaterThan(String value) {
            addCriterion("c_modify_by >", value, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("c_modify_by >=", value, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyByLessThan(String value) {
            addCriterion("c_modify_by <", value, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyByLessThanOrEqualTo(String value) {
            addCriterion("c_modify_by <=", value, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyByLike(String value) {
            addCriterion("c_modify_by like", value, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyByNotLike(String value) {
            addCriterion("c_modify_by not like", value, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyByIn(List<String> values) {
            addCriterion("c_modify_by in", values, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyByNotIn(List<String> values) {
            addCriterion("c_modify_by not in", values, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyByBetween(String value1, String value2) {
            addCriterion("c_modify_by between", value1, value2, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyByNotBetween(String value1, String value2) {
            addCriterion("c_modify_by not between", value1, value2, "cModifyBy");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeIsNull() {
            addCriterion("c_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeIsNotNull() {
            addCriterion("c_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("c_modify_time =", value, "cModifyTime");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_modify_time <>", value, "cModifyTime");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("c_modify_time >", value, "cModifyTime");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_modify_time >=", value, "cModifyTime");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("c_modify_time <", value, "cModifyTime");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_modify_time <=", value, "cModifyTime");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("c_modify_time in", values, "cModifyTime");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_modify_time not in", values, "cModifyTime");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_modify_time between", value1, value2, "cModifyTime");
            return (Criteria) this;
        }

        public Criteria andCModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_modify_time not between", value1, value2, "cModifyTime");
            return (Criteria) this;
        }

        public Criteria andCDeleteIsNull() {
            addCriterion("c_delete is null");
            return (Criteria) this;
        }

        public Criteria andCDeleteIsNotNull() {
            addCriterion("c_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCDeleteEqualTo(Boolean value) {
            addCriterion("c_delete =", value, "cDelete");
            return (Criteria) this;
        }

        public Criteria andCDeleteNotEqualTo(Boolean value) {
            addCriterion("c_delete <>", value, "cDelete");
            return (Criteria) this;
        }

        public Criteria andCDeleteGreaterThan(Boolean value) {
            addCriterion("c_delete >", value, "cDelete");
            return (Criteria) this;
        }

        public Criteria andCDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("c_delete >=", value, "cDelete");
            return (Criteria) this;
        }

        public Criteria andCDeleteLessThan(Boolean value) {
            addCriterion("c_delete <", value, "cDelete");
            return (Criteria) this;
        }

        public Criteria andCDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("c_delete <=", value, "cDelete");
            return (Criteria) this;
        }

        public Criteria andCDeleteIn(List<Boolean> values) {
            addCriterion("c_delete in", values, "cDelete");
            return (Criteria) this;
        }

        public Criteria andCDeleteNotIn(List<Boolean> values) {
            addCriterion("c_delete not in", values, "cDelete");
            return (Criteria) this;
        }

        public Criteria andCDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("c_delete between", value1, value2, "cDelete");
            return (Criteria) this;
        }

        public Criteria andCDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("c_delete not between", value1, value2, "cDelete");
            return (Criteria) this;
        }

        public Criteria andCVersionIsNull() {
            addCriterion("c_version is null");
            return (Criteria) this;
        }

        public Criteria andCVersionIsNotNull() {
            addCriterion("c_version is not null");
            return (Criteria) this;
        }

        public Criteria andCVersionEqualTo(Integer value) {
            addCriterion("c_version =", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionNotEqualTo(Integer value) {
            addCriterion("c_version <>", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionGreaterThan(Integer value) {
            addCriterion("c_version >", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_version >=", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionLessThan(Integer value) {
            addCriterion("c_version <", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionLessThanOrEqualTo(Integer value) {
            addCriterion("c_version <=", value, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionIn(List<Integer> values) {
            addCriterion("c_version in", values, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionNotIn(List<Integer> values) {
            addCriterion("c_version not in", values, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionBetween(Integer value1, Integer value2) {
            addCriterion("c_version between", value1, value2, "cVersion");
            return (Criteria) this;
        }

        public Criteria andCVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("c_version not between", value1, value2, "cVersion");
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