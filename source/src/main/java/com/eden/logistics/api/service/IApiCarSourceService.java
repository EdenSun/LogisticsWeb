package com.eden.logistics.api.service;

import java.util.List;

import com.eden.logistics.api.dto.view.CarSourceListItemView;
import com.eden.logistics.common.dto.param.CreateCarSourceParam;
import com.eden.logistics.common.dto.param.ListCarSourceByCondParam;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.exception.ServiceException;

public interface IApiCarSourceService {

	View<Boolean> create(String token ,CreateCarSourceParam param)throws ServiceException;

	View<List<CarSourceListItemView>> listByCond(ListCarSourceByCondParam param)throws ServiceException;

}
