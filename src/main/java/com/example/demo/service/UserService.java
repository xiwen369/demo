package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    //用户分页查询
    List<User> findAllUser(Map map);





}
