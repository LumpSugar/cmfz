package com.baizhi.cmfz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SlideShow {
    private Integer pictureId;

    private String picturePath;

    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date pictureDate;

    private String pictureDescription;

    private String state;

    public SlideShow() {
    }

    public SlideShow(String picturePath, Date pictureDate, String pictureDescription, String state) {
        this.picturePath = picturePath;
        this.pictureDate = pictureDate;
        this.pictureDescription = pictureDescription;
        this.state = state;
    }

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath == null ? null : picturePath.trim();
    }

    public Date getPictureDate() {
        return pictureDate;
    }

    public void setPictureDate(Date pictureDate) {
        this.pictureDate = pictureDate;
    }

    public String getPictureDescription() {
        return pictureDescription;
    }

    public void setPictureDescription(String pictureDescription) {
        this.pictureDescription = pictureDescription == null ? null : pictureDescription.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        return "SlideShow{" +
                "pictureId=" + pictureId +
                ", picturePath='" + picturePath + '\'' +
                ", pictureDate=" + pictureDate +
                ", pictureDescription='" + pictureDescription + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}