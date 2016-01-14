package com.eden.logistics.common.domain;

public class User {
    private Integer id;

    private String mobile;

    private String password;

    private String nickname;

    private String accessToken;

    private Integer userHeadFileId;

    private String verifyCode;

    private Long verifyCodeGenerateTime;

    private Long registerTime;

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

    public Integer getUserHeadFileId() {
        return userHeadFileId;
    }

    public void setUserHeadFileId(Integer userHeadFileId) {
        this.userHeadFileId = userHeadFileId;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
    }

    public Long getVerifyCodeGenerateTime() {
        return verifyCodeGenerateTime;
    }

    public void setVerifyCodeGenerateTime(Long verifyCodeGenerateTime) {
        this.verifyCodeGenerateTime = verifyCodeGenerateTime;
    }

    public Long getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
    }
}