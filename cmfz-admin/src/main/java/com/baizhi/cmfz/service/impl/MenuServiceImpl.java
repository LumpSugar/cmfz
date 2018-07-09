package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.MenuDao;
import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @Author fyx
 * @Time in 14:41 2018/7/5
 * @Despriction
 */
@Service
@Transactional
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao md;

    public List<Menu> queryMenu() {
        return md.selectMenu();
    }

    public MenuDao getMd() {
        return md;
    }

    public void setMd(MenuDao md) {
        this.md = md;
    }
}
