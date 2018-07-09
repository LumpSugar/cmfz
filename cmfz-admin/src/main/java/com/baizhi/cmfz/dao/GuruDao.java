package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Guru;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuruDao {
    int deleteById(Integer guruId);

    int insert(Guru record);

    int updateById(Guru record);

    Guru selectById(Integer guruId);

    List<Guru> selectAllGuru(@Param("start") Integer start ,@Param("step") Integer step);

    int countGuru();

    List<Guru> selectByKey(Guru guru);

    public List<Guru> selectAnyGuru(@Param("name") String name,@Param("value") String value,@Param("page") Integer page,@Param("rows") Integer rows);

    int insertBatch(@Param("gurus")List<Guru> gurus);

    List<Guru> selectBatch();

}