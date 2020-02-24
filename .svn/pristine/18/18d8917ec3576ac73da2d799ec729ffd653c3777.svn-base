package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuestionTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionTypeExample() {
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

        public Criteria andQtIdIsNull() {
            addCriterion("qt_id is null");
            return (Criteria) this;
        }

        public Criteria andQtIdIsNotNull() {
            addCriterion("qt_id is not null");
            return (Criteria) this;
        }

        public Criteria andQtIdEqualTo(Long value) {
            addCriterion("qt_id =", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdNotEqualTo(Long value) {
            addCriterion("qt_id <>", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdGreaterThan(Long value) {
            addCriterion("qt_id >", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("qt_id >=", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdLessThan(Long value) {
            addCriterion("qt_id <", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdLessThanOrEqualTo(Long value) {
            addCriterion("qt_id <=", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdIn(List<Long> values) {
            addCriterion("qt_id in", values, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdNotIn(List<Long> values) {
            addCriterion("qt_id not in", values, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdBetween(Long value1, Long value2) {
            addCriterion("qt_id between", value1, value2, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdNotBetween(Long value1, Long value2) {
            addCriterion("qt_id not between", value1, value2, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtInsidIsNull() {
            addCriterion("qt_insid is null");
            return (Criteria) this;
        }

        public Criteria andQtInsidIsNotNull() {
            addCriterion("qt_insid is not null");
            return (Criteria) this;
        }

        public Criteria andQtInsidEqualTo(Long value) {
            addCriterion("qt_insid =", value, "qtInsid");
            return (Criteria) this;
        }

        public Criteria andQtInsidNotEqualTo(Long value) {
            addCriterion("qt_insid <>", value, "qtInsid");
            return (Criteria) this;
        }

        public Criteria andQtInsidGreaterThan(Long value) {
            addCriterion("qt_insid >", value, "qtInsid");
            return (Criteria) this;
        }

        public Criteria andQtInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("qt_insid >=", value, "qtInsid");
            return (Criteria) this;
        }

        public Criteria andQtInsidLessThan(Long value) {
            addCriterion("qt_insid <", value, "qtInsid");
            return (Criteria) this;
        }

        public Criteria andQtInsidLessThanOrEqualTo(Long value) {
            addCriterion("qt_insid <=", value, "qtInsid");
            return (Criteria) this;
        }

        public Criteria andQtInsidIn(List<Long> values) {
            addCriterion("qt_insid in", values, "qtInsid");
            return (Criteria) this;
        }

        public Criteria andQtInsidNotIn(List<Long> values) {
            addCriterion("qt_insid not in", values, "qtInsid");
            return (Criteria) this;
        }

        public Criteria andQtInsidBetween(Long value1, Long value2) {
            addCriterion("qt_insid between", value1, value2, "qtInsid");
            return (Criteria) this;
        }

        public Criteria andQtInsidNotBetween(Long value1, Long value2) {
            addCriterion("qt_insid not between", value1, value2, "qtInsid");
            return (Criteria) this;
        }

        public Criteria andQtNameIsNull() {
            addCriterion("qt_name is null");
            return (Criteria) this;
        }

        public Criteria andQtNameIsNotNull() {
            addCriterion("qt_name is not null");
            return (Criteria) this;
        }

        public Criteria andQtNameEqualTo(String value) {
            addCriterion("qt_name =", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotEqualTo(String value) {
            addCriterion("qt_name <>", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameGreaterThan(String value) {
            addCriterion("qt_name >", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameGreaterThanOrEqualTo(String value) {
            addCriterion("qt_name >=", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameLessThan(String value) {
            addCriterion("qt_name <", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameLessThanOrEqualTo(String value) {
            addCriterion("qt_name <=", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameLike(String value) {
            addCriterion("qt_name like", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotLike(String value) {
            addCriterion("qt_name not like", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameIn(List<String> values) {
            addCriterion("qt_name in", values, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotIn(List<String> values) {
            addCriterion("qt_name not in", values, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameBetween(String value1, String value2) {
            addCriterion("qt_name between", value1, value2, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotBetween(String value1, String value2) {
            addCriterion("qt_name not between", value1, value2, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtGradeIsNull() {
            addCriterion("qt_grade is null");
            return (Criteria) this;
        }

        public Criteria andQtGradeIsNotNull() {
            addCriterion("qt_grade is not null");
            return (Criteria) this;
        }

        public Criteria andQtGradeEqualTo(Integer value) {
            addCriterion("qt_grade =", value, "qtGrade");
            return (Criteria) this;
        }

        public Criteria andQtGradeNotEqualTo(Integer value) {
            addCriterion("qt_grade <>", value, "qtGrade");
            return (Criteria) this;
        }

        public Criteria andQtGradeGreaterThan(Integer value) {
            addCriterion("qt_grade >", value, "qtGrade");
            return (Criteria) this;
        }

        public Criteria andQtGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("qt_grade >=", value, "qtGrade");
            return (Criteria) this;
        }

        public Criteria andQtGradeLessThan(Integer value) {
            addCriterion("qt_grade <", value, "qtGrade");
            return (Criteria) this;
        }

        public Criteria andQtGradeLessThanOrEqualTo(Integer value) {
            addCriterion("qt_grade <=", value, "qtGrade");
            return (Criteria) this;
        }

        public Criteria andQtGradeIn(List<Integer> values) {
            addCriterion("qt_grade in", values, "qtGrade");
            return (Criteria) this;
        }

        public Criteria andQtGradeNotIn(List<Integer> values) {
            addCriterion("qt_grade not in", values, "qtGrade");
            return (Criteria) this;
        }

        public Criteria andQtGradeBetween(Integer value1, Integer value2) {
            addCriterion("qt_grade between", value1, value2, "qtGrade");
            return (Criteria) this;
        }

        public Criteria andQtGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("qt_grade not between", value1, value2, "qtGrade");
            return (Criteria) this;
        }

        public Criteria andQtCreateByIsNull() {
            addCriterion("qt_create_by is null");
            return (Criteria) this;
        }

        public Criteria andQtCreateByIsNotNull() {
            addCriterion("qt_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andQtCreateByEqualTo(String value) {
            addCriterion("qt_create_by =", value, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateByNotEqualTo(String value) {
            addCriterion("qt_create_by <>", value, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateByGreaterThan(String value) {
            addCriterion("qt_create_by >", value, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("qt_create_by >=", value, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateByLessThan(String value) {
            addCriterion("qt_create_by <", value, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateByLessThanOrEqualTo(String value) {
            addCriterion("qt_create_by <=", value, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateByLike(String value) {
            addCriterion("qt_create_by like", value, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateByNotLike(String value) {
            addCriterion("qt_create_by not like", value, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateByIn(List<String> values) {
            addCriterion("qt_create_by in", values, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateByNotIn(List<String> values) {
            addCriterion("qt_create_by not in", values, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateByBetween(String value1, String value2) {
            addCriterion("qt_create_by between", value1, value2, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateByNotBetween(String value1, String value2) {
            addCriterion("qt_create_by not between", value1, value2, "qtCreateBy");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeIsNull() {
            addCriterion("qt_create_time is null");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeIsNotNull() {
            addCriterion("qt_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qt_create_time =", value, "qtCreateTime");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qt_create_time <>", value, "qtCreateTime");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qt_create_time >", value, "qtCreateTime");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qt_create_time >=", value, "qtCreateTime");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("qt_create_time <", value, "qtCreateTime");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qt_create_time <=", value, "qtCreateTime");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qt_create_time in", values, "qtCreateTime");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qt_create_time not in", values, "qtCreateTime");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qt_create_time between", value1, value2, "qtCreateTime");
            return (Criteria) this;
        }

        public Criteria andQtCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qt_create_time not between", value1, value2, "qtCreateTime");
            return (Criteria) this;
        }

        public Criteria andQtModifyByIsNull() {
            addCriterion("qt_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andQtModifyByIsNotNull() {
            addCriterion("qt_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andQtModifyByEqualTo(String value) {
            addCriterion("qt_modify_by =", value, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyByNotEqualTo(String value) {
            addCriterion("qt_modify_by <>", value, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyByGreaterThan(String value) {
            addCriterion("qt_modify_by >", value, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("qt_modify_by >=", value, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyByLessThan(String value) {
            addCriterion("qt_modify_by <", value, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyByLessThanOrEqualTo(String value) {
            addCriterion("qt_modify_by <=", value, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyByLike(String value) {
            addCriterion("qt_modify_by like", value, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyByNotLike(String value) {
            addCriterion("qt_modify_by not like", value, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyByIn(List<String> values) {
            addCriterion("qt_modify_by in", values, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyByNotIn(List<String> values) {
            addCriterion("qt_modify_by not in", values, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyByBetween(String value1, String value2) {
            addCriterion("qt_modify_by between", value1, value2, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyByNotBetween(String value1, String value2) {
            addCriterion("qt_modify_by not between", value1, value2, "qtModifyBy");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeIsNull() {
            addCriterion("qt_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeIsNotNull() {
            addCriterion("qt_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qt_modify_time =", value, "qtModifyTime");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qt_modify_time <>", value, "qtModifyTime");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qt_modify_time >", value, "qtModifyTime");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qt_modify_time >=", value, "qtModifyTime");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("qt_modify_time <", value, "qtModifyTime");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qt_modify_time <=", value, "qtModifyTime");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qt_modify_time in", values, "qtModifyTime");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qt_modify_time not in", values, "qtModifyTime");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qt_modify_time between", value1, value2, "qtModifyTime");
            return (Criteria) this;
        }

        public Criteria andQtModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qt_modify_time not between", value1, value2, "qtModifyTime");
            return (Criteria) this;
        }

        public Criteria andQtDeleteIsNull() {
            addCriterion("qt_delete is null");
            return (Criteria) this;
        }

        public Criteria andQtDeleteIsNotNull() {
            addCriterion("qt_delete is not null");
            return (Criteria) this;
        }

        public Criteria andQtDeleteEqualTo(Boolean value) {
            addCriterion("qt_delete =", value, "qtDelete");
            return (Criteria) this;
        }

        public Criteria andQtDeleteNotEqualTo(Boolean value) {
            addCriterion("qt_delete <>", value, "qtDelete");
            return (Criteria) this;
        }

        public Criteria andQtDeleteGreaterThan(Boolean value) {
            addCriterion("qt_delete >", value, "qtDelete");
            return (Criteria) this;
        }

        public Criteria andQtDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("qt_delete >=", value, "qtDelete");
            return (Criteria) this;
        }

        public Criteria andQtDeleteLessThan(Boolean value) {
            addCriterion("qt_delete <", value, "qtDelete");
            return (Criteria) this;
        }

        public Criteria andQtDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("qt_delete <=", value, "qtDelete");
            return (Criteria) this;
        }

        public Criteria andQtDeleteIn(List<Boolean> values) {
            addCriterion("qt_delete in", values, "qtDelete");
            return (Criteria) this;
        }

        public Criteria andQtDeleteNotIn(List<Boolean> values) {
            addCriterion("qt_delete not in", values, "qtDelete");
            return (Criteria) this;
        }

        public Criteria andQtDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("qt_delete between", value1, value2, "qtDelete");
            return (Criteria) this;
        }

        public Criteria andQtDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("qt_delete not between", value1, value2, "qtDelete");
            return (Criteria) this;
        }

        public Criteria andQtVersionIsNull() {
            addCriterion("qt_version is null");
            return (Criteria) this;
        }

        public Criteria andQtVersionIsNotNull() {
            addCriterion("qt_version is not null");
            return (Criteria) this;
        }

        public Criteria andQtVersionEqualTo(Integer value) {
            addCriterion("qt_version =", value, "qtVersion");
            return (Criteria) this;
        }

        public Criteria andQtVersionNotEqualTo(Integer value) {
            addCriterion("qt_version <>", value, "qtVersion");
            return (Criteria) this;
        }

        public Criteria andQtVersionGreaterThan(Integer value) {
            addCriterion("qt_version >", value, "qtVersion");
            return (Criteria) this;
        }

        public Criteria andQtVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("qt_version >=", value, "qtVersion");
            return (Criteria) this;
        }

        public Criteria andQtVersionLessThan(Integer value) {
            addCriterion("qt_version <", value, "qtVersion");
            return (Criteria) this;
        }

        public Criteria andQtVersionLessThanOrEqualTo(Integer value) {
            addCriterion("qt_version <=", value, "qtVersion");
            return (Criteria) this;
        }

        public Criteria andQtVersionIn(List<Integer> values) {
            addCriterion("qt_version in", values, "qtVersion");
            return (Criteria) this;
        }

        public Criteria andQtVersionNotIn(List<Integer> values) {
            addCriterion("qt_version not in", values, "qtVersion");
            return (Criteria) this;
        }

        public Criteria andQtVersionBetween(Integer value1, Integer value2) {
            addCriterion("qt_version between", value1, value2, "qtVersion");
            return (Criteria) this;
        }

        public Criteria andQtVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("qt_version not between", value1, value2, "qtVersion");
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