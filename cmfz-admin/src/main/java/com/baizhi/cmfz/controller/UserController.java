package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.User;
import com.baizhi.cmfz.service.UserService;
import com.baizhi.cmfz.util.CreateValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService us;



    @RequestMapping("/register")
    public void register(User user){
        us.addUser(user);
    }



    @RequestMapping("/login")
    public String  login(String username , String password){
        System.out.println("--- login ---");
        System.out.println(username);
        System.out.println(password);
        User user = us.queryUser(username,password);
        return "login";
    }


    public UserService getUs() {
        return us;
    }

    public void setUs(UserService us) {
        this.us = us;
    }
}
