package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.SlideShow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SlideShowDao {
    int deleteByPrimaryKey(Integer pictureId);

    int insert(SlideShow record);

    int updateByPrimaryKey(SlideShow record);

    List<SlideShow> selectByPrimaryKey(@Param("start") Integer start, @Param("step") Integer step);

    public int countSlideShow();
}