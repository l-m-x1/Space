package com.space.service.impl;


import com.space.dao.InfoDao;
import com.space.domain.Info;
import com.space.service.InfoService;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    InfoDao infoDao;

    @Override
    public void insert(Info info) {

        infoDao.insert(info);
    }

    @Override
    public void delete(Integer id) {

        infoDao.delete(id);
    }

    @Override
    public void update(Info info) {
        infoDao.update(info);
    }

    @Override
    public Info selectById(Integer id) {


        return infoDao.selectById(id);
    }
}
