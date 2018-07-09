package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.SlideShow;
import com.baizhi.cmfz.service.SlideShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * @Author fyx
 * @Time in 9:00 2018/7/6
 * @Despriction
 */
@Controller
@RequestMapping("/slideShow")
public class SlideShowController {

    @Autowired
    private SlideShowService sss;

    @RequestMapping("/add")
    public void addSlideShow(MultipartFile myFile , String pictureDescription , Boolean showPic) throws IOException {
        System.out.println(myFile + "---" + new Date() + "---" + pictureDescription + "---" + showPic);
        // 存储上传的文件
        String uuidName = UUID.randomUUID().toString().replace("-" ,"");

        String oldName = myFile.getOriginalFilename();

        String suffix = oldName.substring(oldName.lastIndexOf("."));

        myFile.transferTo(new File("E:\\Baizhi\\2_JavaWeb\\4_Servlet\\Jars\\apache-tomcat-7.0.81\\webapps\\upload\\"+uuidName+suffix));

        String state = "";
        // 处理状态
        if(showPic){
            state = "展示中";
        }else{
            state = "不展示";
        }

        String picturePath = "\\upload\\"+uuidName+suffix;

        SlideShow slideShow = new SlideShow(picturePath,new Date(),pictureDescription,state);

        sss.addSlideShow(slideShow);
    }

    public void removeSlideShow(SlideShow slideShow){

    }

    public void deleteSlideShow(SlideShow slideShow){

    }

    @RequestMapping("/show")
    @ResponseBody
    public Map<String, Object> showAllSlideShow(@RequestParam("page") Integer pageIndex , @RequestParam("rows") Integer step){
        System.out.println(step);
        return sss.querySlideShow(pageIndex, step);
    }

    public SlideShowService getSss() {
        return sss;
    }

    public void setSss(SlideShowService sss) {
        this.sss = sss;
    }
}
