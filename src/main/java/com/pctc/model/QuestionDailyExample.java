package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuestionDailyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionDailyExample() {
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

        public Criteria andQdIdIsNull() {
            addCriterion("qd_id is null");
            return (Criteria) this;
        }

        public Criteria andQdIdIsNotNull() {
            addCriterion("qd_id is not null");
            return (Criteria) this;
        }

        public Criteria andQdIdEqualTo(Long value) {
            addCriterion("qd_id =", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdNotEqualTo(Long value) {
            addCriterion("qd_id <>", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdGreaterThan(Long value) {
            addCriterion("qd_id >", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("qd_id >=", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdLessThan(Long value) {
            addCriterion("qd_id <", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdLessThanOrEqualTo(Long value) {
            addCriterion("qd_id <=", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdIn(List<Long> values) {
            addCriterion("qd_id in", values, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdNotIn(List<Long> values) {
            addCriterion("qd_id not in", values, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdBetween(Long value1, Long value2) {
            addCriterion("qd_id between", value1, value2, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdNotBetween(Long value1, Long value2) {
            addCriterion("qd_id not between", value1, value2, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdQbidIsNull() {
            addCriterion("qd_qbid is null");
            return (Criteria) this;
        }

        public Criteria andQdQbidIsNotNull() {
            addCriterion("qd_qbid is not null");
            return (Criteria) this;
        }

        public Criteria andQdQbidEqualTo(String value) {
            addCriterion("qd_qbid =", value, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdQbidNotEqualTo(String value) {
            addCriterion("qd_qbid <>", value, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdQbidGreaterThan(String value) {
            addCriterion("qd_qbid >", value, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdQbidGreaterThanOrEqualTo(String value) {
            addCriterion("qd_qbid >=", value, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdQbidLessThan(String value) {
            addCriterion("qd_qbid <", value, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdQbidLessThanOrEqualTo(String value) {
            addCriterion("qd_qbid <=", value, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdQbidLike(String value) {
            addCriterion("qd_qbid like", value, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdQbidNotLike(String value) {
            addCriterion("qd_qbid not like", value, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdQbidIn(List<String> values) {
            addCriterion("qd_qbid in", values, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdQbidNotIn(List<String> values) {
            addCriterion("qd_qbid not in", values, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdQbidBetween(String value1, String value2) {
            addCriterion("qd_qbid between", value1, value2, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdQbidNotBetween(String value1, String value2) {
            addCriterion("qd_qbid not between", value1, value2, "qdQbid");
            return (Criteria) this;
        }

        public Criteria andQdInsidIsNull() {
            addCriterion("qd_insid is null");
            return (Criteria) this;
        }

        public Criteria andQdInsidIsNotNull() {
            addCriterion("qd_insid is not null");
            return (Criteria) this;
        }

        public Criteria andQdInsidEqualTo(Long value) {
            addCriterion("qd_insid =", value, "qdInsid");
            return (Criteria) this;
        }

        public Criteria andQdInsidNotEqualTo(Long value) {
            addCriterion("qd_insid <>", value, "qdInsid");
            return (Criteria) this;
        }

        public Criteria andQdInsidGreaterThan(Long value) {
            addCriterion("qd_insid >", value, "qdInsid");
            return (Criteria) this;
        }

        public Criteria andQdInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("qd_insid >=", value, "qdInsid");
            return (Criteria) this;
        }

        public Criteria andQdInsidLessThan(Long value) {
            addCriterion("qd_insid <", value, "qdInsid");
            return (Criteria) this;
        }

        public Criteria andQdInsidLessThanOrEqualTo(Long value) {
            addCriterion("qd_insid <=", value, "qdInsid");
            return (Criteria) this;
        }

        public Criteria andQdInsidIn(List<Long> values) {
            addCriterion("qd_insid in", values, "qdInsid");
            return (Criteria) this;
        }

        public Criteria andQdInsidNotIn(List<Long> values) {
            addCriterion("qd_insid not in", values, "qdInsid");
            return (Criteria) this;
        }

        public Criteria andQdInsidBetween(Long value1, Long value2) {
            addCriterion("qd_insid between", value1, value2, "qdInsid");
            return (Criteria) this;
        }

        public Criteria andQdInsidNotBetween(Long value1, Long value2) {
            addCriterion("qd_insid not between", value1, value2, "qdInsid");
            return (Criteria) this;
        }

        public Criteria andQdCreateByIsNull() {
            addCriterion("qd_create_by is null");
            return (Criteria) this;
        }

        public Criteria andQdCreateByIsNotNull() {
            addCriterion("qd_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andQdCreateByEqualTo(String value) {
            addCriterion("qd_create_by =", value, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateByNotEqualTo(String value) {
            addCriterion("qd_create_by <>", value, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateByGreaterThan(String value) {
            addCriterion("qd_create_by >", value, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("qd_create_by >=", value, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateByLessThan(String value) {
            addCriterion("qd_create_by <", value, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateByLessThanOrEqualTo(String value) {
            addCriterion("qd_create_by <=", value, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateByLike(String value) {
            addCriterion("qd_create_by like", value, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateByNotLike(String value) {
            addCriterion("qd_create_by not like", value, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateByIn(List<String> values) {
            addCriterion("qd_create_by in", values, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateByNotIn(List<String> values) {
            addCriterion("qd_create_by not in", values, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateByBetween(String value1, String value2) {
            addCriterion("qd_create_by between", value1, value2, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateByNotBetween(String value1, String value2) {
            addCriterion("qd_create_by not between", value1, value2, "qdCreateBy");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeIsNull() {
            addCriterion("qd_create_time is null");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeIsNotNull() {
            addCriterion("qd_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qd_create_time =", value, "qdCreateTime");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qd_create_time <>", value, "qdCreateTime");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qd_create_time >", value, "qdCreateTime");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qd_create_time >=", value, "qdCreateTime");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("qd_create_time <", value, "qdCreateTime");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qd_create_time <=", value, "qdCreateTime");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qd_create_time in", values, "qdCreateTime");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qd_create_time not in", values, "qdCreateTime");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qd_create_time between", value1, value2, "qdCreateTime");
            return (Criteria) this;
        }

        public Criteria andQdCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qd_create_time not between", value1, value2, "qdCreateTime");
            return (Criteria) this;
        }

        public Criteria andQdModifyByIsNull() {
            addCriterion("qd_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andQdModifyByIsNotNull() {
            addCriterion("qd_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andQdModifyByEqualTo(String value) {
            addCriterion("qd_modify_by =", value, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyByNotEqualTo(String value) {
            addCriterion("qd_modify_by <>", value, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyByGreaterThan(String value) {
            addCriterion("qd_modify_by >", value, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("qd_modify_by >=", value, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyByLessThan(String value) {
            addCriterion("qd_modify_by <", value, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyByLessThanOrEqualTo(String value) {
            addCriterion("qd_modify_by <=", value, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyByLike(String value) {
            addCriterion("qd_modify_by like", value, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyByNotLike(String value) {
            addCriterion("qd_modify_by not like", value, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyByIn(List<String> values) {
            addCriterion("qd_modify_by in", values, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyByNotIn(List<String> values) {
            addCriterion("qd_modify_by not in", values, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyByBetween(String value1, String value2) {
            addCriterion("qd_modify_by between", value1, value2, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyByNotBetween(String value1, String value2) {
            addCriterion("qd_modify_by not between", value1, value2, "qdModifyBy");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeIsNull() {
            addCriterion("qd_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeIsNotNull() {
            addCriterion("qd_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qd_modify_time =", value, "qdModifyTime");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qd_modify_time <>", value, "qdModifyTime");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qd_modify_time >", value, "qdModifyTime");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qd_modify_time >=", value, "qdModifyTime");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("qd_modify_time <", value, "qdModifyTime");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qd_modify_time <=", value, "qdModifyTime");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qd_modify_time in", values, "qdModifyTime");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qd_modify_time not in", values, "qdModifyTime");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qd_modify_time between", value1, value2, "qdModifyTime");
            return (Criteria) this;
        }

        public Criteria andQdModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qd_modify_time not between", value1, value2, "qdModifyTime");
            return (Criteria) this;
        }

        public Criteria andQdDeleteIsNull() {
            addCriterion("qd_delete is null");
            return (Criteria) this;
        }

        public Criteria andQdDeleteIsNotNull() {
            addCriterion("qd_delete is not null");
            return (Criteria) this;
        }

        public Criteria andQdDeleteEqualTo(Boolean value) {
            addCriterion("qd_delete =", value, "qdDelete");
            return (Criteria) this;
        }

        public Criteria andQdDeleteNotEqualTo(Boolean value) {
            addCriterion("qd_delete <>", value, "qdDelete");
            return (Criteria) this;
        }

        public Criteria andQdDeleteGreaterThan(Boolean value) {
            addCriterion("qd_delete >", value, "qdDelete");
            return (Criteria) this;
        }

        public Criteria andQdDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("qd_delete >=", value, "qdDelete");
            return (Criteria) this;
        }

        public Criteria andQdDeleteLessThan(Boolean value) {
            addCriterion("qd_delete <", value, "qdDelete");
            return (Criteria) this;
        }

        public Criteria andQdDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("qd_delete <=", value, "qdDelete");
            return (Criteria) this;
        }

        public Criteria andQdDeleteIn(List<Boolean> values) {
            addCriterion("qd_delete in", values, "qdDelete");
            return (Criteria) this;
        }

        public Criteria andQdDeleteNotIn(List<Boolean> values) {
            addCriterion("qd_delete not in", values, "qdDelete");
            return (Criteria) this;
        }

        public Criteria andQdDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("qd_delete between", value1, value2, "qdDelete");
            return (Criteria) this;
        }

        public Criteria andQdDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("qd_delete not between", value1, value2, "qdDelete");
            return (Criteria) this;
        }

        public Criteria andQdVersionIsNull() {
            addCriterion("qd_version is null");
            return (Criteria) this;
        }

        public Criteria andQdVersionIsNotNull() {
            addCriterion("qd_version is not null");
            return (Criteria) this;
        }

        public Criteria andQdVersionEqualTo(Integer value) {
            addCriterion("qd_version =", value, "qdVersion");
            return (Criteria) this;
        }

        public Criteria andQdVersionNotEqualTo(Integer value) {
            addCriterion("qd_version <>", value, "qdVersion");
            return (Criteria) this;
        }

        public Criteria andQdVersionGreaterThan(Integer value) {
            addCriterion("qd_version >", value, "qdVersion");
            return (Criteria) this;
        }

        public Criteria andQdVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("qd_version >=", value, "qdVersion");
            return (Criteria) this;
        }

        public Criteria andQdVersionLessThan(Integer value) {
            addCriterion("qd_version <", value, "qdVersion");
            return (Criteria) this;
        }

        public Criteria andQdVersionLessThanOrEqualTo(Integer value) {
            addCriterion("qd_version <=", value, "qdVersion");
            return (Criteria) this;
        }

        public Criteria andQdVersionIn(List<Integer> values) {
            addCriterion("qd_version in", values, "qdVersion");
            return (Criteria) this;
        }

        public Criteria andQdVersionNotIn(List<Integer> values) {
            addCriterion("qd_version not in", values, "qdVersion");
            return (Criteria) this;
        }

        public Criteria andQdVersionBetween(Integer value1, Integer value2) {
            addCriterion("qd_version between", value1, value2, "qdVersion");
            return (Criteria) this;
        }

        public Criteria andQdVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("qd_version not between", value1, value2, "qdVersion");
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