package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InstitutionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstitutionsExample() {
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

        public Criteria andInsIdIsNull() {
            addCriterion("ins_id is null");
            return (Criteria) this;
        }

        public Criteria andInsIdIsNotNull() {
            addCriterion("ins_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsIdEqualTo(Long value) {
            addCriterion("ins_id =", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotEqualTo(Long value) {
            addCriterion("ins_id <>", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdGreaterThan(Long value) {
            addCriterion("ins_id >", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ins_id >=", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdLessThan(Long value) {
            addCriterion("ins_id <", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdLessThanOrEqualTo(Long value) {
            addCriterion("ins_id <=", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdIn(List<Long> values) {
            addCriterion("ins_id in", values, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotIn(List<Long> values) {
            addCriterion("ins_id not in", values, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdBetween(Long value1, Long value2) {
            addCriterion("ins_id between", value1, value2, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotBetween(Long value1, Long value2) {
            addCriterion("ins_id not between", value1, value2, "insId");
            return (Criteria) this;
        }

        public Criteria andInsTypeIsNull() {
            addCriterion("ins_type is null");
            return (Criteria) this;
        }

        public Criteria andInsTypeIsNotNull() {
            addCriterion("ins_type is not null");
            return (Criteria) this;
        }

        public Criteria andInsTypeEqualTo(String value) {
            addCriterion("ins_type =", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeNotEqualTo(String value) {
            addCriterion("ins_type <>", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeGreaterThan(String value) {
            addCriterion("ins_type >", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ins_type >=", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeLessThan(String value) {
            addCriterion("ins_type <", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeLessThanOrEqualTo(String value) {
            addCriterion("ins_type <=", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeLike(String value) {
            addCriterion("ins_type like", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeNotLike(String value) {
            addCriterion("ins_type not like", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeIn(List<String> values) {
            addCriterion("ins_type in", values, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeNotIn(List<String> values) {
            addCriterion("ins_type not in", values, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeBetween(String value1, String value2) {
            addCriterion("ins_type between", value1, value2, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeNotBetween(String value1, String value2) {
            addCriterion("ins_type not between", value1, value2, "insType");
            return (Criteria) this;
        }

        public Criteria andInsNameIsNull() {
            addCriterion("ins_name is null");
            return (Criteria) this;
        }

        public Criteria andInsNameIsNotNull() {
            addCriterion("ins_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsNameEqualTo(String value) {
            addCriterion("ins_name =", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotEqualTo(String value) {
            addCriterion("ins_name <>", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameGreaterThan(String value) {
            addCriterion("ins_name >", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ins_name >=", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameLessThan(String value) {
            addCriterion("ins_name <", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameLessThanOrEqualTo(String value) {
            addCriterion("ins_name <=", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameLike(String value) {
            addCriterion("ins_name like", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotLike(String value) {
            addCriterion("ins_name not like", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameIn(List<String> values) {
            addCriterion("ins_name in", values, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotIn(List<String> values) {
            addCriterion("ins_name not in", values, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameBetween(String value1, String value2) {
            addCriterion("ins_name between", value1, value2, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotBetween(String value1, String value2) {
            addCriterion("ins_name not between", value1, value2, "insName");
            return (Criteria) this;
        }

        public Criteria andInsCreateByIsNull() {
            addCriterion("ins_create_by is null");
            return (Criteria) this;
        }

        public Criteria andInsCreateByIsNotNull() {
            addCriterion("ins_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andInsCreateByEqualTo(String value) {
            addCriterion("ins_create_by =", value, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateByNotEqualTo(String value) {
            addCriterion("ins_create_by <>", value, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateByGreaterThan(String value) {
            addCriterion("ins_create_by >", value, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("ins_create_by >=", value, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateByLessThan(String value) {
            addCriterion("ins_create_by <", value, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateByLessThanOrEqualTo(String value) {
            addCriterion("ins_create_by <=", value, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateByLike(String value) {
            addCriterion("ins_create_by like", value, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateByNotLike(String value) {
            addCriterion("ins_create_by not like", value, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateByIn(List<String> values) {
            addCriterion("ins_create_by in", values, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateByNotIn(List<String> values) {
            addCriterion("ins_create_by not in", values, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateByBetween(String value1, String value2) {
            addCriterion("ins_create_by between", value1, value2, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateByNotBetween(String value1, String value2) {
            addCriterion("ins_create_by not between", value1, value2, "insCreateBy");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeIsNull() {
            addCriterion("ins_create_time is null");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeIsNotNull() {
            addCriterion("ins_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ins_create_time =", value, "insCreateTime");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ins_create_time <>", value, "insCreateTime");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ins_create_time >", value, "insCreateTime");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ins_create_time >=", value, "insCreateTime");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("ins_create_time <", value, "insCreateTime");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ins_create_time <=", value, "insCreateTime");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ins_create_time in", values, "insCreateTime");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ins_create_time not in", values, "insCreateTime");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ins_create_time between", value1, value2, "insCreateTime");
            return (Criteria) this;
        }

        public Criteria andInsCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ins_create_time not between", value1, value2, "insCreateTime");
            return (Criteria) this;
        }

        public Criteria andInsModifyByIsNull() {
            addCriterion("ins_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andInsModifyByIsNotNull() {
            addCriterion("ins_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andInsModifyByEqualTo(String value) {
            addCriterion("ins_modify_by =", value, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyByNotEqualTo(String value) {
            addCriterion("ins_modify_by <>", value, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyByGreaterThan(String value) {
            addCriterion("ins_modify_by >", value, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("ins_modify_by >=", value, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyByLessThan(String value) {
            addCriterion("ins_modify_by <", value, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyByLessThanOrEqualTo(String value) {
            addCriterion("ins_modify_by <=", value, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyByLike(String value) {
            addCriterion("ins_modify_by like", value, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyByNotLike(String value) {
            addCriterion("ins_modify_by not like", value, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyByIn(List<String> values) {
            addCriterion("ins_modify_by in", values, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyByNotIn(List<String> values) {
            addCriterion("ins_modify_by not in", values, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyByBetween(String value1, String value2) {
            addCriterion("ins_modify_by between", value1, value2, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyByNotBetween(String value1, String value2) {
            addCriterion("ins_modify_by not between", value1, value2, "insModifyBy");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeIsNull() {
            addCriterion("ins_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeIsNotNull() {
            addCriterion("ins_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ins_modify_time =", value, "insModifyTime");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ins_modify_time <>", value, "insModifyTime");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ins_modify_time >", value, "insModifyTime");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ins_modify_time >=", value, "insModifyTime");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("ins_modify_time <", value, "insModifyTime");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ins_modify_time <=", value, "insModifyTime");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ins_modify_time in", values, "insModifyTime");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ins_modify_time not in", values, "insModifyTime");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ins_modify_time between", value1, value2, "insModifyTime");
            return (Criteria) this;
        }

        public Criteria andInsModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ins_modify_time not between", value1, value2, "insModifyTime");
            return (Criteria) this;
        }

        public Criteria andInsDeleteIsNull() {
            addCriterion("ins_delete is null");
            return (Criteria) this;
        }

        public Criteria andInsDeleteIsNotNull() {
            addCriterion("ins_delete is not null");
            return (Criteria) this;
        }

        public Criteria andInsDeleteEqualTo(Boolean value) {
            addCriterion("ins_delete =", value, "insDelete");
            return (Criteria) this;
        }

        public Criteria andInsDeleteNotEqualTo(Boolean value) {
            addCriterion("ins_delete <>", value, "insDelete");
            return (Criteria) this;
        }

        public Criteria andInsDeleteGreaterThan(Boolean value) {
            addCriterion("ins_delete >", value, "insDelete");
            return (Criteria) this;
        }

        public Criteria andInsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ins_delete >=", value, "insDelete");
            return (Criteria) this;
        }

        public Criteria andInsDeleteLessThan(Boolean value) {
            addCriterion("ins_delete <", value, "insDelete");
            return (Criteria) this;
        }

        public Criteria andInsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("ins_delete <=", value, "insDelete");
            return (Criteria) this;
        }

        public Criteria andInsDeleteIn(List<Boolean> values) {
            addCriterion("ins_delete in", values, "insDelete");
            return (Criteria) this;
        }

        public Criteria andInsDeleteNotIn(List<Boolean> values) {
            addCriterion("ins_delete not in", values, "insDelete");
            return (Criteria) this;
        }

        public Criteria andInsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("ins_delete between", value1, value2, "insDelete");
            return (Criteria) this;
        }

        public Criteria andInsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ins_delete not between", value1, value2, "insDelete");
            return (Criteria) this;
        }

        public Criteria andInsVersionIsNull() {
            addCriterion("ins_version is null");
            return (Criteria) this;
        }

        public Criteria andInsVersionIsNotNull() {
            addCriterion("ins_version is not null");
            return (Criteria) this;
        }

        public Criteria andInsVersionEqualTo(Integer value) {
            addCriterion("ins_version =", value, "insVersion");
            return (Criteria) this;
        }

        public Criteria andInsVersionNotEqualTo(Integer value) {
            addCriterion("ins_version <>", value, "insVersion");
            return (Criteria) this;
        }

        public Criteria andInsVersionGreaterThan(Integer value) {
            addCriterion("ins_version >", value, "insVersion");
            return (Criteria) this;
        }

        public Criteria andInsVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("ins_version >=", value, "insVersion");
            return (Criteria) this;
        }

        public Criteria andInsVersionLessThan(Integer value) {
            addCriterion("ins_version <", value, "insVersion");
            return (Criteria) this;
        }

        public Criteria andInsVersionLessThanOrEqualTo(Integer value) {
            addCriterion("ins_version <=", value, "insVersion");
            return (Criteria) this;
        }

        public Criteria andInsVersionIn(List<Integer> values) {
            addCriterion("ins_version in", values, "insVersion");
            return (Criteria) this;
        }

        public Criteria andInsVersionNotIn(List<Integer> values) {
            addCriterion("ins_version not in", values, "insVersion");
            return (Criteria) this;
        }

        public Criteria andInsVersionBetween(Integer value1, Integer value2) {
            addCriterion("ins_version between", value1, value2, "insVersion");
            return (Criteria) this;
        }

        public Criteria andInsVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("ins_version not between", value1, value2, "insVersion");
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