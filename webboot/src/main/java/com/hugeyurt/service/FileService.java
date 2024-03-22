package com.hugeyurt.service;

import java.util.List;

import com.hugeyurt.po.FileInfo;
import com.hugeyurt.vo.PageInfo;


public interface FileService
{
	public boolean save(FileInfo fileInfo);
	public FileInfo getFileByID(String fileID);
	
	public  Object querygetAllFiles(PageInfo pageInfo);
}
