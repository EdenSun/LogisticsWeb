package com.eden.logistics.common.domain;

public class UserView {
    private Integer id;

    private String mobile;

    private String password;

    private String nickname;

    private String accessToken;

    private String registerTimeText;

    private Long registerTime;

    private String verifyCode;

    private String verifyCodeGenerateTimeText;

    private Long verifyCodeGenerateTime;

    private String userHead;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public String getRegisterTimeText() {
        return registerTimeText;
    }

    public void setRegisterTimeText(String registerTimeText) {
        this.registerTimeText = registerTimeText == null ? null : registerTimeText.trim();
    }

    public Long getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
    }

    public String getVerifyCodeGenerateTimeText() {
        return verifyCodeGenerateTimeText;
    }

    public void setVerifyCodeGenerateTimeText(String verifyCodeGenerateTimeText) {
        this.verifyCodeGenerateTimeText = verifyCodeGenerateTimeText == null ? null : verifyCodeGenerateTimeText.trim();
    }

    public Long getVerifyCodeGenerateTime() {
        return verifyCodeGenerateTime;
    }

    public void setVerifyCodeGenerateTime(Long verifyCodeGenerateTime) {
        this.verifyCodeGenerateTime = verifyCodeGenerateTime;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead == null ? null : userHead.trim();
    }
}