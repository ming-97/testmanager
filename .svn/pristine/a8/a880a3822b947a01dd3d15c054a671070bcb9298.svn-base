package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuestionBnakExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionBnakExample() {
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

        public Criteria andQbIdIsNull() {
            addCriterion("qb_id is null");
            return (Criteria) this;
        }

        public Criteria andQbIdIsNotNull() {
            addCriterion("qb_id is not null");
            return (Criteria) this;
        }

        public Criteria andQbIdEqualTo(Long value) {
            addCriterion("qb_id =", value, "qbId");
            return (Criteria) this;
        }

        public Criteria andQbIdNotEqualTo(Long value) {
            addCriterion("qb_id <>", value, "qbId");
            return (Criteria) this;
        }

        public Criteria andQbIdGreaterThan(Long value) {
            addCriterion("qb_id >", value, "qbId");
            return (Criteria) this;
        }

        public Criteria andQbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("qb_id >=", value, "qbId");
            return (Criteria) this;
        }

        public Criteria andQbIdLessThan(Long value) {
            addCriterion("qb_id <", value, "qbId");
            return (Criteria) this;
        }

        public Criteria andQbIdLessThanOrEqualTo(Long value) {
            addCriterion("qb_id <=", value, "qbId");
            return (Criteria) this;
        }

        public Criteria andQbIdIn(List<Long> values) {
            addCriterion("qb_id in", values, "qbId");
            return (Criteria) this;
        }

        public Criteria andQbIdNotIn(List<Long> values) {
            addCriterion("qb_id not in", values, "qbId");
            return (Criteria) this;
        }

        public Criteria andQbIdBetween(Long value1, Long value2) {
            addCriterion("qb_id between", value1, value2, "qbId");
            return (Criteria) this;
        }

        public Criteria andQbIdNotBetween(Long value1, Long value2) {
            addCriterion("qb_id not between", value1, value2, "qbId");
            return (Criteria) this;
        }

        public Criteria andQbCcidIsNull() {
            addCriterion("qb_ccid is null");
            return (Criteria) this;
        }

        public Criteria andQbCcidIsNotNull() {
            addCriterion("qb_ccid is not null");
            return (Criteria) this;
        }

        public Criteria andQbCcidEqualTo(Long value) {
            addCriterion("qb_ccid =", value, "qbCcid");
            return (Criteria) this;
        }

        public Criteria andQbCcidNotEqualTo(Long value) {
            addCriterion("qb_ccid <>", value, "qbCcid");
            return (Criteria) this;
        }

        public Criteria andQbCcidGreaterThan(Long value) {
            addCriterion("qb_ccid >", value, "qbCcid");
            return (Criteria) this;
        }

        public Criteria andQbCcidGreaterThanOrEqualTo(Long value) {
            addCriterion("qb_ccid >=", value, "qbCcid");
            return (Criteria) this;
        }

        public Criteria andQbCcidLessThan(Long value) {
            addCriterion("qb_ccid <", value, "qbCcid");
            return (Criteria) this;
        }

        public Criteria andQbCcidLessThanOrEqualTo(Long value) {
            addCriterion("qb_ccid <=", value, "qbCcid");
            return (Criteria) this;
        }

        public Criteria andQbCcidIn(List<Long> values) {
            addCriterion("qb_ccid in", values, "qbCcid");
            return (Criteria) this;
        }

        public Criteria andQbCcidNotIn(List<Long> values) {
            addCriterion("qb_ccid not in", values, "qbCcid");
            return (Criteria) this;
        }

        public Criteria andQbCcidBetween(Long value1, Long value2) {
            addCriterion("qb_ccid between", value1, value2, "qbCcid");
            return (Criteria) this;
        }

        public Criteria andQbCcidNotBetween(Long value1, Long value2) {
            addCriterion("qb_ccid not between", value1, value2, "qbCcid");
            return (Criteria) this;
        }

        public Criteria andQbQtidIsNull() {
            addCriterion("qb_qtid is null");
            return (Criteria) this;
        }

        public Criteria andQbQtidIsNotNull() {
            addCriterion("qb_qtid is not null");
            return (Criteria) this;
        }

        public Criteria andQbQtidEqualTo(Long value) {
            addCriterion("qb_qtid =", value, "qbQtid");
            return (Criteria) this;
        }

        public Criteria andQbQtidNotEqualTo(Long value) {
            addCriterion("qb_qtid <>", value, "qbQtid");
            return (Criteria) this;
        }

        public Criteria andQbQtidGreaterThan(Long value) {
            addCriterion("qb_qtid >", value, "qbQtid");
            return (Criteria) this;
        }

        public Criteria andQbQtidGreaterThanOrEqualTo(Long value) {
            addCriterion("qb_qtid >=", value, "qbQtid");
            return (Criteria) this;
        }

        public Criteria andQbQtidLessThan(Long value) {
            addCriterion("qb_qtid <", value, "qbQtid");
            return (Criteria) this;
        }

        public Criteria andQbQtidLessThanOrEqualTo(Long value) {
            addCriterion("qb_qtid <=", value, "qbQtid");
            return (Criteria) this;
        }

        public Criteria andQbQtidIn(List<Long> values) {
            addCriterion("qb_qtid in", values, "qbQtid");
            return (Criteria) this;
        }

        public Criteria andQbQtidNotIn(List<Long> values) {
            addCriterion("qb_qtid not in", values, "qbQtid");
            return (Criteria) this;
        }

        public Criteria andQbQtidBetween(Long value1, Long value2) {
            addCriterion("qb_qtid between", value1, value2, "qbQtid");
            return (Criteria) this;
        }

        public Criteria andQbQtidNotBetween(Long value1, Long value2) {
            addCriterion("qb_qtid not between", value1, value2, "qbQtid");
            return (Criteria) this;
        }

        public Criteria andQbInsidIsNull() {
            addCriterion("qb_insid is null");
            return (Criteria) this;
        }

        public Criteria andQbInsidIsNotNull() {
            addCriterion("qb_insid is not null");
            return (Criteria) this;
        }

        public Criteria andQbInsidEqualTo(Long value) {
            addCriterion("qb_insid =", value, "qbInsid");
            return (Criteria) this;
        }

        public Criteria andQbInsidNotEqualTo(Long value) {
            addCriterion("qb_insid <>", value, "qbInsid");
            return (Criteria) this;
        }

        public Criteria andQbInsidGreaterThan(Long value) {
            addCriterion("qb_insid >", value, "qbInsid");
            return (Criteria) this;
        }

        public Criteria andQbInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("qb_insid >=", value, "qbInsid");
            return (Criteria) this;
        }

        public Criteria andQbInsidLessThan(Long value) {
            addCriterion("qb_insid <", value, "qbInsid");
            return (Criteria) this;
        }

        public Criteria andQbInsidLessThanOrEqualTo(Long value) {
            addCriterion("qb_insid <=", value, "qbInsid");
            return (Criteria) this;
        }

        public Criteria andQbInsidIn(List<Long> values) {
            addCriterion("qb_insid in", values, "qbInsid");
            return (Criteria) this;
        }

        public Criteria andQbInsidNotIn(List<Long> values) {
            addCriterion("qb_insid not in", values, "qbInsid");
            return (Criteria) this;
        }

        public Criteria andQbInsidBetween(Long value1, Long value2) {
            addCriterion("qb_insid between", value1, value2, "qbInsid");
            return (Criteria) this;
        }

        public Criteria andQbInsidNotBetween(Long value1, Long value2) {
            addCriterion("qb_insid not between", value1, value2, "qbInsid");
            return (Criteria) this;
        }

        public Criteria andQbContentIsNull() {
            addCriterion("qb_content is null");
            return (Criteria) this;
        }

        public Criteria andQbContentIsNotNull() {
            addCriterion("qb_content is not null");
            return (Criteria) this;
        }

        public Criteria andQbContentEqualTo(String value) {
            addCriterion("qb_content =", value, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbContentNotEqualTo(String value) {
            addCriterion("qb_content <>", value, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbContentGreaterThan(String value) {
            addCriterion("qb_content >", value, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbContentGreaterThanOrEqualTo(String value) {
            addCriterion("qb_content >=", value, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbContentLessThan(String value) {
            addCriterion("qb_content <", value, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbContentLessThanOrEqualTo(String value) {
            addCriterion("qb_content <=", value, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbContentLike(String value) {
            addCriterion("qb_content like", value, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbContentNotLike(String value) {
            addCriterion("qb_content not like", value, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbContentIn(List<String> values) {
            addCriterion("qb_content in", values, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbContentNotIn(List<String> values) {
            addCriterion("qb_content not in", values, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbContentBetween(String value1, String value2) {
            addCriterion("qb_content between", value1, value2, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbContentNotBetween(String value1, String value2) {
            addCriterion("qb_content not between", value1, value2, "qbContent");
            return (Criteria) this;
        }

        public Criteria andQbOptionsAIsNull() {
            addCriterion("qb_options_a is null");
            return (Criteria) this;
        }

        public Criteria andQbOptionsAIsNotNull() {
            addCriterion("qb_options_a is not null");
            return (Criteria) this;
        }

        public Criteria andQbOptionsAEqualTo(String value) {
            addCriterion("qb_options_a =", value, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsANotEqualTo(String value) {
            addCriterion("qb_options_a <>", value, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsAGreaterThan(String value) {
            addCriterion("qb_options_a >", value, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsAGreaterThanOrEqualTo(String value) {
            addCriterion("qb_options_a >=", value, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsALessThan(String value) {
            addCriterion("qb_options_a <", value, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsALessThanOrEqualTo(String value) {
            addCriterion("qb_options_a <=", value, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsALike(String value) {
            addCriterion("qb_options_a like", value, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsANotLike(String value) {
            addCriterion("qb_options_a not like", value, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsAIn(List<String> values) {
            addCriterion("qb_options_a in", values, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsANotIn(List<String> values) {
            addCriterion("qb_options_a not in", values, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsABetween(String value1, String value2) {
            addCriterion("qb_options_a between", value1, value2, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsANotBetween(String value1, String value2) {
            addCriterion("qb_options_a not between", value1, value2, "qbOptionsA");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBIsNull() {
            addCriterion("qb_options_b is null");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBIsNotNull() {
            addCriterion("qb_options_b is not null");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBEqualTo(String value) {
            addCriterion("qb_options_b =", value, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBNotEqualTo(String value) {
            addCriterion("qb_options_b <>", value, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBGreaterThan(String value) {
            addCriterion("qb_options_b >", value, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBGreaterThanOrEqualTo(String value) {
            addCriterion("qb_options_b >=", value, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBLessThan(String value) {
            addCriterion("qb_options_b <", value, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBLessThanOrEqualTo(String value) {
            addCriterion("qb_options_b <=", value, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBLike(String value) {
            addCriterion("qb_options_b like", value, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBNotLike(String value) {
            addCriterion("qb_options_b not like", value, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBIn(List<String> values) {
            addCriterion("qb_options_b in", values, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBNotIn(List<String> values) {
            addCriterion("qb_options_b not in", values, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBBetween(String value1, String value2) {
            addCriterion("qb_options_b between", value1, value2, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsBNotBetween(String value1, String value2) {
            addCriterion("qb_options_b not between", value1, value2, "qbOptionsB");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCIsNull() {
            addCriterion("qb_options_c is null");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCIsNotNull() {
            addCriterion("qb_options_c is not null");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCEqualTo(String value) {
            addCriterion("qb_options_c =", value, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCNotEqualTo(String value) {
            addCriterion("qb_options_c <>", value, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCGreaterThan(String value) {
            addCriterion("qb_options_c >", value, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCGreaterThanOrEqualTo(String value) {
            addCriterion("qb_options_c >=", value, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCLessThan(String value) {
            addCriterion("qb_options_c <", value, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCLessThanOrEqualTo(String value) {
            addCriterion("qb_options_c <=", value, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCLike(String value) {
            addCriterion("qb_options_c like", value, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCNotLike(String value) {
            addCriterion("qb_options_c not like", value, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCIn(List<String> values) {
            addCriterion("qb_options_c in", values, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCNotIn(List<String> values) {
            addCriterion("qb_options_c not in", values, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCBetween(String value1, String value2) {
            addCriterion("qb_options_c between", value1, value2, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsCNotBetween(String value1, String value2) {
            addCriterion("qb_options_c not between", value1, value2, "qbOptionsC");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDIsNull() {
            addCriterion("qb_options_d is null");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDIsNotNull() {
            addCriterion("qb_options_d is not null");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDEqualTo(String value) {
            addCriterion("qb_options_d =", value, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDNotEqualTo(String value) {
            addCriterion("qb_options_d <>", value, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDGreaterThan(String value) {
            addCriterion("qb_options_d >", value, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDGreaterThanOrEqualTo(String value) {
            addCriterion("qb_options_d >=", value, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDLessThan(String value) {
            addCriterion("qb_options_d <", value, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDLessThanOrEqualTo(String value) {
            addCriterion("qb_options_d <=", value, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDLike(String value) {
            addCriterion("qb_options_d like", value, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDNotLike(String value) {
            addCriterion("qb_options_d not like", value, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDIn(List<String> values) {
            addCriterion("qb_options_d in", values, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDNotIn(List<String> values) {
            addCriterion("qb_options_d not in", values, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDBetween(String value1, String value2) {
            addCriterion("qb_options_d between", value1, value2, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbOptionsDNotBetween(String value1, String value2) {
            addCriterion("qb_options_d not between", value1, value2, "qbOptionsD");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlIsNull() {
            addCriterion("qb_image_url is null");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlIsNotNull() {
            addCriterion("qb_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlEqualTo(String value) {
            addCriterion("qb_image_url =", value, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlNotEqualTo(String value) {
            addCriterion("qb_image_url <>", value, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlGreaterThan(String value) {
            addCriterion("qb_image_url >", value, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qb_image_url >=", value, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlLessThan(String value) {
            addCriterion("qb_image_url <", value, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlLessThanOrEqualTo(String value) {
            addCriterion("qb_image_url <=", value, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlLike(String value) {
            addCriterion("qb_image_url like", value, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlNotLike(String value) {
            addCriterion("qb_image_url not like", value, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlIn(List<String> values) {
            addCriterion("qb_image_url in", values, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlNotIn(List<String> values) {
            addCriterion("qb_image_url not in", values, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlBetween(String value1, String value2) {
            addCriterion("qb_image_url between", value1, value2, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbImageUrlNotBetween(String value1, String value2) {
            addCriterion("qb_image_url not between", value1, value2, "qbImageUrl");
            return (Criteria) this;
        }

        public Criteria andQbAnswerIsNull() {
            addCriterion("qb_answer is null");
            return (Criteria) this;
        }

        public Criteria andQbAnswerIsNotNull() {
            addCriterion("qb_answer is not null");
            return (Criteria) this;
        }

        public Criteria andQbAnswerEqualTo(String value) {
            addCriterion("qb_answer =", value, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbAnswerNotEqualTo(String value) {
            addCriterion("qb_answer <>", value, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbAnswerGreaterThan(String value) {
            addCriterion("qb_answer >", value, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("qb_answer >=", value, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbAnswerLessThan(String value) {
            addCriterion("qb_answer <", value, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbAnswerLessThanOrEqualTo(String value) {
            addCriterion("qb_answer <=", value, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbAnswerLike(String value) {
            addCriterion("qb_answer like", value, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbAnswerNotLike(String value) {
            addCriterion("qb_answer not like", value, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbAnswerIn(List<String> values) {
            addCriterion("qb_answer in", values, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbAnswerNotIn(List<String> values) {
            addCriterion("qb_answer not in", values, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbAnswerBetween(String value1, String value2) {
            addCriterion("qb_answer between", value1, value2, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbAnswerNotBetween(String value1, String value2) {
            addCriterion("qb_answer not between", value1, value2, "qbAnswer");
            return (Criteria) this;
        }

        public Criteria andQbCreateByIsNull() {
            addCriterion("qb_create_by is null");
            return (Criteria) this;
        }

        public Criteria andQbCreateByIsNotNull() {
            addCriterion("qb_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andQbCreateByEqualTo(String value) {
            addCriterion("qb_create_by =", value, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateByNotEqualTo(String value) {
            addCriterion("qb_create_by <>", value, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateByGreaterThan(String value) {
            addCriterion("qb_create_by >", value, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("qb_create_by >=", value, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateByLessThan(String value) {
            addCriterion("qb_create_by <", value, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateByLessThanOrEqualTo(String value) {
            addCriterion("qb_create_by <=", value, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateByLike(String value) {
            addCriterion("qb_create_by like", value, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateByNotLike(String value) {
            addCriterion("qb_create_by not like", value, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateByIn(List<String> values) {
            addCriterion("qb_create_by in", values, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateByNotIn(List<String> values) {
            addCriterion("qb_create_by not in", values, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateByBetween(String value1, String value2) {
            addCriterion("qb_create_by between", value1, value2, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateByNotBetween(String value1, String value2) {
            addCriterion("qb_create_by not between", value1, value2, "qbCreateBy");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeIsNull() {
            addCriterion("qb_create_time is null");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeIsNotNull() {
            addCriterion("qb_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qb_create_time =", value, "qbCreateTime");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qb_create_time <>", value, "qbCreateTime");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qb_create_time >", value, "qbCreateTime");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qb_create_time >=", value, "qbCreateTime");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("qb_create_time <", value, "qbCreateTime");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qb_create_time <=", value, "qbCreateTime");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qb_create_time in", values, "qbCreateTime");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qb_create_time not in", values, "qbCreateTime");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qb_create_time between", value1, value2, "qbCreateTime");
            return (Criteria) this;
        }

        public Criteria andQbCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qb_create_time not between", value1, value2, "qbCreateTime");
            return (Criteria) this;
        }

        public Criteria andQbModifyByIsNull() {
            addCriterion("qb_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andQbModifyByIsNotNull() {
            addCriterion("qb_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andQbModifyByEqualTo(String value) {
            addCriterion("qb_modify_by =", value, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyByNotEqualTo(String value) {
            addCriterion("qb_modify_by <>", value, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyByGreaterThan(String value) {
            addCriterion("qb_modify_by >", value, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("qb_modify_by >=", value, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyByLessThan(String value) {
            addCriterion("qb_modify_by <", value, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyByLessThanOrEqualTo(String value) {
            addCriterion("qb_modify_by <=", value, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyByLike(String value) {
            addCriterion("qb_modify_by like", value, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyByNotLike(String value) {
            addCriterion("qb_modify_by not like", value, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyByIn(List<String> values) {
            addCriterion("qb_modify_by in", values, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyByNotIn(List<String> values) {
            addCriterion("qb_modify_by not in", values, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyByBetween(String value1, String value2) {
            addCriterion("qb_modify_by between", value1, value2, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyByNotBetween(String value1, String value2) {
            addCriterion("qb_modify_by not between", value1, value2, "qbModifyBy");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeIsNull() {
            addCriterion("qb_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeIsNotNull() {
            addCriterion("qb_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("qb_modify_time =", value, "qbModifyTime");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("qb_modify_time <>", value, "qbModifyTime");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("qb_modify_time >", value, "qbModifyTime");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qb_modify_time >=", value, "qbModifyTime");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("qb_modify_time <", value, "qbModifyTime");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qb_modify_time <=", value, "qbModifyTime");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("qb_modify_time in", values, "qbModifyTime");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("qb_modify_time not in", values, "qbModifyTime");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qb_modify_time between", value1, value2, "qbModifyTime");
            return (Criteria) this;
        }

        public Criteria andQbModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qb_modify_time not between", value1, value2, "qbModifyTime");
            return (Criteria) this;
        }

        public Criteria andQbDeleteIsNull() {
            addCriterion("qb_delete is null");
            return (Criteria) this;
        }

        public Criteria andQbDeleteIsNotNull() {
            addCriterion("qb_delete is not null");
            return (Criteria) this;
        }

        public Criteria andQbDeleteEqualTo(Boolean value) {
            addCriterion("qb_delete =", value, "qbDelete");
            return (Criteria) this;
        }

        public Criteria andQbDeleteNotEqualTo(Boolean value) {
            addCriterion("qb_delete <>", value, "qbDelete");
            return (Criteria) this;
        }

        public Criteria andQbDeleteGreaterThan(Boolean value) {
            addCriterion("qb_delete >", value, "qbDelete");
            return (Criteria) this;
        }

        public Criteria andQbDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("qb_delete >=", value, "qbDelete");
            return (Criteria) this;
        }

        public Criteria andQbDeleteLessThan(Boolean value) {
            addCriterion("qb_delete <", value, "qbDelete");
            return (Criteria) this;
        }

        public Criteria andQbDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("qb_delete <=", value, "qbDelete");
            return (Criteria) this;
        }

        public Criteria andQbDeleteIn(List<Boolean> values) {
            addCriterion("qb_delete in", values, "qbDelete");
            return (Criteria) this;
        }

        public Criteria andQbDeleteNotIn(List<Boolean> values) {
            addCriterion("qb_delete not in", values, "qbDelete");
            return (Criteria) this;
        }

        public Criteria andQbDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("qb_delete between", value1, value2, "qbDelete");
            return (Criteria) this;
        }

        public Criteria andQbDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("qb_delete not between", value1, value2, "qbDelete");
            return (Criteria) this;
        }

        public Criteria andQbVersionIsNull() {
            addCriterion("qb_version is null");
            return (Criteria) this;
        }

        public Criteria andQbVersionIsNotNull() {
            addCriterion("qb_version is not null");
            return (Criteria) this;
        }

        public Criteria andQbVersionEqualTo(Integer value) {
            addCriterion("qb_version =", value, "qbVersion");
            return (Criteria) this;
        }

        public Criteria andQbVersionNotEqualTo(Integer value) {
            addCriterion("qb_version <>", value, "qbVersion");
            return (Criteria) this;
        }

        public Criteria andQbVersionGreaterThan(Integer value) {
            addCriterion("qb_version >", value, "qbVersion");
            return (Criteria) this;
        }

        public Criteria andQbVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("qb_version >=", value, "qbVersion");
            return (Criteria) this;
        }

        public Criteria andQbVersionLessThan(Integer value) {
            addCriterion("qb_version <", value, "qbVersion");
            return (Criteria) this;
        }

        public Criteria andQbVersionLessThanOrEqualTo(Integer value) {
            addCriterion("qb_version <=", value, "qbVersion");
            return (Criteria) this;
        }

        public Criteria andQbVersionIn(List<Integer> values) {
            addCriterion("qb_version in", values, "qbVersion");
            return (Criteria) this;
        }

        public Criteria andQbVersionNotIn(List<Integer> values) {
            addCriterion("qb_version not in", values, "qbVersion");
            return (Criteria) this;
        }

        public Criteria andQbVersionBetween(Integer value1, Integer value2) {
            addCriterion("qb_version between", value1, value2, "qbVersion");
            return (Criteria) this;
        }

        public Criteria andQbVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("qb_version not between", value1, value2, "qbVersion");
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