package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAllUser(Map map) {
        logger.info("入参为=" + map);
        int flag = 0;
        int page = 0;
        int pageSize = 5;
        List<User> userList = null;
        if (!map.isEmpty()) {
            flag = (int) map.get("flag");
            page = (int) map.get("page");
            pageSize = (int) map.get("pageSize");
            logger.info("flag=" + flag + ",page=" + page + ",pageSize=" + pageSize);
            if (flag == 0) {
                userList = userRepository.queryUser(page, pageSize);
            }
        }
        logger.info("userList=" + userList);
        return userList;
    }
}
