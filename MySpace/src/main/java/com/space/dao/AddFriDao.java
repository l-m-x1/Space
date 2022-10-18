package com.space.dao;

import com.space.domain.AddFriMsg;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface AddFriDao {
    @Insert("insert into add_fri_msg values (#{msg_from},#{msg_to})")
    void insert(AddFriMsg addFriMsg);
    @Delete("delete from add_fri_msg where msg_from=#{msg_from} and msg_to=#{msg_to}")
    void delete(AddFriMsg addFriMsg);
    @Select("select *from add_fri_msg where msg_to=#{msg_to}")
    List<AddFriMsg> selectByTo(Integer msg_to);

    @Select("select *from add_fri_msg where msg_from=#{msg_from}and msg_to=#{msg_to}")
    AddFriMsg selectSingle(AddFriMsg addFriMsg);
}
