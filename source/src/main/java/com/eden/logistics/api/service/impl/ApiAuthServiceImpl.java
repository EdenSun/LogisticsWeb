package com.eden.logistics.api.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.api.service.IApiAuthService;
import com.eden.logistics.common.dto.param.RegisterParam;
import com.eden.logistics.common.dto.view.LoginView;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.IUserService;

@Service
public class ApiAuthServiceImpl implements IApiAuthService {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IUserService userService;
	
	@Override
	public View<LoginView> login(String mobile, String password) throws ServiceException {
		View<LoginView> view = new View<LoginView>();
		
		try {
			LoginView loginView = userService.login(mobile,password);
		
			view.setData(loginView);
			return view;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			view.setMsg("登录失败," + e.getMessage());
			view.setSuccess(false);
			return view;
		}
		
	}

	@Override
	public View<Boolean> getVerifyCode(String mobile) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		try {
			userService.getVerifyCode(mobile);
			
			view.setData(true);
			return view;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			view.setData(false);
			view.setMsg("获取验证码失败," + e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

	@Override
	public View<Boolean> register(RegisterParam param) throws ServiceException {
		View<Boolean> view = new View<Boolean>();
		
		try {
			userService.register(param);
			
			view.setData(true);
			return view;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			view.setData(false);
			view.setMsg("注册失败," + e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

}
