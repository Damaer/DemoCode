package com.aphysia.springdocker.mapper;

import com.aphysia.springdocker.model.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUsers();

    int updateUserAge(Integer id);
}
