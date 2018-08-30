package com.czy.learn.spring.cloud.controller;

import com.czy.learn.spring.cloud.domain.User;
import com.czy.learn.spring.cloud.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenzhiyuan on 2018/8/14.
 */
@RestController("/refactor")
public class RefactorConsumerController {

    @Autowired
    private RefactorHelloService refactorHelloService;
    @GetMapping("/feign-consumer3")
    public String helloConsumer2(){
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("czy")).append("\n")
                .append(refactorHelloService.hello("czy",18)).append("\n")
                .append(refactorHelloService.hello(new User("czy",18))).append("\n");
        return sb.toString();
    }
}
