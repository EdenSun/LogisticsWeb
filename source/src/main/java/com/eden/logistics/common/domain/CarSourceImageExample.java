package com.eden.logistics.common.domain;

import java.util.ArrayList;
import java.util.List;

public class CarSourceImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarSourceImageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdIsNull() {
            addCriterion("CAR_SOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdIsNotNull() {
            addCriterion("CAR_SOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdEqualTo(Integer value) {
            addCriterion("CAR_SOURCE_ID =", value, "carSourceId");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdNotEqualTo(Integer value) {
            addCriterion("CAR_SOURCE_ID <>", value, "carSourceId");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdGreaterThan(Integer value) {
            addCriterion("CAR_SOURCE_ID >", value, "carSourceId");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAR_SOURCE_ID >=", value, "carSourceId");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdLessThan(Integer value) {
            addCriterion("CAR_SOURCE_ID <", value, "carSourceId");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("CAR_SOURCE_ID <=", value, "carSourceId");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdIn(List<Integer> values) {
            addCriterion("CAR_SOURCE_ID in", values, "carSourceId");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdNotIn(List<Integer> values) {
            addCriterion("CAR_SOURCE_ID not in", values, "carSourceId");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("CAR_SOURCE_ID between", value1, value2, "carSourceId");
            return (Criteria) this;
        }

        public Criteria andCarSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CAR_SOURCE_ID not between", value1, value2, "carSourceId");
            return (Criteria) this;
        }

        public Criteria andImageFileIdIsNull() {
            addCriterion("IMAGE_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andImageFileIdIsNotNull() {
            addCriterion("IMAGE_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImageFileIdEqualTo(Integer value) {
            addCriterion("IMAGE_FILE_ID =", value, "imageFileId");
            return (Criteria) this;
        }

        public Criteria andImageFileIdNotEqualTo(Integer value) {
            addCriterion("IMAGE_FILE_ID <>", value, "imageFileId");
            return (Criteria) this;
        }

        public Criteria andImageFileIdGreaterThan(Integer value) {
            addCriterion("IMAGE_FILE_ID >", value, "imageFileId");
            return (Criteria) this;
        }

        public Criteria andImageFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMAGE_FILE_ID >=", value, "imageFileId");
            return (Criteria) this;
        }

        public Criteria andImageFileIdLessThan(Integer value) {
            addCriterion("IMAGE_FILE_ID <", value, "imageFileId");
            return (Criteria) this;
        }

        public Criteria andImageFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("IMAGE_FILE_ID <=", value, "imageFileId");
            return (Criteria) this;
        }

        public Criteria andImageFileIdIn(List<Integer> values) {
            addCriterion("IMAGE_FILE_ID in", values, "imageFileId");
            return (Criteria) this;
        }

        public Criteria andImageFileIdNotIn(List<Integer> values) {
            addCriterion("IMAGE_FILE_ID not in", values, "imageFileId");
            return (Criteria) this;
        }

        public Criteria andImageFileIdBetween(Integer value1, Integer value2) {
            addCriterion("IMAGE_FILE_ID between", value1, value2, "imageFileId");
            return (Criteria) this;
        }

        public Criteria andImageFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("IMAGE_FILE_ID not between", value1, value2, "imageFileId");
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