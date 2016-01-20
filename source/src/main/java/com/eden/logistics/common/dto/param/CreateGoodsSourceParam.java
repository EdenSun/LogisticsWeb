package com.eden.logistics.common.dto.param;

import java.util.List;

public class CreateGoodsSourceParam {
    private Integer depatureAreaId;

    private Integer destinationAreaId;

    // yyyy-MM-dd
    private String depatureTime;

    // yyyy-MM-dd
    private String arrivalTime;

    private Integer transportType;

    private Integer goodsType;

    private Integer carType;

    private Integer needCarNumber;

    private String goodsDescription;

    private String goodsName;

    // 吨
    private Float goodsWeight;

    // 平方米
    private Float goodsVolume;

    // 元
    private Integer lingdanPrice;

    // 元
    private Integer zhengchePrice;

    // 元
    private Integer priceOfEveryTon;

    // 元
    private Integer priceOfEveryVolume;

    private String deliveryCompany;

    private String deliveryAddress;

    private String contactUserName;

    private String contactUserMobile;

    private String contactUserPhone;

    private String contactUserEmail;

    private String contactUserQq;

    private String contactUserWechat;

    private Integer publishUserId;
    
    private List<Integer> imgIdList;

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

	public String getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
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
		this.goodsDescription = goodsDescription;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Float getGoodsWeight() {
		return goodsWeight;
	}

	public void setGoodsWeight(Float goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	public Float getGoodsVolume() {
		return goodsVolume;
	}

	public void setGoodsVolume(Float goodsVolume) {
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
		this.deliveryCompany = deliveryCompany;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getContactUserName() {
		return contactUserName;
	}

	public void setContactUserName(String contactUserName) {
		this.contactUserName = contactUserName;
	}

	public String getContactUserMobile() {
		return contactUserMobile;
	}

	public void setContactUserMobile(String contactUserMobile) {
		this.contactUserMobile = contactUserMobile;
	}

	public String getContactUserPhone() {
		return contactUserPhone;
	}

	public void setContactUserPhone(String contactUserPhone) {
		this.contactUserPhone = contactUserPhone;
	}

	public String getContactUserEmail() {
		return contactUserEmail;
	}

	public void setContactUserEmail(String contactUserEmail) {
		this.contactUserEmail = contactUserEmail;
	}

	public String getContactUserQq() {
		return contactUserQq;
	}

	public void setContactUserQq(String contactUserQq) {
		this.contactUserQq = contactUserQq;
	}

	public String getContactUserWechat() {
		return contactUserWechat;
	}

	public void setContactUserWechat(String contactUserWechat) {
		this.contactUserWechat = contactUserWechat;
	}

	public Integer getPublishUserId() {
		return publishUserId;
	}

	public void setPublishUserId(Integer publishUserId) {
		this.publishUserId = publishUserId;
	}

	public List<Integer> getImgIdList() {
		return imgIdList;
	}

	public void setImgIdList(List<Integer> imgIdList) {
		this.imgIdList = imgIdList;
	}
    
}
