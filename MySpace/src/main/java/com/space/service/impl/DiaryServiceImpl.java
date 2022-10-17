package com.space.service.impl;

import com.space.dao.DiaryDao;
import com.space.domain.Diary;

import com.space.service.DiaryService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DiaryServiceImpl implements DiaryService {
    @Autowired
    DiaryDao diaryDao;
    @Override
    public void insert(Diary diary) {

        diaryDao.insert(diary);
    }

    @Override
    public void delete(Integer id) {

        diaryDao.delete(id);
    }

    @Override
    public void update(Diary diary) {

        diaryDao.update(diary);

    }

    @Override
    public List<Diary> selectByUid(Integer uid) {

        return diaryDao.selectByUid(uid);
    }

    @Override
    public Diary selectById(Integer id) {

        return diaryDao.selectById(id);
    }
}
