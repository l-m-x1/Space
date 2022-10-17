package com.space.dao;

import com.space.domain.Mood;

import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface MoodDao {
    @Insert("insert into mood values (null,#{uid},#{type},#{content})")
    void insert(Mood mood);

    @Delete("delete from mood where id=#{id}")
    void delete(Integer id);

    @Update("update mood set type=#{type},content=#{content} where id=#{id}")
    void update(Mood mood);

    @Select("select *from mood where uid=#{uid}")
    List<Mood> selectByUid(Integer uid);

    @Select("select *from mood where id=#{id}")
    Mood selectById(Integer id);
}
