package com.aphysia.springdocker.service.impl;

import com.aphysia.springdocker.constant.RedisConstant;
import com.aphysia.springdocker.mapper.UserMapper;
import com.aphysia.springdocker.model.User;
import com.aphysia.springdocker.service.UserService;
import com.aphysia.springdocker.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Autowired
    RedisUtil redisUtil;

    @Override
    public List<User> getAllUsers() {
        List<User> users = (List<User>) redisUtil.get(RedisConstant.ALL_USER_KEY);
        if(CollectionUtils.isEmpty(users)){
            users = userMapper.getAllUsers();
            redisUtil.set(RedisConstant.ALL_USER_KEY,users);
        }
        return users;
    }

    @Override
    @Transactional
    public void updateUserAge() {
        redisUtil.del(RedisConstant.ALL_USER_KEY);
        userMapper.updateUserAge(1);
        userMapper.updateUserAge(2);
    }
}
