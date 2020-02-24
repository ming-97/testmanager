package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuestionCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionCourseExample() {
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

        public Criteria andQcIdIsNull() {
            addCriterion("qc_id is null");
            return (Criteria) this;
        }

        public Criteria andQcIdIsNotNull() {
            addCriterion("qc_id is not null");
            return (Criteria) this;
        }

        public Criteria andQcIdEqualTo(Long value) {
            addCriterion("qc_id =", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdNotEqualTo(Long value) {
            addCriterion("qc_id <>", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdGreaterThan(Long value) {
            addCriterion("qc_id >", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("qc_id >=", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdLessThan(Long value) {
            addCriterion("qc_id <", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdLessThanOrEqualTo(Long value) {
            addCriterion("qc_id <=", value, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdIn(List<Long> values) {
            addCriterion("qc_id in", values, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdNotIn(List<Long> values) {
            addCriterion("qc_id not in", values, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdBetween(Long value1, Long value2) {
            addCriterion("qc_id between", value1, value2, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcIdNotBetween(Long value1, Long value2) {
            addCriterion("qc_id not between", value1, value2, "qcId");
            return (Criteria) this;
        }

        public Criteria andQcCidIsNull() {
            addCriterion("qc_cid is null");
            return (Criteria) this;
        }

        public Criteria andQcCidIsNotNull() {
            addCriterion("qc_cid is not null");
            return (Criteria) this;
        }

        public Criteria andQcCidEqualTo(Long value) {
            addCriterion("qc_cid =", value, "qcCid");
            return (Criteria) this;
        }

        public Criteria andQcCidNotEqualTo(Long value) {
            addCriterion("qc_cid <>", value, "qcCid");
            return (Criteria) this;
        }

        public Criteria andQcCidGreaterThan(Long value) {
            addCriterion("qc_cid >", value, "qcCid");
            return (Criteria) this;
        }

        public Criteria andQcCidGreaterThanOrEqualTo(Long value) {
            addCriterion("qc_cid >=", value, "qcCid");
            return (Criteria) this;
        }

        public Criteria andQcCidLessThan(Long value) {
            addCriterion("qc_cid <", value, "qcCid");
            return (Criteria) this;
        }

        public Criteria andQcCidLessThanOrEqualTo(Long value) {
            addCriterion("qc_cid <=", value, "qcCid");
            return (Criteria) this;
        }

        public Criteria andQcCidIn(List<Long> values) {
            addCriterion("qc_cid in", values, "qcCid");
            return (Criteria) this;
        }

        public Criteria andQcCidNotIn(List<Long> values) {
            addCriterion("qc_cid not in", values, "qcCid");
            return (Criteria) this;
        }

        public Criteria andQcCidBetween(Long value1, Long value2) {
            addCriterion("qc_cid between", value1, value2, "qcCid");
            return (Criteria) this;
        }

        public Criteria andQcCidNotBetween(Long value1, Long value2) {
            addCriterion("qc_cid not between", value1, value2, "qcCid");
            return (Criteria) this;
        }

        public Criteria andQcQbidIsNull() {
            addCriterion("qc_qbid is null");
            return (Criteria) this;
        }

        public Criteria andQcQbidIsNotNull() {
            addCriterion("qc_qbid is not null");
            return (Criteria) this;
        }

        public Criteria andQcQbidEqualTo(String value) {
            addCriterion("qc_qbid =", value, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcQbidNotEqualTo(String value) {
            addCriterion("qc_qbid <>", value, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcQbidGreaterThan(String value) {
            addCriterion("qc_qbid >", value, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcQbidGreaterThanOrEqualTo(String value) {
            addCriterion("qc_qbid >=", value, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcQbidLessThan(String value) {
            addCriterion("qc_qbid <", value, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcQbidLessThanOrEqualTo(String value) {
            addCriterion("qc_qbid <=", value, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcQbidLike(String value) {
            addCriterion("qc_qbid like", value, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcQbidNotLike(String value) {
            addCriterion("qc_qbid not like", value, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcQbidIn(List<String> values) {
            addCriterion("qc_qbid in", values, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcQbidNotIn(List<String> values) {
            addCriterion("qc_qbid not in", values, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcQbidBetween(String value1, String value2) {
            addCriterion("qc_qbid between", value1, value2, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcQbidNotBetween(String value1, String value2) {
            addCriterion("qc_qbid not between", value1, value2, "qcQbid");
            return (Criteria) this;
        }

        public Criteria andQcInsidIsNull() {
            addCriterion("qc_insid is null");
            return (Criteria) this;
        }

        public Criteria andQcInsidIsNotNull() {
            addCriterion("qc_insid is not null");
            return (Criteria) this;
        }

        public Criteria andQcInsidEqualTo(Long value) {
            addCriterion("qc_insid =", value, "qcInsid");
            return (Criteria) this;
        }

        public Criteria andQcInsidNotEqualTo(Long value) {
            addCriterion("qc_insid <>", value, "qcInsid");
            return (Criteria) this;
        }

        public Criteria andQcInsidGreaterThan(Long value) {
            addCriterion("qc_insid >", value, "qcInsid");
            return (Criteria) this;
        }

        public Criteria andQcInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("qc_insid >=", value, "qcInsid");
            return (Criteria) this;
        }

        public Criteria andQcInsidLessThan(Long value) {
            addCriterion("qc_insid <", value, "qcInsid");
            return (Criteria) this;
        }

        public Criteria andQcInsidLessThanOrEqualTo(Long value) {
            addCriterion("qc_insid <=", value, "qcInsid");
            return (Criteria) this;
        }

        public Criteria andQcInsidIn(List<Long> values) {
            addCriterion("qc_insid in", values, "qcInsid");
            return (Criteria) this;
        }

        public Criteria andQcInsidNotIn(List<Long> values) {
            addCriterion("qc_insid not in", values, "qcInsid");
            return (Criteria) this;
        }

        public Criteria andQcInsidBetween(Long value1, Long value2) {
            addCriterion("qc_insid between", value1, value2, "qcInsid");
            return (Criteria) this;
        }

        public Criteria andQcInsidNotBetween(Long value1, Long value2) {
            addCriterion("qc_insid not between", value1, value2, "qcInsid");
            return (Criteria) this;
        }

        public Criteria andQcCreateByIsNull() {
            addCriterion("qc_create_by is null");
            return (Criteria) this;
        }

        public Criteria andQcCreateByIsNotNull() {
            addCriterion("qc_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andQcCreateByEqualTo(String value) {
            addCriterion("qc_create_by =", value, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateByNotEqualTo(String value) {
            addCriterion("qc_create_by <>", value, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateByGreaterThan(String value) {
            addCriterion("qc_create_by >", value, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("qc_create_by >=", value, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateByLessThan(String value) {
            addCriterion("qc_create_by <", value, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateByLessThanOrEqualTo(String value) {
            addCriterion("qc_create_by <=", value, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateByLike(String value) {
            addCriterion("qc_create_by like", value, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateByNotLike(String value) {
            addCriterion("qc_create_by not like", value, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateByIn(List<String> values) {
            addCriterion("qc_create_by in", values, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateByNotIn(List<String> values) {
            addCriterion("qc_create_by not in", values, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateByBetween(String value1, String value2) {
            addCriterion("qc_create_by between", value1, value2, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateByNotBetween(String value1, String value2) {
            addCriterion("qc_create_by not between", value1, value2, "qcCreateBy");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeIsNull() {
            addCriterion("qc_create_time is null");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeIsNotNull() {
            addCriterion("qc_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qc_create_time =", value, "qcCreateTime");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qc_create_time <>", value, "qcCreateTime");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qc_create_time >", value, "qcCreateTime");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qc_create_time >=", value, "qcCreateTime");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("qc_create_time <", value, "qcCreateTime");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qc_create_time <=", value, "qcCreateTime");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qc_create_time in", values, "qcCreateTime");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qc_create_time not in", values, "qcCreateTime");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qc_create_time between", value1, value2, "qcCreateTime");
            return (Criteria) this;
        }

        public Criteria andQcCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qc_create_time not between", value1, value2, "qcCreateTime");
            return (Criteria) this;
        }

        public Criteria andQcModifyByIsNull() {
            addCriterion("qc_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andQcModifyByIsNotNull() {
            addCriterion("qc_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andQcModifyByEqualTo(String value) {
            addCriterion("qc_modify_by =", value, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyByNotEqualTo(String value) {
            addCriterion("qc_modify_by <>", value, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyByGreaterThan(String value) {
            addCriterion("qc_modify_by >", value, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("qc_modify_by >=", value, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyByLessThan(String value) {
            addCriterion("qc_modify_by <", value, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyByLessThanOrEqualTo(String value) {
            addCriterion("qc_modify_by <=", value, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyByLike(String value) {
            addCriterion("qc_modify_by like", value, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyByNotLike(String value) {
            addCriterion("qc_modify_by not like", value, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyByIn(List<String> values) {
            addCriterion("qc_modify_by in", values, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyByNotIn(List<String> values) {
            addCriterion("qc_modify_by not in", values, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyByBetween(String value1, String value2) {
            addCriterion("qc_modify_by between", value1, value2, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyByNotBetween(String value1, String value2) {
            addCriterion("qc_modify_by not between", value1, value2, "qcModifyBy");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeIsNull() {
            addCriterion("qc_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeIsNotNull() {
            addCriterion("qc_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qc_modify_time =", value, "qcModifyTime");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qc_modify_time <>", value, "qcModifyTime");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qc_modify_time >", value, "qcModifyTime");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qc_modify_time >=", value, "qcModifyTime");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("qc_modify_time <", value, "qcModifyTime");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qc_modify_time <=", value, "qcModifyTime");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qc_modify_time in", values, "qcModifyTime");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qc_modify_time not in", values, "qcModifyTime");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qc_modify_time between", value1, value2, "qcModifyTime");
            return (Criteria) this;
        }

        public Criteria andQcModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qc_modify_time not between", value1, value2, "qcModifyTime");
            return (Criteria) this;
        }

        public Criteria andQcDeleteIsNull() {
            addCriterion("qc_delete is null");
            return (Criteria) this;
        }

        public Criteria andQcDeleteIsNotNull() {
            addCriterion("qc_delete is not null");
            return (Criteria) this;
        }

        public Criteria andQcDeleteEqualTo(Boolean value) {
            addCriterion("qc_delete =", value, "qcDelete");
            return (Criteria) this;
        }

        public Criteria andQcDeleteNotEqualTo(Boolean value) {
            addCriterion("qc_delete <>", value, "qcDelete");
            return (Criteria) this;
        }

        public Criteria andQcDeleteGreaterThan(Boolean value) {
            addCriterion("qc_delete >", value, "qcDelete");
            return (Criteria) this;
        }

        public Criteria andQcDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("qc_delete >=", value, "qcDelete");
            return (Criteria) this;
        }

        public Criteria andQcDeleteLessThan(Boolean value) {
            addCriterion("qc_delete <", value, "qcDelete");
            return (Criteria) this;
        }

        public Criteria andQcDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("qc_delete <=", value, "qcDelete");
            return (Criteria) this;
        }

        public Criteria andQcDeleteIn(List<Boolean> values) {
            addCriterion("qc_delete in", values, "qcDelete");
            return (Criteria) this;
        }

        public Criteria andQcDeleteNotIn(List<Boolean> values) {
            addCriterion("qc_delete not in", values, "qcDelete");
            return (Criteria) this;
        }

        public Criteria andQcDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("qc_delete between", value1, value2, "qcDelete");
            return (Criteria) this;
        }

        public Criteria andQcDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("qc_delete not between", value1, value2, "qcDelete");
            return (Criteria) this;
        }

        public Criteria andQcVersionIsNull() {
            addCriterion("qc_version is null");
            return (Criteria) this;
        }

        public Criteria andQcVersionIsNotNull() {
            addCriterion("qc_version is not null");
            return (Criteria) this;
        }

        public Criteria andQcVersionEqualTo(Integer value) {
            addCriterion("qc_version =", value, "qcVersion");
            return (Criteria) this;
        }

        public Criteria andQcVersionNotEqualTo(Integer value) {
            addCriterion("qc_version <>", value, "qcVersion");
            return (Criteria) this;
        }

        public Criteria andQcVersionGreaterThan(Integer value) {
            addCriterion("qc_version >", value, "qcVersion");
            return (Criteria) this;
        }

        public Criteria andQcVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("qc_version >=", value, "qcVersion");
            return (Criteria) this;
        }

        public Criteria andQcVersionLessThan(Integer value) {
            addCriterion("qc_version <", value, "qcVersion");
            return (Criteria) this;
        }

        public Criteria andQcVersionLessThanOrEqualTo(Integer value) {
            addCriterion("qc_version <=", value, "qcVersion");
            return (Criteria) this;
        }

        public Criteria andQcVersionIn(List<Integer> values) {
            addCriterion("qc_version in", values, "qcVersion");
            return (Criteria) this;
        }

        public Criteria andQcVersionNotIn(List<Integer> values) {
            addCriterion("qc_version not in", values, "qcVersion");
            return (Criteria) this;
        }

        public Criteria andQcVersionBetween(Integer value1, Integer value2) {
            addCriterion("qc_version between", value1, value2, "qcVersion");
            return (Criteria) this;
        }

        public Criteria andQcVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("qc_version not between", value1, value2, "qcVersion");
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