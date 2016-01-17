package com.eden.logistics.common.domain;

public class CarSourceImage {
    private Integer id;

    private Integer carSourceId;

    private Integer imageFileId;

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

    public Integer getImageFileId() {
        return imageFileId;
    }

    public void setImageFileId(Integer imageFileId) {
        this.imageFileId = imageFileId;
    }
}