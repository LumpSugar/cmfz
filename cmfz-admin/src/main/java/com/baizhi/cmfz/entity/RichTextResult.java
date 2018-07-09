package com.baizhi.cmfz.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @Author fyx
 * @Time in 9:30 2018/7/9
 * @Despriction
 */
public class RichTextResult implements Serializable {

    public Integer errno;
    public List<String> data;

    public Integer getErrno() {
        return errno;
    }

    public List<String> getData() {
        return data;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
