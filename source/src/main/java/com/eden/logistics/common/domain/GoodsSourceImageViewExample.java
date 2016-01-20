package com.eden.logistics.common.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodsSourceImageViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSourceImageViewExample() {
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

        public Criteria andGoodsSourceIdIsNull() {
            addCriterion("GOODS_SOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIdIsNotNull() {
            addCriterion("GOODS_SOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIdEqualTo(Integer value) {
            addCriterion("GOODS_SOURCE_ID =", value, "goodsSourceId");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIdNotEqualTo(Integer value) {
            addCriterion("GOODS_SOURCE_ID <>", value, "goodsSourceId");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIdGreaterThan(Integer value) {
            addCriterion("GOODS_SOURCE_ID >", value, "goodsSourceId");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_SOURCE_ID >=", value, "goodsSourceId");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIdLessThan(Integer value) {
            addCriterion("GOODS_SOURCE_ID <", value, "goodsSourceId");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_SOURCE_ID <=", value, "goodsSourceId");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIdIn(List<Integer> values) {
            addCriterion("GOODS_SOURCE_ID in", values, "goodsSourceId");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIdNotIn(List<Integer> values) {
            addCriterion("GOODS_SOURCE_ID not in", values, "goodsSourceId");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_SOURCE_ID between", value1, value2, "goodsSourceId");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_SOURCE_ID not between", value1, value2, "goodsSourceId");
            return (Criteria) this;
        }

        public Criteria andImgFileIdIsNull() {
            addCriterion("IMG_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andImgFileIdIsNotNull() {
            addCriterion("IMG_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImgFileIdEqualTo(Integer value) {
            addCriterion("IMG_FILE_ID =", value, "imgFileId");
            return (Criteria) this;
        }

        public Criteria andImgFileIdNotEqualTo(Integer value) {
            addCriterion("IMG_FILE_ID <>", value, "imgFileId");
            return (Criteria) this;
        }

        public Criteria andImgFileIdGreaterThan(Integer value) {
            addCriterion("IMG_FILE_ID >", value, "imgFileId");
            return (Criteria) this;
        }

        public Criteria andImgFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMG_FILE_ID >=", value, "imgFileId");
            return (Criteria) this;
        }

        public Criteria andImgFileIdLessThan(Integer value) {
            addCriterion("IMG_FILE_ID <", value, "imgFileId");
            return (Criteria) this;
        }

        public Criteria andImgFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("IMG_FILE_ID <=", value, "imgFileId");
            return (Criteria) this;
        }

        public Criteria andImgFileIdIn(List<Integer> values) {
            addCriterion("IMG_FILE_ID in", values, "imgFileId");
            return (Criteria) this;
        }

        public Criteria andImgFileIdNotIn(List<Integer> values) {
            addCriterion("IMG_FILE_ID not in", values, "imgFileId");
            return (Criteria) this;
        }

        public Criteria andImgFileIdBetween(Integer value1, Integer value2) {
            addCriterion("IMG_FILE_ID between", value1, value2, "imgFileId");
            return (Criteria) this;
        }

        public Criteria andImgFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("IMG_FILE_ID not between", value1, value2, "imgFileId");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIsNull() {
            addCriterion("IMG_FILE_UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIsNotNull() {
            addCriterion("IMG_FILE_UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeEqualTo(String value) {
            addCriterion("IMG_FILE_UPLOAD_TIME =", value, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeNotEqualTo(String value) {
            addCriterion("IMG_FILE_UPLOAD_TIME <>", value, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeGreaterThan(String value) {
            addCriterion("IMG_FILE_UPLOAD_TIME >", value, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_FILE_UPLOAD_TIME >=", value, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeLessThan(String value) {
            addCriterion("IMG_FILE_UPLOAD_TIME <", value, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeLessThanOrEqualTo(String value) {
            addCriterion("IMG_FILE_UPLOAD_TIME <=", value, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeLike(String value) {
            addCriterion("IMG_FILE_UPLOAD_TIME like", value, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeNotLike(String value) {
            addCriterion("IMG_FILE_UPLOAD_TIME not like", value, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIn(List<String> values) {
            addCriterion("IMG_FILE_UPLOAD_TIME in", values, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeNotIn(List<String> values) {
            addCriterion("IMG_FILE_UPLOAD_TIME not in", values, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeBetween(String value1, String value2) {
            addCriterion("IMG_FILE_UPLOAD_TIME between", value1, value2, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeNotBetween(String value1, String value2) {
            addCriterion("IMG_FILE_UPLOAD_TIME not between", value1, value2, "imgFileUploadTime");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntIsNull() {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT is null");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntIsNotNull() {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT is not null");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntEqualTo(Long value) {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT =", value, "imgFileUploadTimeInt");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntNotEqualTo(Long value) {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT <>", value, "imgFileUploadTimeInt");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntGreaterThan(Long value) {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT >", value, "imgFileUploadTimeInt");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntGreaterThanOrEqualTo(Long value) {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT >=", value, "imgFileUploadTimeInt");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntLessThan(Long value) {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT <", value, "imgFileUploadTimeInt");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntLessThanOrEqualTo(Long value) {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT <=", value, "imgFileUploadTimeInt");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntIn(List<Long> values) {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT in", values, "imgFileUploadTimeInt");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntNotIn(List<Long> values) {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT not in", values, "imgFileUploadTimeInt");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntBetween(Long value1, Long value2) {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT between", value1, value2, "imgFileUploadTimeInt");
            return (Criteria) this;
        }

        public Criteria andImgFileUploadTimeIntNotBetween(Long value1, Long value2) {
            addCriterion("IMG_FILE_UPLOAD_TIME_INT not between", value1, value2, "imgFileUploadTimeInt");
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