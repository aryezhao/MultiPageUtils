package com.usts.controller;

import com.usts.entity.User;
import com.usts.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    //@RequestMapping("row")
    //public List<User> getUserByRowBounds() {
    //    Map<String, Object> map = new HashMap<>();
    //
    //    List<User> userList = userService.findAll();
    //    map.put("userList",userList);
    //    RowBounds rowBounds = new RowBounds(0,3);
    //    List<User> users = userService.queryUserByRowBounds(map,rowBounds);
    //    return users;
    //}


    @RequestMapping("row")
    public String getUserByRowBounds(Model model,RowBounds rowBounds) {
        Map map = new HashMap();

        List<User> userList = userService.queryUserByRowBounds(map,rowBounds);

        model.addAttribute("page",userList);


        return "success";
    }

}
