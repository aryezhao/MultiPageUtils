package com.usts.mapper;

import com.usts.entity.User;

import java.util.List;

/**
 * Created by lenovo on 2019/7/4.
 */
public interface UserMapper {

    List<User> findAll();

    void addUser(User user);

    /**
     * 通过数组获取分页
     * @return
     */
    List<User> queryUserByArray();



}
