package com.space.service.impl;

import com.space.dao.StyleDao;
import com.space.domain.Style;

import com.space.service.StyleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StyleServiceImpl implements StyleService {
    @Autowired
    StyleDao styleDao;
    @Override
    public List<Style> selectAll() {

        return styleDao.selectAll();
    }

    @Override
    public Style selectById(Integer id) {


        return styleDao.selectById(id);
    }

    @Override
    public Style selectByUid(Integer uid) {


        return styleDao.selectByUid(uid);
    }

    @Override
    public void insert(Style style) {


        styleDao.insert(style);
    }

    @Override
    public void deleteById(Integer id) {


        styleDao.deleteById(id);

    }

    @Override
    public void updateType(Integer uid, String type) {


        styleDao.updateType(uid, type);
    }
}
