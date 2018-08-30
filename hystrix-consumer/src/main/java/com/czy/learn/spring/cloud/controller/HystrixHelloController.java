package com.czy.learn.spring.cloud.controller;

import com.czy.learn.spring.cloud.service.HystrixHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenzhiyuan on 2018/8/20.
 */
@RestController
public class HystrixHelloController {
    @Autowired
    private HystrixHelloService hystrixHelloService;

    @RequestMapping("hystrix-hello")
    public String hello(){
        return hystrixHelloService.helloService();
    }
}
