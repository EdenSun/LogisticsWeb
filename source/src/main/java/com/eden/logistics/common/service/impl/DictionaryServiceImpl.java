package com.eden.logistics.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.common.dao.DictionaryMapper;
import com.eden.logistics.common.domain.Dictionary;
import com.eden.logistics.common.domain.DictionaryExample;
import com.eden.logistics.common.service.IDictionaryService;

@Service
public class DictionaryServiceImpl implements IDictionaryService {
	@Autowired
	private DictionaryMapper dictionaryMpper;
	
	@Override
	public List<Dictionary> listByType(Integer type) {
		DictionaryExample example = new DictionaryExample();
		DictionaryExample.Criteria c = example.createCriteria();
		
		c.andTypeEqualTo(type);
		
		return dictionaryMpper.selectByExample(example);
	}

}
