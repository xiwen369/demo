package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Api(description = "用户接口")
@RestController
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value = "添加用户", notes = "入参需要姓名和年龄")
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(@RequestBody User user) {
        logger.info("入参为=" + user);
//        try {
//            userRepository.save(user);
//            return "0000";
//        } catch (Exception e) {
//            logger.info("报错信息为=" + e);
//            e.printStackTrace();
//            return "9999";
//        }
        return null;
    }

    /**
     * @param map {"page":0,"pageSize":5,"flag":0}
     *            flag = 0 表示查询所有用户
     *            备注:这里需要分页
     */
    @ApiOperation(value = "用户查询", notes = "可以查询所有用户和精确用户")
    @RequestMapping(value = "findUser", method = RequestMethod.POST)
    public List<User> findUser(@RequestBody Map map) {
        logger.info("入参为=" + map);
        List<User> userList = userServiceImpl.findAllUser(map);
        logger.info("出参为=" + userList);
        return userList;
    }

    @ApiOperation(value = "删除用户", notes = "入参为用户id")
    @RequestMapping(value = "deleteUser", method = RequestMethod.POST)
    public String deleteUser(@RequestBody Map map) {
        logger.info("入参为=" + map);
        int id = (int) map.get("id");
        logger.info("id=" + id);
//        try {
//            userRepository.delete(id);
//            return "0000";
//        } catch (Exception e) {
//            logger.info("报错信息为=" + e);
//            e.printStackTrace();
//            return "9999";
//        }
        return null;
    }

}
