package com.chen.logic.service.impl;

import com.chen.logic.entity.Test;
import com.chen.logic.mapper.TestMapper;
import com.chen.logic.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 陈梓平
 * @date 2017/11/2.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> get() {
        List<Test> tests = testMapper.queryTestInfo();
        return tests;
    }



}
