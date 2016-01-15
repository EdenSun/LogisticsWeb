package com.eden.logistics.common.dto.param;

public class ListGoodsSourceByCondParam {
	private Integer depatureAreaId;
	private Integer destinationAreaId;
	// yyyy-MM-dd
	private String depatureTime;	
	// yyyy-MM-dd
    private String arrivalTime;
    private Integer transportTypeId;
    private Integer goodsTypeId;
    private Integer carTypeId;
	
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
	public Integer getTransportTypeId() {
		return transportTypeId;
	}
	public void setTransportTypeId(Integer transportTypeId) {
		this.transportTypeId = transportTypeId;
	}
	public Integer getGoodsTypeId() {
		return goodsTypeId;
	}
	public void setGoodsTypeId(Integer goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	public Integer getCarTypeId() {
		return carTypeId;
	}
	public void setCarTypeId(Integer carTypeId) {
		this.carTypeId = carTypeId;
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
