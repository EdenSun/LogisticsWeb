package com.eden.logistics.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.api.dto.view.CarSourceListItemView;
import com.eden.logistics.api.dto.view.GoodsSourceDetailView;
import com.eden.logistics.api.dto.view.GoodsSourceListItemView;
import com.eden.logistics.api.service.IApiGoodsSourceService;
import com.eden.logistics.common.domain.CarSourceView;
import com.eden.logistics.common.domain.GoodsSourceView;
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
		View<List<GoodsSourceListItemView>> view = new View<List<GoodsSourceListItemView>>();
		
		try {
			List<GoodsSourceView> goodsSourceViewList = goodsSourceService.listByCond(param);
			List<GoodsSourceListItemView> goodsSourceListItemViewList = trans2GoodsSourceListItemViewList(goodsSourceViewList);
			
			view.setData(goodsSourceListItemViewList);
			return view;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			view.setMsg(e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

	private List<GoodsSourceListItemView> trans2GoodsSourceListItemViewList(List<GoodsSourceView> goodsSourceViewList) {
		if( goodsSourceViewList != null ){
			List<GoodsSourceListItemView> list = new ArrayList<GoodsSourceListItemView>();
			GoodsSourceListItemView view = null;
			for( GoodsSourceView goodsSourceView : goodsSourceViewList ){
				view = trans2GoodsSourceListItemView(goodsSourceView);
				if( view != null ){
					list.add(view);
				}
			}
			
			return list;
		}
		return null;
	}
	
	private GoodsSourceListItemView trans2GoodsSourceListItemView(GoodsSourceView goodsSourceView) {
		if( goodsSourceView == null ){
			return null;
		}
		GoodsSourceListItemView view = new GoodsSourceListItemView();
		
		view.setArrivalTime(goodsSourceView.getArrivalTime());
		view.setCarType(goodsSourceView.getCarType());
		view.setDeliveryAddress(goodsSourceView.getDeliveryAddress());
		view.setDeliveryCompany(goodsSourceView.getDeliveryCompany());
		view.setDepatureAreaName(goodsSourceView.getDepatureAreaName());
		view.setDepatureTime(goodsSourceView.getDepatureTime());
		view.setDestinationAreaName(goodsSourceView.getDestinationAreaName());
		view.setGoodsName(goodsSourceView.getGoodsName());
		view.setGoodsType(goodsSourceView.getGoodsType());
		view.setGoodsVolume(goodsSourceView.getGoodsVolume());
		view.setGoodsWeight(goodsSourceView.getGoodsWeight());
		view.setId(goodsSourceView.getId());
		view.setLingdanPrice(goodsSourceView.getLingdanPrice());
		view.setPublishTime(goodsSourceView.getPublishTime());
		view.setPublishTimeInt(goodsSourceView.getPublishTimeInt());
		view.setPublishUserId(goodsSourceView.getPublishUserId());
		view.setPublishUserNickname(goodsSourceView.getPublishUserNickname());
		view.setTransportType(goodsSourceView.getTransportType());
		view.setZhengchePrice(goodsSourceView.getZhengchePrice());
		
		return view;
	}

	@Override
	public View<GoodsSourceDetailView> loadGoodsSourceDetail(Integer goodsSourceId) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
