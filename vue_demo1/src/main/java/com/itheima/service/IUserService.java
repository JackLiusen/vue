package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User findById(Integer id);
    void updateUser(User user);

}
