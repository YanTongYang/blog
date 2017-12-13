package com.sitan.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogCommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNull() {
            addCriterion("comment_type is null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNotNull() {
            addCriterion("comment_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeEqualTo(Integer value) {
            addCriterion("comment_type =", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotEqualTo(Integer value) {
            addCriterion("comment_type <>", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThan(Integer value) {
            addCriterion("comment_type >", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_type >=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThan(Integer value) {
            addCriterion("comment_type <", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_type <=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIn(List<Integer> values) {
            addCriterion("comment_type in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotIn(List<Integer> values) {
            addCriterion("comment_type not in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeBetween(Integer value1, Integer value2) {
            addCriterion("comment_type between", value1, value2, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_type not between", value1, value2, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentPersonIsNull() {
            addCriterion("comment_person is null");
            return (Criteria) this;
        }

        public Criteria andCommentPersonIsNotNull() {
            addCriterion("comment_person is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPersonEqualTo(String value) {
            addCriterion("comment_person =", value, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentPersonNotEqualTo(String value) {
            addCriterion("comment_person <>", value, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentPersonGreaterThan(String value) {
            addCriterion("comment_person >", value, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentPersonGreaterThanOrEqualTo(String value) {
            addCriterion("comment_person >=", value, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentPersonLessThan(String value) {
            addCriterion("comment_person <", value, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentPersonLessThanOrEqualTo(String value) {
            addCriterion("comment_person <=", value, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentPersonLike(String value) {
            addCriterion("comment_person like", value, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentPersonNotLike(String value) {
            addCriterion("comment_person not like", value, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentPersonIn(List<String> values) {
            addCriterion("comment_person in", values, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentPersonNotIn(List<String> values) {
            addCriterion("comment_person not in", values, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentPersonBetween(String value1, String value2) {
            addCriterion("comment_person between", value1, value2, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentPersonNotBetween(String value1, String value2) {
            addCriterion("comment_person not between", value1, value2, "commentPerson");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("comment_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("comment_date =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("comment_date <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("comment_date >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("comment_date <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("comment_date <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("comment_date in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("comment_date not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("comment_date between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("comment_date not between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentParentIsNull() {
            addCriterion("comment_parent is null");
            return (Criteria) this;
        }

        public Criteria andCommentParentIsNotNull() {
            addCriterion("comment_parent is not null");
            return (Criteria) this;
        }

        public Criteria andCommentParentEqualTo(Integer value) {
            addCriterion("comment_parent =", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentNotEqualTo(Integer value) {
            addCriterion("comment_parent <>", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentGreaterThan(Integer value) {
            addCriterion("comment_parent >", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_parent >=", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentLessThan(Integer value) {
            addCriterion("comment_parent <", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentLessThanOrEqualTo(Integer value) {
            addCriterion("comment_parent <=", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentIn(List<Integer> values) {
            addCriterion("comment_parent in", values, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentNotIn(List<Integer> values) {
            addCriterion("comment_parent not in", values, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentBetween(Integer value1, Integer value2) {
            addCriterion("comment_parent between", value1, value2, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_parent not between", value1, value2, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIsNull() {
            addCriterion("comment_target is null");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIsNotNull() {
            addCriterion("comment_target is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTargetEqualTo(Integer value) {
            addCriterion("comment_target =", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetNotEqualTo(Integer value) {
            addCriterion("comment_target <>", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetGreaterThan(Integer value) {
            addCriterion("comment_target >", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_target >=", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetLessThan(Integer value) {
            addCriterion("comment_target <", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetLessThanOrEqualTo(Integer value) {
            addCriterion("comment_target <=", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIn(List<Integer> values) {
            addCriterion("comment_target in", values, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetNotIn(List<Integer> values) {
            addCriterion("comment_target not in", values, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetBetween(Integer value1, Integer value2) {
            addCriterion("comment_target between", value1, value2, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_target not between", value1, value2, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
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