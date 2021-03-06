package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.RichTextResult;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

/**
 * @Author fyx
 * @Time in 9:28 2018/7/9
 * @Despriction
 */
@Controller
@RequestMapping("rt")
public class RichTextController {

    @RequestMapping("/upload")
    @ResponseBody
    public RichTextResult uploadFiles(@RequestParam("myFiles")MultipartFile[] files, HttpServletRequest request){
        RichTextResult result = new RichTextResult();

        ArrayList<String> data = new ArrayList<String>();

        try {
            String realPath = request.getRealPath("");

            String uploadPath = realPath.substring(0,realPath.lastIndexOf("\\"))+"\\upload";

            if(files != null && files.length != 0){
                for (MultipartFile file: files) {
                    String fileName = UUID.randomUUID().toString()+"."+ FilenameUtils.getExtension(file.getOriginalFilename());
                    // 将上传的文件转存到服务器中存储
                    file.transferTo(new File(uploadPath+"\\"+fileName));

                    // 将上传的图片在服务器的url响应给客户端  图片回显
                    data.add(request.getContextPath()+"/upload/"+fileName);
                }
            }
            result.setErrno(0);
            result.setData(data);

        } catch (IOException e) {

            result.setErrno(1);
            e.printStackTrace();
        }

        return result;
    }

}
