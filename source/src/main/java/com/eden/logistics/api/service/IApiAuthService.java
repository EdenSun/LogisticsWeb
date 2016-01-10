package com.eden.logistics.api.service;

import com.eden.logistics.common.dto.param.RegisterParam;
import com.eden.logistics.common.dto.view.LoginView;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.exception.ServiceException;

public interface IApiAuthService {

	View<LoginView> login(String mobile, String password)throws ServiceException;

	View<Boolean> getVerifyCode(String mobile)throws ServiceException;

	View<Boolean> register(RegisterParam param)throws ServiceException;

}
