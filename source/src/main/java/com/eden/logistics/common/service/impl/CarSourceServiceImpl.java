package com.eden.logistics.common.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.common.dao.CarSourceImageViewMapper;
import com.eden.logistics.common.dao.CarSourceMapper;
import com.eden.logistics.common.dao.CarSourceViewMapper;
import com.eden.logistics.common.domain.CarSource;
import com.eden.logistics.common.domain.CarSourceImageView;
import com.eden.logistics.common.domain.CarSourceImageViewExample;
import com.eden.logistics.common.domain.CarSourceView;
import com.eden.logistics.common.domain.CarSourceViewExample;
import com.eden.logistics.common.dto.param.CreateCarSourceParam;
import com.eden.logistics.common.dto.param.ListCarSourceByCondParam;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.ICarSourceImageService;
import com.eden.logistics.common.service.ICarSourceService;
import com.eden.logistics.common.service.IFileService;
import com.eden.logistics.common.util.AssertUtil;

@Service
public class CarSourceServiceImpl implements ICarSourceService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private CarSourceMapper carSourceMapper;

	@Autowired
	private CarSourceViewMapper carSourceViewMapper;
	
	@Autowired
	private IFileService FileService;
	
	@Autowired
	private ICarSourceImageService carSourceImageService;
	
	@Autowired
	private CarSourceImageViewMapper carSourceImageViewMapper;
	
	@Override
	public void createCarSource(CreateCarSourceParam param) throws ServiceException {
		try {
			validateCreateCarSourceParam(param);
			
			CarSource carSource = trans2CarSource(param);
			this.save(carSource);
			
			// save car source images
			List<Integer> imgIdList = param.getImgIdList();
			carSourceImageService.addCarSourceImage( carSource.getId(), imgIdList);
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new ServiceException(e.getMessage(),e);
		}
	}

	private CarSource trans2CarSource(CreateCarSourceParam param) {
		if( param == null ){
			return null;
		}
		CarSource carSource = new CarSource();
		carSource.setCarHeight(param.getCarHeight());
		carSource.setCarLength(param.getCarLength());
		carSource.setCarNumber(param.getCarNumber());
		carSource.setCarSourceDescription(param.getCarSourceDescription());
		carSource.setCarTonnage(param.getCarTonnage());
		carSource.setCarType(param.getCarType());
		carSource.setCarVolume(param.getCarVolume());
		carSource.setCarWidth(param.getCarWidth());
		carSource.setContactUserEmail(param.getContactUserEmail());
		carSource.setContactUserMobile(param.getContactUserMobile());
		carSource.setContactUserName(param.getContactUserName());
		carSource.setContactUserPhone(param.getContactUserPhone());
		carSource.setContactUserQq(param.getContactUserQq());
		carSource.setContactUserWechat(param.getContactUserWechat());
		carSource.setDepatureAreaId(param.getDepatureAreaId());
		carSource.setDestinationAreaId(param.getDestinationAreaId());
		carSource.setPublishTime(new Date().getTime());
		carSource.setPublishUserId(param.getPublishUserId());
		
		return carSource;
	}

	private void save(CarSource carSource) {
		if( carSource != null && carSource.getId() == null ){
			carSourceMapper.insertSelective(carSource);
		}
	}

	private void validateCreateCarSourceParam(CreateCarSourceParam param)throws ServiceException {
		if( param == null ){
			throw new ServiceException("参数不可为空");
		}
		
		if( param.getPublishUserId() == null ){
			throw new ServiceException("发布用户不存在");
		}
		
		if( param.getDepatureAreaId() == null ){
			throw new ServiceException("出发地不可为空");
		}
		
		if( param.getDestinationAreaId() == null ){
			throw new ServiceException("目的地不可为空");
		}
		
		if( param.getCarType() == null ){
			throw new ServiceException("车源类型不可为空");
		}
		
		if( param.getContactUserName() == null ){
			throw new ServiceException("联系人姓名不可为空");
		}
		if( param.getContactUserMobile() == null ){
			throw new ServiceException("联系人电话不可为空");
		}
	}

	@Override
	public List<CarSourceView> listByCond(ListCarSourceByCondParam param) throws ServiceException {
		CarSourceViewExample example = trans2CarSourceViewExample(param);
		
		int pageSize = param.getPageSize();
		RowBounds rowBounds = new RowBounds(0, pageSize);
		List<CarSourceView> carSourceViewList = carSourceViewMapper.selectByExampleWithRowbounds(example, rowBounds);

		return carSourceViewList;
	}

	private CarSourceViewExample trans2CarSourceViewExample(ListCarSourceByCondParam param) {
		if( param == null ){
			return new CarSourceViewExample();
		}
		CarSourceViewExample example = new CarSourceViewExample();
		CarSourceViewExample.Criteria c = example.createCriteria();
		c.andPublishTimeIntLessThan(param.getOldestTime());
		
		if( AssertUtil.isNotEmpty(param.getDepatureAreaId()) ){
			c.andDepatureAreaIdEqualTo(param.getDepatureAreaId());
		}
		
		if( AssertUtil.isNotEmpty(param.getDestinationAreaId()) ){
			c.andDestinationAreaIdEqualTo(param.getDestinationAreaId());
		}
		
		if( AssertUtil.isNotEmpty(param.getCarType()) ){
			c.andCarTypeIdEqualTo(param.getCarType());
		}
		
		
		example.setOrderByClause("PUBLISH_TIME_INT DESC");
		return example;
	}

	@Override
	public CarSourceView getCarSourceViewById(Integer carSourceId) throws ServiceException {
		if( carSourceId == null ){
			throw new ServiceException("Car Source ID不可为空");
		}
		
		CarSourceViewExample example = new CarSourceViewExample();
		CarSourceViewExample.Criteria c = example.createCriteria();
		
		c.andIdEqualTo(carSourceId);
		
		List<CarSourceView> list = carSourceViewMapper.selectByExample(example);
		if( list != null && list.size() > 0 ){
			return list.get(0);
		}
		return null;
	}

	@Override
	public CarSource getById(Integer carSourceId) throws ServiceException {
		return carSourceMapper.selectByPrimaryKey(carSourceId);
	}

	@Override
	public List<CarSourceImageView> listCarSourceImageViewByCarSourceId(Integer carSourceId) throws ServiceException {
		CarSourceImageViewExample example = new CarSourceImageViewExample();
		CarSourceImageViewExample.Criteria c = example.createCriteria();
		
		c.andCarSourceIdEqualTo(carSourceId);
		
		List<CarSourceImageView> list = carSourceImageViewMapper.selectByExampleWithBLOBs(example);
		
		return list;
	}

	
}
