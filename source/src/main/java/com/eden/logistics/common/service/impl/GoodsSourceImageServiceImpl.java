package com.eden.logistics.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.common.dao.GoodsSourceImageMapper;
import com.eden.logistics.common.domain.File;
import com.eden.logistics.common.domain.GoodsSource;
import com.eden.logistics.common.domain.GoodsSourceImage;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.IFileService;
import com.eden.logistics.common.service.IGoodsSourceImageService;
import com.eden.logistics.common.service.IGoodsSourceService;

@Service
public class GoodsSourceImageServiceImpl implements IGoodsSourceImageService {
	@Autowired
	private GoodsSourceImageMapper goodsSourceImageMapper;
	@Autowired 
	private IGoodsSourceService goodsSourceService;
	@Autowired
	private IFileService fileService;
	
	@Override
	public void addGoodsSourceImage(Integer goodsSourceId, List<Integer> imgIdList) throws ServiceException {
		if (goodsSourceId == null) {
			throw new ServiceException("参数goods source id不可为空");
		}

		GoodsSource goodsSource = goodsSourceService.getById(goodsSourceId);
		if (goodsSource == null) {
			throw new ServiceException("货源不存在");
		}

		if (imgIdList != null) {
			for (Integer imgId : imgIdList) {
				File imgFile = fileService.getById(imgId);
				if (imgFile != null) {
					GoodsSourceImage img = new GoodsSourceImage();
					img.setGoodsSourceId(goodsSourceId);
					img.setImageFileId(imgId);

					this.save(img);
				}
			}
		}
	}

	private void save(GoodsSourceImage img) {
		if (img != null && img.getId() == null) {
			goodsSourceImageMapper.insertSelective(img);
		}
	}
}
