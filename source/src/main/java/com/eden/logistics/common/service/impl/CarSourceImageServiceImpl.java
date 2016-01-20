package com.eden.logistics.common.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.common.dao.CarSourceImageMapper;
import com.eden.logistics.common.dao.CarSourceImageViewMapper;
import com.eden.logistics.common.domain.CarSource;
import com.eden.logistics.common.domain.CarSourceImage;
import com.eden.logistics.common.domain.CarSourceImageView;
import com.eden.logistics.common.domain.CarSourceImageViewExample;
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
	@Autowired
	private CarSourceImageViewMapper carSourceImageViewMapper;
	
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

	@Override
	public String getFirstImageUrl(Integer carSourceId) throws ServiceException {
		if( carSourceId == null ){
			throw new ServiceException("Car Source Id 不可为空");
		}
		
		CarSourceImageViewExample example = new CarSourceImageViewExample();
		CarSourceImageViewExample.Criteria c = example.createCriteria();

		c.andCarSourceIdEqualTo(carSourceId);
		
		RowBounds rowBounds = new RowBounds(0,1);
		List<CarSourceImageView> list = carSourceImageViewMapper.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);
		if( list != null && list.size() > 0 ){
			return list.get(0).getImgFilePath();
		}
		
		return null;
	}

}
