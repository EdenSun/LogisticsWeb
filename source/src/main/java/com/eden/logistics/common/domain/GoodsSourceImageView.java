package com.eden.logistics.common.domain;

public class GoodsSourceImageView {
    private Integer id;

    private Integer goodsSourceId;

    private Integer imgFileId;

    private String imgFileUploadTime;

    private Long imgFileUploadTimeInt;

    private String imgFilePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsSourceId() {
        return goodsSourceId;
    }

    public void setGoodsSourceId(Integer goodsSourceId) {
        this.goodsSourceId = goodsSourceId;
    }

    public Integer getImgFileId() {
        return imgFileId;
    }

    public void setImgFileId(Integer imgFileId) {
        this.imgFileId = imgFileId;
    }

    public String getImgFileUploadTime() {
        return imgFileUploadTime;
    }

    public void setImgFileUploadTime(String imgFileUploadTime) {
        this.imgFileUploadTime = imgFileUploadTime == null ? null : imgFileUploadTime.trim();
    }

    public Long getImgFileUploadTimeInt() {
        return imgFileUploadTimeInt;
    }

    public void setImgFileUploadTimeInt(Long imgFileUploadTimeInt) {
        this.imgFileUploadTimeInt = imgFileUploadTimeInt;
    }

    public String getImgFilePath() {
        return imgFilePath;
    }

    public void setImgFilePath(String imgFilePath) {
        this.imgFilePath = imgFilePath == null ? null : imgFilePath.trim();
    }
}