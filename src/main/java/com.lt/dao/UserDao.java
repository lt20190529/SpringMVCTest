package com.lt.dao;

import com.lt.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
public interface UserDao {

    public User findUserByUserName(@Param("name") String userName);

    public List<User> findUser(User user);

    public void add(User user);

    public void update(User user);

    public void delete(String id);

}
