package com.space.dao;

import com.space.domain.Trends;

import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface TrendsDao {

    @Select("select * from trends")
    List<Trends>  selectAll();

    @Select("select * from trends where id=#{id} order by id desc")
    Trends selectById(Integer id);

    @Select("select * from trends where uid=#{uid} order by id desc")
    List<Trends> selectByUid(Integer uid);

    List<Trends> selectByUids(@Param("uids") int[] uids);

    @Insert("insert into trends(content,uid,time) values (#{content},#{uid},#{time})")
    void insert(Trends trends);

    @Delete("delete from trends where id=#{id}")
    void deleteById(Integer id);

    @Delete("delete from trends where uid=#{uid}")
    void deleteByUid(Integer uid);

    @Update("update trends set likes = #{likes} where id=#{id} ;")
    void updateLikes(@Param("id") Integer id, @Param("likes") Integer likes);

    @Update("update trends set content=#{content} where id=#{id}")
    void updateContent(@Param("id") Integer id, @Param("content") String content);
}
