package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "Hello接口")
@RestController
public class HelloController {

    @ApiOperation(value = "接口描述" ,  notes="这里填写执行说明")
    @RequestMapping(value = "/hello", method= RequestMethod.POST)
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }

}