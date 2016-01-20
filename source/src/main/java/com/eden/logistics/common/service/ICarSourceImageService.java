package com.eden.logistics.common.service;

import java.util.List;

import com.eden.logistics.common.exception.ServiceException;

public interface ICarSourceImageService {

	void addCarSourceImage(Integer carSourceId, List<Integer> imgIdList)throws ServiceException;

	String getFirstImageUrl(Integer carSourceId)throws ServiceException;

}
