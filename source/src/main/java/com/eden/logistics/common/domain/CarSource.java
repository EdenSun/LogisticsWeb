package com.eden.logistics.common.domain;

import java.util.Date;

public class CarSource {
    private Integer id;

    private Integer depatureAreaId;

    private Integer destinationAreaId;

    private Integer carType;

    private String carNumber;

    private Integer carLength;

    private Integer carWidth;

    private Integer carHeight;

    private Integer carTonnage;

    private Integer carVolume;

    private String carSourceDescription;

    private String contactUserName;

    private String contactUserMobile;

    private String contactUserPhone;

    private String contactUserEmail;

    private String contactUserQq;

    private String contactUserWechat;

    private Date publishTime;

    private Integer publishUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepatureAreaId() {
        return depatureAreaId;
    }

    public void setDepatureAreaId(Integer depatureAreaId) {
        this.depatureAreaId = depatureAreaId;
    }

    public Integer getDestinationAreaId() {
        return destinationAreaId;
    }

    public void setDestinationAreaId(Integer destinationAreaId) {
        this.destinationAreaId = destinationAreaId;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public Integer getCarLength() {
        return carLength;
    }

    public void setCarLength(Integer carLength) {
        this.carLength = carLength;
    }

    public Integer getCarWidth() {
        return carWidth;
    }

    public void setCarWidth(Integer carWidth) {
        this.carWidth = carWidth;
    }

    public Integer getCarHeight() {
        return carHeight;
    }

    public void setCarHeight(Integer carHeight) {
        this.carHeight = carHeight;
    }

    public Integer getCarTonnage() {
        return carTonnage;
    }

    public void setCarTonnage(Integer carTonnage) {
        this.carTonnage = carTonnage;
    }

    public Integer getCarVolume() {
        return carVolume;
    }

    public void setCarVolume(Integer carVolume) {
        this.carVolume = carVolume;
    }

    public String getCarSourceDescription() {
        return carSourceDescription;
    }

    public void setCarSourceDescription(String carSourceDescription) {
        this.carSourceDescription = carSourceDescription == null ? null : carSourceDescription.trim();
    }

    public String getContactUserName() {
        return contactUserName;
    }

    public void setContactUserName(String contactUserName) {
        this.contactUserName = contactUserName == null ? null : contactUserName.trim();
    }

    public String getContactUserMobile() {
        return contactUserMobile;
    }

    public void setContactUserMobile(String contactUserMobile) {
        this.contactUserMobile = contactUserMobile == null ? null : contactUserMobile.trim();
    }

    public String getContactUserPhone() {
        return contactUserPhone;
    }

    public void setContactUserPhone(String contactUserPhone) {
        this.contactUserPhone = contactUserPhone == null ? null : contactUserPhone.trim();
    }

    public String getContactUserEmail() {
        return contactUserEmail;
    }

    public void setContactUserEmail(String contactUserEmail) {
        this.contactUserEmail = contactUserEmail == null ? null : contactUserEmail.trim();
    }

    public String getContactUserQq() {
        return contactUserQq;
    }

    public void setContactUserQq(String contactUserQq) {
        this.contactUserQq = contactUserQq == null ? null : contactUserQq.trim();
    }

    public String getContactUserWechat() {
        return contactUserWechat;
    }

    public void setContactUserWechat(String contactUserWechat) {
        this.contactUserWechat = contactUserWechat == null ? null : contactUserWechat.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getPublishUserId() {
        return publishUserId;
    }

    public void setPublishUserId(Integer publishUserId) {
        this.publishUserId = publishUserId;
    }
}