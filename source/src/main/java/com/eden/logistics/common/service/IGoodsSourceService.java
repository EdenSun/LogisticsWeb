package com.eden.logistics.common.service;

import java.util.List;

import com.eden.logistics.common.domain.GoodsSource;
import com.eden.logistics.common.domain.GoodsSourceView;
import com.eden.logistics.common.dto.param.CreateGoodsSourceParam;
import com.eden.logistics.common.dto.param.ListGoodsSourceByCondParam;
import com.eden.logistics.common.exception.ServiceException;

public interface IGoodsSourceService {

	void createGoodsSource(CreateGoodsSourceParam param)throws ServiceException;

	List<GoodsSourceView> listByCond(ListGoodsSourceByCondParam param)throws ServiceException;

	GoodsSource getById(Integer goodsSourceId)throws ServiceException;

}
