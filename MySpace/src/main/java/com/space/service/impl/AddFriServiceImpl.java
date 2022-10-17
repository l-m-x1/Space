package com.space.service.impl;

import com.space.dao.AddFriDao;
import com.space.domain.AddFriMsg;

import com.space.service.AddFriService;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddFriServiceImpl implements AddFriService {

    @Autowired
    AddFriDao addFriDao;
    @Override
    public void insert(AddFriMsg addFriMsg) {
        addFriDao.insert(addFriMsg);
    }

    @Override
    public void delete(AddFriMsg addFriMsg) {

        addFriDao.delete(addFriMsg);

    }

    @Override
    public List<AddFriMsg> selectByTo(Integer msg_to) {

        return addFriDao.selectByTo(msg_to);
    }

    @Override
    public AddFriMsg selectSingle(AddFriMsg addFriMsg) {
        return addFriDao.selectSingle(addFriMsg);
    }

}
