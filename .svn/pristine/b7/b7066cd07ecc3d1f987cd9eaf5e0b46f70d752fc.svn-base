package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuestionCourseChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionCourseChapterExample() {
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

        public Criteria andQccIdIsNull() {
            addCriterion("qcc_id is null");
            return (Criteria) this;
        }

        public Criteria andQccIdIsNotNull() {
            addCriterion("qcc_id is not null");
            return (Criteria) this;
        }

        public Criteria andQccIdEqualTo(Long value) {
            addCriterion("qcc_id =", value, "qccId");
            return (Criteria) this;
        }

        public Criteria andQccIdNotEqualTo(Long value) {
            addCriterion("qcc_id <>", value, "qccId");
            return (Criteria) this;
        }

        public Criteria andQccIdGreaterThan(Long value) {
            addCriterion("qcc_id >", value, "qccId");
            return (Criteria) this;
        }

        public Criteria andQccIdGreaterThanOrEqualTo(Long value) {
            addCriterion("qcc_id >=", value, "qccId");
            return (Criteria) this;
        }

        public Criteria andQccIdLessThan(Long value) {
            addCriterion("qcc_id <", value, "qccId");
            return (Criteria) this;
        }

        public Criteria andQccIdLessThanOrEqualTo(Long value) {
            addCriterion("qcc_id <=", value, "qccId");
            return (Criteria) this;
        }

        public Criteria andQccIdIn(List<Long> values) {
            addCriterion("qcc_id in", values, "qccId");
            return (Criteria) this;
        }

        public Criteria andQccIdNotIn(List<Long> values) {
            addCriterion("qcc_id not in", values, "qccId");
            return (Criteria) this;
        }

        public Criteria andQccIdBetween(Long value1, Long value2) {
            addCriterion("qcc_id between", value1, value2, "qccId");
            return (Criteria) this;
        }

        public Criteria andQccIdNotBetween(Long value1, Long value2) {
            addCriterion("qcc_id not between", value1, value2, "qccId");
            return (Criteria) this;
        }

        public Criteria andQccCcidIsNull() {
            addCriterion("qcc_ccid is null");
            return (Criteria) this;
        }

        public Criteria andQccCcidIsNotNull() {
            addCriterion("qcc_ccid is not null");
            return (Criteria) this;
        }

        public Criteria andQccCcidEqualTo(Long value) {
            addCriterion("qcc_ccid =", value, "qccCcid");
            return (Criteria) this;
        }

        public Criteria andQccCcidNotEqualTo(Long value) {
            addCriterion("qcc_ccid <>", value, "qccCcid");
            return (Criteria) this;
        }

        public Criteria andQccCcidGreaterThan(Long value) {
            addCriterion("qcc_ccid >", value, "qccCcid");
            return (Criteria) this;
        }

        public Criteria andQccCcidGreaterThanOrEqualTo(Long value) {
            addCriterion("qcc_ccid >=", value, "qccCcid");
            return (Criteria) this;
        }

        public Criteria andQccCcidLessThan(Long value) {
            addCriterion("qcc_ccid <", value, "qccCcid");
            return (Criteria) this;
        }

        public Criteria andQccCcidLessThanOrEqualTo(Long value) {
            addCriterion("qcc_ccid <=", value, "qccCcid");
            return (Criteria) this;
        }

        public Criteria andQccCcidIn(List<Long> values) {
            addCriterion("qcc_ccid in", values, "qccCcid");
            return (Criteria) this;
        }

        public Criteria andQccCcidNotIn(List<Long> values) {
            addCriterion("qcc_ccid not in", values, "qccCcid");
            return (Criteria) this;
        }

        public Criteria andQccCcidBetween(Long value1, Long value2) {
            addCriterion("qcc_ccid between", value1, value2, "qccCcid");
            return (Criteria) this;
        }

        public Criteria andQccCcidNotBetween(Long value1, Long value2) {
            addCriterion("qcc_ccid not between", value1, value2, "qccCcid");
            return (Criteria) this;
        }

        public Criteria andQccQbidIsNull() {
            addCriterion("qcc_qbid is null");
            return (Criteria) this;
        }

        public Criteria andQccQbidIsNotNull() {
            addCriterion("qcc_qbid is not null");
            return (Criteria) this;
        }

        public Criteria andQccQbidEqualTo(String value) {
            addCriterion("qcc_qbid =", value, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccQbidNotEqualTo(String value) {
            addCriterion("qcc_qbid <>", value, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccQbidGreaterThan(String value) {
            addCriterion("qcc_qbid >", value, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccQbidGreaterThanOrEqualTo(String value) {
            addCriterion("qcc_qbid >=", value, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccQbidLessThan(String value) {
            addCriterion("qcc_qbid <", value, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccQbidLessThanOrEqualTo(String value) {
            addCriterion("qcc_qbid <=", value, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccQbidLike(String value) {
            addCriterion("qcc_qbid like", value, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccQbidNotLike(String value) {
            addCriterion("qcc_qbid not like", value, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccQbidIn(List<String> values) {
            addCriterion("qcc_qbid in", values, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccQbidNotIn(List<String> values) {
            addCriterion("qcc_qbid not in", values, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccQbidBetween(String value1, String value2) {
            addCriterion("qcc_qbid between", value1, value2, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccQbidNotBetween(String value1, String value2) {
            addCriterion("qcc_qbid not between", value1, value2, "qccQbid");
            return (Criteria) this;
        }

        public Criteria andQccInsidIsNull() {
            addCriterion("qcc_insid is null");
            return (Criteria) this;
        }

        public Criteria andQccInsidIsNotNull() {
            addCriterion("qcc_insid is not null");
            return (Criteria) this;
        }

        public Criteria andQccInsidEqualTo(Long value) {
            addCriterion("qcc_insid =", value, "qccInsid");
            return (Criteria) this;
        }

        public Criteria andQccInsidNotEqualTo(Long value) {
            addCriterion("qcc_insid <>", value, "qccInsid");
            return (Criteria) this;
        }

        public Criteria andQccInsidGreaterThan(Long value) {
            addCriterion("qcc_insid >", value, "qccInsid");
            return (Criteria) this;
        }

        public Criteria andQccInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("qcc_insid >=", value, "qccInsid");
            return (Criteria) this;
        }

        public Criteria andQccInsidLessThan(Long value) {
            addCriterion("qcc_insid <", value, "qccInsid");
            return (Criteria) this;
        }

        public Criteria andQccInsidLessThanOrEqualTo(Long value) {
            addCriterion("qcc_insid <=", value, "qccInsid");
            return (Criteria) this;
        }

        public Criteria andQccInsidIn(List<Long> values) {
            addCriterion("qcc_insid in", values, "qccInsid");
            return (Criteria) this;
        }

        public Criteria andQccInsidNotIn(List<Long> values) {
            addCriterion("qcc_insid not in", values, "qccInsid");
            return (Criteria) this;
        }

        public Criteria andQccInsidBetween(Long value1, Long value2) {
            addCriterion("qcc_insid between", value1, value2, "qccInsid");
            return (Criteria) this;
        }

        public Criteria andQccInsidNotBetween(Long value1, Long value2) {
            addCriterion("qcc_insid not between", value1, value2, "qccInsid");
            return (Criteria) this;
        }

        public Criteria andQccCreateByIsNull() {
            addCriterion("qcc_create_by is null");
            return (Criteria) this;
        }

        public Criteria andQccCreateByIsNotNull() {
            addCriterion("qcc_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andQccCreateByEqualTo(String value) {
            addCriterion("qcc_create_by =", value, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateByNotEqualTo(String value) {
            addCriterion("qcc_create_by <>", value, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateByGreaterThan(String value) {
            addCriterion("qcc_create_by >", value, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("qcc_create_by >=", value, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateByLessThan(String value) {
            addCriterion("qcc_create_by <", value, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateByLessThanOrEqualTo(String value) {
            addCriterion("qcc_create_by <=", value, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateByLike(String value) {
            addCriterion("qcc_create_by like", value, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateByNotLike(String value) {
            addCriterion("qcc_create_by not like", value, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateByIn(List<String> values) {
            addCriterion("qcc_create_by in", values, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateByNotIn(List<String> values) {
            addCriterion("qcc_create_by not in", values, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateByBetween(String value1, String value2) {
            addCriterion("qcc_create_by between", value1, value2, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateByNotBetween(String value1, String value2) {
            addCriterion("qcc_create_by not between", value1, value2, "qccCreateBy");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeIsNull() {
            addCriterion("qcc_create_time is null");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeIsNotNull() {
            addCriterion("qcc_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qcc_create_time =", value, "qccCreateTime");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qcc_create_time <>", value, "qccCreateTime");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qcc_create_time >", value, "qccCreateTime");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qcc_create_time >=", value, "qccCreateTime");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("qcc_create_time <", value, "qccCreateTime");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qcc_create_time <=", value, "qccCreateTime");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qcc_create_time in", values, "qccCreateTime");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qcc_create_time not in", values, "qccCreateTime");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qcc_create_time between", value1, value2, "qccCreateTime");
            return (Criteria) this;
        }

        public Criteria andQccCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qcc_create_time not between", value1, value2, "qccCreateTime");
            return (Criteria) this;
        }

        public Criteria andQccModifyByIsNull() {
            addCriterion("qcc_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andQccModifyByIsNotNull() {
            addCriterion("qcc_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andQccModifyByEqualTo(String value) {
            addCriterion("qcc_modify_by =", value, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyByNotEqualTo(String value) {
            addCriterion("qcc_modify_by <>", value, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyByGreaterThan(String value) {
            addCriterion("qcc_modify_by >", value, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("qcc_modify_by >=", value, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyByLessThan(String value) {
            addCriterion("qcc_modify_by <", value, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyByLessThanOrEqualTo(String value) {
            addCriterion("qcc_modify_by <=", value, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyByLike(String value) {
            addCriterion("qcc_modify_by like", value, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyByNotLike(String value) {
            addCriterion("qcc_modify_by not like", value, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyByIn(List<String> values) {
            addCriterion("qcc_modify_by in", values, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyByNotIn(List<String> values) {
            addCriterion("qcc_modify_by not in", values, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyByBetween(String value1, String value2) {
            addCriterion("qcc_modify_by between", value1, value2, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyByNotBetween(String value1, String value2) {
            addCriterion("qcc_modify_by not between", value1, value2, "qccModifyBy");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeIsNull() {
            addCriterion("qcc_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeIsNotNull() {
            addCriterion("qcc_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qcc_modify_time =", value, "qccModifyTime");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qcc_modify_time <>", value, "qccModifyTime");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qcc_modify_time >", value, "qccModifyTime");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qcc_modify_time >=", value, "qccModifyTime");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("qcc_modify_time <", value, "qccModifyTime");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qcc_modify_time <=", value, "qccModifyTime");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qcc_modify_time in", values, "qccModifyTime");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qcc_modify_time not in", values, "qccModifyTime");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qcc_modify_time between", value1, value2, "qccModifyTime");
            return (Criteria) this;
        }

        public Criteria andQccModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qcc_modify_time not between", value1, value2, "qccModifyTime");
            return (Criteria) this;
        }

        public Criteria andQccDeleteIsNull() {
            addCriterion("qcc_delete is null");
            return (Criteria) this;
        }

        public Criteria andQccDeleteIsNotNull() {
            addCriterion("qcc_delete is not null");
            return (Criteria) this;
        }

        public Criteria andQccDeleteEqualTo(Boolean value) {
            addCriterion("qcc_delete =", value, "qccDelete");
            return (Criteria) this;
        }

        public Criteria andQccDeleteNotEqualTo(Boolean value) {
            addCriterion("qcc_delete <>", value, "qccDelete");
            return (Criteria) this;
        }

        public Criteria andQccDeleteGreaterThan(Boolean value) {
            addCriterion("qcc_delete >", value, "qccDelete");
            return (Criteria) this;
        }

        public Criteria andQccDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("qcc_delete >=", value, "qccDelete");
            return (Criteria) this;
        }

        public Criteria andQccDeleteLessThan(Boolean value) {
            addCriterion("qcc_delete <", value, "qccDelete");
            return (Criteria) this;
        }

        public Criteria andQccDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("qcc_delete <=", value, "qccDelete");
            return (Criteria) this;
        }

        public Criteria andQccDeleteIn(List<Boolean> values) {
            addCriterion("qcc_delete in", values, "qccDelete");
            return (Criteria) this;
        }

        public Criteria andQccDeleteNotIn(List<Boolean> values) {
            addCriterion("qcc_delete not in", values, "qccDelete");
            return (Criteria) this;
        }

        public Criteria andQccDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("qcc_delete between", value1, value2, "qccDelete");
            return (Criteria) this;
        }

        public Criteria andQccDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("qcc_delete not between", value1, value2, "qccDelete");
            return (Criteria) this;
        }

        public Criteria andQccVersionIsNull() {
            addCriterion("qcc_version is null");
            return (Criteria) this;
        }

        public Criteria andQccVersionIsNotNull() {
            addCriterion("qcc_version is not null");
            return (Criteria) this;
        }

        public Criteria andQccVersionEqualTo(Integer value) {
            addCriterion("qcc_version =", value, "qccVersion");
            return (Criteria) this;
        }

        public Criteria andQccVersionNotEqualTo(Integer value) {
            addCriterion("qcc_version <>", value, "qccVersion");
            return (Criteria) this;
        }

        public Criteria andQccVersionGreaterThan(Integer value) {
            addCriterion("qcc_version >", value, "qccVersion");
            return (Criteria) this;
        }

        public Criteria andQccVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("qcc_version >=", value, "qccVersion");
            return (Criteria) this;
        }

        public Criteria andQccVersionLessThan(Integer value) {
            addCriterion("qcc_version <", value, "qccVersion");
            return (Criteria) this;
        }

        public Criteria andQccVersionLessThanOrEqualTo(Integer value) {
            addCriterion("qcc_version <=", value, "qccVersion");
            return (Criteria) this;
        }

        public Criteria andQccVersionIn(List<Integer> values) {
            addCriterion("qcc_version in", values, "qccVersion");
            return (Criteria) this;
        }

        public Criteria andQccVersionNotIn(List<Integer> values) {
            addCriterion("qcc_version not in", values, "qccVersion");
            return (Criteria) this;
        }

        public Criteria andQccVersionBetween(Integer value1, Integer value2) {
            addCriterion("qcc_version between", value1, value2, "qccVersion");
            return (Criteria) this;
        }

        public Criteria andQccVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("qcc_version not between", value1, value2, "qccVersion");
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