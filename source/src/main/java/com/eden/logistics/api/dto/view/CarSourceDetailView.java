package com.eden.logistics.api.dto.view;

import java.util.List;

public class CarSourceDetailView {
	private Integer id;

	private Integer depatureAreaId;

	private String depatureAreaName;

	private Integer destinationAreaId;

	private String destinationAreaName;

	private Integer carTypeId;

	private String carType;

	private String carNumber;

	private Integer carLength;

	private Integer carWidth;

	private Integer carHeight;

	private String carTonnage;

	private String carVolume;

	private String carSourceDescription;

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
	
	private List<FileView> imgList;
	
	private List<CommentListItemView> commentList;

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
		this.depatureAreaName = depatureAreaName;
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
		this.destinationAreaName = destinationAreaName;
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
		this.carType = carType;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
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

	public String getCarTonnage() {
		return carTonnage;
	}

	public void setCarTonnage(String carTonnage) {
		this.carTonnage = carTonnage;
	}

	public String getCarVolume() {
		return carVolume;
	}

	public void setCarVolume(String carVolume) {
		this.carVolume = carVolume;
	}

	public String getCarSourceDescription() {
		return carSourceDescription;
	}

	public void setCarSourceDescription(String carSourceDescription) {
		this.carSourceDescription = carSourceDescription;
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

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
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
		this.publishUserNickname = publishUserNickname;
	}

	public List<FileView> getImgList() {
		return imgList;
	}

	public void setImgList(List<FileView> imgList) {
		this.imgList = imgList;
	}

	public List<CommentListItemView> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<CommentListItemView> commentList) {
		this.commentList = commentList;
	}
	
}
