package com.eden.logistics.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.api.dto.param.CreateGoodsSourceParam;
import com.eden.logistics.api.dto.param.GoodsSourceListItemView;
import com.eden.logistics.api.dto.param.ListGoodsSourceByCondParam;
import com.eden.logistics.api.service.IApiGoodsSourceService;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.IGoodsSourceService;

@Service
public class ApiGoodsSourceServiceImpl implements IApiGoodsSourceService {
	@Autowired
	private IGoodsSourceService goodsSourceService;
	
	@Override
	public View<Boolean> create(CreateGoodsSourceParam param) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View<List<GoodsSourceListItemView>> listByCond(ListGoodsSourceByCondParam param) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
