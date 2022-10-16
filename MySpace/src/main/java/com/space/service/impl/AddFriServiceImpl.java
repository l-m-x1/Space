package com.space.service.impl;

import com.space.dao.AddFriDao;
import com.space.domain.AddFriMsg;

import com.space.service.AddFriService;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddFriServiceImpl implements AddFriService {

//    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Autowired
    AddFriDao addFriDao;
    @Override
    public void insert(AddFriMsg addFriMsg) {




        SqlSession session = factory.openSession();
        AddFriMapper mapper = session.getMapper(AddFriMapper.class);
        mapper.insert(addFriMsg);
        session.commit();
        session.close();
    }

    @Override
    public void delete(AddFriMsg addFriMsg) {
        SqlSession session = factory.openSession();
        AddFriMapper mapper = session.getMapper(AddFriMapper.class);
        mapper.delete(addFriMsg);
        session.commit();
        session.close();

    }

    @Override
    public List<AddFriMsg> selectByTo(Integer msg_to) {
        SqlSession session = factory.openSession();
        AddFriMapper mapper = session.getMapper(AddFriMapper.class);
        return mapper.selectByTo(msg_to);
    }

    @Override
    public AddFriMsg selectSingle(AddFriMsg addFriMsg) {
        SqlSession session = factory.openSession();
        AddFriMapper mapper = session.getMapper(AddFriMapper.class);
        return mapper.selectSingle(addFriMsg);
    }

}
