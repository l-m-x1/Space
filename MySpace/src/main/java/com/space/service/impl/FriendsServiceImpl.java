package com.space.service.impl;

import com.space.dao.FriendsDao;
import com.space.domain.Friends;

import com.space.service.FriendsService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FriendsServiceImpl implements FriendsService {


    FriendsDao friendsDao;
    @Override
    public void insert(Friends friends) {


        friendsDao.insert(friends);
    }

    @Override
    public void delete(Friends friends) {


        friendsDao.delete(friends);
    }

    @Override
    public void update(Friends friends) {


        friendsDao.update(friends);
    }

    @Override
    public List<Friends> selectById(Integer id) {

        return friendsDao.selectById(id);
    }

    @Override
    public Friends selectAccess(Friends friends) {


        return friendsDao.selectAccess(friends);

    }
}
