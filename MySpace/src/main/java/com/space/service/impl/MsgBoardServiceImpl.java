package com.space.service.impl;

import com.space.dao.MsgBoardDao;
import com.space.domain.MsgBoard;

import com.space.service.MsgBoardService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MsgBoardServiceImpl implements MsgBoardService {

    @Autowired
    MsgBoardDao msgBoardDao;

    @Override
    public List<MsgBoard> selectAll() {


        return msgBoardDao.selectAll();
    }



    @Override
    public void insert(MsgBoard msgBoard) {


        msgBoardDao.insert(msgBoard);
    }

    @Override
    public List<MsgBoard> selectByUid(Integer uid) {


        return msgBoardDao.selectByUid(uid);
    }

    @Override
    public void deleteById(Integer id) {


        msgBoardDao.deleteById(id);
    }
}
