package com.shk.dao;

import com.shk.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUserId(int id);
    int insertUser(User user);
    int updatatUser(User user);
}
