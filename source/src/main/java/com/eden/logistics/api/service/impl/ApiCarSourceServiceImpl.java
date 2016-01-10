package com.eden.logistics.api.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.api.dto.param.CreateCarSourceParam;
import com.eden.logistics.api.dto.param.ListCarSourceByCondParam;
import com.eden.logistics.api.dto.view.CarSourceListItemView;
import com.eden.logistics.api.service.IApiCarSourceService;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.ICarSourceService;
@Service
public class ApiCarSourceServiceImpl implements IApiCarSourceService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private ICarSourceService carSourceService;
	
	@Override
	public View<Boolean> create(CreateCarSourceParam param) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View<List<CarSourceListItemView>> listByCond(ListCarSourceByCondParam param) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
