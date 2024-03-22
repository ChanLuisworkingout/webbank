package com.hugeyurt.controller;

import com.hugeyurt.po.FileInfo;
import com.hugeyurt.service.FileService;
import com.hugeyurt.vo.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FileController
{

      @Autowired
     private FileService  fileService;

      @GetMapping("test")
      public List<FileInfo> viewall()
      {
          return (List<FileInfo>)fileService.querygetAllFiles(null);
      }

    @GetMapping("view.do")
    public PageInfo getAllFile(PageInfo pageInfo)
    {
        return (PageInfo)fileService.querygetAllFiles(pageInfo);
    }


    @GetMapping("reg")
    public Boolean save(FileInfo fileInfo)
   {
      return  fileService.save(fileInfo);
   }

}
