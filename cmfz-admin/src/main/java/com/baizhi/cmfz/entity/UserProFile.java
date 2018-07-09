package com.baizhi.cmfz.entity;

import java.io.Serializable;

/**
 * @Author fyx
 * @Time in 15:09 2018/7/9
 * @Despriction
 */
public class UserProFile implements Serializable {

    String name;
    String value;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UserProFile{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
