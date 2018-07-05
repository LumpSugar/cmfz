package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.util.CreateValidateCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author fyx
 * @Time in 14:25 2018/7/5
 * @Despriction
 */
@Controller
@RequestMapping("/vc")
public class validateCodeController {

    /*@RequestMapping("/getVcode")
    public void create(HttpSession session , HttpServletResponse response){

        System.out.println("--- getvcode ---");
        CreateValidateCode vcode = new CreateValidateCode(100,30,4,10);

        System.out.println("vcode = "+vcode.getCode());

        session.setAttribute("code",vcode.getCode());

        try {
            vcode.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/

}
