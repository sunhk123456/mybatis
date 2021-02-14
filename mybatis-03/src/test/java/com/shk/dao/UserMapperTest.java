package com.shk.dao;

import com.shk.pojo.User;
import com.shk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    @Test
    public void test(){
        //获得sqlSession对象
//        try {
//
//        }catch (){
//
//        }finally {
//
//        }
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);

        }
        sqlSession.close();
    }
    @Test
    public void getUserId(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userId = mapper.getUserId(2);
        System.out.println(userId);
        sqlSession.close();
    }
    @Test
    //增删改需要提交事务
    public void insertUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.insertUser(new User(8, "老刘", "123456789"));
        System.out.println(i);
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    //增删改需要提交事务
    public void updatatUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updatatUser(new User(2, "22123", "1236789"));
        System.out.println(i);
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("endIndex",2);

        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }
    }
}
