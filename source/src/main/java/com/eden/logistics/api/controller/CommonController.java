package com.eden.logistics.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.eden.logistics.api.dto.view.DictionaryView;
import com.eden.logistics.api.dto.view.UploadView;
import com.eden.logistics.api.service.IApiCommonService;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.util.Constants;

@Controller
@RequestMapping("/api/common")
public class CommonController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private IApiCommonService apiCommonService;
	
	@RequestMapping("/uploadImage")
	@ResponseBody
	public View<UploadView> uploadImage(@RequestParam("file") CommonsMultipartFile file){
		String token = request.getHeader(Constants.HTTP_HEAD_KEY_ACCESS_TOKEN);
		
		View<UploadView> view = apiCommonService.uploadImage(token,file);
		
		return view;
	}
	
	
	@RequestMapping("/listDictionaryByType")
	@ResponseBody
	public View<List<DictionaryView>> listDictionaryByType(Integer type){
		View<List<DictionaryView>> view = apiCommonService.listDictionaryByType(type);
		
		return view;
	}
}
