package com.shk.dao;

import com.shk.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> getUserByLimit(Map<String,Integer> map);
    User getUserId(int id);
    int insertUser(User user);
    int updatatUser(User user);
}
