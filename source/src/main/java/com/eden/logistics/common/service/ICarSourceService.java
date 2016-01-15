package com.eden.logistics.common.service;

import java.util.List;

import com.eden.logistics.common.domain.CarSourceView;
import com.eden.logistics.common.dto.param.CreateCarSourceParam;
import com.eden.logistics.common.dto.param.ListCarSourceByCondParam;
import com.eden.logistics.common.exception.ServiceException;

public interface ICarSourceService {

	void createCarSource(CreateCarSourceParam param)throws ServiceException;

	List<CarSourceView> listByCond(ListCarSourceByCondParam param)throws ServiceException;

	CarSourceView getCarSourceViewById(Integer carSourceId)throws ServiceException;

}
