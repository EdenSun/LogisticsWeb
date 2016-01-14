package com.eden.logistics.common.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.common.dao.GoodsSourceMapper;
import com.eden.logistics.common.domain.GoodsSource;
import com.eden.logistics.common.dto.param.CreateGoodsSourceParam;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.IGoodsSourceService;
import com.eden.logistics.common.util.CurrencyHelper;
import com.eden.logistics.common.util.DateHelper;
import com.eden.logistics.common.util.VolumeHelper;
import com.eden.logistics.common.util.WeightHelper;

@Service
public class GoodsSourceServiceImpl implements IGoodsSourceService {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private GoodsSourceMapper goodsSourceMapper;
	
	@Override	
	public void createGoodsSource(CreateGoodsSourceParam param) throws ServiceException {
		try {
			validateCreateGoodsSourceParam(param);
			
			GoodsSource goodsSource = trans2GoodsSource(param);
			this.save(goodsSource);
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
		
		goodsSource.setArrivalTime( DateHelper.parseDate( param.getArrivalTime() , "yyyy-MM-dd") );
		goodsSource.setDepatureTime( DateHelper.parseDate( param.getDepatureTime() , "yyyy-MM-dd") );
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
			throw new ServiceException("��������Ϊ��");
		}
		
		if( param.getDepatureAreaId() == null ){
			throw new ServiceException("����д������");
		}
		
		if( param.getDestinationAreaId() == null ){
			throw new ServiceException("����дĿ�ĵ�");
		}
		
		if( param.getDepatureTime() == null ){
			throw new ServiceException("����д����ʱ��");
		}
		
		if( param.getArrivalTime() == null ){
			throw new ServiceException("����д����ʱ��");
		}
		
		if( param.getTransportType() == null ){
			throw new ServiceException("����д��������");
		}
		
		if( param.getGoodsName() == null ){
			throw new ServiceException("����д��������");
		}
		
		if( param.getGoodsWeight() == null && param.getGoodsVolume() == null){
			throw new ServiceException("���������ͻ����������Ҫ��дһ��");
		}
		
		if( param.getLingdanPrice() == null && param.getZhengchePrice() == null ){
			throw new ServiceException("�㵣�۸�������۸�������дһ��");
		}
		
		if( param.getDeliveryCompany() == null ){
			throw new ServiceException("����д������λ");
		}
		
		if( param.getDeliveryAddress() == null ){
			throw new ServiceException("����д������ַ");
		}
		
		if( param.getContactUserName() == null ){
			throw new ServiceException("����д��ϵ������");
		}
		
		if( param.getContactUserMobile() == null ){
			throw new ServiceException("����д��ϵ���ֻ���");
		}
	}

}
