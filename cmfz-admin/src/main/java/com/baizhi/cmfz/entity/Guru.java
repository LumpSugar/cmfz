package com.baizhi.cmfz.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

public class Guru implements Serializable {
    @Excel(name = "编号")
    private Integer guruId;
    @Excel(name = "法名")
    private String religiousName;
    @Excel(name = "头像")
    private String guruPhoto;
    @Excel(name = "描述信息")
    private String guruIntro;

    public Guru() {
    }

    public Guru(String religiousName, String guruPhoto, String guruIntro) {
        this.religiousName = religiousName;
        this.guruPhoto = guruPhoto;
        this.guruIntro = guruIntro;
    }

    public Integer getGuruId() {
        return guruId;
    }

    public void setGuruId(Integer guruId) {
        this.guruId = guruId;
    }

    public String getReligiousName() {
        return religiousName;
    }

    public void setReligiousName(String religiousName) {
        this.religiousName = religiousName == null ? null : religiousName.trim();
    }

    public String getGuruPhoto() {
        return guruPhoto;
    }

    public void setGuruPhoto(String guruPhoto) {
        this.guruPhoto = guruPhoto == null ? null : guruPhoto.trim();
    }

    public String getGuruIntro() {
        return guruIntro;
    }

    public void setGuruIntro(String guruIntro) {
        this.guruIntro = guruIntro == null ? null : guruIntro.trim();
    }

    @Override
    public String toString() {
        return "Guru{" +
                "guruId=" + guruId +
                ", religiousName='" + religiousName + '\'' +
                ", guruPhoto='" + guruPhoto + '\'' +
                ", guruIntro='" + guruIntro + '\'' +
                '}';
    }
}