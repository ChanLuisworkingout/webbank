package com.hugeyurt.service.impl;

import java.util.List;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hugeyurt.vo.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugeyurt.mapper.FileServiceMapper;
import com.hugeyurt.po.FileInfo;
import com.hugeyurt.service.FileService;


@Service
public class FileServiceImpl implements FileService
{
	@Autowired
	private FileServiceMapper  fileServiceMapper;

	@Override
	public boolean save(FileInfo fileInfo) {
		// TODO Auto-generated method stub
		return fileServiceMapper.insert(fileInfo)>0;
	}

	@Override
	public FileInfo getFileByID(String fileID) {
		// TODO Auto-generated method stub
		return fileServiceMapper.selectById(fileID);
	}

	@Override
	public Object querygetAllFiles(PageInfo pageInfo) {

		// TODO Auto-generated method stub
		QueryWrapper queryWrapper=new QueryWrapper();
		//queryWrapper.eq
		return fileServiceMapper.selectList(null);

	}

}
