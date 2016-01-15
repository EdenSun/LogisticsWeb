package com.eden.logistics.common.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.common.dao.CarSourceMapper;
import com.eden.logistics.common.dao.CarSourceViewMapper;
import com.eden.logistics.common.domain.CarSource;
import com.eden.logistics.common.domain.CarSourceView;
import com.eden.logistics.common.domain.CarSourceViewExample;
import com.eden.logistics.common.dto.param.CreateCarSourceParam;
import com.eden.logistics.common.dto.param.ListCarSourceByCondParam;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.ICarSourceService;
import com.eden.logistics.common.util.AssertUtil;
import com.eden.logistics.common.util.PagerUtil;

@Service
public class CarSourceServiceImpl implements ICarSourceService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private CarSourceMapper carSourceMapper;

	@Autowired
	private CarSourceViewMapper carSourceViewMapper;
	
	@Override
	public void createCarSource(CreateCarSourceParam param) throws ServiceException {
		try {
			validateCreateCarSourceParam(param);
			
			CarSource carSource = trans2CarSource(param);
			this.save(carSource);
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
			throw new ServiceException("��������Ϊ��");
		}
		
		if( param.getPublishUserId() == null ){
			throw new ServiceException("�����û�������");
		}
		
		if( param.getDepatureAreaId() == null ){
			throw new ServiceException("�����ز���Ϊ��");
		}
		
		if( param.getDestinationAreaId() == null ){
			throw new ServiceException("Ŀ�ĵز���Ϊ��");
		}
		
		if( param.getCarType() == null ){
			throw new ServiceException("��Դ���Ͳ���Ϊ��");
		}
		
		if( param.getContactUserName() == null ){
			throw new ServiceException("��ϵ����������Ϊ��");
		}
		if( param.getContactUserMobile() == null ){
			throw new ServiceException("��ϵ�˵绰����Ϊ��");
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
			throw new ServiceException("Car Source ID����Ϊ��");
		}
		
		//CarSourceView carSourceView = 
		return null;
	}

}
