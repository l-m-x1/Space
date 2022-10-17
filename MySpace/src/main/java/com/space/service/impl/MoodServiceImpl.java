package com.space.service.impl;

import com.space.dao.MoodDao;
import com.space.domain.Mood;

import com.space.service.MoodService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MoodServiceImpl implements MoodService {

    @Autowired
    MoodDao moodDao;
    @Override
    public void insert(Mood mood) {


        moodDao.insert(mood);
    }

    @Override
    public void delete(Integer id) {

        moodDao.delete(id);
    }

    @Override
    public void update(Mood mood) {


        moodDao.update(mood);
    }

    @Override
    public List<Mood> selectByUid(Integer uid) {


        return moodDao.selectByUid(uid);
    }

    @Override
    public Mood selectById(Integer id) {


        return moodDao.selectById(id);
    }
}
