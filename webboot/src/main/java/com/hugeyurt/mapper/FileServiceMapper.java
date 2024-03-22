package com.hugeyurt.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.hugeyurt.po.FileInfo;

public interface FileServiceMapper extends BaseMapper<FileInfo>
{
	/*@Insert("insert into fileinfo(fileID,fileName,fileSize,filePath,"
			+ "fileType,stuID)values(#{fileID},#{fileName},#{fileSize},"
			+ "#{filePath},#{fileType},#{stuID})")
	public boolean save(FileInfo fileInfo);

	@Select("select * from fileInfo")
	public List<FileInfo> getAllFileInfo();
	
	@Select("select * from fileinfo where fileID=#{fileID}")
	public FileInfo getFileInfoByID(String fileID);
   */
}
