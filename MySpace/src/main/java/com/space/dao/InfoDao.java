package com.space.dao;


import com.space.domain.Info;
import org.apache.ibatis.annotations.*;

@Mapper
public interface InfoDao {
    @Insert("insert into info(id) values (#{id})")
    void insert(Info info);

    @Delete("delete from info where id=#{id}")
    void delete(Integer id);

    @Update("update info set gender=#{gender},city=#{city},birthday=#{birthday}," +
            "work=#{work},companyName=#{companyName}," +
            "companyAddress=#{companyAddress},address=#{address} where id=#{id}")
    void update(Info info);

    @Select("select *from info where id=#{id}")
    Info selectById(Integer id);
}
