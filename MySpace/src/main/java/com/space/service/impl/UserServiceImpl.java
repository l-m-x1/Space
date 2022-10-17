package com.space.service.impl;

import com.space.dao.UserDao;
import com.space.domain.User;

import com.space.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> selectAll() {


        return userDao.selectAll();
    }

    @Override
    public void insert(User user) {


        userDao.insert(user);
    }

    @Override
    public User selectById(Integer id) {

        return userDao.selectById(id);
    }

    @Override
    public void deleteById(Integer id) {


        userDao.deleteById(id);
    }

    @Override
    public void updateUsername(Integer id,String username) {


        userDao.updateUsername(id, username);
    }

    @Override
    public void updatePassword(Integer id, String password) {


        userDao.updatePassword(id, password);
    }

    @Override
    public User select(Integer id, String password) {


        return userDao.select(id, password);
    }

    @Override
    public Integer getMaxId() {


        return userDao.getMaxId();
    }

    @Override
    public void updateAvatar(Integer id, String avatar) {


        userDao.updateAvatar(id,avatar);
    }
}
