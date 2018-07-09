package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.SlideShow;

import java.util.List;
import java.util.Map;

/**
 * @Author fyx
 * @Time in 9:01 2018/7/6
 * @Despriction
 */
public interface SlideShowService {

    public int addSlideShow(SlideShow slideShow);

    public int removeSlideShow(Integer id);

    public int modifySlideShow(SlideShow slideShow);

    public Map<String,Object> querySlideShow(Integer pageIndex , Integer step);

}
