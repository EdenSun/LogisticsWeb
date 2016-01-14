package com.eden.logistics.common.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.common.dao.UserMapper;
import com.eden.logistics.common.dao.UserViewMapper;
import com.eden.logistics.common.domain.User;
import com.eden.logistics.common.domain.UserExample;
import com.eden.logistics.common.domain.UserView;
import com.eden.logistics.common.domain.UserViewExample;
import com.eden.logistics.common.dto.param.RegisterParam;
import com.eden.logistics.common.dto.view.LoginView;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.IUserService;
import com.eden.logistics.common.util.DateHelper;
import com.eden.logistics.common.util.RadomNumberHelper;

@Service
public class UserServiceImpl implements IUserService {
	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserViewMapper userViewMapper;
	
	@Override
	public LoginView login(String mobile, String password) {
		try {
			if( mobile == null ){
				throw new ServiceException("手机号不可为空");
			}
			
			if( password == null ){
				throw new ServiceException("密码不可为空");
			}
			
			UserView userView = getUserViewByMobile(mobile);
			if( userView == null ){
				throw new ServiceException("用户不存在,请检查手机号是否正确");
			}
			
			if( userView.getPassword() != null && userView.getPassword().equals(password) ){
				LoginView loginView = new LoginView();
				loginView.setAccessToken(userView.getAccessToken());
				loginView.setNickname(userView.getNickname());
				loginView.setUserhead(userView.getUserHead());
				
				return loginView;
			}else{
				throw new ServiceException("用户名或密码不正确");
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(e.getMessage(),e);
		}
	}


	@Override
	public void register(RegisterParam param) {
		if( param.getMobile() == null ){
			throw new ServiceException("手机号不可为空");
		}
		
		if( param.getNickname() == null ){
			throw new ServiceException("昵称不可为空");
		}
		
		if( param.getPassword() == null ){
			throw new ServiceException("密码不可为空");
		}
		
		if( param.getVerifyCode() == null ){
			throw new ServiceException("验证码不可为空");
		}
		
		User user = getByMobile(param.getMobile());
		if( user == null ){
			throw new ServiceException("手机验证异常，请重新验证");
		}
		
		if( user.getVerifyCode() == null ){
			throw new ServiceException("手机验证码异常，请重新验证");
		}
		
		if( !param.getVerifyCode().equals(user.getVerifyCode()) ){
			throw new ServiceException("验证码不正确，请重新输入");
		}
		
		//注册
		user.setNickname(param.getNickname());
		user.setMobile(param.getMobile());
		user.setPassword(param.getPassword());
		user.setRegisterTime(new Date().getTime());
		user.setVerifyCode(null);
		user.setVerifyCodeGenerateTime(null);
		update(user);
	}



	@Override
	public void getVerifyCode(String mobile) {
		try {
			if( mobile == null ){
				throw new ServiceException("手机号不可为空");
			}
			
			User user = getByMobile(mobile);
			if( user == null ){
				user = initUserByMobile(mobile);
			}
			
			Date now = new Date();
			if( user != null && user.getVerifyCodeGenerateTime() != null ){
				long secondDiff = DateHelper.secondDiff( new Date(user.getVerifyCodeGenerateTime()), now);
				if( secondDiff < 60 ){
					throw new ServiceException("获取验证码过于频繁，请1分钟后再试");
				}
			}
			
			String verifyCode = String.valueOf(RadomNumberHelper.get6BitRadomNumber());
			user.setVerifyCode(verifyCode);
			user.setVerifyCodeGenerateTime(now.getTime());
			update(user);
			
			/*String content = TemplateUtil.replace(TemplateConstants.STUDENT_REGISTER_SMS_CONTENT,1,verifyCode);
			SMSHelper.sendSms(mobile, content);*/
			//TODO: 发送短信		
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(e.getMessage(),e);
		}
		
	}

	

	@Override
	public UserView getUserViewByMobile(String mobile) throws ServiceException {
		UserViewExample example = new UserViewExample();
		UserViewExample.Criteria c = example.createCriteria();
		
		if( mobile != null ){
			c.andMobileEqualTo(mobile);
		}
		
		List<UserView> list = userViewMapper.selectByExampleWithBLOBs(example);
		if( list != null && list.size() > 0 ){
			return list.get(0);
		}
		return null;
	}


	@Override
	public User getByMobile(String mobile) throws ServiceException {
		UserExample example = new UserExample();
		UserExample.Criteria c = example.createCriteria();
		
		if( mobile != null ){
			c.andMobileEqualTo(mobile);
		}
		
		List<User> list = userMapper.selectByExample(example);
		if( list != null && list.size() > 0 ){
			return list.get(0);
		}
		return null;
	}


	private void update(User user)throws ServiceException {
		if( user != null && user.getId() != null ){
			userMapper.updateByPrimaryKey(user);
		}
	}


	private User initUserByMobile(String mobile) {
		User user = new User();
		user.setMobile(mobile);
		userMapper.insertSelective(user);
		
		return user;
	}


	@Override
	public User getByAccessToken(String token) throws ServiceException {
		UserExample example = new UserExample();
		UserExample.Criteria c = example.createCriteria();
		
		c.andAccessTokenEqualTo(token);
		
		List<User> list = userMapper.selectByExample(example);
		if( list != null && list.size() > 0 ){
			return list.get(0);
		}
		return null;
	}
	
}
