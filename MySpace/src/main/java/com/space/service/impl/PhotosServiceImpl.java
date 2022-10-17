package com.space.service.impl;

import com.space.dao.PhotosDao;
import com.space.domain.Photos;

import com.space.service.PhotosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhotosServiceImpl implements PhotosService {
    @Autowired
    PhotosDao photosDao;
    @Override
    public List<Photos> selectAll() {


        return photosDao.selectAll();
    }

    @Override
    public Photos selectById(Integer id) {


        return photosDao.selectById(id);
    }

    @Override
    public List<Photos> selectByUid(Integer uid) {


        return photosDao.selectByUid(uid);
    }


    @Override
    public void insert(Photos photos) {


        photosDao.insert(photos);
    }

    @Override
    public void deleteById(Integer id) {


        photosDao.deleteById(id);
    }
}
