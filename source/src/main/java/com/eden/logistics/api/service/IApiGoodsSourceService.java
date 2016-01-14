package com.eden.logistics.api.service;

import java.util.List;

import com.eden.logistics.api.dto.view.GoodsSourceListItemView;
import com.eden.logistics.common.dto.param.CreateGoodsSourceParam;
import com.eden.logistics.common.dto.param.ListGoodsSourceByCondParam;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.exception.ServiceException;

public interface IApiGoodsSourceService {

	View<Boolean> create(String token,CreateGoodsSourceParam param)throws ServiceException;

	View<List<GoodsSourceListItemView>> listByCond(ListGoodsSourceByCondParam param)throws ServiceException;

}
