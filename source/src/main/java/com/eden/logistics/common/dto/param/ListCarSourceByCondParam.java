package com.eden.logistics.common.dto.param;

public class ListCarSourceByCondParam {
	private Integer depatureAreaId;

	private Integer destinationAreaId;

	private Integer carType;
	
	private Long oldestTime;

	private Integer pageSize;
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

	public Long getOldestTime() {
		return oldestTime;
	}

	public void setOldestTime(Long oldestTime) {
		this.oldestTime = oldestTime;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
