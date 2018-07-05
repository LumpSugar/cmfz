package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.User;

public interface UserService {

    public int addUser(User user);

    public User queryUser(String username , String password);

}
