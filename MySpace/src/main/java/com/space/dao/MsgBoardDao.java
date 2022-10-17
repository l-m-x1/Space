package com.space.dao;

import com.space.domain.MsgBoard;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper

    public interface MsgBoardDao {
        @Select("select *from msg_board")
        List<MsgBoard> selectAll();


        @Select("select *from msg_board where uid=#{uid} order by id desc")
        List<MsgBoard> selectByUid(Integer uid);


        void insert(MsgBoard msgBoard);


        @Delete("delete from msg_board where id=#{id} ;")
        void deleteById(Integer id);


    }


