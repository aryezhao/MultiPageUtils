package com.usts.service.impl;

import com.usts.entity.User;
import com.usts.mapper.UserMapper;
import com.usts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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



    /**
     * 分页查询
     * @param currPage  参数表示显示第几页的数据
     * @param pageSize  表示每页显示的数据条数
     * @return
     */
    @Override
    public List<User> queryUserByArray(int currPage, int pageSize) {

        List<User> users = userMapper.queryUserByArray();

        //从第几条数据开始
        int firstIndex = (currPage - 1) * pageSize;
        //到第几条数据结束
        int lastIndex = currPage * pageSize;
        return users.subList(firstIndex,lastIndex);
    }
}
