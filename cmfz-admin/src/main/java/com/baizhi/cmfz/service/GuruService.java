package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Guru;

import java.util.List;
import java.util.Map;

/**
 * @Author fyx
 * @Time in 22:46 2018/7/7
 * @Despriction
 */

public interface GuruService {

    public int addGuru(Guru guru);

    public int removeGuru(Integer id);

    public int modifyGuru(Guru guru);

    public Guru queryById(Integer id);

    public Map<String,Object> queryAllGuru(Integer pageIndex , Integer step);

    public void importGuru(List<Guru> gurus);

    public List<Guru> exportGuru();

}
