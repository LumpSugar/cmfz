package com.baizhi.cmfz.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class User implements Serializable {
    private Integer userId;

    private String username;

    private String religiousName;

    private String password;

    private String sex;

    private String headPortrait;

    private Integer provinceId;

    private Integer cityId;

    private String phone;

    private String signature;

    private Integer guruId;

    private String salt;

    public User() {
    }

    public User(String username, String religiousName, String password, String sex, String headPortrait, Integer provinceId, Integer cityId, String phone, String signature, Integer guruId) {
        this.username = username;
        this.religiousName = religiousName;
        this.password = password;
        this.sex = sex;
        this.headPortrait = headPortrait;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.phone = phone;
        this.signature = signature;
        this.guruId = guruId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getReligiousName() {
        return religiousName;
    }

    public void setReligiousName(String religiousName) {
        this.religiousName = religiousName == null ? null : religiousName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Integer getGuruId() {
        return guruId;
    }

    public void setGuruId(Integer guruId) {
        this.guruId = guruId;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", religiousName='" + religiousName + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", headPortrait='" + headPortrait + '\'' +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", phone='" + phone + '\'' +
                ", signature='" + signature + '\'' +
                ", guruId=" + guruId +
                '}';
    }
}