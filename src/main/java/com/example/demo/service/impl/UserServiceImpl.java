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
        int page = 1;
        int pageSize = 5;
        int currentCount;
        List<User> userList = null;
        if (!map.isEmpty()) {
            flag = (int) map.get("flag");
            page = (int) map.get("page");
            currentCount = (int) map.get("currentCount");
            pageSize = (int) map.get("pageSize");
            logger.info("flag=" + flag + ",page=" + page + ",pageSize=" + pageSize + ",currentCount=" + currentCount);
            if (flag == 0) {
                userList = userRepository.queryUser(currentCount, pageSize);
            }
        }
        logger.info("userList=" + userList);
        return userList;
    }

    @Override
    public int findCount() {
        int count = (int) userRepository.count();
        return count;
    }

    @Override
    public String deleteUser(int id) {
        String Desc = "删除成功!";
        try {
            userRepository.delete(id);
        }catch (Exception e){
            logger.error("删除用户异常="+e);
            Desc = "您所删除的用户不存在!";
        }
        return Desc;
    }

    @Override
    public String addUser(User user) {
        String Desc = "添加/修改成功!";
        try {
            userRepository.save(user);
        }catch (Exception e){
            logger.error("添加/修改用户异常="+e);
            e.printStackTrace();
            Desc = "添加/修改成功!";
        }
        return Desc;
    }

}
