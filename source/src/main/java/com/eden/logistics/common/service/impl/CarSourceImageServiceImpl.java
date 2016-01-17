package com.eden.logistics.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.common.dao.CarSourceImageMapper;
import com.eden.logistics.common.domain.CarSource;
import com.eden.logistics.common.domain.CarSourceImage;
import com.eden.logistics.common.domain.File;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.ICarSourceImageService;
import com.eden.logistics.common.service.ICarSourceService;
import com.eden.logistics.common.service.IFileService;

@Service
public class CarSourceImageServiceImpl implements ICarSourceImageService {
	@Autowired
	private IFileService fileService;
	@Autowired
	private ICarSourceService carSourceService;
	@Autowired
	private CarSourceImageMapper carSourceImageMapper;
	
	@Override
	public void addCarSourceImage(Integer carSourceId, List<Integer> imgIdList) throws ServiceException {
		if( carSourceId == null ){
			throw new ServiceException("参数car source id不可为空");
		}
		
		CarSource carSource = carSourceService.getById(carSourceId);
		if( carSource == null ){
			throw new ServiceException("车源不存在");
		}
		
		if( imgIdList != null ){
			for(Integer imgId : imgIdList ){
				File imgFile = fileService.getById(imgId);
				if( imgFile != null ){
					CarSourceImage img = new CarSourceImage();
					img.setCarSourceId(carSourceId);
					img.setImageFileId(imgId);
					
					this.save(img);
				}
			}
		}		
	}

	private void save(CarSourceImage img) {
		if( img != null && img.getId() == null ){
			carSourceImageMapper.insertSelective(img);
		}
	}

}
