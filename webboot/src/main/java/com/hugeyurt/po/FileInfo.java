package com.hugeyurt.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("fileInfo")
public class FileInfo  implements Serializable
{
	@TableId(type=IdType.ASSIGN_UUID)
	private String fileID;

	@TableField("fileName")
	private String fileName;
	private String fileType;
	private Long fileSize;
	private String filePath;
	private String stuID;

	

}
