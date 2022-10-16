package com.space.service;

import com.space.domain.Info;


public interface InfoService {

    void insert(Info info);

    void delete(Integer id);

    void update(Info info);

    Info selectById(Integer id);
}
