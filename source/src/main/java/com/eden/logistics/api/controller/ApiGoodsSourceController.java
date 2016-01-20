package com.eden.logistics.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eden.logistics.api.dto.view.GoodsSourceDetailView;
import com.eden.logistics.api.dto.view.GoodsSourceListItemView;
import com.eden.logistics.api.service.IApiGoodsSourceService;
import com.eden.logistics.common.dto.param.CreateGoodsSourceParam;
import com.eden.logistics.common.dto.param.ListGoodsSourceByCondParam;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.util.Constants;
import com.eden.logistics.common.util.ListUtil;

@Controller
@RequestMapping("/api/goodssource")
public class ApiGoodsSourceController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private IApiGoodsSourceService apiGoodsSourceService;
	
	@RequestMapping("/create")
	public View<Boolean> create(String imgIdListStr , @ModelAttribute("param")CreateGoodsSourceParam param){
		String token = request.getHeader(Constants.HTTP_HEAD_KEY_ACCESS_TOKEN);
		
		List<Integer> imageIdList = ListUtil.separateStringToIntList(imgIdListStr, ",");
		param.setImgIdList(imageIdList);
		
		View<Boolean> view = apiGoodsSourceService.create(token,param);
		
		return view;
	}
	
	@RequestMapping("/listByCond")
	public View<List<GoodsSourceListItemView>> listByCond(@ModelAttribute("param")ListGoodsSourceByCondParam param){
		String token = request.getHeader(Constants.HTTP_HEAD_KEY_ACCESS_TOKEN);
		
		View<List<GoodsSourceListItemView>> view = apiGoodsSourceService.listByCond(param);
		
		return view;
	}
	
	@RequestMapping("/loadGoodsSourceDetail")
	public View<GoodsSourceDetailView> loadGoodsSourceDetail(Integer goodsSourceId){
		View<GoodsSourceDetailView> view = apiGoodsSourceService.loadGoodsSourceDetail(goodsSourceId);
		
		return view;
	}
}
