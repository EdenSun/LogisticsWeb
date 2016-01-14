package com.eden.logistics.common.domain;

import java.util.ArrayList;
import java.util.List;

public class UserViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserViewExample() {
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

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NICKNAME like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNull() {
            addCriterion("ACCESS_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNotNull() {
            addCriterion("ACCESS_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenEqualTo(String value) {
            addCriterion("ACCESS_TOKEN =", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotEqualTo(String value) {
            addCriterion("ACCESS_TOKEN <>", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThan(String value) {
            addCriterion("ACCESS_TOKEN >", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_TOKEN >=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThan(String value) {
            addCriterion("ACCESS_TOKEN <", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_TOKEN <=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLike(String value) {
            addCriterion("ACCESS_TOKEN like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotLike(String value) {
            addCriterion("ACCESS_TOKEN not like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIn(List<String> values) {
            addCriterion("ACCESS_TOKEN in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotIn(List<String> values) {
            addCriterion("ACCESS_TOKEN not in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenBetween(String value1, String value2) {
            addCriterion("ACCESS_TOKEN between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotBetween(String value1, String value2) {
            addCriterion("ACCESS_TOKEN not between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextIsNull() {
            addCriterion("REGISTER_TIME_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextIsNotNull() {
            addCriterion("REGISTER_TIME_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextEqualTo(String value) {
            addCriterion("REGISTER_TIME_TEXT =", value, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextNotEqualTo(String value) {
            addCriterion("REGISTER_TIME_TEXT <>", value, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextGreaterThan(String value) {
            addCriterion("REGISTER_TIME_TEXT >", value, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_TIME_TEXT >=", value, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextLessThan(String value) {
            addCriterion("REGISTER_TIME_TEXT <", value, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_TIME_TEXT <=", value, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextLike(String value) {
            addCriterion("REGISTER_TIME_TEXT like", value, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextNotLike(String value) {
            addCriterion("REGISTER_TIME_TEXT not like", value, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextIn(List<String> values) {
            addCriterion("REGISTER_TIME_TEXT in", values, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextNotIn(List<String> values) {
            addCriterion("REGISTER_TIME_TEXT not in", values, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextBetween(String value1, String value2) {
            addCriterion("REGISTER_TIME_TEXT between", value1, value2, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeTextNotBetween(String value1, String value2) {
            addCriterion("REGISTER_TIME_TEXT not between", value1, value2, "registerTimeText");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Long value) {
            addCriterion("REGISTER_TIME =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Long value) {
            addCriterion("REGISTER_TIME <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Long value) {
            addCriterion("REGISTER_TIME >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("REGISTER_TIME >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Long value) {
            addCriterion("REGISTER_TIME <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Long value) {
            addCriterion("REGISTER_TIME <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Long> values) {
            addCriterion("REGISTER_TIME in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Long> values) {
            addCriterion("REGISTER_TIME not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Long value1, Long value2) {
            addCriterion("REGISTER_TIME between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Long value1, Long value2) {
            addCriterion("REGISTER_TIME not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNull() {
            addCriterion("VERIFY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNotNull() {
            addCriterion("VERIFY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeEqualTo(String value) {
            addCriterion("VERIFY_CODE =", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotEqualTo(String value) {
            addCriterion("VERIFY_CODE <>", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThan(String value) {
            addCriterion("VERIFY_CODE >", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_CODE >=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThan(String value) {
            addCriterion("VERIFY_CODE <", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_CODE <=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLike(String value) {
            addCriterion("VERIFY_CODE like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotLike(String value) {
            addCriterion("VERIFY_CODE not like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIn(List<String> values) {
            addCriterion("VERIFY_CODE in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotIn(List<String> values) {
            addCriterion("VERIFY_CODE not in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeBetween(String value1, String value2) {
            addCriterion("VERIFY_CODE between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotBetween(String value1, String value2) {
            addCriterion("VERIFY_CODE not between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextIsNull() {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextIsNotNull() {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextEqualTo(String value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT =", value, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextNotEqualTo(String value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT <>", value, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextGreaterThan(String value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT >", value, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT >=", value, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextLessThan(String value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT <", value, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT <=", value, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextLike(String value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT like", value, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextNotLike(String value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT not like", value, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextIn(List<String> values) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT in", values, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextNotIn(List<String> values) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT not in", values, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextBetween(String value1, String value2) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT between", value1, value2, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeTextNotBetween(String value1, String value2) {
            addCriterion("VERIFY_CODE_GENERATE_TIME_TEXT not between", value1, value2, "verifyCodeGenerateTimeText");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeIsNull() {
            addCriterion("VERIFY_CODE_GENERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeIsNotNull() {
            addCriterion("VERIFY_CODE_GENERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeEqualTo(Long value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME =", value, "verifyCodeGenerateTime");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeNotEqualTo(Long value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME <>", value, "verifyCodeGenerateTime");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeGreaterThan(Long value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME >", value, "verifyCodeGenerateTime");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME >=", value, "verifyCodeGenerateTime");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeLessThan(Long value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME <", value, "verifyCodeGenerateTime");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeLessThanOrEqualTo(Long value) {
            addCriterion("VERIFY_CODE_GENERATE_TIME <=", value, "verifyCodeGenerateTime");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeIn(List<Long> values) {
            addCriterion("VERIFY_CODE_GENERATE_TIME in", values, "verifyCodeGenerateTime");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeNotIn(List<Long> values) {
            addCriterion("VERIFY_CODE_GENERATE_TIME not in", values, "verifyCodeGenerateTime");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeBetween(Long value1, Long value2) {
            addCriterion("VERIFY_CODE_GENERATE_TIME between", value1, value2, "verifyCodeGenerateTime");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGenerateTimeNotBetween(Long value1, Long value2) {
            addCriterion("VERIFY_CODE_GENERATE_TIME not between", value1, value2, "verifyCodeGenerateTime");
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