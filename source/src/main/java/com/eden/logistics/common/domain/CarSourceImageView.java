package com.eden.logistics.common.domain;

public class CarSourceImageView {
    private Integer id;

    private Integer carSourceId;

    private Integer imgFileId;

    private String imgFilePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarSourceId() {
        return carSourceId;
    }

    public void setCarSourceId(Integer carSourceId) {
        this.carSourceId = carSourceId;
    }

    public Integer getImgFileId() {
        return imgFileId;
    }

    public void setImgFileId(Integer imgFileId) {
        this.imgFileId = imgFileId;
    }

    public String getImgFilePath() {
        return imgFilePath;
    }

    public void setImgFilePath(String imgFilePath) {
        this.imgFilePath = imgFilePath == null ? null : imgFilePath.trim();
    }
}