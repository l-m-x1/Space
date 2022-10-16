package com.space.dao;

import com.space.domain.Diary;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DiaryDao {
    @Insert("insert into diary VALUES (null,#{uid},#{time},#{content},#{title})")
    void insert( Diary diary);
    @Delete("delete from diary where id=#{id}")
    void delete(Integer id);
    @Update("update diary set time=#{time},content=#{content},title=#{title} where id=#{id}")
    void update(Diary diary);
    @Select("select *from diary where uid=#{uid}")
    List<Diary> selectByUid(Integer uid);
    @Select("select *from diary where id=#{id}")
    Diary selectById(Integer id);
}
