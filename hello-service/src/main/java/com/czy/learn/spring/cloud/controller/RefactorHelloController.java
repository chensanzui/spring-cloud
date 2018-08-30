package com.czy.learn.spring.cloud.controller;

import com.czy.learn.spring.cloud.HelloService;
import com.czy.learn.spring.cloud.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenzhiyuan on 2018/8/14.
 */
@RestController
public class RefactorHelloController implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello"+ name;
    }

    @Override
    public User hello(String name, Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Hello "+ user.getName() + ", " + user.getAge();
    }
}
