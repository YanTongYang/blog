package com.sitan.entity;

import java.util.ArrayList;
import java.util.List;

public class BlogSongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogSongExample() {
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

        public Criteria andSongIdIsNull() {
            addCriterion("song_id is null");
            return (Criteria) this;
        }

        public Criteria andSongIdIsNotNull() {
            addCriterion("song_id is not null");
            return (Criteria) this;
        }

        public Criteria andSongIdEqualTo(Integer value) {
            addCriterion("song_id =", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdNotEqualTo(Integer value) {
            addCriterion("song_id <>", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdGreaterThan(Integer value) {
            addCriterion("song_id >", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("song_id >=", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdLessThan(Integer value) {
            addCriterion("song_id <", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdLessThanOrEqualTo(Integer value) {
            addCriterion("song_id <=", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdIn(List<Integer> values) {
            addCriterion("song_id in", values, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdNotIn(List<Integer> values) {
            addCriterion("song_id not in", values, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdBetween(Integer value1, Integer value2) {
            addCriterion("song_id between", value1, value2, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdNotBetween(Integer value1, Integer value2) {
            addCriterion("song_id not between", value1, value2, "songId");
            return (Criteria) this;
        }

        public Criteria andSongNameIsNull() {
            addCriterion("song_name is null");
            return (Criteria) this;
        }

        public Criteria andSongNameIsNotNull() {
            addCriterion("song_name is not null");
            return (Criteria) this;
        }

        public Criteria andSongNameEqualTo(String value) {
            addCriterion("song_name =", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameNotEqualTo(String value) {
            addCriterion("song_name <>", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameGreaterThan(String value) {
            addCriterion("song_name >", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameGreaterThanOrEqualTo(String value) {
            addCriterion("song_name >=", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameLessThan(String value) {
            addCriterion("song_name <", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameLessThanOrEqualTo(String value) {
            addCriterion("song_name <=", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameLike(String value) {
            addCriterion("song_name like", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameNotLike(String value) {
            addCriterion("song_name not like", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameIn(List<String> values) {
            addCriterion("song_name in", values, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameNotIn(List<String> values) {
            addCriterion("song_name not in", values, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameBetween(String value1, String value2) {
            addCriterion("song_name between", value1, value2, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameNotBetween(String value1, String value2) {
            addCriterion("song_name not between", value1, value2, "songName");
            return (Criteria) this;
        }

        public Criteria andSongUrlIsNull() {
            addCriterion("song_url is null");
            return (Criteria) this;
        }

        public Criteria andSongUrlIsNotNull() {
            addCriterion("song_url is not null");
            return (Criteria) this;
        }

        public Criteria andSongUrlEqualTo(String value) {
            addCriterion("song_url =", value, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongUrlNotEqualTo(String value) {
            addCriterion("song_url <>", value, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongUrlGreaterThan(String value) {
            addCriterion("song_url >", value, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongUrlGreaterThanOrEqualTo(String value) {
            addCriterion("song_url >=", value, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongUrlLessThan(String value) {
            addCriterion("song_url <", value, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongUrlLessThanOrEqualTo(String value) {
            addCriterion("song_url <=", value, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongUrlLike(String value) {
            addCriterion("song_url like", value, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongUrlNotLike(String value) {
            addCriterion("song_url not like", value, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongUrlIn(List<String> values) {
            addCriterion("song_url in", values, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongUrlNotIn(List<String> values) {
            addCriterion("song_url not in", values, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongUrlBetween(String value1, String value2) {
            addCriterion("song_url between", value1, value2, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongUrlNotBetween(String value1, String value2) {
            addCriterion("song_url not between", value1, value2, "songUrl");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdIsNull() {
            addCriterion("song_singer_id is null");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdIsNotNull() {
            addCriterion("song_singer_id is not null");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdEqualTo(Integer value) {
            addCriterion("song_singer_id =", value, "songSingerId");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdNotEqualTo(Integer value) {
            addCriterion("song_singer_id <>", value, "songSingerId");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdGreaterThan(Integer value) {
            addCriterion("song_singer_id >", value, "songSingerId");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("song_singer_id >=", value, "songSingerId");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdLessThan(Integer value) {
            addCriterion("song_singer_id <", value, "songSingerId");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdLessThanOrEqualTo(Integer value) {
            addCriterion("song_singer_id <=", value, "songSingerId");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdIn(List<Integer> values) {
            addCriterion("song_singer_id in", values, "songSingerId");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdNotIn(List<Integer> values) {
            addCriterion("song_singer_id not in", values, "songSingerId");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdBetween(Integer value1, Integer value2) {
            addCriterion("song_singer_id between", value1, value2, "songSingerId");
            return (Criteria) this;
        }

        public Criteria andSongSingerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("song_singer_id not between", value1, value2, "songSingerId");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdIsNull() {
            addCriterion("song_album_id is null");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdIsNotNull() {
            addCriterion("song_album_id is not null");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdEqualTo(Integer value) {
            addCriterion("song_album_id =", value, "songAlbumId");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdNotEqualTo(Integer value) {
            addCriterion("song_album_id <>", value, "songAlbumId");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdGreaterThan(Integer value) {
            addCriterion("song_album_id >", value, "songAlbumId");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("song_album_id >=", value, "songAlbumId");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdLessThan(Integer value) {
            addCriterion("song_album_id <", value, "songAlbumId");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdLessThanOrEqualTo(Integer value) {
            addCriterion("song_album_id <=", value, "songAlbumId");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdIn(List<Integer> values) {
            addCriterion("song_album_id in", values, "songAlbumId");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdNotIn(List<Integer> values) {
            addCriterion("song_album_id not in", values, "songAlbumId");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdBetween(Integer value1, Integer value2) {
            addCriterion("song_album_id between", value1, value2, "songAlbumId");
            return (Criteria) this;
        }

        public Criteria andSongAlbumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("song_album_id not between", value1, value2, "songAlbumId");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdIsNull() {
            addCriterion("song_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdIsNotNull() {
            addCriterion("song_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdEqualTo(Integer value) {
            addCriterion("song_type_id =", value, "songTypeId");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdNotEqualTo(Integer value) {
            addCriterion("song_type_id <>", value, "songTypeId");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdGreaterThan(Integer value) {
            addCriterion("song_type_id >", value, "songTypeId");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("song_type_id >=", value, "songTypeId");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdLessThan(Integer value) {
            addCriterion("song_type_id <", value, "songTypeId");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("song_type_id <=", value, "songTypeId");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdIn(List<Integer> values) {
            addCriterion("song_type_id in", values, "songTypeId");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdNotIn(List<Integer> values) {
            addCriterion("song_type_id not in", values, "songTypeId");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("song_type_id between", value1, value2, "songTypeId");
            return (Criteria) this;
        }

        public Criteria andSongTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("song_type_id not between", value1, value2, "songTypeId");
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