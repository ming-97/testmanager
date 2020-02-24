package com.pctc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PermissionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionsExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Long value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Long value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Long value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Long value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Long value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Long> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Long> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Long value1, Long value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Long value1, Long value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPInsidIsNull() {
            addCriterion("p_insid is null");
            return (Criteria) this;
        }

        public Criteria andPInsidIsNotNull() {
            addCriterion("p_insid is not null");
            return (Criteria) this;
        }

        public Criteria andPInsidEqualTo(Long value) {
            addCriterion("p_insid =", value, "pInsid");
            return (Criteria) this;
        }

        public Criteria andPInsidNotEqualTo(Long value) {
            addCriterion("p_insid <>", value, "pInsid");
            return (Criteria) this;
        }

        public Criteria andPInsidGreaterThan(Long value) {
            addCriterion("p_insid >", value, "pInsid");
            return (Criteria) this;
        }

        public Criteria andPInsidGreaterThanOrEqualTo(Long value) {
            addCriterion("p_insid >=", value, "pInsid");
            return (Criteria) this;
        }

        public Criteria andPInsidLessThan(Long value) {
            addCriterion("p_insid <", value, "pInsid");
            return (Criteria) this;
        }

        public Criteria andPInsidLessThanOrEqualTo(Long value) {
            addCriterion("p_insid <=", value, "pInsid");
            return (Criteria) this;
        }

        public Criteria andPInsidIn(List<Long> values) {
            addCriterion("p_insid in", values, "pInsid");
            return (Criteria) this;
        }

        public Criteria andPInsidNotIn(List<Long> values) {
            addCriterion("p_insid not in", values, "pInsid");
            return (Criteria) this;
        }

        public Criteria andPInsidBetween(Long value1, Long value2) {
            addCriterion("p_insid between", value1, value2, "pInsid");
            return (Criteria) this;
        }

        public Criteria andPInsidNotBetween(Long value1, Long value2) {
            addCriterion("p_insid not between", value1, value2, "pInsid");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoIsNull() {
            addCriterion("p_permission_no is null");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoIsNotNull() {
            addCriterion("p_permission_no is not null");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoEqualTo(String value) {
            addCriterion("p_permission_no =", value, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoNotEqualTo(String value) {
            addCriterion("p_permission_no <>", value, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoGreaterThan(String value) {
            addCriterion("p_permission_no >", value, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoGreaterThanOrEqualTo(String value) {
            addCriterion("p_permission_no >=", value, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoLessThan(String value) {
            addCriterion("p_permission_no <", value, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoLessThanOrEqualTo(String value) {
            addCriterion("p_permission_no <=", value, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoLike(String value) {
            addCriterion("p_permission_no like", value, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoNotLike(String value) {
            addCriterion("p_permission_no not like", value, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoIn(List<String> values) {
            addCriterion("p_permission_no in", values, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoNotIn(List<String> values) {
            addCriterion("p_permission_no not in", values, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoBetween(String value1, String value2) {
            addCriterion("p_permission_no between", value1, value2, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPPermissionNoNotBetween(String value1, String value2) {
            addCriterion("p_permission_no not between", value1, value2, "pPermissionNo");
            return (Criteria) this;
        }

        public Criteria andPUrlIsNull() {
            addCriterion("p_url is null");
            return (Criteria) this;
        }

        public Criteria andPUrlIsNotNull() {
            addCriterion("p_url is not null");
            return (Criteria) this;
        }

        public Criteria andPUrlEqualTo(String value) {
            addCriterion("p_url =", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotEqualTo(String value) {
            addCriterion("p_url <>", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlGreaterThan(String value) {
            addCriterion("p_url >", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlGreaterThanOrEqualTo(String value) {
            addCriterion("p_url >=", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLessThan(String value) {
            addCriterion("p_url <", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLessThanOrEqualTo(String value) {
            addCriterion("p_url <=", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLike(String value) {
            addCriterion("p_url like", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotLike(String value) {
            addCriterion("p_url not like", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlIn(List<String> values) {
            addCriterion("p_url in", values, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotIn(List<String> values) {
            addCriterion("p_url not in", values, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlBetween(String value1, String value2) {
            addCriterion("p_url between", value1, value2, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotBetween(String value1, String value2) {
            addCriterion("p_url not between", value1, value2, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPCreateByIsNull() {
            addCriterion("p_create_by is null");
            return (Criteria) this;
        }

        public Criteria andPCreateByIsNotNull() {
            addCriterion("p_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andPCreateByEqualTo(String value) {
            addCriterion("p_create_by =", value, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateByNotEqualTo(String value) {
            addCriterion("p_create_by <>", value, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateByGreaterThan(String value) {
            addCriterion("p_create_by >", value, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("p_create_by >=", value, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateByLessThan(String value) {
            addCriterion("p_create_by <", value, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateByLessThanOrEqualTo(String value) {
            addCriterion("p_create_by <=", value, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateByLike(String value) {
            addCriterion("p_create_by like", value, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateByNotLike(String value) {
            addCriterion("p_create_by not like", value, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateByIn(List<String> values) {
            addCriterion("p_create_by in", values, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateByNotIn(List<String> values) {
            addCriterion("p_create_by not in", values, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateByBetween(String value1, String value2) {
            addCriterion("p_create_by between", value1, value2, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateByNotBetween(String value1, String value2) {
            addCriterion("p_create_by not between", value1, value2, "pCreateBy");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeIsNull() {
            addCriterion("p_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeIsNotNull() {
            addCriterion("p_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("p_create_time =", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("p_create_time <>", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("p_create_time >", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_create_time >=", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("p_create_time <", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_create_time <=", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("p_create_time in", values, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("p_create_time not in", values, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_create_time between", value1, value2, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_create_time not between", value1, value2, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPModifyByIsNull() {
            addCriterion("p_modify_by is null");
            return (Criteria) this;
        }

        public Criteria andPModifyByIsNotNull() {
            addCriterion("p_modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andPModifyByEqualTo(String value) {
            addCriterion("p_modify_by =", value, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModifyByNotEqualTo(String value) {
            addCriterion("p_modify_by <>", value, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModifyByGreaterThan(String value) {
            addCriterion("p_modify_by >", value, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("p_modify_by >=", value, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModifyByLessThan(String value) {
            addCriterion("p_modify_by <", value, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModifyByLessThanOrEqualTo(String value) {
            addCriterion("p_modify_by <=", value, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModifyByLike(String value) {
            addCriterion("p_modify_by like", value, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModifyByNotLike(String value) {
            addCriterion("p_modify_by not like", value, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModifyByIn(List<String> values) {
            addCriterion("p_modify_by in", values, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModifyByNotIn(List<String> values) {
            addCriterion("p_modify_by not in", values, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModifyByBetween(String value1, String value2) {
            addCriterion("p_modify_by between", value1, value2, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModifyByNotBetween(String value1, String value2) {
            addCriterion("p_modify_by not between", value1, value2, "pModifyBy");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeIsNull() {
            addCriterion("p_modufy_time is null");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeIsNotNull() {
            addCriterion("p_modufy_time is not null");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("p_modufy_time =", value, "pModufyTime");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("p_modufy_time <>", value, "pModufyTime");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("p_modufy_time >", value, "pModufyTime");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_modufy_time >=", value, "pModufyTime");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeLessThan(Date value) {
            addCriterionForJDBCDate("p_modufy_time <", value, "pModufyTime");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_modufy_time <=", value, "pModufyTime");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("p_modufy_time in", values, "pModufyTime");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("p_modufy_time not in", values, "pModufyTime");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_modufy_time between", value1, value2, "pModufyTime");
            return (Criteria) this;
        }

        public Criteria andPModufyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_modufy_time not between", value1, value2, "pModufyTime");
            return (Criteria) this;
        }

        public Criteria andPDeleteIsNull() {
            addCriterion("p_delete is null");
            return (Criteria) this;
        }

        public Criteria andPDeleteIsNotNull() {
            addCriterion("p_delete is not null");
            return (Criteria) this;
        }

        public Criteria andPDeleteEqualTo(Boolean value) {
            addCriterion("p_delete =", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteNotEqualTo(Boolean value) {
            addCriterion("p_delete <>", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteGreaterThan(Boolean value) {
            addCriterion("p_delete >", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("p_delete >=", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteLessThan(Boolean value) {
            addCriterion("p_delete <", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("p_delete <=", value, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteIn(List<Boolean> values) {
            addCriterion("p_delete in", values, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteNotIn(List<Boolean> values) {
            addCriterion("p_delete not in", values, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("p_delete between", value1, value2, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("p_delete not between", value1, value2, "pDelete");
            return (Criteria) this;
        }

        public Criteria andPVersionIsNull() {
            addCriterion("p_version is null");
            return (Criteria) this;
        }

        public Criteria andPVersionIsNotNull() {
            addCriterion("p_version is not null");
            return (Criteria) this;
        }

        public Criteria andPVersionEqualTo(Integer value) {
            addCriterion("p_version =", value, "pVersion");
            return (Criteria) this;
        }

        public Criteria andPVersionNotEqualTo(Integer value) {
            addCriterion("p_version <>", value, "pVersion");
            return (Criteria) this;
        }

        public Criteria andPVersionGreaterThan(Integer value) {
            addCriterion("p_version >", value, "pVersion");
            return (Criteria) this;
        }

        public Criteria andPVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_version >=", value, "pVersion");
            return (Criteria) this;
        }

        public Criteria andPVersionLessThan(Integer value) {
            addCriterion("p_version <", value, "pVersion");
            return (Criteria) this;
        }

        public Criteria andPVersionLessThanOrEqualTo(Integer value) {
            addCriterion("p_version <=", value, "pVersion");
            return (Criteria) this;
        }

        public Criteria andPVersionIn(List<Integer> values) {
            addCriterion("p_version in", values, "pVersion");
            return (Criteria) this;
        }

        public Criteria andPVersionNotIn(List<Integer> values) {
            addCriterion("p_version not in", values, "pVersion");
            return (Criteria) this;
        }

        public Criteria andPVersionBetween(Integer value1, Integer value2) {
            addCriterion("p_version between", value1, value2, "pVersion");
            return (Criteria) this;
        }

        public Criteria andPVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("p_version not between", value1, value2, "pVersion");
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