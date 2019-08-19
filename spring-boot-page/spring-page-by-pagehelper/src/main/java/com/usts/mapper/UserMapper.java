package com.usts.mapper;

import com.usts.entity.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2019/7/4.
 */
public interface UserMapper {

    List<User> findAll();

    void addUser(User user);

    /**
     * 通过mybatis的row bounds实现分页
     */
    List<User> queryUserByRowBounds(Map<String,Object> map, RowBounds rowBounds);


}
