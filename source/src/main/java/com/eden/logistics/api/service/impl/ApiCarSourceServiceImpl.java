package com.eden.logistics.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.api.dto.view.CarSourceListItemView;
import com.eden.logistics.api.service.IApiCarSourceService;
import com.eden.logistics.common.domain.CarSourceView;
import com.eden.logistics.common.domain.User;
import com.eden.logistics.common.dto.param.CreateCarSourceParam;
import com.eden.logistics.common.dto.param.ListCarSourceByCondParam;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.ICarSourceService;
import com.eden.logistics.common.service.IUserService;
@Service
public class ApiCarSourceServiceImpl implements IApiCarSourceService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private ICarSourceService carSourceService;
	
	@Override
	public View<Boolean> create(String token,CreateCarSourceParam param) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			User user = userService.getByAccessToken(token);
			if( user == null ){
				throw new ServiceException("Œﬁ»®∑√Œ ");
			}
			
			param.setPublishUserId( user.getId() );
			carSourceService.createCarSource( param );
			
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
	public View<List<CarSourceListItemView>> listByCond(ListCarSourceByCondParam param) throws ServiceException {
		View<List<CarSourceListItemView>> view = new View<List<CarSourceListItemView>>();
		
		try {
			List<CarSourceView> carSourceViewList = carSourceService.listByCond(param);
			List<CarSourceListItemView> carSourceListItemViewList = trans2CarSourceListItemViewList(carSourceViewList);
			
			view.setData(carSourceListItemViewList);
			return view;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			view.setMsg(e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

	private List<CarSourceListItemView> trans2CarSourceListItemViewList(List<CarSourceView> carSourceViewList) {
		if( carSourceViewList != null ){
			List<CarSourceListItemView> list = new ArrayList<CarSourceListItemView>();
			CarSourceListItemView view = null;
			for( CarSourceView carSourceView : carSourceViewList ){
				view = trans2CarSourceListItemView(carSourceView);
				if( view != null ){
					list.add(view);
				}
			}
			
			return list;
		}
		return null;
	}

	private CarSourceListItemView trans2CarSourceListItemView(CarSourceView carSourceView) {
		if( carSourceView == null ){
			return null;
		}
		CarSourceListItemView view = new CarSourceListItemView();
		view.setCarHeight(carSourceView.getCarHeight());
		view.setCarLength(carSourceView.getCarLength());
		view.setCarTonnage(carSourceView.getCarTonnage());
		view.setCarType(carSourceView.getCarType());
		view.setCarVolume(carSourceView.getCarVolume());
		view.setCarWidth(carSourceView.getCarWidth());
		view.setDepatureAreaName(carSourceView.getDepatureAreaName());
		view.setDestinationAreaName(carSourceView.getDestinationAreaName());
		view.setId(carSourceView.getId());
		view.setPublishTime(carSourceView.getPublishTime());
		view.setPublishTimeInt(carSourceView.getPublishTimeInt());
		
		return view;
	}

}
