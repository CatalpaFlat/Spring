package com.chen.mapper;

import com.chen.logic.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 陈梓平
 * @date 2017/11/2.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml"})
public class TestMybatis {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void test(){
        List<com.chen.logic.entity.Test> tests = testMapper.queryTestInfo();
    }
}
