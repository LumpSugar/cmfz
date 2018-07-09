package com.baizhi.cmfz.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.baizhi.cmfz.entity.Guru;
import com.baizhi.cmfz.service.GuruService;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @Author fyx
 * @Time in 22:56 2018/7/7
 * @Despriction
 */
@Controller
@RequestMapping("/guru")
public class GuruController {
    @Autowired
    private GuruService gs;

    @RequestMapping("addGuru")
    @ResponseBody
    public void addGuru(MultipartFile myFile , String religiousName, String guruIntro) throws IOException {
        System.out.println(myFile + "---" +religiousName +"---" +guruIntro);
        // 存储上传的文件
        String uuidName = UUID.randomUUID().toString().replace("-" ,"");

        String oldName = myFile.getOriginalFilename();

        String suffix = oldName.substring(oldName.lastIndexOf("."));

        myFile.transferTo(new File("E:\\Baizhi\\2_JavaWeb\\4_Servlet\\Jars\\apache-tomcat-7.0.81\\webapps\\upload\\"+uuidName+suffix));

        String guruPhoto = "\\upload\\"+uuidName+suffix;

        Guru guru = new Guru(religiousName,guruPhoto,guruIntro);

        gs.addGuru(guru);

    }

    @RequestMapping("removeGuru")
    @ResponseBody
    public void removeGuru(Integer id){
        gs.removeGuru(id);
    }

    @RequestMapping("/modifyGuru")
    public void modifyGuru(Guru guru){
        System.out.println(guru);
        gs.modifyGuru(guru);
    }

    @RequestMapping("showAllGuru")
    public @ResponseBody Map<String,Object> showAllGuru(@RequestParam("page") Integer pageIndex , @RequestParam("rows") Integer step){

        return gs.queryAllGuru(pageIndex,step);
    }

    @RequestMapping("showGuruByKey")
    public void showGuruByKey(){

    }

    @RequestMapping("/import")
    @ResponseBody
    public void importExcel(MultipartFile myFile){
        try {
            ImportParams importParams = new ImportParams();

            List<Guru> gurus = ExcelImportUtil.importExcel(myFile.getInputStream(), Guru.class, importParams);

            for (Guru guru: gurus) {
                System.out.println(guru);
            }

            gs.importGuru(gurus);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/export")
    public void exportExcel(HttpServletResponse resp){
        try {
            List<Guru> gurus = gs.exportGuru();

            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("上师信息", "上师信息表"), Guru.class, gurus);

            ServletOutputStream out = resp.getOutputStream();

            String fileName = new String("上师信息.xls".getBytes(),"iso-8859-1");

            resp.setContentType("application/vnd.ms-excel");

            resp.setHeader("content-disposition","attachment;fileName="+fileName);

            workbook.write(out);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public GuruService getGs() {
        return gs;
    }

    public void setGs(GuruService gs) {
        this.gs = gs;
    }
}
