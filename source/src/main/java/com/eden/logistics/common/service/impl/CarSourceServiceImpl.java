package com.eden.logistics.common.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.common.dao.CarSourceMapper;
import com.eden.logistics.common.service.ICarSourceService;

@Service
public class CarSourceServiceImpl implements ICarSourceService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private CarSourceMapper carSourceMapper;
	
}
