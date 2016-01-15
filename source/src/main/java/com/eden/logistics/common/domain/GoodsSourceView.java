package com.eden.logistics.common.domain;

public class GoodsSourceView {
    private Integer id;

    private Integer depatureAreaId;

    private String depatureAreaName;

    private Integer destinationAreaId;

    private String destinationAreaName;

    private String depatureTime;

    private Long depatureTimeInt;

    private String arrivalTime;

    private Long arrivalTimeInt;

    private Integer transportTypeId;

    private String transportType;

    private Integer goodsTypeId;

    private String goodsType;

    private Integer carTypeId;

    private String carType;

    private Integer needCarNumber;

    private String goodsDescription;

    private String goodsName;

    private String goodsWeight;

    private String goodsVolume;

    private String lingdanPrice;

    private String zhengchePrice;

    private String priceOfEveryTon;

    private String priceOfEveryVolume;

    private String deliveryCompany;

    private String deliveryAddress;

    private String contactUserName;

    private String contactUserMobile;

    private String contactUserPhone;

    private String contactUserEmail;

    private String contactUserQq;

    private String contactUserWechat;

    private String publishTime;

    private Long publishTimeInt;

    private Integer publishUserId;

    private String publishUserNickname;

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

    public String getDepatureAreaName() {
        return depatureAreaName;
    }

    public void setDepatureAreaName(String depatureAreaName) {
        this.depatureAreaName = depatureAreaName == null ? null : depatureAreaName.trim();
    }

    public Integer getDestinationAreaId() {
        return destinationAreaId;
    }

    public void setDestinationAreaId(Integer destinationAreaId) {
        this.destinationAreaId = destinationAreaId;
    }

    public String getDestinationAreaName() {
        return destinationAreaName;
    }

    public void setDestinationAreaName(String destinationAreaName) {
        this.destinationAreaName = destinationAreaName == null ? null : destinationAreaName.trim();
    }

    public String getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(String depatureTime) {
        this.depatureTime = depatureTime == null ? null : depatureTime.trim();
    }

    public Long getDepatureTimeInt() {
        return depatureTimeInt;
    }

    public void setDepatureTimeInt(Long depatureTimeInt) {
        this.depatureTimeInt = depatureTimeInt;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime == null ? null : arrivalTime.trim();
    }

    public Long getArrivalTimeInt() {
        return arrivalTimeInt;
    }

    public void setArrivalTimeInt(Long arrivalTimeInt) {
        this.arrivalTimeInt = arrivalTimeInt;
    }

    public Integer getTransportTypeId() {
        return transportTypeId;
    }

    public void setTransportTypeId(Integer transportTypeId) {
        this.transportTypeId = transportTypeId;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType == null ? null : transportType.trim();
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
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

    public String getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(String goodsWeight) {
        this.goodsWeight = goodsWeight == null ? null : goodsWeight.trim();
    }

    public String getGoodsVolume() {
        return goodsVolume;
    }

    public void setGoodsVolume(String goodsVolume) {
        this.goodsVolume = goodsVolume == null ? null : goodsVolume.trim();
    }

    public String getLingdanPrice() {
        return lingdanPrice;
    }

    public void setLingdanPrice(String lingdanPrice) {
        this.lingdanPrice = lingdanPrice == null ? null : lingdanPrice.trim();
    }

    public String getZhengchePrice() {
        return zhengchePrice;
    }

    public void setZhengchePrice(String zhengchePrice) {
        this.zhengchePrice = zhengchePrice == null ? null : zhengchePrice.trim();
    }

    public String getPriceOfEveryTon() {
        return priceOfEveryTon;
    }

    public void setPriceOfEveryTon(String priceOfEveryTon) {
        this.priceOfEveryTon = priceOfEveryTon == null ? null : priceOfEveryTon.trim();
    }

    public String getPriceOfEveryVolume() {
        return priceOfEveryVolume;
    }

    public void setPriceOfEveryVolume(String priceOfEveryVolume) {
        this.priceOfEveryVolume = priceOfEveryVolume == null ? null : priceOfEveryVolume.trim();
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

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
    }

    public Long getPublishTimeInt() {
        return publishTimeInt;
    }

    public void setPublishTimeInt(Long publishTimeInt) {
        this.publishTimeInt = publishTimeInt;
    }

    public Integer getPublishUserId() {
        return publishUserId;
    }

    public void setPublishUserId(Integer publishUserId) {
        this.publishUserId = publishUserId;
    }

    public String getPublishUserNickname() {
        return publishUserNickname;
    }

    public void setPublishUserNickname(String publishUserNickname) {
        this.publishUserNickname = publishUserNickname == null ? null : publishUserNickname.trim();
    }
}