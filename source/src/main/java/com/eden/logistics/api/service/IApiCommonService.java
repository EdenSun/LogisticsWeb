package com.eden.logistics.api.service;

import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.eden.logistics.api.dto.view.DictionaryView;
import com.eden.logistics.api.dto.view.UploadView;
import com.eden.logistics.common.dto.view.View;
import com.eden.logistics.common.exception.ServiceException;

public interface IApiCommonService {

	View<UploadView> uploadImage(String token, CommonsMultipartFile file)throws ServiceException;

	View<List<DictionaryView>> listDictionaryByType(Integer type)throws ServiceException;

}
