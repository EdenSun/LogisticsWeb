package com.eden.logistics.api.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.eden.logistics.api.dto.view.DictionaryView;
import com.eden.logistics.api.dto.view.UploadView;
import com.eden.logistics.api.service.IApiCommonService;
import com.eden.logistics.common.domain.Dictionary;
import com.eden.logistics.common.domain.User;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.IDictionaryService;
import com.eden.logistics.common.service.IFileService;
import com.eden.logistics.common.service.IUserService;
import com.eden.logistics.common.util.DateUtil;
import com.eden.logistics.common.util.FileHelper;
import com.eden.logistics.common.util.FtpUtil;

@Service
public class ApiCommonServiceImpl implements IApiCommonService{
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IFileService fileService;

	@Autowired
	private IDictionaryService dictionaryService;
	
	@Override
	public View<UploadView> uploadImage(String token, CommonsMultipartFile file) throws ServiceException {
		View<UploadView> view = new View<UploadView>();
		try {
			UploadView uploadView = new UploadView();
			User user = userService.getByAccessToken(token);
			if( user == null ){
				throw new ServiceException("无权操作，请重新登录");
			}
			
			String suffix = FileHelper.getSuffix(file.getOriginalFilename());
			Date now = new Date();
			String path = DateUtil.getYear(now) + "/" + DateUtil.getMonth(now) ;
			String fileName = FileHelper.getUniqueFileName(suffix);
			FtpUtil.upload(file.getInputStream(), path, fileName);
			
			Integer fileId = fileService.save(fileName, null /*alias*/, path + "/" + fileName, file.getSize(), suffix, user.getId());
			
			uploadView.setFileId(fileId);
			
			logger.info("----------- 返回图片地址：" + FtpUtil.FTP_HTTP_BASE_URL + path + "/" + fileName );
			uploadView.setUrl(FtpUtil.FTP_HTTP_BASE_URL + path + "/" + fileName );
			view.setData(uploadView);
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

	@Override
	public View<List<DictionaryView>> listDictionaryByType(Integer type) throws ServiceException {
		View<List<DictionaryView>> view = new View<List<DictionaryView>>();
		
		try {
			List<Dictionary> dicList = dictionaryService.listByType(type);
			List<DictionaryView> dicViewList = trans2DictionaryViewList(dicList);
			
			view.setData(dicViewList);
			return view;
		} catch (Exception e) {
			logger.error(e);
			view.setMsg(e.getMessage());
			view.setSuccess(false);
			return view;
		}
	}

	private List<DictionaryView> trans2DictionaryViewList(List<Dictionary> dicList) {
		if( dicList == null ){
			return null;
		}
		List<DictionaryView> list = new ArrayList<DictionaryView>();
		DictionaryView view = null;
		for( Dictionary dic: dicList ){
			view = trans2DictionaryView(dic);
			if( view != null ){
				list.add(view);
			}
		}
		
		return list;
	}

	private DictionaryView trans2DictionaryView(Dictionary dic) {
		if( dic == null ){
			return null;
		}
		DictionaryView view = new DictionaryView();
		view.setId(dic.getId());
		view.setType(dic.getType());
		view.setValue(dic.getValue());
		return view;
	}

	
}
