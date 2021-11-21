package com.aphysia.springdemo.mapper;

import com.aphysia.springdemo.model.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUsers();

    int updateUserAge(Integer id);
}
