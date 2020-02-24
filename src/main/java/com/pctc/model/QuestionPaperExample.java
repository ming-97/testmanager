package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuestionPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionPaperExample() {
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

        public Criteria andQpIdIsNull() {
            addCriterion("qp_id is null");
            return (Criteria) this;
        }

        public Criteria andQpIdIsNotNull() {
            addCriterion("qp_id is not null");
            return (Criteria) this;
        }

        public Criteria andQpIdEqualTo(Long value) {
            addCriterion("qp_id =", value, "qpId");
            return (Criteria) this;
        }

        public Criteria andQpIdNotEqualTo(Long value) {
            addCriterion("qp_id <>", value, "qpId");
            return (Criteria) this;
        }

        public Criteria andQpIdGreaterThan(Long value) {
            addCriterion("qp_id >", value, "qpId");
            return (Criteria) this;
        }

        public Criteria andQpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("qp_id >=", value, "qpId");
            return (Criteria) this;
        }

        public Criteria andQpIdLessThan(Long value) {
            addCriterion("qp_id <", value, "qpId");
            return (Criteria) this;
        }

        public Criteria andQpIdLessThanOrEqualTo(Long value) {
            addCriterion("qp_id <=", value, "qpId");
            return (Criteria) this;
        }

        public Criteria andQpIdIn(List<Long> values) {
            addCriterion("qp_id in", values, "qpId");
            return (Criteria) this;
        }

        public Criteria andQpIdNotIn(List<Long> values) {
            addCriterion("qp_id not in", values, "qpId");
            return (Criteria) this;
        }

        public Criteria andQpIdBetween(Long value1, Long value2) {
            addCriterion("qp_id between", value1, value2, "qpId");
            return (Criteria) this;
        }

        public Criteria andQpIdNotBetween(Long value1, Long value2) {
            addCriterion("qp_id not between", value1, value2, "qpId");
            return (Criteria) this;
        }

        public Criteria andQpSidIsNull() {
            addCriterion("qp_sid is null");
            return (Criteria) this;
        }

        public Criteria andQpSidIsNotNull() {
            addCriterion("qp_sid is not null");
            return (Criteria) this;
        }

        public Criteria andQpSidEqualTo(Long value) {
            addCriterion("qp_sid =", value, "qpSid");
            return (Criteria) this;
        }

        public Criteria andQpSidNotEqualTo(Long value) {
            addCriterion("qp_sid <>", value, "qpSid");
            return (Criteria) this;
        }

        public Criteria andQpSidGreaterThan(Long value) {
            addCriterion("qp_sid >", value, "qpSid");
            return (Criteria) this;
        }

        public Criteria andQpSidGreaterThanOrEqualTo(Long value) {
            addCriterion("qp_sid >=", value, "qpSid");
            return (Criteria) this;
        }

        public Criteria andQpSidLessThan(Long value) {
            addCriterion("qp_sid <", value, "qpSid");
            return (Criteria) this;
        }

        public Criteria andQpSidLessThanOrEqualTo(Long value) {
            addCriterion("qp_sid <=", value, "qpSid");
            return (Criteria) this;
        }

        public Criteria andQpSidIn(List<Long> values) {
            addCriterion("qp_sid in", values, "qpSid");
            return (Criteria) this;
        }

        public Criteria andQpSidNotIn(List<Long> values) {
            addCriterion("qp_sid not in", values, "qpSid");
            return (Criteria) this;
        }

        public Criteria andQpSidBetween(Long value1, Long value2) {
            addCriterion("qp_sid between", value1, value2, "qpSid");
            return (Criteria) this;
        }

        public Criteria andQpSidNotBetween(Long value1, Long value2) {
            addCriterion("qp_sid not between", value1, value2, "qpSid");
            return (Criteria) this;
        }

        public Criteria andQpQbidIsNull() {
            addCriterion("qp_qbid is null");
            return (Criteria) this;
        }

        public Criteria andQpQbidIsNotNull() {
            addCriterion("qp_qbid is not null");
            return (Criteria) this;
        }

        public Criteria andQpQbidEqualTo(Long value) {
            addCriterion("qp_qbid =", value, "qpQbid");
            return (Criteria) this;
        }

        public Criteria andQpQbidNotEqualTo(Long value) {
            addCriterion("qp_qbid <>", value, "qpQbid");
            return (Criteria) this;
        }

        public Criteria andQpQbidGreaterThan(Long value) {
            addCriterion("qp_qbid >", value, "qpQbid");
            return (Criteria) this;
        }

        public Criteria andQpQbidGreaterThanOrEqualTo(Long value) {
            addCriterion("qp_qbid >=", value, "qpQbid");
            return (Criteria) this;
        }

        public Criteria andQpQbidLessThan(Long value) {
            addCriterion("qp_qbid <", value, "qpQbid");
            return (Criteria) this;
        }

        public Criteria andQpQbidLessThanOrEqualTo(Long value) {
            addCriterion("qp_qbid <=", value, "qpQbid");
            return (Criteria) this;
        }

        public Criteria andQpQbidIn(List<Long> values) {
            addCriterion("qp_qbid in", values, "qpQbid");
            return (Criteria) this;
        }

        public Criteria andQpQbidNotIn(List<Long> values) {
            addCriterion("qp_qbid not in", values, "qpQbid");
            return (Criteria) this;
        }

        public Criteria andQpQbidBetween(Long value1, Long value2) {
            addCriterion("qp_qbid between", value1, value2, "qpQbid");
            return (Criteria) this;
        }

        public Criteria andQpQbidNotBetween(Long value1, Long value2) {
            addCriterion("qp_qbid not between", value1, value2, "qpQbid");
            return (Criteria) this;
        }

        public Criteria andQpInsidIsNull() {
            addCriterion("qp_insid is null");
            return (Criteria) this;
        }

        public Criteria andQpInsidIsNotNull() {
            addCriterion("qp_insid is not null");
            return (Criteria) this;
        }

        public Criteria andQpInsidEqualTo(Long value) {
            addCriterion("qp_insid =", value, "qpInsid");
            return (Criteria) this;
        }

        public Criteria andQpInsidNotEqualTo(Long value) {
            addCriterion("qp_insid <>", value, "qpInsid");
            return (Criteria) this;
        }

        public Criteria andQpInsidGreaterThan(Long value) {
            addCriterion("qp_insid >", value, "qpInsid");
            return (Criteria) this;
        }

        public Criteria andQpInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("qp_insid >=", value, "qpInsid");
            return (Criteria) this;
        }

        public Criteria andQpInsidLessThan(Long value) {
            addCriterion("qp_insid <", value, "qpInsid");
            return (Criteria) this;
        }

        public Criteria andQpInsidLessThanOrEqualTo(Long value) {
            addCriterion("qp_insid <=", value, "qpInsid");
            return (Criteria) this;
        }

        public Criteria andQpInsidIn(List<Long> values) {
            addCriterion("qp_insid in", values, "qpInsid");
            return (Criteria) this;
        }

        public Criteria andQpInsidNotIn(List<Long> values) {
            addCriterion("qp_insid not in", values, "qpInsid");
            return (Criteria) this;
        }

        public Criteria andQpInsidBetween(Long value1, Long value2) {
            addCriterion("qp_insid between", value1, value2, "qpInsid");
            return (Criteria) this;
        }

        public Criteria andQpInsidNotBetween(Long value1, Long value2) {
            addCriterion("qp_insid not between", value1, value2, "qpInsid");
            return (Criteria) this;
        }

        public Criteria andQpAnswerIsNull() {
            addCriterion("qp_answer is null");
            return (Criteria) this;
        }

        public Criteria andQpAnswerIsNotNull() {
            addCriterion("qp_answer is not null");
            return (Criteria) this;
        }

        public Criteria andQpAnswerEqualTo(String value) {
            addCriterion("qp_answer =", value, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpAnswerNotEqualTo(String value) {
            addCriterion("qp_answer <>", value, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpAnswerGreaterThan(String value) {
            addCriterion("qp_answer >", value, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("qp_answer >=", value, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpAnswerLessThan(String value) {
            addCriterion("qp_answer <", value, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpAnswerLessThanOrEqualTo(String value) {
            addCriterion("qp_answer <=", value, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpAnswerLike(String value) {
            addCriterion("qp_answer like", value, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpAnswerNotLike(String value) {
            addCriterion("qp_answer not like", value, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpAnswerIn(List<String> values) {
            addCriterion("qp_answer in", values, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpAnswerNotIn(List<String> values) {
            addCriterion("qp_answer not in", values, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpAnswerBetween(String value1, String value2) {
            addCriterion("qp_answer between", value1, value2, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpAnswerNotBetween(String value1, String value2) {
            addCriterion("qp_answer not between", value1, value2, "qpAnswer");
            return (Criteria) this;
        }

        public Criteria andQpNameIsNull() {
            addCriterion("qp_name is null");
            return (Criteria) this;
        }

        public Criteria andQpNameIsNotNull() {
            addCriterion("qp_name is not null");
            return (Criteria) this;
        }

        public Criteria andQpNameEqualTo(String value) {
            addCriterion("qp_name =", value, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpNameNotEqualTo(String value) {
            addCriterion("qp_name <>", value, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpNameGreaterThan(String value) {
            addCriterion("qp_name >", value, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpNameGreaterThanOrEqualTo(String value) {
            addCriterion("qp_name >=", value, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpNameLessThan(String value) {
            addCriterion("qp_name <", value, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpNameLessThanOrEqualTo(String value) {
            addCriterion("qp_name <=", value, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpNameLike(String value) {
            addCriterion("qp_name like", value, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpNameNotLike(String value) {
            addCriterion("qp_name not like", value, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpNameIn(List<String> values) {
            addCriterion("qp_name in", values, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpNameNotIn(List<String> values) {
            addCriterion("qp_name not in", values, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpNameBetween(String value1, String value2) {
            addCriterion("qp_name between", value1, value2, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpNameNotBetween(String value1, String value2) {
            addCriterion("qp_name not between", value1, value2, "qpName");
            return (Criteria) this;
        }

        public Criteria andQpCreateByIsNull() {
            addCriterion("qp_create_by is null");
            return (Criteria) this;
        }

        public Criteria andQpCreateByIsNotNull() {
            addCriterion("qp_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andQpCreateByEqualTo(String value) {
            addCriterion("qp_create_by =", value, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateByNotEqualTo(String value) {
            addCriterion("qp_create_by <>", value, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateByGreaterThan(String value) {
            addCriterion("qp_create_by >", value, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("qp_create_by >=", value, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateByLessThan(String value) {
            addCriterion("qp_create_by <", value, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateByLessThanOrEqualTo(String value) {
            addCriterion("qp_create_by <=", value, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateByLike(String value) {
            addCriterion("qp_create_by like", value, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateByNotLike(String value) {
            addCriterion("qp_create_by not like", value, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateByIn(List<String> values) {
            addCriterion("qp_create_by in", values, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateByNotIn(List<String> values) {
            addCriterion("qp_create_by not in", values, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateByBetween(String value1, String value2) {
            addCriterion("qp_create_by between", value1, value2, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateByNotBetween(String value1, String value2) {
            addCriterion("qp_create_by not between", value1, value2, "qpCreateBy");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeIsNull() {
            addCriterion("qp_create_time is null");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeIsNotNull() {
            addCriterion("qp_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qp_create_time =", value, "qpCreateTime");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qp_create_time <>", value, "qpCreateTime");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qp_create_time >", value, "qpCreateTime");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qp_create_time >=", value, "qpCreateTime");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("qp_create_time <", value, "qpCreateTime");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qp_create_time <=", value, "qpCreateTime");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qp_create_time in", values, "qpCreateTime");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qp_create_time not in", values, "qpCreateTime");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qp_create_time between", value1, value2, "qpCreateTime");
            return (Criteria) this;
        }

        public Criteria andQpCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qp_create_time not between", value1, value2, "qpCreateTime");
            return (Criteria) this;
        }

        public Criteria andQpModifyByIsNull() {
            addCriterion("qp_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andQpModifyByIsNotNull() {
            addCriterion("qp_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andQpModifyByEqualTo(String value) {
            addCriterion("qp_modify_by =", value, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyByNotEqualTo(String value) {
            addCriterion("qp_modify_by <>", value, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyByGreaterThan(String value) {
            addCriterion("qp_modify_by >", value, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("qp_modify_by >=", value, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyByLessThan(String value) {
            addCriterion("qp_modify_by <", value, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyByLessThanOrEqualTo(String value) {
            addCriterion("qp_modify_by <=", value, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyByLike(String value) {
            addCriterion("qp_modify_by like", value, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyByNotLike(String value) {
            addCriterion("qp_modify_by not like", value, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyByIn(List<String> values) {
            addCriterion("qp_modify_by in", values, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyByNotIn(List<String> values) {
            addCriterion("qp_modify_by not in", values, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyByBetween(String value1, String value2) {
            addCriterion("qp_modify_by between", value1, value2, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyByNotBetween(String value1, String value2) {
            addCriterion("qp_modify_by not between", value1, value2, "qpModifyBy");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeIsNull() {
            addCriterion("qp_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeIsNotNull() {
            addCriterion("qp_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qp_modify_time =", value, "qpModifyTime");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qp_modify_time <>", value, "qpModifyTime");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qp_modify_time >", value, "qpModifyTime");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qp_modify_time >=", value, "qpModifyTime");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("qp_modify_time <", value, "qpModifyTime");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qp_modify_time <=", value, "qpModifyTime");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qp_modify_time in", values, "qpModifyTime");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qp_modify_time not in", values, "qpModifyTime");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qp_modify_time between", value1, value2, "qpModifyTime");
            return (Criteria) this;
        }

        public Criteria andQpModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qp_modify_time not between", value1, value2, "qpModifyTime");
            return (Criteria) this;
        }

        public Criteria andQpDeleteIsNull() {
            addCriterion("qp_delete is null");
            return (Criteria) this;
        }

        public Criteria andQpDeleteIsNotNull() {
            addCriterion("qp_delete is not null");
            return (Criteria) this;
        }

        public Criteria andQpDeleteEqualTo(Boolean value) {
            addCriterion("qp_delete =", value, "qpDelete");
            return (Criteria) this;
        }

        public Criteria andQpDeleteNotEqualTo(Boolean value) {
            addCriterion("qp_delete <>", value, "qpDelete");
            return (Criteria) this;
        }

        public Criteria andQpDeleteGreaterThan(Boolean value) {
            addCriterion("qp_delete >", value, "qpDelete");
            return (Criteria) this;
        }

        public Criteria andQpDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("qp_delete >=", value, "qpDelete");
            return (Criteria) this;
        }

        public Criteria andQpDeleteLessThan(Boolean value) {
            addCriterion("qp_delete <", value, "qpDelete");
            return (Criteria) this;
        }

        public Criteria andQpDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("qp_delete <=", value, "qpDelete");
            return (Criteria) this;
        }

        public Criteria andQpDeleteIn(List<Boolean> values) {
            addCriterion("qp_delete in", values, "qpDelete");
            return (Criteria) this;
        }

        public Criteria andQpDeleteNotIn(List<Boolean> values) {
            addCriterion("qp_delete not in", values, "qpDelete");
            return (Criteria) this;
        }

        public Criteria andQpDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("qp_delete between", value1, value2, "qpDelete");
            return (Criteria) this;
        }

        public Criteria andQpDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("qp_delete not between", value1, value2, "qpDelete");
            return (Criteria) this;
        }

        public Criteria andQpVersionIsNull() {
            addCriterion("qp_version is null");
            return (Criteria) this;
        }

        public Criteria andQpVersionIsNotNull() {
            addCriterion("qp_version is not null");
            return (Criteria) this;
        }

        public Criteria andQpVersionEqualTo(Integer value) {
            addCriterion("qp_version =", value, "qpVersion");
            return (Criteria) this;
        }

        public Criteria andQpVersionNotEqualTo(Integer value) {
            addCriterion("qp_version <>", value, "qpVersion");
            return (Criteria) this;
        }

        public Criteria andQpVersionGreaterThan(Integer value) {
            addCriterion("qp_version >", value, "qpVersion");
            return (Criteria) this;
        }

        public Criteria andQpVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("qp_version >=", value, "qpVersion");
            return (Criteria) this;
        }

        public Criteria andQpVersionLessThan(Integer value) {
            addCriterion("qp_version <", value, "qpVersion");
            return (Criteria) this;
        }

        public Criteria andQpVersionLessThanOrEqualTo(Integer value) {
            addCriterion("qp_version <=", value, "qpVersion");
            return (Criteria) this;
        }

        public Criteria andQpVersionIn(List<Integer> values) {
            addCriterion("qp_version in", values, "qpVersion");
            return (Criteria) this;
        }

        public Criteria andQpVersionNotIn(List<Integer> values) {
            addCriterion("qp_version not in", values, "qpVersion");
            return (Criteria) this;
        }

        public Criteria andQpVersionBetween(Integer value1, Integer value2) {
            addCriterion("qp_version between", value1, value2, "qpVersion");
            return (Criteria) this;
        }

        public Criteria andQpVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("qp_version not between", value1, value2, "qpVersion");
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