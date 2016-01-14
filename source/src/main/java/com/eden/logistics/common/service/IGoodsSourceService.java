package com.eden.logistics.common.service;

import com.eden.logistics.common.dto.param.CreateGoodsSourceParam;
import com.eden.logistics.common.exception.ServiceException;

public interface IGoodsSourceService {

	void createGoodsSource(CreateGoodsSourceParam param)throws ServiceException;

}
