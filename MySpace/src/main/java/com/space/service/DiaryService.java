package com.space.service;



import com.space.domain.Diary;

import java.util.List;

public interface DiaryService {

    void insert(Diary diary);

    void delete(Integer id);

    void update(Diary diary);

    List<Diary> selectByUid(Integer uid);

    Diary selectById(Integer id);
}
