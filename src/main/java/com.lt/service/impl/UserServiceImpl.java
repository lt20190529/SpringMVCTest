package com.lt.service.impl;

import com.lt.dao.UserDao;
import com.lt.entity.User;
import com.lt.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource(name = "UserDao")
    private UserDao userDao;

    @Override
    public User findUserByName(String name) {
        return userDao.findUserByUserName(name);
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void update(User user) {
       userDao.update(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

}
