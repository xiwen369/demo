package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    //用户分页查询
    List<User> findAllUser(Map map);
    //用户总数查询
    int findCount();
    //删除用户
    String deleteUser(int id);
    //添加用户/修改用户信息
    String addUser(User user);




}
