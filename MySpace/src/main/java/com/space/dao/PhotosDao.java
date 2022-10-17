package com.space.dao;


import com.space.domain.Photos;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface PhotosDao {

    @Select("select * from photos")
    List<Photos> selectAll();

    @Select("select * from photos where uid=#{uid}")
    List<Photos> selectByUid(Integer uid);

    @Select("select * from photos where id=#{id}")
    Photos selectById(Integer id);


    void insert(Photos photos);

    @Delete("delete  from photos where id=#{id}")
    void deleteById(Integer id);
}
