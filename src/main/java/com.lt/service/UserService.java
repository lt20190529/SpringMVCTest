package com.lt.service;

import com.lt.entity.User;


public interface UserService {

    public User findUserByName(String name);

    public void add(User user);

    public void update(User user);

    public void delete(String id);
}
