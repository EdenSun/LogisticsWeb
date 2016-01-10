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
	 * �û���¼
	 * @param mobile	�ֻ���
	 * @param password	����
	 * @return userhead,nickname,accessToken
	 */
	@RequestMapping("/login")
	public View<LoginView> login(String mobile,String password){
		View<LoginView> view = apiAuthService.login(mobile,password);
		
		return view;
	}
	
	/**
	 * ��ȡ��֤��
	 * @param mobile �ֻ���
	 * @return
	 */
	@RequestMapping("/getVerifyCode")
	public View<Boolean> getVerifyCode(String mobile){
		View<Boolean> view = apiAuthService.getVerifyCode(mobile);
		
		return view;
	}

	/**
	 * �û�ע��
	 * @param mobile		�ֻ���
	 * @param verifyCode	��֤��
	 * @param nickname		�ǳ�
	 * @param password		����
	 * @return 
	 */
	@RequestMapping("/register")
	public View<Boolean> register(@ModelAttribute("param")RegisterParam param){
		View<Boolean> view = apiAuthService.register(param);

		return view;
	}
}
