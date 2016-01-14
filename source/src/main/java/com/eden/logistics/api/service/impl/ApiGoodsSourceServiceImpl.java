package com.eden.logistics.api.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.api.dto.view.GoodsSourceListItemView;
import com.eden.logistics.api.service.IApiGoodsSourceService;
import com.eden.logistics.common.domain.User;
import com.eden.logistics.common.dto.param.CreateGoodsSourceParam;
import com.eden.logistics.common.dto.param.ListGoodsSourceByCondParam;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.IGoodsSourceService;
import com.eden.logistics.common.service.IUserService;

@Service
public class ApiGoodsSourceServiceImpl implements IApiGoodsSourceService {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IUserService userService;
	@Autowired
	private IGoodsSourceService goodsSourceService;
	
	@Override
	public View<Boolean> create(String token,CreateGoodsSourceParam param) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			User user = userService.getByAccessToken(token);
			if( user == null ){
				throw new ServiceException("Œﬁ»®∑√Œ ");
			}
			
			param.setPublishUserId( user.getId() );
			goodsSourceService.createGoodsSource( param );
			
			view.setData(true);
			return view;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			view.setData(false);
			view.setMsg(e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

	@Override
	public View<List<GoodsSourceListItemView>> listByCond(ListGoodsSourceByCondParam param) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
