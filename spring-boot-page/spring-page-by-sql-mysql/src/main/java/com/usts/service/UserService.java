package com.usts.service;

import com.usts.entity.QueryVo;
import com.usts.entity.User;
import com.usts.utils.Page;

import java.util.List;

/**
 * Created by lenovo on 2019/8/7.
 */
public interface UserService {

    List<User> findAll();

    void addUser(User user);

    List<User> queryUserByArray(int currPage,int pageSize);

    /**
     * 根据分页查询用户
     */
    Page<User> queryUserByQueryVo(QueryVo queryVo);
}
