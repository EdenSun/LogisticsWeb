package com.eden.logistics.common.service;

import java.util.List;

import com.eden.logistics.common.domain.Dictionary;

public interface IDictionaryService {

	List<Dictionary> listByType(Integer type);

}
