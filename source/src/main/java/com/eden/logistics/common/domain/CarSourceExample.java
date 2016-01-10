package com.eden.logistics.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarSourceExample() {
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

        public Criteria andDepatureAreaIdIsNull() {
            addCriterion("DEPATURE_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaIdIsNotNull() {
            addCriterion("DEPATURE_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaIdEqualTo(Integer value) {
            addCriterion("DEPATURE_AREA_ID =", value, "depatureAreaId");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaIdNotEqualTo(Integer value) {
            addCriterion("DEPATURE_AREA_ID <>", value, "depatureAreaId");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaIdGreaterThan(Integer value) {
            addCriterion("DEPATURE_AREA_ID >", value, "depatureAreaId");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPATURE_AREA_ID >=", value, "depatureAreaId");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaIdLessThan(Integer value) {
            addCriterion("DEPATURE_AREA_ID <", value, "depatureAreaId");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("DEPATURE_AREA_ID <=", value, "depatureAreaId");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaIdIn(List<Integer> values) {
            addCriterion("DEPATURE_AREA_ID in", values, "depatureAreaId");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaIdNotIn(List<Integer> values) {
            addCriterion("DEPATURE_AREA_ID not in", values, "depatureAreaId");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("DEPATURE_AREA_ID between", value1, value2, "depatureAreaId");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPATURE_AREA_ID not between", value1, value2, "depatureAreaId");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdIsNull() {
            addCriterion("DESTINATION_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdIsNotNull() {
            addCriterion("DESTINATION_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdEqualTo(Integer value) {
            addCriterion("DESTINATION_AREA_ID =", value, "destinationAreaId");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdNotEqualTo(Integer value) {
            addCriterion("DESTINATION_AREA_ID <>", value, "destinationAreaId");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdGreaterThan(Integer value) {
            addCriterion("DESTINATION_AREA_ID >", value, "destinationAreaId");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DESTINATION_AREA_ID >=", value, "destinationAreaId");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdLessThan(Integer value) {
            addCriterion("DESTINATION_AREA_ID <", value, "destinationAreaId");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("DESTINATION_AREA_ID <=", value, "destinationAreaId");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdIn(List<Integer> values) {
            addCriterion("DESTINATION_AREA_ID in", values, "destinationAreaId");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdNotIn(List<Integer> values) {
            addCriterion("DESTINATION_AREA_ID not in", values, "destinationAreaId");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("DESTINATION_AREA_ID between", value1, value2, "destinationAreaId");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DESTINATION_AREA_ID not between", value1, value2, "destinationAreaId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("CAR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("CAR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(Integer value) {
            addCriterion("CAR_TYPE =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(Integer value) {
            addCriterion("CAR_TYPE <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(Integer value) {
            addCriterion("CAR_TYPE >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAR_TYPE >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(Integer value) {
            addCriterion("CAR_TYPE <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CAR_TYPE <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<Integer> values) {
            addCriterion("CAR_TYPE in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<Integer> values) {
            addCriterion("CAR_TYPE not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(Integer value1, Integer value2) {
            addCriterion("CAR_TYPE between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CAR_TYPE not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNull() {
            addCriterion("CAR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNotNull() {
            addCriterion("CAR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumberEqualTo(String value) {
            addCriterion("CAR_NUMBER =", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotEqualTo(String value) {
            addCriterion("CAR_NUMBER <>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThan(String value) {
            addCriterion("CAR_NUMBER >", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_NUMBER >=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThan(String value) {
            addCriterion("CAR_NUMBER <", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThanOrEqualTo(String value) {
            addCriterion("CAR_NUMBER <=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLike(String value) {
            addCriterion("CAR_NUMBER like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotLike(String value) {
            addCriterion("CAR_NUMBER not like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIn(List<String> values) {
            addCriterion("CAR_NUMBER in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotIn(List<String> values) {
            addCriterion("CAR_NUMBER not in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberBetween(String value1, String value2) {
            addCriterion("CAR_NUMBER between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotBetween(String value1, String value2) {
            addCriterion("CAR_NUMBER not between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarLengthIsNull() {
            addCriterion("CAR_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andCarLengthIsNotNull() {
            addCriterion("CAR_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andCarLengthEqualTo(Integer value) {
            addCriterion("CAR_LENGTH =", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthNotEqualTo(Integer value) {
            addCriterion("CAR_LENGTH <>", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthGreaterThan(Integer value) {
            addCriterion("CAR_LENGTH >", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAR_LENGTH >=", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthLessThan(Integer value) {
            addCriterion("CAR_LENGTH <", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthLessThanOrEqualTo(Integer value) {
            addCriterion("CAR_LENGTH <=", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthIn(List<Integer> values) {
            addCriterion("CAR_LENGTH in", values, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthNotIn(List<Integer> values) {
            addCriterion("CAR_LENGTH not in", values, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthBetween(Integer value1, Integer value2) {
            addCriterion("CAR_LENGTH between", value1, value2, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("CAR_LENGTH not between", value1, value2, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarWidthIsNull() {
            addCriterion("CAR_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andCarWidthIsNotNull() {
            addCriterion("CAR_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andCarWidthEqualTo(Integer value) {
            addCriterion("CAR_WIDTH =", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotEqualTo(Integer value) {
            addCriterion("CAR_WIDTH <>", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthGreaterThan(Integer value) {
            addCriterion("CAR_WIDTH >", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAR_WIDTH >=", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthLessThan(Integer value) {
            addCriterion("CAR_WIDTH <", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthLessThanOrEqualTo(Integer value) {
            addCriterion("CAR_WIDTH <=", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthIn(List<Integer> values) {
            addCriterion("CAR_WIDTH in", values, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotIn(List<Integer> values) {
            addCriterion("CAR_WIDTH not in", values, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthBetween(Integer value1, Integer value2) {
            addCriterion("CAR_WIDTH between", value1, value2, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("CAR_WIDTH not between", value1, value2, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarHeightIsNull() {
            addCriterion("CAR_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andCarHeightIsNotNull() {
            addCriterion("CAR_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andCarHeightEqualTo(Integer value) {
            addCriterion("CAR_HEIGHT =", value, "carHeight");
            return (Criteria) this;
        }

        public Criteria andCarHeightNotEqualTo(Integer value) {
            addCriterion("CAR_HEIGHT <>", value, "carHeight");
            return (Criteria) this;
        }

        public Criteria andCarHeightGreaterThan(Integer value) {
            addCriterion("CAR_HEIGHT >", value, "carHeight");
            return (Criteria) this;
        }

        public Criteria andCarHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAR_HEIGHT >=", value, "carHeight");
            return (Criteria) this;
        }

        public Criteria andCarHeightLessThan(Integer value) {
            addCriterion("CAR_HEIGHT <", value, "carHeight");
            return (Criteria) this;
        }

        public Criteria andCarHeightLessThanOrEqualTo(Integer value) {
            addCriterion("CAR_HEIGHT <=", value, "carHeight");
            return (Criteria) this;
        }

        public Criteria andCarHeightIn(List<Integer> values) {
            addCriterion("CAR_HEIGHT in", values, "carHeight");
            return (Criteria) this;
        }

        public Criteria andCarHeightNotIn(List<Integer> values) {
            addCriterion("CAR_HEIGHT not in", values, "carHeight");
            return (Criteria) this;
        }

        public Criteria andCarHeightBetween(Integer value1, Integer value2) {
            addCriterion("CAR_HEIGHT between", value1, value2, "carHeight");
            return (Criteria) this;
        }

        public Criteria andCarHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("CAR_HEIGHT not between", value1, value2, "carHeight");
            return (Criteria) this;
        }

        public Criteria andCarTonnageIsNull() {
            addCriterion("CAR_TONNAGE is null");
            return (Criteria) this;
        }

        public Criteria andCarTonnageIsNotNull() {
            addCriterion("CAR_TONNAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCarTonnageEqualTo(Integer value) {
            addCriterion("CAR_TONNAGE =", value, "carTonnage");
            return (Criteria) this;
        }

        public Criteria andCarTonnageNotEqualTo(Integer value) {
            addCriterion("CAR_TONNAGE <>", value, "carTonnage");
            return (Criteria) this;
        }

        public Criteria andCarTonnageGreaterThan(Integer value) {
            addCriterion("CAR_TONNAGE >", value, "carTonnage");
            return (Criteria) this;
        }

        public Criteria andCarTonnageGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAR_TONNAGE >=", value, "carTonnage");
            return (Criteria) this;
        }

        public Criteria andCarTonnageLessThan(Integer value) {
            addCriterion("CAR_TONNAGE <", value, "carTonnage");
            return (Criteria) this;
        }

        public Criteria andCarTonnageLessThanOrEqualTo(Integer value) {
            addCriterion("CAR_TONNAGE <=", value, "carTonnage");
            return (Criteria) this;
        }

        public Criteria andCarTonnageIn(List<Integer> values) {
            addCriterion("CAR_TONNAGE in", values, "carTonnage");
            return (Criteria) this;
        }

        public Criteria andCarTonnageNotIn(List<Integer> values) {
            addCriterion("CAR_TONNAGE not in", values, "carTonnage");
            return (Criteria) this;
        }

        public Criteria andCarTonnageBetween(Integer value1, Integer value2) {
            addCriterion("CAR_TONNAGE between", value1, value2, "carTonnage");
            return (Criteria) this;
        }

        public Criteria andCarTonnageNotBetween(Integer value1, Integer value2) {
            addCriterion("CAR_TONNAGE not between", value1, value2, "carTonnage");
            return (Criteria) this;
        }

        public Criteria andCarVolumeIsNull() {
            addCriterion("CAR_VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andCarVolumeIsNotNull() {
            addCriterion("CAR_VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andCarVolumeEqualTo(Integer value) {
            addCriterion("CAR_VOLUME =", value, "carVolume");
            return (Criteria) this;
        }

        public Criteria andCarVolumeNotEqualTo(Integer value) {
            addCriterion("CAR_VOLUME <>", value, "carVolume");
            return (Criteria) this;
        }

        public Criteria andCarVolumeGreaterThan(Integer value) {
            addCriterion("CAR_VOLUME >", value, "carVolume");
            return (Criteria) this;
        }

        public Criteria andCarVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAR_VOLUME >=", value, "carVolume");
            return (Criteria) this;
        }

        public Criteria andCarVolumeLessThan(Integer value) {
            addCriterion("CAR_VOLUME <", value, "carVolume");
            return (Criteria) this;
        }

        public Criteria andCarVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("CAR_VOLUME <=", value, "carVolume");
            return (Criteria) this;
        }

        public Criteria andCarVolumeIn(List<Integer> values) {
            addCriterion("CAR_VOLUME in", values, "carVolume");
            return (Criteria) this;
        }

        public Criteria andCarVolumeNotIn(List<Integer> values) {
            addCriterion("CAR_VOLUME not in", values, "carVolume");
            return (Criteria) this;
        }

        public Criteria andCarVolumeBetween(Integer value1, Integer value2) {
            addCriterion("CAR_VOLUME between", value1, value2, "carVolume");
            return (Criteria) this;
        }

        public Criteria andCarVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("CAR_VOLUME not between", value1, value2, "carVolume");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionIsNull() {
            addCriterion("CAR_SOURCE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionIsNotNull() {
            addCriterion("CAR_SOURCE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionEqualTo(String value) {
            addCriterion("CAR_SOURCE_DESCRIPTION =", value, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionNotEqualTo(String value) {
            addCriterion("CAR_SOURCE_DESCRIPTION <>", value, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionGreaterThan(String value) {
            addCriterion("CAR_SOURCE_DESCRIPTION >", value, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_SOURCE_DESCRIPTION >=", value, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionLessThan(String value) {
            addCriterion("CAR_SOURCE_DESCRIPTION <", value, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionLessThanOrEqualTo(String value) {
            addCriterion("CAR_SOURCE_DESCRIPTION <=", value, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionLike(String value) {
            addCriterion("CAR_SOURCE_DESCRIPTION like", value, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionNotLike(String value) {
            addCriterion("CAR_SOURCE_DESCRIPTION not like", value, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionIn(List<String> values) {
            addCriterion("CAR_SOURCE_DESCRIPTION in", values, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionNotIn(List<String> values) {
            addCriterion("CAR_SOURCE_DESCRIPTION not in", values, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionBetween(String value1, String value2) {
            addCriterion("CAR_SOURCE_DESCRIPTION between", value1, value2, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andCarSourceDescriptionNotBetween(String value1, String value2) {
            addCriterion("CAR_SOURCE_DESCRIPTION not between", value1, value2, "carSourceDescription");
            return (Criteria) this;
        }

        public Criteria andContactUserNameIsNull() {
            addCriterion("CONTACT_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContactUserNameIsNotNull() {
            addCriterion("CONTACT_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContactUserNameEqualTo(String value) {
            addCriterion("CONTACT_USER_NAME =", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameNotEqualTo(String value) {
            addCriterion("CONTACT_USER_NAME <>", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameGreaterThan(String value) {
            addCriterion("CONTACT_USER_NAME >", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_NAME >=", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameLessThan(String value) {
            addCriterion("CONTACT_USER_NAME <", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_NAME <=", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameLike(String value) {
            addCriterion("CONTACT_USER_NAME like", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameNotLike(String value) {
            addCriterion("CONTACT_USER_NAME not like", value, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameIn(List<String> values) {
            addCriterion("CONTACT_USER_NAME in", values, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameNotIn(List<String> values) {
            addCriterion("CONTACT_USER_NAME not in", values, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_NAME between", value1, value2, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserNameNotBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_NAME not between", value1, value2, "contactUserName");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileIsNull() {
            addCriterion("CONTACT_USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileIsNotNull() {
            addCriterion("CONTACT_USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileEqualTo(String value) {
            addCriterion("CONTACT_USER_MOBILE =", value, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileNotEqualTo(String value) {
            addCriterion("CONTACT_USER_MOBILE <>", value, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileGreaterThan(String value) {
            addCriterion("CONTACT_USER_MOBILE >", value, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_MOBILE >=", value, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileLessThan(String value) {
            addCriterion("CONTACT_USER_MOBILE <", value, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_MOBILE <=", value, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileLike(String value) {
            addCriterion("CONTACT_USER_MOBILE like", value, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileNotLike(String value) {
            addCriterion("CONTACT_USER_MOBILE not like", value, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileIn(List<String> values) {
            addCriterion("CONTACT_USER_MOBILE in", values, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileNotIn(List<String> values) {
            addCriterion("CONTACT_USER_MOBILE not in", values, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_MOBILE between", value1, value2, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserMobileNotBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_MOBILE not between", value1, value2, "contactUserMobile");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneIsNull() {
            addCriterion("CONTACT_USER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneIsNotNull() {
            addCriterion("CONTACT_USER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneEqualTo(String value) {
            addCriterion("CONTACT_USER_PHONE =", value, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneNotEqualTo(String value) {
            addCriterion("CONTACT_USER_PHONE <>", value, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneGreaterThan(String value) {
            addCriterion("CONTACT_USER_PHONE >", value, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_PHONE >=", value, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneLessThan(String value) {
            addCriterion("CONTACT_USER_PHONE <", value, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_PHONE <=", value, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneLike(String value) {
            addCriterion("CONTACT_USER_PHONE like", value, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneNotLike(String value) {
            addCriterion("CONTACT_USER_PHONE not like", value, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneIn(List<String> values) {
            addCriterion("CONTACT_USER_PHONE in", values, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneNotIn(List<String> values) {
            addCriterion("CONTACT_USER_PHONE not in", values, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_PHONE between", value1, value2, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserPhoneNotBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_PHONE not between", value1, value2, "contactUserPhone");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailIsNull() {
            addCriterion("CONTACT_USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailIsNotNull() {
            addCriterion("CONTACT_USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailEqualTo(String value) {
            addCriterion("CONTACT_USER_EMAIL =", value, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailNotEqualTo(String value) {
            addCriterion("CONTACT_USER_EMAIL <>", value, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailGreaterThan(String value) {
            addCriterion("CONTACT_USER_EMAIL >", value, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_EMAIL >=", value, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailLessThan(String value) {
            addCriterion("CONTACT_USER_EMAIL <", value, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_EMAIL <=", value, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailLike(String value) {
            addCriterion("CONTACT_USER_EMAIL like", value, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailNotLike(String value) {
            addCriterion("CONTACT_USER_EMAIL not like", value, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailIn(List<String> values) {
            addCriterion("CONTACT_USER_EMAIL in", values, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailNotIn(List<String> values) {
            addCriterion("CONTACT_USER_EMAIL not in", values, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_EMAIL between", value1, value2, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserEmailNotBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_EMAIL not between", value1, value2, "contactUserEmail");
            return (Criteria) this;
        }

        public Criteria andContactUserQqIsNull() {
            addCriterion("CONTACT_USER_QQ is null");
            return (Criteria) this;
        }

        public Criteria andContactUserQqIsNotNull() {
            addCriterion("CONTACT_USER_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andContactUserQqEqualTo(String value) {
            addCriterion("CONTACT_USER_QQ =", value, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserQqNotEqualTo(String value) {
            addCriterion("CONTACT_USER_QQ <>", value, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserQqGreaterThan(String value) {
            addCriterion("CONTACT_USER_QQ >", value, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserQqGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_QQ >=", value, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserQqLessThan(String value) {
            addCriterion("CONTACT_USER_QQ <", value, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserQqLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_QQ <=", value, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserQqLike(String value) {
            addCriterion("CONTACT_USER_QQ like", value, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserQqNotLike(String value) {
            addCriterion("CONTACT_USER_QQ not like", value, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserQqIn(List<String> values) {
            addCriterion("CONTACT_USER_QQ in", values, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserQqNotIn(List<String> values) {
            addCriterion("CONTACT_USER_QQ not in", values, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserQqBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_QQ between", value1, value2, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserQqNotBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_QQ not between", value1, value2, "contactUserQq");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatIsNull() {
            addCriterion("CONTACT_USER_WECHAT is null");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatIsNotNull() {
            addCriterion("CONTACT_USER_WECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatEqualTo(String value) {
            addCriterion("CONTACT_USER_WECHAT =", value, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatNotEqualTo(String value) {
            addCriterion("CONTACT_USER_WECHAT <>", value, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatGreaterThan(String value) {
            addCriterion("CONTACT_USER_WECHAT >", value, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_WECHAT >=", value, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatLessThan(String value) {
            addCriterion("CONTACT_USER_WECHAT <", value, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_USER_WECHAT <=", value, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatLike(String value) {
            addCriterion("CONTACT_USER_WECHAT like", value, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatNotLike(String value) {
            addCriterion("CONTACT_USER_WECHAT not like", value, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatIn(List<String> values) {
            addCriterion("CONTACT_USER_WECHAT in", values, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatNotIn(List<String> values) {
            addCriterion("CONTACT_USER_WECHAT not in", values, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_WECHAT between", value1, value2, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andContactUserWechatNotBetween(String value1, String value2) {
            addCriterion("CONTACT_USER_WECHAT not between", value1, value2, "contactUserWechat");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("PUBLISH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("PUBLISH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("PUBLISH_TIME =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("PUBLISH_TIME <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("PUBLISH_TIME >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PUBLISH_TIME >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("PUBLISH_TIME <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("PUBLISH_TIME <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("PUBLISH_TIME in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("PUBLISH_TIME not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("PUBLISH_TIME between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("PUBLISH_TIME not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdIsNull() {
            addCriterion("PUBLISH_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdIsNotNull() {
            addCriterion("PUBLISH_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdEqualTo(Integer value) {
            addCriterion("PUBLISH_USER_ID =", value, "publishUserId");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdNotEqualTo(Integer value) {
            addCriterion("PUBLISH_USER_ID <>", value, "publishUserId");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdGreaterThan(Integer value) {
            addCriterion("PUBLISH_USER_ID >", value, "publishUserId");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PUBLISH_USER_ID >=", value, "publishUserId");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdLessThan(Integer value) {
            addCriterion("PUBLISH_USER_ID <", value, "publishUserId");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("PUBLISH_USER_ID <=", value, "publishUserId");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdIn(List<Integer> values) {
            addCriterion("PUBLISH_USER_ID in", values, "publishUserId");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdNotIn(List<Integer> values) {
            addCriterion("PUBLISH_USER_ID not in", values, "publishUserId");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdBetween(Integer value1, Integer value2) {
            addCriterion("PUBLISH_USER_ID between", value1, value2, "publishUserId");
            return (Criteria) this;
        }

        public Criteria andPublishUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PUBLISH_USER_ID not between", value1, value2, "publishUserId");
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