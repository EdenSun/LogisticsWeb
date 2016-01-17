package com.eden.logistics.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.api.dto.view.CarSourceDetailView;
import com.eden.logistics.api.dto.view.CarSourceListItemView;
import com.eden.logistics.api.dto.view.FileView;
import com.eden.logistics.api.service.IApiCarSourceService;
import com.eden.logistics.common.domain.CarSourceImageView;
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
				throw new ServiceException("无权访问");
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

	@Override
	public View<CarSourceDetailView> loadCarSourceDetail(Integer carSourceId) throws ServiceException {
		View<CarSourceDetailView> view = new View<CarSourceDetailView>();
		
		try {
			CarSourceView carSourceView = carSourceService.getCarSourceViewById(carSourceId);
			CarSourceDetailView carSourceDetailView = trans2CarSourceDetailView(carSourceView);
			
			view.setData(carSourceDetailView);
			return view;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			view.setMsg(e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

	private CarSourceDetailView trans2CarSourceDetailView(CarSourceView carSourceView) {
		if( carSourceView == null ){
			return null;
		}
		CarSourceDetailView view = new CarSourceDetailView();
		view.setCarHeight(carSourceView.getCarHeight());
		view.setCarLength(carSourceView.getCarLength());
		view.setCarNumber(carSourceView.getCarNumber());
		view.setCarSourceDescription(carSourceView.getCarSourceDescription());
		view.setCarTonnage(carSourceView.getCarTonnage());
		view.setCarType(carSourceView.getCarType());
		view.setCarTypeId(carSourceView.getCarTypeId());
		view.setCarVolume(carSourceView.getCarVolume());
		view.setCarWidth(carSourceView.getCarWidth());
		view.setContactUserEmail(carSourceView.getContactUserEmail());
		view.setContactUserMobile(carSourceView.getContactUserMobile());
		view.setContactUserName(carSourceView.getContactUserName());
		view.setContactUserPhone(carSourceView.getContactUserPhone());
		view.setContactUserQq(carSourceView.getContactUserQq());
		view.setContactUserWechat(carSourceView.getContactUserWechat());
		view.setDepatureAreaId(carSourceView.getDepatureAreaId());
		view.setDepatureAreaName(carSourceView.getDepatureAreaName());
		view.setDestinationAreaId(carSourceView.getDestinationAreaId());
		view.setDestinationAreaName(carSourceView.getDestinationAreaName());
		view.setId(carSourceView.getId());
		view.setPublishTime(carSourceView.getPublishTime());
		view.setPublishTimeInt(carSourceView.getPublishTimeInt());
		view.setPublishUserId(carSourceView.getPublishUserId());
		view.setPublishUserNickname(carSourceView.getPublishUserNickname());

		List<CarSourceImageView> carSourceImageViewList = carSourceService.listCarSourceImageViewByCarSourceId(carSourceView.getId());
		List<FileView> fileViewList = trans2FileViewList(carSourceImageViewList);
		view.setImgList(fileViewList);
		
		//TODO: 评论
		//view.setCommentList(carSourceView.get);
		
		return view;
	}

	private List<FileView> trans2FileViewList(List<CarSourceImageView> carSourceImageViewList) {
		if( carSourceImageViewList == null ){
			return null;
		}
		List<FileView> list = new ArrayList<FileView>();
		FileView view = null;
		
		for(CarSourceImageView imgView : carSourceImageViewList){
			view = trans2FileView(imgView);
			if( view != null ){
				list.add(view);
			}
		}
		
		return list;
	}

	private FileView trans2FileView(CarSourceImageView imgView) {
		if( imgView == null ){
			return null;
		}
		FileView fileView = new FileView();
		fileView.setId(imgView.getImgFileId());
		fileView.setPath(imgView.getImgFilePath());
		
		return fileView;
	}

	
}
