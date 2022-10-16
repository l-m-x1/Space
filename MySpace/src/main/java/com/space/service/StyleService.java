package com.space.service;

import com.space.domain.Style;


import java.util.List;

public interface StyleService {

    List<Style> selectAll();

    Style selectById(Integer id);

    Style selectByUid(Integer uid);


    void insert(Style style);


    void deleteById(Integer id);


    void updateType( Integer uid, String type);

}
