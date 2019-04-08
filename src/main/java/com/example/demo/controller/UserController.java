package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.impl.UserServiceImpl;
import com.example.demo.tool.PaginationTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        String Desc = userServiceImpl.addUser(user);
        return Desc;
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
        int count = userServiceImpl.findCount();
        int page = (int) map.get("page");
        int pageSize = (int) map.get("pageSize");
        PaginationTool paginationTool = new PaginationTool();
        map.putAll(paginationTool.pagination(page, pageSize, count));
        logger.info("分页工具类返回的参数=" + map);
        List<User> userList = userServiceImpl.findAllUser(map);
        logger.info("出参为=" + userList);
        return userList;
    }

    @ApiOperation(value = "删除用户", notes = "入参为用户id")
    @GetMapping("/hello/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        logger.info("入参为=" + id);
        String Desc = userServiceImpl.deleteUser(id);
        return Desc;
    }

}
