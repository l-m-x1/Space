package com.space.service;

import com.space.domain.Photos;


import java.util.List;

public interface PhotosService {


    List<Photos> selectAll();


    Photos selectById(Integer id);

    List<Photos> selectByUid(Integer uid);


    void insert(Photos photos);


    void deleteById(Integer id);

}
