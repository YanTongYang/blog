package com.sitan.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogMessageExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNull() {
            addCriterion("message_title is null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNotNull() {
            addCriterion("message_title is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleEqualTo(String value) {
            addCriterion("message_title =", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotEqualTo(String value) {
            addCriterion("message_title <>", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThan(String value) {
            addCriterion("message_title >", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("message_title >=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThan(String value) {
            addCriterion("message_title <", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThanOrEqualTo(String value) {
            addCriterion("message_title <=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLike(String value) {
            addCriterion("message_title like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotLike(String value) {
            addCriterion("message_title not like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIn(List<String> values) {
            addCriterion("message_title in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotIn(List<String> values) {
            addCriterion("message_title not in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleBetween(String value1, String value2) {
            addCriterion("message_title between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotBetween(String value1, String value2) {
            addCriterion("message_title not between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageDescIsNull() {
            addCriterion("message_desc is null");
            return (Criteria) this;
        }

        public Criteria andMessageDescIsNotNull() {
            addCriterion("message_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMessageDescEqualTo(String value) {
            addCriterion("message_desc =", value, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageDescNotEqualTo(String value) {
            addCriterion("message_desc <>", value, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageDescGreaterThan(String value) {
            addCriterion("message_desc >", value, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageDescGreaterThanOrEqualTo(String value) {
            addCriterion("message_desc >=", value, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageDescLessThan(String value) {
            addCriterion("message_desc <", value, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageDescLessThanOrEqualTo(String value) {
            addCriterion("message_desc <=", value, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageDescLike(String value) {
            addCriterion("message_desc like", value, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageDescNotLike(String value) {
            addCriterion("message_desc not like", value, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageDescIn(List<String> values) {
            addCriterion("message_desc in", values, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageDescNotIn(List<String> values) {
            addCriterion("message_desc not in", values, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageDescBetween(String value1, String value2) {
            addCriterion("message_desc between", value1, value2, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageDescNotBetween(String value1, String value2) {
            addCriterion("message_desc not between", value1, value2, "messageDesc");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdIsNull() {
            addCriterion("message_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdIsNotNull() {
            addCriterion("message_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdEqualTo(Integer value) {
            addCriterion("message_type_id =", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdNotEqualTo(Integer value) {
            addCriterion("message_type_id <>", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdGreaterThan(Integer value) {
            addCriterion("message_type_id >", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_type_id >=", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdLessThan(Integer value) {
            addCriterion("message_type_id <", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_type_id <=", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdIn(List<Integer> values) {
            addCriterion("message_type_id in", values, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdNotIn(List<Integer> values) {
            addCriterion("message_type_id not in", values, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("message_type_id between", value1, value2, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_type_id not between", value1, value2, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageDateIsNull() {
            addCriterion("message_date is null");
            return (Criteria) this;
        }

        public Criteria andMessageDateIsNotNull() {
            addCriterion("message_date is not null");
            return (Criteria) this;
        }

        public Criteria andMessageDateEqualTo(Date value) {
            addCriterion("message_date =", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateNotEqualTo(Date value) {
            addCriterion("message_date <>", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateGreaterThan(Date value) {
            addCriterion("message_date >", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateGreaterThanOrEqualTo(Date value) {
            addCriterion("message_date >=", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateLessThan(Date value) {
            addCriterion("message_date <", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateLessThanOrEqualTo(Date value) {
            addCriterion("message_date <=", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateIn(List<Date> values) {
            addCriterion("message_date in", values, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateNotIn(List<Date> values) {
            addCriterion("message_date not in", values, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateBetween(Date value1, Date value2) {
            addCriterion("message_date between", value1, value2, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateNotBetween(Date value1, Date value2) {
            addCriterion("message_date not between", value1, value2, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageCountIsNull() {
            addCriterion("message_count is null");
            return (Criteria) this;
        }

        public Criteria andMessageCountIsNotNull() {
            addCriterion("message_count is not null");
            return (Criteria) this;
        }

        public Criteria andMessageCountEqualTo(Integer value) {
            addCriterion("message_count =", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountNotEqualTo(Integer value) {
            addCriterion("message_count <>", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountGreaterThan(Integer value) {
            addCriterion("message_count >", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_count >=", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountLessThan(Integer value) {
            addCriterion("message_count <", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountLessThanOrEqualTo(Integer value) {
            addCriterion("message_count <=", value, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountIn(List<Integer> values) {
            addCriterion("message_count in", values, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountNotIn(List<Integer> values) {
            addCriterion("message_count not in", values, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountBetween(Integer value1, Integer value2) {
            addCriterion("message_count between", value1, value2, "messageCount");
            return (Criteria) this;
        }

        public Criteria andMessageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("message_count not between", value1, value2, "messageCount");
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