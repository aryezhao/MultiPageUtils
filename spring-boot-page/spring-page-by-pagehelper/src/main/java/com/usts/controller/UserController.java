package com.usts.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.usts.entity.User;
import com.usts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lenovo on 2019/8/7.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //查询所有用户
    @RequestMapping("home")
    public String home(){
        return "demo";
    }

    @ResponseBody
    @RequestMapping("userList")
    public List<User> list(){
        List<User> list = userService.findAll();
        return list;
    }

    //分页查询
    @RequestMapping(value="/list",method= RequestMethod.GET)
    public String pageList(ModelMap map, @RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo){

        //每页显示记录数
        Integer pageSize = 4;

        //分页查询
        PageHelper.startPage(pageNo,pageSize);

        //获取所有信息
        List<User> userList = userService.findAll();

        PageInfo<User> pageInfo = new PageInfo<>(userList);
        map.addAttribute("pageInfo",pageInfo);
        return "list";
    }
}
