package com.eden.logistics.common.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.logistics.common.dao.FileMapper;
import com.eden.logistics.common.domain.File;
import com.eden.logistics.common.exception.ServiceException;
import com.eden.logistics.common.service.IFileService;
import com.eden.logistics.common.util.AssertUtil;

@Service
public class FileServiceImpl implements IFileService {
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private FileMapper fileMapper;

	@Override
	public Integer save(String fileName, String alias, String path, long size, String suffix, Integer uploadUserId)
			throws ServiceException {
		try {
			File file = new File();
			file.setFileName(fileName);
			if (AssertUtil.isEmpty(alias)) {
				file.setAlias("Î´ÃüÃû");
			} else {
				file.setAlias(alias);
			}
			file.setPath(path);
			file.setSize((int) size);
			file.setSuffix(suffix);
			file.setCreateTime(new Date().getTime());
			file.setCreatorUserId(uploadUserId);
			this.saveOrUpdate(file);

			return file.getId();
		} catch (Exception e) {
			logger.error(e);
			throw new ServiceException(e);
		}
	}

	private void saveOrUpdate(File file) {
		if (file != null) {
			if (file.getId() == null) {
				fileMapper.insertSelective(file);
			} else {
				fileMapper.updateByPrimaryKeySelective(file);
			}
		}
	}
}
