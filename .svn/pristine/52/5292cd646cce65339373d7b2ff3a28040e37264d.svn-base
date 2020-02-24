package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Long value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Long value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Long value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Long value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Long value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Long value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Long> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Long> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Long value1, Long value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Long value1, Long value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGSidIsNull() {
            addCriterion("g_sid is null");
            return (Criteria) this;
        }

        public Criteria andGSidIsNotNull() {
            addCriterion("g_sid is not null");
            return (Criteria) this;
        }

        public Criteria andGSidEqualTo(Long value) {
            addCriterion("g_sid =", value, "gSid");
            return (Criteria) this;
        }

        public Criteria andGSidNotEqualTo(Long value) {
            addCriterion("g_sid <>", value, "gSid");
            return (Criteria) this;
        }

        public Criteria andGSidGreaterThan(Long value) {
            addCriterion("g_sid >", value, "gSid");
            return (Criteria) this;
        }

        public Criteria andGSidGreaterThanOrEqualTo(Long value) {
            addCriterion("g_sid >=", value, "gSid");
            return (Criteria) this;
        }

        public Criteria andGSidLessThan(Long value) {
            addCriterion("g_sid <", value, "gSid");
            return (Criteria) this;
        }

        public Criteria andGSidLessThanOrEqualTo(Long value) {
            addCriterion("g_sid <=", value, "gSid");
            return (Criteria) this;
        }

        public Criteria andGSidIn(List<Long> values) {
            addCriterion("g_sid in", values, "gSid");
            return (Criteria) this;
        }

        public Criteria andGSidNotIn(List<Long> values) {
            addCriterion("g_sid not in", values, "gSid");
            return (Criteria) this;
        }

        public Criteria andGSidBetween(Long value1, Long value2) {
            addCriterion("g_sid between", value1, value2, "gSid");
            return (Criteria) this;
        }

        public Criteria andGSidNotBetween(Long value1, Long value2) {
            addCriterion("g_sid not between", value1, value2, "gSid");
            return (Criteria) this;
        }

        public Criteria andGQpnameIsNull() {
            addCriterion("g_qpname is null");
            return (Criteria) this;
        }

        public Criteria andGQpnameIsNotNull() {
            addCriterion("g_qpname is not null");
            return (Criteria) this;
        }

        public Criteria andGQpnameEqualTo(String value) {
            addCriterion("g_qpname =", value, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGQpnameNotEqualTo(String value) {
            addCriterion("g_qpname <>", value, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGQpnameGreaterThan(String value) {
            addCriterion("g_qpname >", value, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGQpnameGreaterThanOrEqualTo(String value) {
            addCriterion("g_qpname >=", value, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGQpnameLessThan(String value) {
            addCriterion("g_qpname <", value, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGQpnameLessThanOrEqualTo(String value) {
            addCriterion("g_qpname <=", value, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGQpnameLike(String value) {
            addCriterion("g_qpname like", value, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGQpnameNotLike(String value) {
            addCriterion("g_qpname not like", value, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGQpnameIn(List<String> values) {
            addCriterion("g_qpname in", values, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGQpnameNotIn(List<String> values) {
            addCriterion("g_qpname not in", values, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGQpnameBetween(String value1, String value2) {
            addCriterion("g_qpname between", value1, value2, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGQpnameNotBetween(String value1, String value2) {
            addCriterion("g_qpname not between", value1, value2, "gQpname");
            return (Criteria) this;
        }

        public Criteria andGInsidIsNull() {
            addCriterion("g_insid is null");
            return (Criteria) this;
        }

        public Criteria andGInsidIsNotNull() {
            addCriterion("g_insid is not null");
            return (Criteria) this;
        }

        public Criteria andGInsidEqualTo(Long value) {
            addCriterion("g_insid =", value, "gInsid");
            return (Criteria) this;
        }

        public Criteria andGInsidNotEqualTo(Long value) {
            addCriterion("g_insid <>", value, "gInsid");
            return (Criteria) this;
        }

        public Criteria andGInsidGreaterThan(Long value) {
            addCriterion("g_insid >", value, "gInsid");
            return (Criteria) this;
        }

        public Criteria andGInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("g_insid >=", value, "gInsid");
            return (Criteria) this;
        }

        public Criteria andGInsidLessThan(Long value) {
            addCriterion("g_insid <", value, "gInsid");
            return (Criteria) this;
        }

        public Criteria andGInsidLessThanOrEqualTo(Long value) {
            addCriterion("g_insid <=", value, "gInsid");
            return (Criteria) this;
        }

        public Criteria andGInsidIn(List<Long> values) {
            addCriterion("g_insid in", values, "gInsid");
            return (Criteria) this;
        }

        public Criteria andGInsidNotIn(List<Long> values) {
            addCriterion("g_insid not in", values, "gInsid");
            return (Criteria) this;
        }

        public Criteria andGInsidBetween(Long value1, Long value2) {
            addCriterion("g_insid between", value1, value2, "gInsid");
            return (Criteria) this;
        }

        public Criteria andGInsidNotBetween(Long value1, Long value2) {
            addCriterion("g_insid not between", value1, value2, "gInsid");
            return (Criteria) this;
        }

        public Criteria andGGradeIsNull() {
            addCriterion("g_grade is null");
            return (Criteria) this;
        }

        public Criteria andGGradeIsNotNull() {
            addCriterion("g_grade is not null");
            return (Criteria) this;
        }

        public Criteria andGGradeEqualTo(Integer value) {
            addCriterion("g_grade =", value, "gGrade");
            return (Criteria) this;
        }

        public Criteria andGGradeNotEqualTo(Integer value) {
            addCriterion("g_grade <>", value, "gGrade");
            return (Criteria) this;
        }

        public Criteria andGGradeGreaterThan(Integer value) {
            addCriterion("g_grade >", value, "gGrade");
            return (Criteria) this;
        }

        public Criteria andGGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_grade >=", value, "gGrade");
            return (Criteria) this;
        }

        public Criteria andGGradeLessThan(Integer value) {
            addCriterion("g_grade <", value, "gGrade");
            return (Criteria) this;
        }

        public Criteria andGGradeLessThanOrEqualTo(Integer value) {
            addCriterion("g_grade <=", value, "gGrade");
            return (Criteria) this;
        }

        public Criteria andGGradeIn(List<Integer> values) {
            addCriterion("g_grade in", values, "gGrade");
            return (Criteria) this;
        }

        public Criteria andGGradeNotIn(List<Integer> values) {
            addCriterion("g_grade not in", values, "gGrade");
            return (Criteria) this;
        }

        public Criteria andGGradeBetween(Integer value1, Integer value2) {
            addCriterion("g_grade between", value1, value2, "gGrade");
            return (Criteria) this;
        }

        public Criteria andGGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("g_grade not between", value1, value2, "gGrade");
            return (Criteria) this;
        }

        public Criteria andGCreateByIsNull() {
            addCriterion("g_create_by is null");
            return (Criteria) this;
        }

        public Criteria andGCreateByIsNotNull() {
            addCriterion("g_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andGCreateByEqualTo(String value) {
            addCriterion("g_create_by =", value, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateByNotEqualTo(String value) {
            addCriterion("g_create_by <>", value, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateByGreaterThan(String value) {
            addCriterion("g_create_by >", value, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("g_create_by >=", value, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateByLessThan(String value) {
            addCriterion("g_create_by <", value, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateByLessThanOrEqualTo(String value) {
            addCriterion("g_create_by <=", value, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateByLike(String value) {
            addCriterion("g_create_by like", value, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateByNotLike(String value) {
            addCriterion("g_create_by not like", value, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateByIn(List<String> values) {
            addCriterion("g_create_by in", values, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateByNotIn(List<String> values) {
            addCriterion("g_create_by not in", values, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateByBetween(String value1, String value2) {
            addCriterion("g_create_by between", value1, value2, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateByNotBetween(String value1, String value2) {
            addCriterion("g_create_by not between", value1, value2, "gCreateBy");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeIsNull() {
            addCriterion("g_create_time is null");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeIsNotNull() {
            addCriterion("g_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("g_create_time =", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("g_create_time <>", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("g_create_time >", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("g_create_time >=", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("g_create_time <", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("g_create_time <=", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("g_create_time in", values, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("g_create_time not in", values, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("g_create_time between", value1, value2, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("g_create_time not between", value1, value2, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGModifyByIsNull() {
            addCriterion("g_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andGModifyByIsNotNull() {
            addCriterion("g_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andGModifyByEqualTo(String value) {
            addCriterion("g_modify_by =", value, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyByNotEqualTo(String value) {
            addCriterion("g_modify_by <>", value, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyByGreaterThan(String value) {
            addCriterion("g_modify_by >", value, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("g_modify_by >=", value, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyByLessThan(String value) {
            addCriterion("g_modify_by <", value, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyByLessThanOrEqualTo(String value) {
            addCriterion("g_modify_by <=", value, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyByLike(String value) {
            addCriterion("g_modify_by like", value, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyByNotLike(String value) {
            addCriterion("g_modify_by not like", value, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyByIn(List<String> values) {
            addCriterion("g_modify_by in", values, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyByNotIn(List<String> values) {
            addCriterion("g_modify_by not in", values, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyByBetween(String value1, String value2) {
            addCriterion("g_modify_by between", value1, value2, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyByNotBetween(String value1, String value2) {
            addCriterion("g_modify_by not between", value1, value2, "gModifyBy");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeIsNull() {
            addCriterion("g_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeIsNotNull() {
            addCriterion("g_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("g_modify_time =", value, "gModifyTime");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("g_modify_time <>", value, "gModifyTime");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("g_modify_time >", value, "gModifyTime");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("g_modify_time >=", value, "gModifyTime");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("g_modify_time <", value, "gModifyTime");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("g_modify_time <=", value, "gModifyTime");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("g_modify_time in", values, "gModifyTime");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("g_modify_time not in", values, "gModifyTime");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("g_modify_time between", value1, value2, "gModifyTime");
            return (Criteria) this;
        }

        public Criteria andGModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("g_modify_time not between", value1, value2, "gModifyTime");
            return (Criteria) this;
        }

        public Criteria andGDeleteIsNull() {
            addCriterion("g_delete is null");
            return (Criteria) this;
        }

        public Criteria andGDeleteIsNotNull() {
            addCriterion("g_delete is not null");
            return (Criteria) this;
        }

        public Criteria andGDeleteEqualTo(Boolean value) {
            addCriterion("g_delete =", value, "gDelete");
            return (Criteria) this;
        }

        public Criteria andGDeleteNotEqualTo(Boolean value) {
            addCriterion("g_delete <>", value, "gDelete");
            return (Criteria) this;
        }

        public Criteria andGDeleteGreaterThan(Boolean value) {
            addCriterion("g_delete >", value, "gDelete");
            return (Criteria) this;
        }

        public Criteria andGDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("g_delete >=", value, "gDelete");
            return (Criteria) this;
        }

        public Criteria andGDeleteLessThan(Boolean value) {
            addCriterion("g_delete <", value, "gDelete");
            return (Criteria) this;
        }

        public Criteria andGDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("g_delete <=", value, "gDelete");
            return (Criteria) this;
        }

        public Criteria andGDeleteIn(List<Boolean> values) {
            addCriterion("g_delete in", values, "gDelete");
            return (Criteria) this;
        }

        public Criteria andGDeleteNotIn(List<Boolean> values) {
            addCriterion("g_delete not in", values, "gDelete");
            return (Criteria) this;
        }

        public Criteria andGDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("g_delete between", value1, value2, "gDelete");
            return (Criteria) this;
        }

        public Criteria andGDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("g_delete not between", value1, value2, "gDelete");
            return (Criteria) this;
        }

        public Criteria andGVersionIsNull() {
            addCriterion("g_version is null");
            return (Criteria) this;
        }

        public Criteria andGVersionIsNotNull() {
            addCriterion("g_version is not null");
            return (Criteria) this;
        }

        public Criteria andGVersionEqualTo(Integer value) {
            addCriterion("g_version =", value, "gVersion");
            return (Criteria) this;
        }

        public Criteria andGVersionNotEqualTo(Integer value) {
            addCriterion("g_version <>", value, "gVersion");
            return (Criteria) this;
        }

        public Criteria andGVersionGreaterThan(Integer value) {
            addCriterion("g_version >", value, "gVersion");
            return (Criteria) this;
        }

        public Criteria andGVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_version >=", value, "gVersion");
            return (Criteria) this;
        }

        public Criteria andGVersionLessThan(Integer value) {
            addCriterion("g_version <", value, "gVersion");
            return (Criteria) this;
        }

        public Criteria andGVersionLessThanOrEqualTo(Integer value) {
            addCriterion("g_version <=", value, "gVersion");
            return (Criteria) this;
        }

        public Criteria andGVersionIn(List<Integer> values) {
            addCriterion("g_version in", values, "gVersion");
            return (Criteria) this;
        }

        public Criteria andGVersionNotIn(List<Integer> values) {
            addCriterion("g_version not in", values, "gVersion");
            return (Criteria) this;
        }

        public Criteria andGVersionBetween(Integer value1, Integer value2) {
            addCriterion("g_version between", value1, value2, "gVersion");
            return (Criteria) this;
        }

        public Criteria andGVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("g_version not between", value1, value2, "gVersion");
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