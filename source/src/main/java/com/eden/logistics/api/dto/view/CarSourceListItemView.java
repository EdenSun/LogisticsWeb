package com.eden.logistics.api.dto.view;

public class CarSourceListItemView {
	private Integer id;

	private String depatureAreaName;

	private String destinationAreaName;

	private String carType;

	private Integer carLength;

	private Integer carWidth;

	private Integer carHeight;

	private String carTonnage;

	private String carVolume;

	private String publishTime;

	private Long publishTimeInt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepatureAreaName() {
		return depatureAreaName;
	}

	public void setDepatureAreaName(String depatureAreaName) {
		this.depatureAreaName = depatureAreaName;
	}

	public String getDestinationAreaName() {
		return destinationAreaName;
	}

	public void setDestinationAreaName(String destinationAreaName) {
		this.destinationAreaName = destinationAreaName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
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
	
}
