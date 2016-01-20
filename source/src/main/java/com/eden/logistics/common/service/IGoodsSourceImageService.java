package com.eden.logistics.common.service;

import java.util.List;

import com.eden.logistics.common.exception.ServiceException;

public interface IGoodsSourceImageService {

	void addGoodsSourceImage(Integer goodsSourceId, List<Integer> imgIdList)throws ServiceException;

	String getFirstImageUrl(Integer goodsSourceId)throws ServiceException;

}
