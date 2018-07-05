package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Menu;

import java.util.List;

public interface MenuDao {
    int deleteByPrimaryKey(Integer menuId);

    int insert(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> selectParent();

    List<Menu> selectChild(Integer parentID);
}