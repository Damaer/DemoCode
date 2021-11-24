package com.aphysia.springdocker.service;

import com.aphysia.springdocker.model.User;

import java.util.List;


public interface UserService {
    public List<User> getAllUsers();

    public void updateUserAge();
}
