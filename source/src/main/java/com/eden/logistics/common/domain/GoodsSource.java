package com.eden.logistics.common.domain;

import java.util.Date;

public class GoodsSource {
    private Integer id;

    private Integer depatureAreaId;

    private Integer destinationAreaId;

    private Date depatureTime;

    private Date arrivalTime;

    private Integer transportType;

    private Integer goodsType;

    private Integer carType;

    private Integer needCarNumber;

    private String goodsDescription;

    private String goodsName;

    private Integer goodsWeight;

    private Integer goodsVolume;

    private Integer lingdanPrice;

    private Integer zhengchePrice;

    private Integer priceOfEveryTon;

    private Integer priceOfEveryVolume;

    private String deliveryCompany;

    private String deliveryAddress;

    private String contactUserName;

    private String contactUserMobile;

    private String contactUserPhone;

    private String contactUserEmail;

    private String contactUserQq;

    private String contactUserWechat;

    private Long publishTime;

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

    public Date getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(Date depatureTime) {
        this.depatureTime = depatureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Integer getTransportType() {
        return transportType;
    }

    public void setTransportType(Integer transportType) {
        this.transportType = transportType;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Integer getNeedCarNumber() {
        return needCarNumber;
    }

    public void setNeedCarNumber(Integer needCarNumber) {
        this.needCarNumber = needCarNumber;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription == null ? null : goodsDescription.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Integer goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Integer getGoodsVolume() {
        return goodsVolume;
    }

    public void setGoodsVolume(Integer goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    public Integer getLingdanPrice() {
        return lingdanPrice;
    }

    public void setLingdanPrice(Integer lingdanPrice) {
        this.lingdanPrice = lingdanPrice;
    }

    public Integer getZhengchePrice() {
        return zhengchePrice;
    }

    public void setZhengchePrice(Integer zhengchePrice) {
        this.zhengchePrice = zhengchePrice;
    }

    public Integer getPriceOfEveryTon() {
        return priceOfEveryTon;
    }

    public void setPriceOfEveryTon(Integer priceOfEveryTon) {
        this.priceOfEveryTon = priceOfEveryTon;
    }

    public Integer getPriceOfEveryVolume() {
        return priceOfEveryVolume;
    }

    public void setPriceOfEveryVolume(Integer priceOfEveryVolume) {
        this.priceOfEveryVolume = priceOfEveryVolume;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany == null ? null : deliveryCompany.trim();
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
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

    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getPublishUserId() {
        return publishUserId;
    }

    public void setPublishUserId(Integer publishUserId) {
        this.publishUserId = publishUserId;
    }
}