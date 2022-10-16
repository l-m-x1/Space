package com.space.service;

import com.space.domain.Friends;


import java.util.List;

public interface FriendsService {

    void insert(Friends friends);

    void delete(Friends friends);

    void update(Friends friends);

    List<Friends> selectById(Integer id);

    Friends selectAccess(Friends friends);
}
