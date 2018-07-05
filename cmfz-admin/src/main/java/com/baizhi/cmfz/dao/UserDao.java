package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.User;

public interface UserDao {
    int insert(User record);

    int deleteByPrimaryKey(Integer userId);

    int updateByPrimaryKey(User record);

    User selectByPrimaryKey(String username);
}