package com.space.service;

import com.space.domain.MsgBoard;


import java.util.List;

public interface MsgBoardService {
     List<MsgBoard> selectAll();

     void insert(MsgBoard msgBoard);

     List<MsgBoard> selectByUid(Integer uid);


     void deleteById(Integer id);



}
