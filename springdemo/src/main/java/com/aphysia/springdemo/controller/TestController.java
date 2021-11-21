package com.aphysia.springdemo.controller;

import com.aphysia.springdemo.model.User;
import com.aphysia.springdemo.service.UserService;
import com.aphysia.springdemo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    UserService userService;


    @RequestMapping("/getUserList")
    @ResponseBody
    public List<User> getUserList() {
        return userService.getAllUsers();
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update() {
        userService.updateUserAge();
        return 1;
    }
}

