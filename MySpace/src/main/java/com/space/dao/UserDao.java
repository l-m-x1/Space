package com.space.dao;


import com.space.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select *from user")
    List<User> selectAll();

    @Select("select *from user where id=#{id} and password=#{password}")
    User select(@Param("id") Integer id,@Param("password") String password);

    @Select("select *from user where id=#{id}")
    User selectById(Integer id);


    void insert(User user);

    @Delete("delete from user where id=#{id} ;")
    void deleteById(Integer id);

    @Update("update user set username =#{username} where id=#{id} ")
    void updateUsername(@Param("id")Integer id,@Param("username")String username);

    @Update("update user set password =#{password} where id=#{id}")
    void updatePassword(@Param("id")Integer id,@Param("password") String password);

    @Select("select max(id) from user")
    Integer getMaxId();

    @Update("update user set avatar=#{avatar} where id=#{id}")
    void updateAvatar(@Param("id")Integer id,@Param("avatar") String avatar);
}
