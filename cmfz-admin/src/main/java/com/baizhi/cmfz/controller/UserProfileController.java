package com.baizhi.cmfz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.baizhi.cmfz.entity.UserProFile;
import org.springframework.web.bind.annotation.ResponseBody;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author fyx
 * @Time in 15:06 2018/7/9
 * @Despriction
 */
@Controller
@RequestMapping("userProfile")
public class UserProfileController {

    @RequestMapping("/male")
    @ResponseBody
    public List<UserProFile> showMale(){
        List<UserProFile> list = new ArrayList<UserProFile>();

        UserProFile profile;

        Random random;

        String[] provinces = {"北京","天津","河北","山西","内蒙古","辽宁","吉林","黑龙江","上海","江苏","浙江","安徽","福建","江西","山东","河南","湖北","湖南","广东","广西","海南","重庆","四川","贵州","云南","西藏","陕西","甘肃","青海","宁夏","新疆","台湾","香港","澳门"};

        for (String province: provinces) {

            profile = new UserProFile();

            random = new Random();

            profile.setName(province);
            profile.setValue("" + random.nextInt(1000));

            list.add(profile);
        }

        for (UserProFile file: list) {
            System.out.println(file);
        }

        return list;

    }

    @RequestMapping("/female")
    @ResponseBody
    public List<UserProFile> showFemale(){
        List<UserProFile> list = new ArrayList<UserProFile>();

        UserProFile profile;

        Random random;

        String[] provinces = {"北京","天津","河北","山西","内蒙古","辽宁","吉林","黑龙江","上海","江苏","浙江","安徽","福建","江西","山东","河南","湖北","湖南","广东","广西","海南","重庆","四川","贵州","云南","西藏","陕西","甘肃","青海","宁夏","新疆","台湾","香港","澳门"};

        for (String province: provinces) {

            profile = new UserProFile();

            random = new Random();

            profile.setName(province);
            profile.setValue("" + random.nextInt(1000));

            list.add(profile);
        }

        for (UserProFile file: list) {
            System.out.println(file);
        }

        return list;

    }

}
