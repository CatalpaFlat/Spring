package com.chen.logic.controller;

import com.chen.logic.entity.Test;
import com.chen.logic.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 陈梓平
 * @date 2017/11/2.
 */
@RequestMapping
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping(value = "get")
    public List<Test> get(){
        return testService.get();
    }

    @GetMapping(value = "get2")
    public String get2(){
        return "qwhuidhdiuwhqiuw";
    }
}
