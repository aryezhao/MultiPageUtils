package com.usts.controller;

import com.usts.entity.User;
import com.usts.service.UserService;
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
        return "demo";
    }

    //查询所有用户
    @RequestMapping("list")
    public String getAll(Model model) throws Exception{
        List<User> userList = userService.findAll();
        model.addAttribute("userList",userList);
        return "success";
    }

    //@ResponseBody
    //@RequestMapping("/student/array/{currPage}/{pageSize}")
    //public List<User> getStudentByArray(@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
    //    List<User> users = userService.queryUserByArray(currPage, pageSize);
    //    return users;
    //}

    @RequestMapping("/student/array/{currPage}/{pageSize}")
    public String page(Model model , @PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        List<User> pageInfo = userService.queryUserByArray(currPage, pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "demo";
    }


}
