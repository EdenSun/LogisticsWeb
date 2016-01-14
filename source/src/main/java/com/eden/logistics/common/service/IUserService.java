package com.eden.logistics.common.service;

import com.eden.logistics.common.domain.User;
import com.eden.logistics.common.domain.UserView;
import com.eden.logistics.common.dto.param.RegisterParam;
import com.eden.logistics.common.dto.view.LoginView;
import com.eden.logistics.common.exception.ServiceException;

public interface IUserService {

	LoginView login(String mobile, String password)throws ServiceException;

	void register(RegisterParam param)throws ServiceException;

	void getVerifyCode(String mobile)throws ServiceException;

	UserView getUserViewByMobile(String mobile)throws ServiceException;
	
	User getByMobile(String mobile)throws ServiceException;

	User getByAccessToken(String token)throws ServiceException;
}
