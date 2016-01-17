package com.eden.logistics.common.service;


import com.eden.logistics.common.domain.File;
import com.eden.logistics.common.exception.ServiceException;

public interface IFileService {

	Integer save(String fileName, String alias, String path, long size,
			String suffix, Integer uploadUserId) throws ServiceException;

	File getById(Integer fileId)throws ServiceException;

}
