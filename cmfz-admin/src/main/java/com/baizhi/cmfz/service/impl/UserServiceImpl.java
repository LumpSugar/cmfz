package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.UserDao;
import com.baizhi.cmfz.entity.User;
import com.baizhi.cmfz.service.UserService;
import com.baizhi.cmfz.util.EncryptionUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao ud;

    public int addUser(User user) {
        int n = 0;
        if(ud.selectByPrimaryKey(user.getUsername()) == null){
            String salt = EncryptionUtils.getRandomSalt(6);

            user.setSalt(salt);

            String pwd = DigestUtils.md5Hex(user.getPassword()+salt);

            user.setPassword(pwd);

            n = ud.insert(user);
        }

        return n;
    }

    public User queryUser(String username,String password) {
        User user = ud.selectByPrimaryKey(username);

        if(user != null){
            String salt = user.getSalt();

            String pwd = DigestUtils.md5Hex(password+salt);

            if(pwd.equals(user.getPassword()) || password.equals(user.getPassword())){
                return user;
            }

        }
        return null;
    }

    public UserDao getUd() {
        return ud;
    }

    public void setUd(UserDao ud) {
        this.ud = ud;
    }
}
