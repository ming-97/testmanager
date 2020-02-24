package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuestionErrorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionErrorExample() {
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

        public Criteria andQeIdIsNull() {
            addCriterion("qe_id is null");
            return (Criteria) this;
        }

        public Criteria andQeIdIsNotNull() {
            addCriterion("qe_id is not null");
            return (Criteria) this;
        }

        public Criteria andQeIdEqualTo(Long value) {
            addCriterion("qe_id =", value, "qeId");
            return (Criteria) this;
        }

        public Criteria andQeIdNotEqualTo(Long value) {
            addCriterion("qe_id <>", value, "qeId");
            return (Criteria) this;
        }

        public Criteria andQeIdGreaterThan(Long value) {
            addCriterion("qe_id >", value, "qeId");
            return (Criteria) this;
        }

        public Criteria andQeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("qe_id >=", value, "qeId");
            return (Criteria) this;
        }

        public Criteria andQeIdLessThan(Long value) {
            addCriterion("qe_id <", value, "qeId");
            return (Criteria) this;
        }

        public Criteria andQeIdLessThanOrEqualTo(Long value) {
            addCriterion("qe_id <=", value, "qeId");
            return (Criteria) this;
        }

        public Criteria andQeIdIn(List<Long> values) {
            addCriterion("qe_id in", values, "qeId");
            return (Criteria) this;
        }

        public Criteria andQeIdNotIn(List<Long> values) {
            addCriterion("qe_id not in", values, "qeId");
            return (Criteria) this;
        }

        public Criteria andQeIdBetween(Long value1, Long value2) {
            addCriterion("qe_id between", value1, value2, "qeId");
            return (Criteria) this;
        }

        public Criteria andQeIdNotBetween(Long value1, Long value2) {
            addCriterion("qe_id not between", value1, value2, "qeId");
            return (Criteria) this;
        }

        public Criteria andQeSidIsNull() {
            addCriterion("qe_sid is null");
            return (Criteria) this;
        }

        public Criteria andQeSidIsNotNull() {
            addCriterion("qe_sid is not null");
            return (Criteria) this;
        }

        public Criteria andQeSidEqualTo(Long value) {
            addCriterion("qe_sid =", value, "qeSid");
            return (Criteria) this;
        }

        public Criteria andQeSidNotEqualTo(Long value) {
            addCriterion("qe_sid <>", value, "qeSid");
            return (Criteria) this;
        }

        public Criteria andQeSidGreaterThan(Long value) {
            addCriterion("qe_sid >", value, "qeSid");
            return (Criteria) this;
        }

        public Criteria andQeSidGreaterThanOrEqualTo(Long value) {
            addCriterion("qe_sid >=", value, "qeSid");
            return (Criteria) this;
        }

        public Criteria andQeSidLessThan(Long value) {
            addCriterion("qe_sid <", value, "qeSid");
            return (Criteria) this;
        }

        public Criteria andQeSidLessThanOrEqualTo(Long value) {
            addCriterion("qe_sid <=", value, "qeSid");
            return (Criteria) this;
        }

        public Criteria andQeSidIn(List<Long> values) {
            addCriterion("qe_sid in", values, "qeSid");
            return (Criteria) this;
        }

        public Criteria andQeSidNotIn(List<Long> values) {
            addCriterion("qe_sid not in", values, "qeSid");
            return (Criteria) this;
        }

        public Criteria andQeSidBetween(Long value1, Long value2) {
            addCriterion("qe_sid between", value1, value2, "qeSid");
            return (Criteria) this;
        }

        public Criteria andQeSidNotBetween(Long value1, Long value2) {
            addCriterion("qe_sid not between", value1, value2, "qeSid");
            return (Criteria) this;
        }

        public Criteria andQeQpidIsNull() {
            addCriterion("qe_qpid is null");
            return (Criteria) this;
        }

        public Criteria andQeQpidIsNotNull() {
            addCriterion("qe_qpid is not null");
            return (Criteria) this;
        }

        public Criteria andQeQpidEqualTo(Long value) {
            addCriterion("qe_qpid =", value, "qeQpid");
            return (Criteria) this;
        }

        public Criteria andQeQpidNotEqualTo(Long value) {
            addCriterion("qe_qpid <>", value, "qeQpid");
            return (Criteria) this;
        }

        public Criteria andQeQpidGreaterThan(Long value) {
            addCriterion("qe_qpid >", value, "qeQpid");
            return (Criteria) this;
        }

        public Criteria andQeQpidGreaterThanOrEqualTo(Long value) {
            addCriterion("qe_qpid >=", value, "qeQpid");
            return (Criteria) this;
        }

        public Criteria andQeQpidLessThan(Long value) {
            addCriterion("qe_qpid <", value, "qeQpid");
            return (Criteria) this;
        }

        public Criteria andQeQpidLessThanOrEqualTo(Long value) {
            addCriterion("qe_qpid <=", value, "qeQpid");
            return (Criteria) this;
        }

        public Criteria andQeQpidIn(List<Long> values) {
            addCriterion("qe_qpid in", values, "qeQpid");
            return (Criteria) this;
        }

        public Criteria andQeQpidNotIn(List<Long> values) {
            addCriterion("qe_qpid not in", values, "qeQpid");
            return (Criteria) this;
        }

        public Criteria andQeQpidBetween(Long value1, Long value2) {
            addCriterion("qe_qpid between", value1, value2, "qeQpid");
            return (Criteria) this;
        }

        public Criteria andQeQpidNotBetween(Long value1, Long value2) {
            addCriterion("qe_qpid not between", value1, value2, "qeQpid");
            return (Criteria) this;
        }

        public Criteria andQeInsidIsNull() {
            addCriterion("qe_insid is null");
            return (Criteria) this;
        }

        public Criteria andQeInsidIsNotNull() {
            addCriterion("qe_insid is not null");
            return (Criteria) this;
        }

        public Criteria andQeInsidEqualTo(Long value) {
            addCriterion("qe_insid =", value, "qeInsid");
            return (Criteria) this;
        }

        public Criteria andQeInsidNotEqualTo(Long value) {
            addCriterion("qe_insid <>", value, "qeInsid");
            return (Criteria) this;
        }

        public Criteria andQeInsidGreaterThan(Long value) {
            addCriterion("qe_insid >", value, "qeInsid");
            return (Criteria) this;
        }

        public Criteria andQeInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("qe_insid >=", value, "qeInsid");
            return (Criteria) this;
        }

        public Criteria andQeInsidLessThan(Long value) {
            addCriterion("qe_insid <", value, "qeInsid");
            return (Criteria) this;
        }

        public Criteria andQeInsidLessThanOrEqualTo(Long value) {
            addCriterion("qe_insid <=", value, "qeInsid");
            return (Criteria) this;
        }

        public Criteria andQeInsidIn(List<Long> values) {
            addCriterion("qe_insid in", values, "qeInsid");
            return (Criteria) this;
        }

        public Criteria andQeInsidNotIn(List<Long> values) {
            addCriterion("qe_insid not in", values, "qeInsid");
            return (Criteria) this;
        }

        public Criteria andQeInsidBetween(Long value1, Long value2) {
            addCriterion("qe_insid between", value1, value2, "qeInsid");
            return (Criteria) this;
        }

        public Criteria andQeInsidNotBetween(Long value1, Long value2) {
            addCriterion("qe_insid not between", value1, value2, "qeInsid");
            return (Criteria) this;
        }

        public Criteria andQeCreateByIsNull() {
            addCriterion("qe_create_by is null");
            return (Criteria) this;
        }

        public Criteria andQeCreateByIsNotNull() {
            addCriterion("qe_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andQeCreateByEqualTo(String value) {
            addCriterion("qe_create_by =", value, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateByNotEqualTo(String value) {
            addCriterion("qe_create_by <>", value, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateByGreaterThan(String value) {
            addCriterion("qe_create_by >", value, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("qe_create_by >=", value, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateByLessThan(String value) {
            addCriterion("qe_create_by <", value, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateByLessThanOrEqualTo(String value) {
            addCriterion("qe_create_by <=", value, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateByLike(String value) {
            addCriterion("qe_create_by like", value, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateByNotLike(String value) {
            addCriterion("qe_create_by not like", value, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateByIn(List<String> values) {
            addCriterion("qe_create_by in", values, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateByNotIn(List<String> values) {
            addCriterion("qe_create_by not in", values, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateByBetween(String value1, String value2) {
            addCriterion("qe_create_by between", value1, value2, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateByNotBetween(String value1, String value2) {
            addCriterion("qe_create_by not between", value1, value2, "qeCreateBy");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeIsNull() {
            addCriterion("qe_create_time is null");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeIsNotNull() {
            addCriterion("qe_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qe_create_time =", value, "qeCreateTime");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qe_create_time <>", value, "qeCreateTime");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qe_create_time >", value, "qeCreateTime");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qe_create_time >=", value, "qeCreateTime");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("qe_create_time <", value, "qeCreateTime");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qe_create_time <=", value, "qeCreateTime");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qe_create_time in", values, "qeCreateTime");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qe_create_time not in", values, "qeCreateTime");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qe_create_time between", value1, value2, "qeCreateTime");
            return (Criteria) this;
        }

        public Criteria andQeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qe_create_time not between", value1, value2, "qeCreateTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyByIsNull() {
            addCriterion("qe_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andQeModifyByIsNotNull() {
            addCriterion("qe_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andQeModifyByEqualTo(String value) {
            addCriterion("qe_modify_by =", value, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyByNotEqualTo(String value) {
            addCriterion("qe_modify_by <>", value, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyByGreaterThan(String value) {
            addCriterion("qe_modify_by >", value, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("qe_modify_by >=", value, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyByLessThan(String value) {
            addCriterion("qe_modify_by <", value, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyByLessThanOrEqualTo(String value) {
            addCriterion("qe_modify_by <=", value, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyByLike(String value) {
            addCriterion("qe_modify_by like", value, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyByNotLike(String value) {
            addCriterion("qe_modify_by not like", value, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyByIn(List<String> values) {
            addCriterion("qe_modify_by in", values, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyByNotIn(List<String> values) {
            addCriterion("qe_modify_by not in", values, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyByBetween(String value1, String value2) {
            addCriterion("qe_modify_by between", value1, value2, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyByNotBetween(String value1, String value2) {
            addCriterion("qe_modify_by not between", value1, value2, "qeModifyBy");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeIsNull() {
            addCriterion("qe_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeIsNotNull() {
            addCriterion("qe_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeEqualTo(String value) {
            addCriterion("qe_modify_time =", value, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeNotEqualTo(String value) {
            addCriterion("qe_modify_time <>", value, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeGreaterThan(String value) {
            addCriterion("qe_modify_time >", value, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("qe_modify_time >=", value, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeLessThan(String value) {
            addCriterion("qe_modify_time <", value, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeLessThanOrEqualTo(String value) {
            addCriterion("qe_modify_time <=", value, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeLike(String value) {
            addCriterion("qe_modify_time like", value, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeNotLike(String value) {
            addCriterion("qe_modify_time not like", value, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeIn(List<String> values) {
            addCriterion("qe_modify_time in", values, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeNotIn(List<String> values) {
            addCriterion("qe_modify_time not in", values, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeBetween(String value1, String value2) {
            addCriterion("qe_modify_time between", value1, value2, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeModifyTimeNotBetween(String value1, String value2) {
            addCriterion("qe_modify_time not between", value1, value2, "qeModifyTime");
            return (Criteria) this;
        }

        public Criteria andQeDeleteIsNull() {
            addCriterion("qe_delete is null");
            return (Criteria) this;
        }

        public Criteria andQeDeleteIsNotNull() {
            addCriterion("qe_delete is not null");
            return (Criteria) this;
        }

        public Criteria andQeDeleteEqualTo(Boolean value) {
            addCriterion("qe_delete =", value, "qeDelete");
            return (Criteria) this;
        }

        public Criteria andQeDeleteNotEqualTo(Boolean value) {
            addCriterion("qe_delete <>", value, "qeDelete");
            return (Criteria) this;
        }

        public Criteria andQeDeleteGreaterThan(Boolean value) {
            addCriterion("qe_delete >", value, "qeDelete");
            return (Criteria) this;
        }

        public Criteria andQeDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("qe_delete >=", value, "qeDelete");
            return (Criteria) this;
        }

        public Criteria andQeDeleteLessThan(Boolean value) {
            addCriterion("qe_delete <", value, "qeDelete");
            return (Criteria) this;
        }

        public Criteria andQeDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("qe_delete <=", value, "qeDelete");
            return (Criteria) this;
        }

        public Criteria andQeDeleteIn(List<Boolean> values) {
            addCriterion("qe_delete in", values, "qeDelete");
            return (Criteria) this;
        }

        public Criteria andQeDeleteNotIn(List<Boolean> values) {
            addCriterion("qe_delete not in", values, "qeDelete");
            return (Criteria) this;
        }

        public Criteria andQeDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("qe_delete between", value1, value2, "qeDelete");
            return (Criteria) this;
        }

        public Criteria andQeDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("qe_delete not between", value1, value2, "qeDelete");
            return (Criteria) this;
        }

        public Criteria andQeVersionIsNull() {
            addCriterion("qe_version is null");
            return (Criteria) this;
        }

        public Criteria andQeVersionIsNotNull() {
            addCriterion("qe_version is not null");
            return (Criteria) this;
        }

        public Criteria andQeVersionEqualTo(Integer value) {
            addCriterion("qe_version =", value, "qeVersion");
            return (Criteria) this;
        }

        public Criteria andQeVersionNotEqualTo(Integer value) {
            addCriterion("qe_version <>", value, "qeVersion");
            return (Criteria) this;
        }

        public Criteria andQeVersionGreaterThan(Integer value) {
            addCriterion("qe_version >", value, "qeVersion");
            return (Criteria) this;
        }

        public Criteria andQeVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("qe_version >=", value, "qeVersion");
            return (Criteria) this;
        }

        public Criteria andQeVersionLessThan(Integer value) {
            addCriterion("qe_version <", value, "qeVersion");
            return (Criteria) this;
        }

        public Criteria andQeVersionLessThanOrEqualTo(Integer value) {
            addCriterion("qe_version <=", value, "qeVersion");
            return (Criteria) this;
        }

        public Criteria andQeVersionIn(List<Integer> values) {
            addCriterion("qe_version in", values, "qeVersion");
            return (Criteria) this;
        }

        public Criteria andQeVersionNotIn(List<Integer> values) {
            addCriterion("qe_version not in", values, "qeVersion");
            return (Criteria) this;
        }

        public Criteria andQeVersionBetween(Integer value1, Integer value2) {
            addCriterion("qe_version between", value1, value2, "qeVersion");
            return (Criteria) this;
        }

        public Criteria andQeVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("qe_version not between", value1, value2, "qeVersion");
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