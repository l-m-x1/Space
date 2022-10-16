package com.space.service;

import com.space.domain.Mood;

import java.util.List;

public interface MoodService {

    void insert(Mood mood);

    void delete(Integer id);

    void update(Mood mood);

    List<Mood> selectByUid(Integer uid);

    Mood selectById(Integer id);
}
