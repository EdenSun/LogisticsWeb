package com.eden.logistics.api.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eden.logistics.api.service.IApiAuthService;
import com.eden.logistics.common.dto.param.RegisterParam;
import com.eden.logistics.common.dto.view.LoginView;
import com.eden.logistics.common.dto.view.View;

@Controller
@RequestMapping("/api/auth")
public class ApiAuthController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private IApiAuthService apiAuthService;
	
	/**
	 * 用户登录
	 * @param mobile	手机号
	 * @param password	密码
	 * @return userhead,nickname,accessToken
	 */
	@RequestMapping("/login")
	public View<LoginView> login(String mobile,String password){
		View<LoginView> view = apiAuthService.login(mobile,password);
		
		return view;
	}
	
	/**
	 * 获取验证码
	 * @param mobile 手机号
	 * @return
	 */
	@RequestMapping("/getVerifyCode")
	public View<Boolean> getVerifyCode(String mobile){
		View<Boolean> view = apiAuthService.getVerifyCode(mobile);
		
		return view;
	}

	/**
	 * 用户注册
	 * @param mobile		手机号
	 * @param verifyCode	验证码
	 * @param nickname		昵称
	 * @param password		密码
	 * @return 
	 */
	@RequestMapping("/register")
	public View<Boolean> register(@ModelAttribute("param")RegisterParam param){
		View<Boolean> view = apiAuthService.register(param);

		return view;
	}
}
