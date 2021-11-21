package com.aphysia.springdemo.service;

import com.aphysia.springdemo.model.User;

import java.util.List;


public interface UserService {
    public List<User> getAllUsers();

    public void updateUserAge();
}
