package com.usts.controller;

import com.usts.entity.QueryVo;
import com.usts.entity.User;
import com.usts.service.UserService;
import com.usts.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "success";
    }

    //查询所有用户
    @RequestMapping("list")
    public String getAll(Model model) throws Exception{
        List<User> userList = userService.findAll();
        model.addAttribute("userList",userList);
        return "success";
    }

    @RequestMapping("/student/array/{currPage}/{pageSize}")
    public String page(Model model , @PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        List<User> pageInfo = userService.queryUserByArray(currPage, pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "demo";
    }


    @RequestMapping("query")
    public String queryUser(QueryVo queryVo,Model model){

        //分页查询数据
        Page<User> page = userService.queryUserByQueryVo(queryVo);
        System.out.println("page："+page);
        //把分页查询的结果放到模型中
        model.addAttribute("page",page);
        //model.addAttribute("id",queryVo.getId());

        return "success";
    }


}
