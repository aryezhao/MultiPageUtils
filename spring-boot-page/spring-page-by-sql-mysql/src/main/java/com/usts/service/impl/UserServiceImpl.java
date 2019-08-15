package com.usts.service.impl;

import com.usts.entity.QueryVo;
import com.usts.entity.User;
import com.usts.mapper.UserMapper;
import com.usts.service.UserService;
import com.usts.utils.Page;
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

    @Override
    public Page<User> queryUserByQueryVo(QueryVo queryVo) {
        //设置查询条件，从哪一条数据开始查
        queryVo.setStart((queryVo.getPage() - 1) * queryVo.getRows());

        //查询数据结果集
        List<User> list = userMapper.queryUserByQueryVo(queryVo);

        //查询数据总条数
        int total = userMapper.queryCountByQueryVo(queryVo);

        //封装返回的page对象
        Page<User> page = new Page<>(total,queryVo.getPage(),queryVo.getRows(),list);

        return page;
    }
}
