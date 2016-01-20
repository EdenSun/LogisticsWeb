package com.eden.logistics.common.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.common.dao.GoodsSourceMapper;
import com.eden.logistics.common.dao.GoodsSourceViewMapper;
import com.eden.logistics.common.domain.GoodsSource;
import com.eden.logistics.common.domain.GoodsSourceView;
import com.eden.logistics.common.domain.GoodsSourceViewExample;
import com.eden.logistics.common.dto.param.CreateGoodsSourceParam;
import com.eden.logistics.common.dto.param.ListGoodsSourceByCondParam;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.IGoodsSourceImageService;
import com.eden.logistics.common.service.IGoodsSourceService;
import com.eden.logistics.common.util.AssertUtil;
import com.eden.logistics.common.util.CurrencyHelper;
import com.eden.logistics.common.util.DateHelper;
import com.eden.logistics.common.util.VolumeHelper;
import com.eden.logistics.common.util.WeightHelper;

@Service
public class GoodsSourceServiceImpl implements IGoodsSourceService {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private GoodsSourceMapper goodsSourceMapper;
	@Autowired
	private GoodsSourceViewMapper goodsSourceViewMapper;
	@Autowired
	private IGoodsSourceImageService goodsSourceImageService;
	
	@Override	
	public void createGoodsSource(CreateGoodsSourceParam param) throws ServiceException {
		try {
			validateCreateGoodsSourceParam(param);
			
			GoodsSource goodsSource = trans2GoodsSource(param);
			this.save(goodsSource);
			
			// save goods source images
			List<Integer> imgIdList = param.getImgIdList();
			goodsSourceImageService.addGoodsSourceImage( goodsSource.getId(), imgIdList);
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new ServiceException(e.getMessage(),e);
		}
		
	}

	private void save(GoodsSource goodsSource) {
		if( goodsSource != null && goodsSource.getId() == null ){
			goodsSourceMapper.insertSelective(goodsSource);
		}
	}

	private GoodsSource trans2GoodsSource(CreateGoodsSourceParam param) {
		if( param == null ){
			return null;
		}
		GoodsSource goodsSource = new GoodsSource();
		
		goodsSource.setArrivalTime( DateHelper.parseDate( param.getArrivalTime() , "yyyy-MM-dd").getTime() );
		goodsSource.setDepatureTime( DateHelper.parseDate( param.getDepatureTime() , "yyyy-MM-dd").getTime() );
		goodsSource.setCarType(param.getCarType());
		goodsSource.setContactUserEmail(param.getContactUserEmail());
		goodsSource.setContactUserMobile(param.getContactUserMobile());
		goodsSource.setContactUserName(param.getContactUserName());
		goodsSource.setContactUserPhone(param.getContactUserPhone());
		goodsSource.setContactUserQq(param.getContactUserQq());
		goodsSource.setContactUserWechat(param.getContactUserWechat());
		goodsSource.setDeliveryAddress(param.getDeliveryAddress());
		goodsSource.setDeliveryCompany(param.getDeliveryCompany());
		goodsSource.setDepatureAreaId(param.getDepatureAreaId());
		goodsSource.setDestinationAreaId(param.getDestinationAreaId());
		goodsSource.setGoodsDescription(param.getGoodsDescription());
		goodsSource.setGoodsName(param.getGoodsName());
		goodsSource.setGoodsType(param.getGoodsType());
		goodsSource.setNeedCarNumber(param.getNeedCarNumber());
		goodsSource.setPublishUserId(param.getPublishUserId());
		goodsSource.setTransportType(param.getTransportType());
		goodsSource.setPublishTime(new Date().getTime());
		
		
		Float goodsVolume = param.getGoodsVolume();
		if( goodsVolume != null ){
			Integer goodsVolumeCc = VolumeHelper.cubicMeterToCubicCentimeter(goodsVolume);
			
			goodsSource.setGoodsVolume(goodsVolumeCc);
		}
		
		Float goodsWeight = param.getGoodsWeight();
		if( goodsWeight != null ){
			Integer goodsWeightGram = WeightHelper.tonToGram(goodsWeight);
			
			goodsSource.setGoodsWeight(goodsWeightGram);
		}
		
		
		Integer priceOfEveryTon = param.getPriceOfEveryTon();
		if( priceOfEveryTon != null ){
			Integer priceOfEveryTonFen = CurrencyHelper.yuanToFen(priceOfEveryTon);
			
			goodsSource.setPriceOfEveryTon(priceOfEveryTonFen);
		}
		
		Integer priceOfEveryVolume = param.getPriceOfEveryVolume();
		if( priceOfEveryVolume != null ){
			Integer priceOfEveryVolumeFen = CurrencyHelper.yuanToFen(priceOfEveryVolume);
			
			goodsSource.setPriceOfEveryVolume(priceOfEveryVolumeFen);
		}
		
		Integer lingDanPrice = param.getLingdanPrice();
		if( lingDanPrice != null ){
			Integer lingDanPriceFen = CurrencyHelper.yuanToFen(lingDanPrice);
			
			goodsSource.setLingdanPrice(lingDanPriceFen);
		}
		
		Integer zhengChePrice = param.getZhengchePrice();
		if( zhengChePrice != null ){
			Integer zhengChePriceFen = CurrencyHelper.yuanToFen(zhengChePrice);
			
			goodsSource.setZhengchePrice(zhengChePriceFen);
		}
		
		return goodsSource;
	}

	private void validateCreateGoodsSourceParam(CreateGoodsSourceParam param) {
		if( param == null ){
			throw new ServiceException("参数不可为空");
		}
		
		if( param.getDepatureAreaId() == null ){
			throw new ServiceException("请填写出发地");
		}
		
		if( param.getDestinationAreaId() == null ){
			throw new ServiceException("请填写目的地");
		}
		
		if( param.getDepatureTime() == null ){
			throw new ServiceException("请填写起运时间");
		}
		
		if( param.getArrivalTime() == null ){
			throw new ServiceException("请填写到达时间");
		}
		
		if( param.getTransportType() == null ){
			throw new ServiceException("请填写运输类型");
		}
		
		if( param.getGoodsName() == null ){
			throw new ServiceException("请填写货物名称");
		}
		
		if( param.getGoodsWeight() == null && param.getGoodsVolume() == null){
			throw new ServiceException("货物重量和货物体积至少要填写一个");
		}
		
		if( param.getLingdanPrice() == null && param.getZhengchePrice() == null ){
			throw new ServiceException("零担价格和整车价格至少填写一个");
		}
		
		if( param.getDeliveryCompany() == null ){
			throw new ServiceException("请填写发货单位");
		}
		
		if( param.getDeliveryAddress() == null ){
			throw new ServiceException("请填写发货地址");
		}
		
		if( param.getContactUserName() == null ){
			throw new ServiceException("请填写联系人姓名");
		}
		
		if( param.getContactUserMobile() == null ){
			throw new ServiceException("请填写联系人手机号");
		}
	}

	@Override
	public List<GoodsSourceView> listByCond(ListGoodsSourceByCondParam param) throws ServiceException {
		GoodsSourceViewExample example = trans2GoodsSourceViewExample(param);
		
		int pageSize = param.getPageSize();
		RowBounds rowBounds = new RowBounds(0, pageSize);
		List<GoodsSourceView> goodsSourceViewList = goodsSourceViewMapper.selectByExampleWithRowbounds(example, rowBounds);

		return goodsSourceViewList;
	}
	
	
	private GoodsSourceViewExample trans2GoodsSourceViewExample(ListGoodsSourceByCondParam param) {
		if( param == null ){
			return new GoodsSourceViewExample();
		}
		
		GoodsSourceViewExample example = new GoodsSourceViewExample();
		GoodsSourceViewExample.Criteria c = example.createCriteria();
		c.andPublishTimeIntLessThan(param.getOldestTime());
		
		if( AssertUtil.isNotEmpty(param.getDepatureAreaId()) ){
			c.andDepatureAreaIdEqualTo(param.getDepatureAreaId());
		}
		
		if( AssertUtil.isNotEmpty(param.getDestinationAreaId()) ){
			c.andDestinationAreaIdEqualTo(param.getDestinationAreaId());
		}
		
		if( AssertUtil.isNotEmpty(param.getCarTypeId()) ){
			c.andCarTypeIdEqualTo(param.getCarTypeId());
		}
		
		if( AssertUtil.isNotEmpty(param.getArrivalTime()) ){
			c.andArrivalTimeEqualTo(param.getArrivalTime());
		}
		
		if( AssertUtil.isNotEmpty(param.getDepatureTime()) ){
			c.andDepatureTimeEqualTo(param.getDepatureTime());
		}
		
		if( AssertUtil.isNotEmpty(param.getGoodsTypeId()) ){
			c.andGoodsTypeIdEqualTo(param.getGoodsTypeId());
		}
		if( AssertUtil.isNotEmpty(param.getTransportTypeId()) ){
			c.andTransportTypeIdEqualTo(param.getTransportTypeId());
		}
		
		example.setOrderByClause("PUBLISH_TIME_INT DESC");
		return example;
	}

	@Override
	public GoodsSource getById(Integer goodsSourceId) throws ServiceException {
		return goodsSourceMapper.selectByPrimaryKey(goodsSourceId);
	}

}
