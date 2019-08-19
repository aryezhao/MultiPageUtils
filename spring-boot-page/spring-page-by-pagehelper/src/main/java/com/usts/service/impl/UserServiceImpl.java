package com.usts.service.impl;

import com.usts.entity.User;
import com.usts.mapper.UserMapper;
import com.usts.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2019/8/7.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public List<User> queryUserByRowBounds(Map<String, Object> map, RowBounds rowBounds) {


        List<User> list = userMapper.queryUserByRowBounds(map, new RowBounds(1,5));

        return list;
    }
}
