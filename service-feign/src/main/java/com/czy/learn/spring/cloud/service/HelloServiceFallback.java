package com.czy.learn.spring.cloud.service;

import com.czy.learn.spring.cloud.domain.User;
import org.springframework.stereotype.Component;

/**
 * Created by chenzhiyuan on 2018/8/14.
 */
@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("未知",0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
