package com.eden.logistics.common.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodsSourceViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSourceViewExample() {
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

        public Criteria andDepatureAreaNameIsNull() {
            addCriterion("DEPATURE_AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameIsNotNull() {
            addCriterion("DEPATURE_AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameEqualTo(String value) {
            addCriterion("DEPATURE_AREA_NAME =", value, "depatureAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameNotEqualTo(String value) {
            addCriterion("DEPATURE_AREA_NAME <>", value, "depatureAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameGreaterThan(String value) {
            addCriterion("DEPATURE_AREA_NAME >", value, "depatureAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPATURE_AREA_NAME >=", value, "depatureAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameLessThan(String value) {
            addCriterion("DEPATURE_AREA_NAME <", value, "depatureAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameLessThanOrEqualTo(String value) {
            addCriterion("DEPATURE_AREA_NAME <=", value, "depatureAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameLike(String value) {
            addCriterion("DEPATURE_AREA_NAME like", value, "depatureAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameNotLike(String value) {
            addCriterion("DEPATURE_AREA_NAME not like", value, "depatureAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameIn(List<String> values) {
            addCriterion("DEPATURE_AREA_NAME in", values, "depatureAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameNotIn(List<String> values) {
            addCriterion("DEPATURE_AREA_NAME not in", values, "depatureAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameBetween(String value1, String value2) {
            addCriterion("DEPATURE_AREA_NAME between", value1, value2, "depatureAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureAreaNameNotBetween(String value1, String value2) {
            addCriterion("DEPATURE_AREA_NAME not between", value1, value2, "depatureAreaName");
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

        public Criteria andDestinationAreaNameIsNull() {
            addCriterion("DESTINATION_AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameIsNotNull() {
            addCriterion("DESTINATION_AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameEqualTo(String value) {
            addCriterion("DESTINATION_AREA_NAME =", value, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameNotEqualTo(String value) {
            addCriterion("DESTINATION_AREA_NAME <>", value, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameGreaterThan(String value) {
            addCriterion("DESTINATION_AREA_NAME >", value, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("DESTINATION_AREA_NAME >=", value, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameLessThan(String value) {
            addCriterion("DESTINATION_AREA_NAME <", value, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameLessThanOrEqualTo(String value) {
            addCriterion("DESTINATION_AREA_NAME <=", value, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameLike(String value) {
            addCriterion("DESTINATION_AREA_NAME like", value, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameNotLike(String value) {
            addCriterion("DESTINATION_AREA_NAME not like", value, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameIn(List<String> values) {
            addCriterion("DESTINATION_AREA_NAME in", values, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameNotIn(List<String> values) {
            addCriterion("DESTINATION_AREA_NAME not in", values, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameBetween(String value1, String value2) {
            addCriterion("DESTINATION_AREA_NAME between", value1, value2, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDestinationAreaNameNotBetween(String value1, String value2) {
            addCriterion("DESTINATION_AREA_NAME not between", value1, value2, "destinationAreaName");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIsNull() {
            addCriterion("DEPATURE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIsNotNull() {
            addCriterion("DEPATURE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeEqualTo(String value) {
            addCriterion("DEPATURE_TIME =", value, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeNotEqualTo(String value) {
            addCriterion("DEPATURE_TIME <>", value, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeGreaterThan(String value) {
            addCriterion("DEPATURE_TIME >", value, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPATURE_TIME >=", value, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeLessThan(String value) {
            addCriterion("DEPATURE_TIME <", value, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeLessThanOrEqualTo(String value) {
            addCriterion("DEPATURE_TIME <=", value, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeLike(String value) {
            addCriterion("DEPATURE_TIME like", value, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeNotLike(String value) {
            addCriterion("DEPATURE_TIME not like", value, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIn(List<String> values) {
            addCriterion("DEPATURE_TIME in", values, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeNotIn(List<String> values) {
            addCriterion("DEPATURE_TIME not in", values, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeBetween(String value1, String value2) {
            addCriterion("DEPATURE_TIME between", value1, value2, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeNotBetween(String value1, String value2) {
            addCriterion("DEPATURE_TIME not between", value1, value2, "depatureTime");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntIsNull() {
            addCriterion("DEPATURE_TIME_INT is null");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntIsNotNull() {
            addCriterion("DEPATURE_TIME_INT is not null");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntEqualTo(Long value) {
            addCriterion("DEPATURE_TIME_INT =", value, "depatureTimeInt");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntNotEqualTo(Long value) {
            addCriterion("DEPATURE_TIME_INT <>", value, "depatureTimeInt");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntGreaterThan(Long value) {
            addCriterion("DEPATURE_TIME_INT >", value, "depatureTimeInt");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPATURE_TIME_INT >=", value, "depatureTimeInt");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntLessThan(Long value) {
            addCriterion("DEPATURE_TIME_INT <", value, "depatureTimeInt");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntLessThanOrEqualTo(Long value) {
            addCriterion("DEPATURE_TIME_INT <=", value, "depatureTimeInt");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntIn(List<Long> values) {
            addCriterion("DEPATURE_TIME_INT in", values, "depatureTimeInt");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntNotIn(List<Long> values) {
            addCriterion("DEPATURE_TIME_INT not in", values, "depatureTimeInt");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntBetween(Long value1, Long value2) {
            addCriterion("DEPATURE_TIME_INT between", value1, value2, "depatureTimeInt");
            return (Criteria) this;
        }

        public Criteria andDepatureTimeIntNotBetween(Long value1, Long value2) {
            addCriterion("DEPATURE_TIME_INT not between", value1, value2, "depatureTimeInt");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("ARRIVAL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("ARRIVAL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(String value) {
            addCriterion("ARRIVAL_TIME =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(String value) {
            addCriterion("ARRIVAL_TIME <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(String value) {
            addCriterion("ARRIVAL_TIME >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ARRIVAL_TIME >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(String value) {
            addCriterion("ARRIVAL_TIME <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(String value) {
            addCriterion("ARRIVAL_TIME <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLike(String value) {
            addCriterion("ARRIVAL_TIME like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotLike(String value) {
            addCriterion("ARRIVAL_TIME not like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<String> values) {
            addCriterion("ARRIVAL_TIME in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<String> values) {
            addCriterion("ARRIVAL_TIME not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(String value1, String value2) {
            addCriterion("ARRIVAL_TIME between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(String value1, String value2) {
            addCriterion("ARRIVAL_TIME not between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntIsNull() {
            addCriterion("ARRIVAL_TIME_INT is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntIsNotNull() {
            addCriterion("ARRIVAL_TIME_INT is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntEqualTo(Long value) {
            addCriterion("ARRIVAL_TIME_INT =", value, "arrivalTimeInt");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntNotEqualTo(Long value) {
            addCriterion("ARRIVAL_TIME_INT <>", value, "arrivalTimeInt");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntGreaterThan(Long value) {
            addCriterion("ARRIVAL_TIME_INT >", value, "arrivalTimeInt");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntGreaterThanOrEqualTo(Long value) {
            addCriterion("ARRIVAL_TIME_INT >=", value, "arrivalTimeInt");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntLessThan(Long value) {
            addCriterion("ARRIVAL_TIME_INT <", value, "arrivalTimeInt");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntLessThanOrEqualTo(Long value) {
            addCriterion("ARRIVAL_TIME_INT <=", value, "arrivalTimeInt");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntIn(List<Long> values) {
            addCriterion("ARRIVAL_TIME_INT in", values, "arrivalTimeInt");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntNotIn(List<Long> values) {
            addCriterion("ARRIVAL_TIME_INT not in", values, "arrivalTimeInt");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntBetween(Long value1, Long value2) {
            addCriterion("ARRIVAL_TIME_INT between", value1, value2, "arrivalTimeInt");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIntNotBetween(Long value1, Long value2) {
            addCriterion("ARRIVAL_TIME_INT not between", value1, value2, "arrivalTimeInt");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdIsNull() {
            addCriterion("TRANSPORT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdIsNotNull() {
            addCriterion("TRANSPORT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdEqualTo(Integer value) {
            addCriterion("TRANSPORT_TYPE_ID =", value, "transportTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdNotEqualTo(Integer value) {
            addCriterion("TRANSPORT_TYPE_ID <>", value, "transportTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdGreaterThan(Integer value) {
            addCriterion("TRANSPORT_TYPE_ID >", value, "transportTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSPORT_TYPE_ID >=", value, "transportTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdLessThan(Integer value) {
            addCriterion("TRANSPORT_TYPE_ID <", value, "transportTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSPORT_TYPE_ID <=", value, "transportTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdIn(List<Integer> values) {
            addCriterion("TRANSPORT_TYPE_ID in", values, "transportTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdNotIn(List<Integer> values) {
            addCriterion("TRANSPORT_TYPE_ID not in", values, "transportTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("TRANSPORT_TYPE_ID between", value1, value2, "transportTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSPORT_TYPE_ID not between", value1, value2, "transportTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNull() {
            addCriterion("TRANSPORT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNotNull() {
            addCriterion("TRANSPORT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeEqualTo(String value) {
            addCriterion("TRANSPORT_TYPE =", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotEqualTo(String value) {
            addCriterion("TRANSPORT_TYPE <>", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThan(String value) {
            addCriterion("TRANSPORT_TYPE >", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSPORT_TYPE >=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThan(String value) {
            addCriterion("TRANSPORT_TYPE <", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThanOrEqualTo(String value) {
            addCriterion("TRANSPORT_TYPE <=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLike(String value) {
            addCriterion("TRANSPORT_TYPE like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotLike(String value) {
            addCriterion("TRANSPORT_TYPE not like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIn(List<String> values) {
            addCriterion("TRANSPORT_TYPE in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotIn(List<String> values) {
            addCriterion("TRANSPORT_TYPE not in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeBetween(String value1, String value2) {
            addCriterion("TRANSPORT_TYPE between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotBetween(String value1, String value2) {
            addCriterion("TRANSPORT_TYPE not between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNull() {
            addCriterion("GOODS_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNotNull() {
            addCriterion("GOODS_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdEqualTo(Integer value) {
            addCriterion("GOODS_TYPE_ID =", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotEqualTo(Integer value) {
            addCriterion("GOODS_TYPE_ID <>", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThan(Integer value) {
            addCriterion("GOODS_TYPE_ID >", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_TYPE_ID >=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThan(Integer value) {
            addCriterion("GOODS_TYPE_ID <", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_TYPE_ID <=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIn(List<Integer> values) {
            addCriterion("GOODS_TYPE_ID in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotIn(List<Integer> values) {
            addCriterion("GOODS_TYPE_ID not in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_TYPE_ID between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_TYPE_ID not between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("GOODS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("GOODS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("GOODS_TYPE =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("GOODS_TYPE <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("GOODS_TYPE >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("GOODS_TYPE <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("GOODS_TYPE like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("GOODS_TYPE not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("GOODS_TYPE in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("GOODS_TYPE not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIsNull() {
            addCriterion("CAR_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIsNotNull() {
            addCriterion("CAR_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdEqualTo(Integer value) {
            addCriterion("CAR_TYPE_ID =", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotEqualTo(Integer value) {
            addCriterion("CAR_TYPE_ID <>", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThan(Integer value) {
            addCriterion("CAR_TYPE_ID >", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAR_TYPE_ID >=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThan(Integer value) {
            addCriterion("CAR_TYPE_ID <", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("CAR_TYPE_ID <=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIn(List<Integer> values) {
            addCriterion("CAR_TYPE_ID in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotIn(List<Integer> values) {
            addCriterion("CAR_TYPE_ID not in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("CAR_TYPE_ID between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CAR_TYPE_ID not between", value1, value2, "carTypeId");
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

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("CAR_TYPE =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("CAR_TYPE <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("CAR_TYPE >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_TYPE >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("CAR_TYPE <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("CAR_TYPE <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("CAR_TYPE like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("CAR_TYPE not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("CAR_TYPE in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("CAR_TYPE not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("CAR_TYPE between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("CAR_TYPE not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberIsNull() {
            addCriterion("NEED_CAR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberIsNotNull() {
            addCriterion("NEED_CAR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberEqualTo(Integer value) {
            addCriterion("NEED_CAR_NUMBER =", value, "needCarNumber");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberNotEqualTo(Integer value) {
            addCriterion("NEED_CAR_NUMBER <>", value, "needCarNumber");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberGreaterThan(Integer value) {
            addCriterion("NEED_CAR_NUMBER >", value, "needCarNumber");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEED_CAR_NUMBER >=", value, "needCarNumber");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberLessThan(Integer value) {
            addCriterion("NEED_CAR_NUMBER <", value, "needCarNumber");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberLessThanOrEqualTo(Integer value) {
            addCriterion("NEED_CAR_NUMBER <=", value, "needCarNumber");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberIn(List<Integer> values) {
            addCriterion("NEED_CAR_NUMBER in", values, "needCarNumber");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberNotIn(List<Integer> values) {
            addCriterion("NEED_CAR_NUMBER not in", values, "needCarNumber");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberBetween(Integer value1, Integer value2) {
            addCriterion("NEED_CAR_NUMBER between", value1, value2, "needCarNumber");
            return (Criteria) this;
        }

        public Criteria andNeedCarNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("NEED_CAR_NUMBER not between", value1, value2, "needCarNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionIsNull() {
            addCriterion("GOODS_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionIsNotNull() {
            addCriterion("GOODS_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionEqualTo(String value) {
            addCriterion("GOODS_DESCRIPTION =", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotEqualTo(String value) {
            addCriterion("GOODS_DESCRIPTION <>", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionGreaterThan(String value) {
            addCriterion("GOODS_DESCRIPTION >", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_DESCRIPTION >=", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionLessThan(String value) {
            addCriterion("GOODS_DESCRIPTION <", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionLessThanOrEqualTo(String value) {
            addCriterion("GOODS_DESCRIPTION <=", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionLike(String value) {
            addCriterion("GOODS_DESCRIPTION like", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotLike(String value) {
            addCriterion("GOODS_DESCRIPTION not like", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionIn(List<String> values) {
            addCriterion("GOODS_DESCRIPTION in", values, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotIn(List<String> values) {
            addCriterion("GOODS_DESCRIPTION not in", values, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionBetween(String value1, String value2) {
            addCriterion("GOODS_DESCRIPTION between", value1, value2, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotBetween(String value1, String value2) {
            addCriterion("GOODS_DESCRIPTION not between", value1, value2, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("GOODS_NAME like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNull() {
            addCriterion("GOODS_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNotNull() {
            addCriterion("GOODS_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightEqualTo(String value) {
            addCriterion("GOODS_WEIGHT =", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotEqualTo(String value) {
            addCriterion("GOODS_WEIGHT <>", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThan(String value) {
            addCriterion("GOODS_WEIGHT >", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_WEIGHT >=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThan(String value) {
            addCriterion("GOODS_WEIGHT <", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThanOrEqualTo(String value) {
            addCriterion("GOODS_WEIGHT <=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLike(String value) {
            addCriterion("GOODS_WEIGHT like", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotLike(String value) {
            addCriterion("GOODS_WEIGHT not like", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIn(List<String> values) {
            addCriterion("GOODS_WEIGHT in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotIn(List<String> values) {
            addCriterion("GOODS_WEIGHT not in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightBetween(String value1, String value2) {
            addCriterion("GOODS_WEIGHT between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotBetween(String value1, String value2) {
            addCriterion("GOODS_WEIGHT not between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeIsNull() {
            addCriterion("GOODS_VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeIsNotNull() {
            addCriterion("GOODS_VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeEqualTo(String value) {
            addCriterion("GOODS_VOLUME =", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeNotEqualTo(String value) {
            addCriterion("GOODS_VOLUME <>", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeGreaterThan(String value) {
            addCriterion("GOODS_VOLUME >", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_VOLUME >=", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeLessThan(String value) {
            addCriterion("GOODS_VOLUME <", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeLessThanOrEqualTo(String value) {
            addCriterion("GOODS_VOLUME <=", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeLike(String value) {
            addCriterion("GOODS_VOLUME like", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeNotLike(String value) {
            addCriterion("GOODS_VOLUME not like", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeIn(List<String> values) {
            addCriterion("GOODS_VOLUME in", values, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeNotIn(List<String> values) {
            addCriterion("GOODS_VOLUME not in", values, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeBetween(String value1, String value2) {
            addCriterion("GOODS_VOLUME between", value1, value2, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeNotBetween(String value1, String value2) {
            addCriterion("GOODS_VOLUME not between", value1, value2, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceIsNull() {
            addCriterion("LINGDAN_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceIsNotNull() {
            addCriterion("LINGDAN_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceEqualTo(String value) {
            addCriterion("LINGDAN_PRICE =", value, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceNotEqualTo(String value) {
            addCriterion("LINGDAN_PRICE <>", value, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceGreaterThan(String value) {
            addCriterion("LINGDAN_PRICE >", value, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceGreaterThanOrEqualTo(String value) {
            addCriterion("LINGDAN_PRICE >=", value, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceLessThan(String value) {
            addCriterion("LINGDAN_PRICE <", value, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceLessThanOrEqualTo(String value) {
            addCriterion("LINGDAN_PRICE <=", value, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceLike(String value) {
            addCriterion("LINGDAN_PRICE like", value, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceNotLike(String value) {
            addCriterion("LINGDAN_PRICE not like", value, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceIn(List<String> values) {
            addCriterion("LINGDAN_PRICE in", values, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceNotIn(List<String> values) {
            addCriterion("LINGDAN_PRICE not in", values, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceBetween(String value1, String value2) {
            addCriterion("LINGDAN_PRICE between", value1, value2, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andLingdanPriceNotBetween(String value1, String value2) {
            addCriterion("LINGDAN_PRICE not between", value1, value2, "lingdanPrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceIsNull() {
            addCriterion("ZHENGCHE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceIsNotNull() {
            addCriterion("ZHENGCHE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceEqualTo(String value) {
            addCriterion("ZHENGCHE_PRICE =", value, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceNotEqualTo(String value) {
            addCriterion("ZHENGCHE_PRICE <>", value, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceGreaterThan(String value) {
            addCriterion("ZHENGCHE_PRICE >", value, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceGreaterThanOrEqualTo(String value) {
            addCriterion("ZHENGCHE_PRICE >=", value, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceLessThan(String value) {
            addCriterion("ZHENGCHE_PRICE <", value, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceLessThanOrEqualTo(String value) {
            addCriterion("ZHENGCHE_PRICE <=", value, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceLike(String value) {
            addCriterion("ZHENGCHE_PRICE like", value, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceNotLike(String value) {
            addCriterion("ZHENGCHE_PRICE not like", value, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceIn(List<String> values) {
            addCriterion("ZHENGCHE_PRICE in", values, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceNotIn(List<String> values) {
            addCriterion("ZHENGCHE_PRICE not in", values, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceBetween(String value1, String value2) {
            addCriterion("ZHENGCHE_PRICE between", value1, value2, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andZhengchePriceNotBetween(String value1, String value2) {
            addCriterion("ZHENGCHE_PRICE not between", value1, value2, "zhengchePrice");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonIsNull() {
            addCriterion("PRICE_OF_EVERY_TON is null");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonIsNotNull() {
            addCriterion("PRICE_OF_EVERY_TON is not null");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonEqualTo(String value) {
            addCriterion("PRICE_OF_EVERY_TON =", value, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonNotEqualTo(String value) {
            addCriterion("PRICE_OF_EVERY_TON <>", value, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonGreaterThan(String value) {
            addCriterion("PRICE_OF_EVERY_TON >", value, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_OF_EVERY_TON >=", value, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonLessThan(String value) {
            addCriterion("PRICE_OF_EVERY_TON <", value, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonLessThanOrEqualTo(String value) {
            addCriterion("PRICE_OF_EVERY_TON <=", value, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonLike(String value) {
            addCriterion("PRICE_OF_EVERY_TON like", value, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonNotLike(String value) {
            addCriterion("PRICE_OF_EVERY_TON not like", value, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonIn(List<String> values) {
            addCriterion("PRICE_OF_EVERY_TON in", values, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonNotIn(List<String> values) {
            addCriterion("PRICE_OF_EVERY_TON not in", values, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonBetween(String value1, String value2) {
            addCriterion("PRICE_OF_EVERY_TON between", value1, value2, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryTonNotBetween(String value1, String value2) {
            addCriterion("PRICE_OF_EVERY_TON not between", value1, value2, "priceOfEveryTon");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeIsNull() {
            addCriterion("PRICE_OF_EVERY_VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeIsNotNull() {
            addCriterion("PRICE_OF_EVERY_VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeEqualTo(String value) {
            addCriterion("PRICE_OF_EVERY_VOLUME =", value, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeNotEqualTo(String value) {
            addCriterion("PRICE_OF_EVERY_VOLUME <>", value, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeGreaterThan(String value) {
            addCriterion("PRICE_OF_EVERY_VOLUME >", value, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_OF_EVERY_VOLUME >=", value, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeLessThan(String value) {
            addCriterion("PRICE_OF_EVERY_VOLUME <", value, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeLessThanOrEqualTo(String value) {
            addCriterion("PRICE_OF_EVERY_VOLUME <=", value, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeLike(String value) {
            addCriterion("PRICE_OF_EVERY_VOLUME like", value, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeNotLike(String value) {
            addCriterion("PRICE_OF_EVERY_VOLUME not like", value, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeIn(List<String> values) {
            addCriterion("PRICE_OF_EVERY_VOLUME in", values, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeNotIn(List<String> values) {
            addCriterion("PRICE_OF_EVERY_VOLUME not in", values, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeBetween(String value1, String value2) {
            addCriterion("PRICE_OF_EVERY_VOLUME between", value1, value2, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andPriceOfEveryVolumeNotBetween(String value1, String value2) {
            addCriterion("PRICE_OF_EVERY_VOLUME not between", value1, value2, "priceOfEveryVolume");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIsNull() {
            addCriterion("DELIVERY_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIsNotNull() {
            addCriterion("DELIVERY_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyEqualTo(String value) {
            addCriterion("DELIVERY_COMPANY =", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyNotEqualTo(String value) {
            addCriterion("DELIVERY_COMPANY <>", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyGreaterThan(String value) {
            addCriterion("DELIVERY_COMPANY >", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_COMPANY >=", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyLessThan(String value) {
            addCriterion("DELIVERY_COMPANY <", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_COMPANY <=", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyLike(String value) {
            addCriterion("DELIVERY_COMPANY like", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyNotLike(String value) {
            addCriterion("DELIVERY_COMPANY not like", value, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIn(List<String> values) {
            addCriterion("DELIVERY_COMPANY in", values, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyNotIn(List<String> values) {
            addCriterion("DELIVERY_COMPANY not in", values, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyBetween(String value1, String value2) {
            addCriterion("DELIVERY_COMPANY between", value1, value2, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_COMPANY not between", value1, value2, "deliveryCompany");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNull() {
            addCriterion("DELIVERY_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNotNull() {
            addCriterion("DELIVERY_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressEqualTo(String value) {
            addCriterion("DELIVERY_ADDRESS =", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotEqualTo(String value) {
            addCriterion("DELIVERY_ADDRESS <>", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThan(String value) {
            addCriterion("DELIVERY_ADDRESS >", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_ADDRESS >=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThan(String value) {
            addCriterion("DELIVERY_ADDRESS <", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_ADDRESS <=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLike(String value) {
            addCriterion("DELIVERY_ADDRESS like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotLike(String value) {
            addCriterion("DELIVERY_ADDRESS not like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIn(List<String> values) {
            addCriterion("DELIVERY_ADDRESS in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotIn(List<String> values) {
            addCriterion("DELIVERY_ADDRESS not in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressBetween(String value1, String value2) {
            addCriterion("DELIVERY_ADDRESS between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_ADDRESS not between", value1, value2, "deliveryAddress");
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

        public Criteria andPublishTimeEqualTo(String value) {
            addCriterion("PUBLISH_TIME =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(String value) {
            addCriterion("PUBLISH_TIME <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(String value) {
            addCriterion("PUBLISH_TIME >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLISH_TIME >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(String value) {
            addCriterion("PUBLISH_TIME <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(String value) {
            addCriterion("PUBLISH_TIME <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLike(String value) {
            addCriterion("PUBLISH_TIME like", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotLike(String value) {
            addCriterion("PUBLISH_TIME not like", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<String> values) {
            addCriterion("PUBLISH_TIME in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<String> values) {
            addCriterion("PUBLISH_TIME not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(String value1, String value2) {
            addCriterion("PUBLISH_TIME between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(String value1, String value2) {
            addCriterion("PUBLISH_TIME not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntIsNull() {
            addCriterion("PUBLISH_TIME_INT is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntIsNotNull() {
            addCriterion("PUBLISH_TIME_INT is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntEqualTo(Long value) {
            addCriterion("PUBLISH_TIME_INT =", value, "publishTimeInt");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntNotEqualTo(Long value) {
            addCriterion("PUBLISH_TIME_INT <>", value, "publishTimeInt");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntGreaterThan(Long value) {
            addCriterion("PUBLISH_TIME_INT >", value, "publishTimeInt");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntGreaterThanOrEqualTo(Long value) {
            addCriterion("PUBLISH_TIME_INT >=", value, "publishTimeInt");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntLessThan(Long value) {
            addCriterion("PUBLISH_TIME_INT <", value, "publishTimeInt");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntLessThanOrEqualTo(Long value) {
            addCriterion("PUBLISH_TIME_INT <=", value, "publishTimeInt");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntIn(List<Long> values) {
            addCriterion("PUBLISH_TIME_INT in", values, "publishTimeInt");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntNotIn(List<Long> values) {
            addCriterion("PUBLISH_TIME_INT not in", values, "publishTimeInt");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntBetween(Long value1, Long value2) {
            addCriterion("PUBLISH_TIME_INT between", value1, value2, "publishTimeInt");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIntNotBetween(Long value1, Long value2) {
            addCriterion("PUBLISH_TIME_INT not between", value1, value2, "publishTimeInt");
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

        public Criteria andPublishUserNicknameIsNull() {
            addCriterion("PUBLISH_USER_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameIsNotNull() {
            addCriterion("PUBLISH_USER_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameEqualTo(String value) {
            addCriterion("PUBLISH_USER_NICKNAME =", value, "publishUserNickname");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameNotEqualTo(String value) {
            addCriterion("PUBLISH_USER_NICKNAME <>", value, "publishUserNickname");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameGreaterThan(String value) {
            addCriterion("PUBLISH_USER_NICKNAME >", value, "publishUserNickname");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLISH_USER_NICKNAME >=", value, "publishUserNickname");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameLessThan(String value) {
            addCriterion("PUBLISH_USER_NICKNAME <", value, "publishUserNickname");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("PUBLISH_USER_NICKNAME <=", value, "publishUserNickname");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameLike(String value) {
            addCriterion("PUBLISH_USER_NICKNAME like", value, "publishUserNickname");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameNotLike(String value) {
            addCriterion("PUBLISH_USER_NICKNAME not like", value, "publishUserNickname");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameIn(List<String> values) {
            addCriterion("PUBLISH_USER_NICKNAME in", values, "publishUserNickname");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameNotIn(List<String> values) {
            addCriterion("PUBLISH_USER_NICKNAME not in", values, "publishUserNickname");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameBetween(String value1, String value2) {
            addCriterion("PUBLISH_USER_NICKNAME between", value1, value2, "publishUserNickname");
            return (Criteria) this;
        }

        public Criteria andPublishUserNicknameNotBetween(String value1, String value2) {
            addCriterion("PUBLISH_USER_NICKNAME not between", value1, value2, "publishUserNickname");
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