package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Long value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Long value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Long value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Long value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Long value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Long value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Long> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Long> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Long value1, Long value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Long value1, Long value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSInsidIsNull() {
            addCriterion("s_insid is null");
            return (Criteria) this;
        }

        public Criteria andSInsidIsNotNull() {
            addCriterion("s_insid is not null");
            return (Criteria) this;
        }

        public Criteria andSInsidEqualTo(Long value) {
            addCriterion("s_insid =", value, "sInsid");
            return (Criteria) this;
        }

        public Criteria andSInsidNotEqualTo(Long value) {
            addCriterion("s_insid <>", value, "sInsid");
            return (Criteria) this;
        }

        public Criteria andSInsidGreaterThan(Long value) {
            addCriterion("s_insid >", value, "sInsid");
            return (Criteria) this;
        }

        public Criteria andSInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("s_insid >=", value, "sInsid");
            return (Criteria) this;
        }

        public Criteria andSInsidLessThan(Long value) {
            addCriterion("s_insid <", value, "sInsid");
            return (Criteria) this;
        }

        public Criteria andSInsidLessThanOrEqualTo(Long value) {
            addCriterion("s_insid <=", value, "sInsid");
            return (Criteria) this;
        }

        public Criteria andSInsidIn(List<Long> values) {
            addCriterion("s_insid in", values, "sInsid");
            return (Criteria) this;
        }

        public Criteria andSInsidNotIn(List<Long> values) {
            addCriterion("s_insid not in", values, "sInsid");
            return (Criteria) this;
        }

        public Criteria andSInsidBetween(Long value1, Long value2) {
            addCriterion("s_insid between", value1, value2, "sInsid");
            return (Criteria) this;
        }

        public Criteria andSInsidNotBetween(Long value1, Long value2) {
            addCriterion("s_insid not between", value1, value2, "sInsid");
            return (Criteria) this;
        }

        public Criteria andSUsernameIsNull() {
            addCriterion("s_username is null");
            return (Criteria) this;
        }

        public Criteria andSUsernameIsNotNull() {
            addCriterion("s_username is not null");
            return (Criteria) this;
        }

        public Criteria andSUsernameEqualTo(String value) {
            addCriterion("s_username =", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameNotEqualTo(String value) {
            addCriterion("s_username <>", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameGreaterThan(String value) {
            addCriterion("s_username >", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("s_username >=", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameLessThan(String value) {
            addCriterion("s_username <", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameLessThanOrEqualTo(String value) {
            addCriterion("s_username <=", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameLike(String value) {
            addCriterion("s_username like", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameNotLike(String value) {
            addCriterion("s_username not like", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameIn(List<String> values) {
            addCriterion("s_username in", values, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameNotIn(List<String> values) {
            addCriterion("s_username not in", values, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameBetween(String value1, String value2) {
            addCriterion("s_username between", value1, value2, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameNotBetween(String value1, String value2) {
            addCriterion("s_username not between", value1, value2, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNull() {
            addCriterion("s_password is null");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNotNull() {
            addCriterion("s_password is not null");
            return (Criteria) this;
        }

        public Criteria andSPasswordEqualTo(String value) {
            addCriterion("s_password =", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotEqualTo(String value) {
            addCriterion("s_password <>", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThan(String value) {
            addCriterion("s_password >", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("s_password >=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThan(String value) {
            addCriterion("s_password <", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThanOrEqualTo(String value) {
            addCriterion("s_password <=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLike(String value) {
            addCriterion("s_password like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotLike(String value) {
            addCriterion("s_password not like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordIn(List<String> values) {
            addCriterion("s_password in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotIn(List<String> values) {
            addCriterion("s_password not in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordBetween(String value1, String value2) {
            addCriterion("s_password between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotBetween(String value1, String value2) {
            addCriterion("s_password not between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSCreateByIsNull() {
            addCriterion("s_create_by is null");
            return (Criteria) this;
        }

        public Criteria andSCreateByIsNotNull() {
            addCriterion("s_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andSCreateByEqualTo(String value) {
            addCriterion("s_create_by =", value, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateByNotEqualTo(String value) {
            addCriterion("s_create_by <>", value, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateByGreaterThan(String value) {
            addCriterion("s_create_by >", value, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("s_create_by >=", value, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateByLessThan(String value) {
            addCriterion("s_create_by <", value, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateByLessThanOrEqualTo(String value) {
            addCriterion("s_create_by <=", value, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateByLike(String value) {
            addCriterion("s_create_by like", value, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateByNotLike(String value) {
            addCriterion("s_create_by not like", value, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateByIn(List<String> values) {
            addCriterion("s_create_by in", values, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateByNotIn(List<String> values) {
            addCriterion("s_create_by not in", values, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateByBetween(String value1, String value2) {
            addCriterion("s_create_by between", value1, value2, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateByNotBetween(String value1, String value2) {
            addCriterion("s_create_by not between", value1, value2, "sCreateBy");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIsNull() {
            addCriterion("s_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIsNotNull() {
            addCriterion("s_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("s_create_time =", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("s_create_time <>", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("s_create_time >", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_create_time >=", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("s_create_time <", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_create_time <=", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("s_create_time in", values, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("s_create_time not in", values, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_create_time between", value1, value2, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_create_time not between", value1, value2, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSModifyByIsNull() {
            addCriterion("s_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andSModifyByIsNotNull() {
            addCriterion("s_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andSModifyByEqualTo(String value) {
            addCriterion("s_modify_by =", value, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyByNotEqualTo(String value) {
            addCriterion("s_modify_by <>", value, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyByGreaterThan(String value) {
            addCriterion("s_modify_by >", value, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("s_modify_by >=", value, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyByLessThan(String value) {
            addCriterion("s_modify_by <", value, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyByLessThanOrEqualTo(String value) {
            addCriterion("s_modify_by <=", value, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyByLike(String value) {
            addCriterion("s_modify_by like", value, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyByNotLike(String value) {
            addCriterion("s_modify_by not like", value, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyByIn(List<String> values) {
            addCriterion("s_modify_by in", values, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyByNotIn(List<String> values) {
            addCriterion("s_modify_by not in", values, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyByBetween(String value1, String value2) {
            addCriterion("s_modify_by between", value1, value2, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyByNotBetween(String value1, String value2) {
            addCriterion("s_modify_by not between", value1, value2, "sModifyBy");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeIsNull() {
            addCriterion("s_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeIsNotNull() {
            addCriterion("s_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("s_modify_time =", value, "sModifyTime");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("s_modify_time <>", value, "sModifyTime");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("s_modify_time >", value, "sModifyTime");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_modify_time >=", value, "sModifyTime");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("s_modify_time <", value, "sModifyTime");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_modify_time <=", value, "sModifyTime");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("s_modify_time in", values, "sModifyTime");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("s_modify_time not in", values, "sModifyTime");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_modify_time between", value1, value2, "sModifyTime");
            return (Criteria) this;
        }

        public Criteria andSModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_modify_time not between", value1, value2, "sModifyTime");
            return (Criteria) this;
        }

        public Criteria andSDeleteIsNull() {
            addCriterion("s_delete is null");
            return (Criteria) this;
        }

        public Criteria andSDeleteIsNotNull() {
            addCriterion("s_delete is not null");
            return (Criteria) this;
        }

        public Criteria andSDeleteEqualTo(Boolean value) {
            addCriterion("s_delete =", value, "sDelete");
            return (Criteria) this;
        }

        public Criteria andSDeleteNotEqualTo(Boolean value) {
            addCriterion("s_delete <>", value, "sDelete");
            return (Criteria) this;
        }

        public Criteria andSDeleteGreaterThan(Boolean value) {
            addCriterion("s_delete >", value, "sDelete");
            return (Criteria) this;
        }

        public Criteria andSDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("s_delete >=", value, "sDelete");
            return (Criteria) this;
        }

        public Criteria andSDeleteLessThan(Boolean value) {
            addCriterion("s_delete <", value, "sDelete");
            return (Criteria) this;
        }

        public Criteria andSDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("s_delete <=", value, "sDelete");
            return (Criteria) this;
        }

        public Criteria andSDeleteIn(List<Boolean> values) {
            addCriterion("s_delete in", values, "sDelete");
            return (Criteria) this;
        }

        public Criteria andSDeleteNotIn(List<Boolean> values) {
            addCriterion("s_delete not in", values, "sDelete");
            return (Criteria) this;
        }

        public Criteria andSDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("s_delete between", value1, value2, "sDelete");
            return (Criteria) this;
        }

        public Criteria andSDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("s_delete not between", value1, value2, "sDelete");
            return (Criteria) this;
        }

        public Criteria andSVersionIsNull() {
            addCriterion("s_version is null");
            return (Criteria) this;
        }

        public Criteria andSVersionIsNotNull() {
            addCriterion("s_version is not null");
            return (Criteria) this;
        }

        public Criteria andSVersionEqualTo(Integer value) {
            addCriterion("s_version =", value, "sVersion");
            return (Criteria) this;
        }

        public Criteria andSVersionNotEqualTo(Integer value) {
            addCriterion("s_version <>", value, "sVersion");
            return (Criteria) this;
        }

        public Criteria andSVersionGreaterThan(Integer value) {
            addCriterion("s_version >", value, "sVersion");
            return (Criteria) this;
        }

        public Criteria andSVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_version >=", value, "sVersion");
            return (Criteria) this;
        }

        public Criteria andSVersionLessThan(Integer value) {
            addCriterion("s_version <", value, "sVersion");
            return (Criteria) this;
        }

        public Criteria andSVersionLessThanOrEqualTo(Integer value) {
            addCriterion("s_version <=", value, "sVersion");
            return (Criteria) this;
        }

        public Criteria andSVersionIn(List<Integer> values) {
            addCriterion("s_version in", values, "sVersion");
            return (Criteria) this;
        }

        public Criteria andSVersionNotIn(List<Integer> values) {
            addCriterion("s_version not in", values, "sVersion");
            return (Criteria) this;
        }

        public Criteria andSVersionBetween(Integer value1, Integer value2) {
            addCriterion("s_version between", value1, value2, "sVersion");
            return (Criteria) this;
        }

        public Criteria andSVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("s_version not between", value1, value2, "sVersion");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoIsNull() {
            addCriterion("s_permission_no is null");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoIsNotNull() {
            addCriterion("s_permission_no is not null");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoEqualTo(Integer value) {
            addCriterion("s_permission_no =", value, "sPermissionNo");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoNotEqualTo(Integer value) {
            addCriterion("s_permission_no <>", value, "sPermissionNo");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoGreaterThan(Integer value) {
            addCriterion("s_permission_no >", value, "sPermissionNo");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_permission_no >=", value, "sPermissionNo");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoLessThan(Integer value) {
            addCriterion("s_permission_no <", value, "sPermissionNo");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoLessThanOrEqualTo(Integer value) {
            addCriterion("s_permission_no <=", value, "sPermissionNo");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoIn(List<Integer> values) {
            addCriterion("s_permission_no in", values, "sPermissionNo");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoNotIn(List<Integer> values) {
            addCriterion("s_permission_no not in", values, "sPermissionNo");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoBetween(Integer value1, Integer value2) {
            addCriterion("s_permission_no between", value1, value2, "sPermissionNo");
            return (Criteria) this;
        }

        public Criteria andSPermissionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("s_permission_no not between", value1, value2, "sPermissionNo");
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