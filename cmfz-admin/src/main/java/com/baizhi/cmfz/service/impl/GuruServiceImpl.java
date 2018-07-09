package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.GuruDao;
import com.baizhi.cmfz.entity.Guru;
import com.baizhi.cmfz.service.GuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author fyx
 * @Time in 22:50 2018/7/7
 * @Despriction
 */
@Service
@Transactional
public class GuruServiceImpl implements GuruService {

    @Autowired
    private GuruDao gd;

    public int addGuru(Guru guru) {
        return gd.insert(guru);
    }

    public int removeGuru(Integer id) {
        return gd.deleteById(id);
    }

    public int modifyGuru(Guru guru) {
        return gd.updateById(guru);
    }

    public Guru queryById(Integer id) {
        return gd.selectById(id);
    }

    public Map<String,Object> queryAllGuru(Integer pageIndex, Integer step) {
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("total",gd.countGuru());
        map.put("rows",gd.selectAllGuru((pageIndex - 1) * step, step));

        return map;
    }

    public void importGuru(List<Guru> gurus) {
        gd.insertBatch(gurus);
    }

    public List<Guru> exportGuru() {
        return gd.selectBatch();
    }

    public GuruDao getGd() {
        return gd;
    }

    public void setGd(GuruDao gd) {
        this.gd = gd;
    }
}
