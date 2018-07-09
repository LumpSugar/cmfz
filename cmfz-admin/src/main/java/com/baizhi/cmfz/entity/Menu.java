package com.baizhi.cmfz.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class Menu implements Serializable {
    private Integer menuId;

    private String menuName;

    private String menuCode;

    private String menuIcon;

    private String menuUrl;

    private String menuLevel;

    private List<Menu> childs;

    public Menu() {
    }

    public Menu(Integer menuId, String menuName, String menuCode, String menuIcon, String menuUrl, String menuLevel, List<Menu> childs) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuCode = menuCode;
        this.menuIcon = menuIcon;
        this.menuUrl = menuUrl;
        this.menuLevel = menuLevel;
        this.childs = childs;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel == null ? null : menuLevel.trim();
    }

    public List<Menu> getChilds() {
        return childs;
    }

    public void setChilds(List<Menu> childs) {
        this.childs = childs;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", menuCode='" + menuCode + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", menuLevel='" + menuLevel + '\'' +
                ", childs=" + childs +
                '}';
    }
}