package com.jks.usercenter.service;

import io.lettuce.core.RedisClient;
import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class RedissonTest {

    @Resource
    private RedissonClient redissonClient;

    @Test
    void test(){
        List<String> list = new ArrayList<>();
        list.add("dog");
        System.out.println("list: " + list.get(0));

        RList<String> rlist = redissonClient.getList("test-list");
        rlist.add("dog");
        System.out.println("rlist: " + rlist.get(0));
    }

}
