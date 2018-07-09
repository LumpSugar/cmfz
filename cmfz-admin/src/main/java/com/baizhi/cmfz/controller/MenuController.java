package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author fyx
 * @Time in 17:15 2018/7/5
 * @Despriction
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService ms;

    @RequestMapping("/showMenu")
    public @ResponseBody  List<Menu> showMenu(){
        return ms.queryMenu();
    }

    public MenuService getMs() {
        return ms;
    }

    public void setMs(MenuService ms) {
        this.ms = ms;
    }
}
