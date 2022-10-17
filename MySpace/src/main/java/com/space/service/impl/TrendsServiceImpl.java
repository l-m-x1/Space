package com.space.service.impl;

import com.space.dao.TrendsDao;
import com.space.domain.Trends;

import com.space.service.TrendsService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TrendsServiceImpl implements TrendsService {

    @Autowired
    TrendsDao trendsDao;

    @Override
    public List<Trends> selectAll() {


        return trendsDao.selectAll();
    }

    @Override
    public Trends selectById(Integer id) {


        return trendsDao.selectById(id);
    }

    @Override
    public List<Trends> selectByUid(Integer uid) {


        return trendsDao.selectByUid(uid);
    }

    @Override
    public void insert(Trends trends) {


        trendsDao.insert(trends);
    }

    @Override
    public void deleteById(Integer id) {


        trendsDao.deleteById(id);
    }

    @Override
    public void deleteByUid(Integer uid) {


        trendsDao.deleteByUid(uid);
    }

    @Override
    public void updateLikes(Integer id, Integer likes) {


        trendsDao.updateLikes(id, likes);
    }

    @Override
    public List<Trends> selectByUids(int[] uids) {


        return trendsDao.selectByUids(uids);
    }

    @Override
    public void updateContent(Integer id, String content) {


        trendsDao.updateContent(id, content);
    }
}
