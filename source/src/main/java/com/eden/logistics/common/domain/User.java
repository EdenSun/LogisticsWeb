package com.eden.logistics.common.domain;

import java.util.Date;

public class User {
    private Integer id;

    private String mobile;

    private String password;

    private String nickname;

    private String accessToken;

    private Integer userHeadFileId;

    private String verifyCode;

    private Date verifyCodeGenerateTime;

    private Date registerTime;

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

    public Date getVerifyCodeGenerateTime() {
        return verifyCodeGenerateTime;
    }

    public void setVerifyCodeGenerateTime(Date verifyCodeGenerateTime) {
        this.verifyCodeGenerateTime = verifyCodeGenerateTime;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}