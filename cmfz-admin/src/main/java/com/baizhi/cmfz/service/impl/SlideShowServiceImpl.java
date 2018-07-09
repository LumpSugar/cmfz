package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.SlideShowDao;
import com.baizhi.cmfz.entity.SlideShow;
import com.baizhi.cmfz.service.SlideShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author fyx
 * @Time in 9:01 2018/7/6
 * @Despriction
 */
@Service
@Transactional
public class SlideShowServiceImpl implements SlideShowService {
    @Autowired
    private SlideShowDao ssd;

    public int addSlideShow(SlideShow slideShow) {
        return ssd.insert(slideShow);
    }

    public int removeSlideShow(Integer id) {
        return ssd.deleteByPrimaryKey(id);
    }

    public int modifySlideShow(SlideShow slideShow) {
        return ssd.updateByPrimaryKey(slideShow);
    }

    public Map<String,Object> querySlideShow(Integer pageIndex, Integer step) {
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("total",ssd.countSlideShow());
        map.put("rows",ssd.selectByPrimaryKey((pageIndex - 1) * step, step));

        return map;
    }

    public SlideShowDao getSsd() {
        return ssd;
    }

    public void setSsd(SlideShowDao ssd) {
        this.ssd = ssd;
    }
}
