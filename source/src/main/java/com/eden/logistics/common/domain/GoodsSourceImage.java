package com.eden.logistics.common.domain;

public class GoodsSourceImage {
    private Integer id;

    private Integer goodsSourceId;

    private Integer imageFileId;

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

    public Integer getImageFileId() {
        return imageFileId;
    }

    public void setImageFileId(Integer imageFileId) {
        this.imageFileId = imageFileId;
    }
}