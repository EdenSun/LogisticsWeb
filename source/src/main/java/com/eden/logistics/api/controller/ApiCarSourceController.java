package com.eden.logistics.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eden.logistics.api.dto.view.CarSourceListItemView;
import com.eden.logistics.api.service.IApiCarSourceService;
import com.eden.logistics.common.dto.param.CreateCarSourceParam;
import com.eden.logistics.common.dto.param.ListCarSourceByCondParam;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.util.Constants;

@Controller
@RequestMapping("/api/carsource")
public class ApiCarSourceController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private IApiCarSourceService apiCarSourceService;
	
	@RequestMapping("/create")
	public View<Boolean> create(@ModelAttribute("param")CreateCarSourceParam param){
		String token = request.getHeader(Constants.HTTP_HEAD_KEY_ACCESS_TOKEN);
		
		View<Boolean> view = apiCarSourceService.create(token,param);
		
		return view;
	}
	
	@RequestMapping("/listByCond")
	public View<List<CarSourceListItemView>> listByCond(@ModelAttribute("param")ListCarSourceByCondParam param){
		String token = request.getHeader(Constants.HTTP_HEAD_KEY_ACCESS_TOKEN);
		
		View<List<CarSourceListItemView>> view = apiCarSourceService.listByCond(param);
		
		return view;
	}
}
