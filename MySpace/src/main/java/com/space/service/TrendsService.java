package com.space.service;

import com.space.domain.Trends;


import java.util.List;

public interface TrendsService {

    List<Trends> selectAll();

    Trends selectById(Integer id);

    List<Trends> selectByUid(Integer uid);

    void insert(Trends trends);

    void deleteById(Integer id);

    void deleteByUid(Integer uid);

    void updateLikes(Integer id,  Integer likes);

    List<Trends> selectByUids( int[] uids);

    void updateContent(Integer id,  String content);
}
