package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Long value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Long value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Long value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Long value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Long value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Long> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Long> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Long value1, Long value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Long value1, Long value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTInsidIsNull() {
            addCriterion("t_insid is null");
            return (Criteria) this;
        }

        public Criteria andTInsidIsNotNull() {
            addCriterion("t_insid is not null");
            return (Criteria) this;
        }

        public Criteria andTInsidEqualTo(Long value) {
            addCriterion("t_insid =", value, "tInsid");
            return (Criteria) this;
        }

        public Criteria andTInsidNotEqualTo(Long value) {
            addCriterion("t_insid <>", value, "tInsid");
            return (Criteria) this;
        }

        public Criteria andTInsidGreaterThan(Long value) {
            addCriterion("t_insid >", value, "tInsid");
            return (Criteria) this;
        }

        public Criteria andTInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("t_insid >=", value, "tInsid");
            return (Criteria) this;
        }

        public Criteria andTInsidLessThan(Long value) {
            addCriterion("t_insid <", value, "tInsid");
            return (Criteria) this;
        }

        public Criteria andTInsidLessThanOrEqualTo(Long value) {
            addCriterion("t_insid <=", value, "tInsid");
            return (Criteria) this;
        }

        public Criteria andTInsidIn(List<Long> values) {
            addCriterion("t_insid in", values, "tInsid");
            return (Criteria) this;
        }

        public Criteria andTInsidNotIn(List<Long> values) {
            addCriterion("t_insid not in", values, "tInsid");
            return (Criteria) this;
        }

        public Criteria andTInsidBetween(Long value1, Long value2) {
            addCriterion("t_insid between", value1, value2, "tInsid");
            return (Criteria) this;
        }

        public Criteria andTInsidNotBetween(Long value1, Long value2) {
            addCriterion("t_insid not between", value1, value2, "tInsid");
            return (Criteria) this;
        }

        public Criteria andTUsernameIsNull() {
            addCriterion("t_username is null");
            return (Criteria) this;
        }

        public Criteria andTUsernameIsNotNull() {
            addCriterion("t_username is not null");
            return (Criteria) this;
        }

        public Criteria andTUsernameEqualTo(String value) {
            addCriterion("t_username =", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotEqualTo(String value) {
            addCriterion("t_username <>", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameGreaterThan(String value) {
            addCriterion("t_username >", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("t_username >=", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameLessThan(String value) {
            addCriterion("t_username <", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameLessThanOrEqualTo(String value) {
            addCriterion("t_username <=", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameLike(String value) {
            addCriterion("t_username like", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotLike(String value) {
            addCriterion("t_username not like", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameIn(List<String> values) {
            addCriterion("t_username in", values, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotIn(List<String> values) {
            addCriterion("t_username not in", values, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameBetween(String value1, String value2) {
            addCriterion("t_username between", value1, value2, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotBetween(String value1, String value2) {
            addCriterion("t_username not between", value1, value2, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTPasswordIsNull() {
            addCriterion("t_password is null");
            return (Criteria) this;
        }

        public Criteria andTPasswordIsNotNull() {
            addCriterion("t_password is not null");
            return (Criteria) this;
        }

        public Criteria andTPasswordEqualTo(String value) {
            addCriterion("t_password =", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotEqualTo(String value) {
            addCriterion("t_password <>", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordGreaterThan(String value) {
            addCriterion("t_password >", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("t_password >=", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordLessThan(String value) {
            addCriterion("t_password <", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordLessThanOrEqualTo(String value) {
            addCriterion("t_password <=", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordLike(String value) {
            addCriterion("t_password like", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotLike(String value) {
            addCriterion("t_password not like", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordIn(List<String> values) {
            addCriterion("t_password in", values, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotIn(List<String> values) {
            addCriterion("t_password not in", values, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordBetween(String value1, String value2) {
            addCriterion("t_password between", value1, value2, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotBetween(String value1, String value2) {
            addCriterion("t_password not between", value1, value2, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTCreateByIsNull() {
            addCriterion("t_create_by is null");
            return (Criteria) this;
        }

        public Criteria andTCreateByIsNotNull() {
            addCriterion("t_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andTCreateByEqualTo(String value) {
            addCriterion("t_create_by =", value, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateByNotEqualTo(String value) {
            addCriterion("t_create_by <>", value, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateByGreaterThan(String value) {
            addCriterion("t_create_by >", value, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("t_create_by >=", value, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateByLessThan(String value) {
            addCriterion("t_create_by <", value, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateByLessThanOrEqualTo(String value) {
            addCriterion("t_create_by <=", value, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateByLike(String value) {
            addCriterion("t_create_by like", value, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateByNotLike(String value) {
            addCriterion("t_create_by not like", value, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateByIn(List<String> values) {
            addCriterion("t_create_by in", values, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateByNotIn(List<String> values) {
            addCriterion("t_create_by not in", values, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateByBetween(String value1, String value2) {
            addCriterion("t_create_by between", value1, value2, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateByNotBetween(String value1, String value2) {
            addCriterion("t_create_by not between", value1, value2, "tCreateBy");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIsNull() {
            addCriterion("t_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIsNotNull() {
            addCriterion("t_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("t_create_time =", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("t_create_time <>", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("t_create_time >", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_create_time >=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("t_create_time <", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_create_time <=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("t_create_time in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("t_create_time not in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_create_time between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_create_time not between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTModifyByIsNull() {
            addCriterion("t_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andTModifyByIsNotNull() {
            addCriterion("t_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andTModifyByEqualTo(String value) {
            addCriterion("t_modify_by =", value, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyByNotEqualTo(String value) {
            addCriterion("t_modify_by <>", value, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyByGreaterThan(String value) {
            addCriterion("t_modify_by >", value, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("t_modify_by >=", value, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyByLessThan(String value) {
            addCriterion("t_modify_by <", value, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyByLessThanOrEqualTo(String value) {
            addCriterion("t_modify_by <=", value, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyByLike(String value) {
            addCriterion("t_modify_by like", value, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyByNotLike(String value) {
            addCriterion("t_modify_by not like", value, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyByIn(List<String> values) {
            addCriterion("t_modify_by in", values, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyByNotIn(List<String> values) {
            addCriterion("t_modify_by not in", values, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyByBetween(String value1, String value2) {
            addCriterion("t_modify_by between", value1, value2, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyByNotBetween(String value1, String value2) {
            addCriterion("t_modify_by not between", value1, value2, "tModifyBy");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeIsNull() {
            addCriterion("t_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeIsNotNull() {
            addCriterion("t_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("t_modify_time =", value, "tModifyTime");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("t_modify_time <>", value, "tModifyTime");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("t_modify_time >", value, "tModifyTime");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_modify_time >=", value, "tModifyTime");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("t_modify_time <", value, "tModifyTime");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_modify_time <=", value, "tModifyTime");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("t_modify_time in", values, "tModifyTime");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("t_modify_time not in", values, "tModifyTime");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_modify_time between", value1, value2, "tModifyTime");
            return (Criteria) this;
        }

        public Criteria andTModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_modify_time not between", value1, value2, "tModifyTime");
            return (Criteria) this;
        }

        public Criteria andTDeleteIsNull() {
            addCriterion("t_delete is null");
            return (Criteria) this;
        }

        public Criteria andTDeleteIsNotNull() {
            addCriterion("t_delete is not null");
            return (Criteria) this;
        }

        public Criteria andTDeleteEqualTo(Boolean value) {
            addCriterion("t_delete =", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteNotEqualTo(Boolean value) {
            addCriterion("t_delete <>", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteGreaterThan(Boolean value) {
            addCriterion("t_delete >", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("t_delete >=", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteLessThan(Boolean value) {
            addCriterion("t_delete <", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("t_delete <=", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteIn(List<Boolean> values) {
            addCriterion("t_delete in", values, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteNotIn(List<Boolean> values) {
            addCriterion("t_delete not in", values, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("t_delete between", value1, value2, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("t_delete not between", value1, value2, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTVersionIsNull() {
            addCriterion("t_version is null");
            return (Criteria) this;
        }

        public Criteria andTVersionIsNotNull() {
            addCriterion("t_version is not null");
            return (Criteria) this;
        }

        public Criteria andTVersionEqualTo(Integer value) {
            addCriterion("t_version =", value, "tVersion");
            return (Criteria) this;
        }

        public Criteria andTVersionNotEqualTo(Integer value) {
            addCriterion("t_version <>", value, "tVersion");
            return (Criteria) this;
        }

        public Criteria andTVersionGreaterThan(Integer value) {
            addCriterion("t_version >", value, "tVersion");
            return (Criteria) this;
        }

        public Criteria andTVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_version >=", value, "tVersion");
            return (Criteria) this;
        }

        public Criteria andTVersionLessThan(Integer value) {
            addCriterion("t_version <", value, "tVersion");
            return (Criteria) this;
        }

        public Criteria andTVersionLessThanOrEqualTo(Integer value) {
            addCriterion("t_version <=", value, "tVersion");
            return (Criteria) this;
        }

        public Criteria andTVersionIn(List<Integer> values) {
            addCriterion("t_version in", values, "tVersion");
            return (Criteria) this;
        }

        public Criteria andTVersionNotIn(List<Integer> values) {
            addCriterion("t_version not in", values, "tVersion");
            return (Criteria) this;
        }

        public Criteria andTVersionBetween(Integer value1, Integer value2) {
            addCriterion("t_version between", value1, value2, "tVersion");
            return (Criteria) this;
        }

        public Criteria andTVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("t_version not between", value1, value2, "tVersion");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoIsNull() {
            addCriterion("t_permission_no is null");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoIsNotNull() {
            addCriterion("t_permission_no is not null");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoEqualTo(Integer value) {
            addCriterion("t_permission_no =", value, "tPermissionNo");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoNotEqualTo(Integer value) {
            addCriterion("t_permission_no <>", value, "tPermissionNo");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoGreaterThan(Integer value) {
            addCriterion("t_permission_no >", value, "tPermissionNo");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_permission_no >=", value, "tPermissionNo");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoLessThan(Integer value) {
            addCriterion("t_permission_no <", value, "tPermissionNo");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoLessThanOrEqualTo(Integer value) {
            addCriterion("t_permission_no <=", value, "tPermissionNo");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoIn(List<Integer> values) {
            addCriterion("t_permission_no in", values, "tPermissionNo");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoNotIn(List<Integer> values) {
            addCriterion("t_permission_no not in", values, "tPermissionNo");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoBetween(Integer value1, Integer value2) {
            addCriterion("t_permission_no between", value1, value2, "tPermissionNo");
            return (Criteria) this;
        }

        public Criteria andTPermissionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("t_permission_no not between", value1, value2, "tPermissionNo");
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