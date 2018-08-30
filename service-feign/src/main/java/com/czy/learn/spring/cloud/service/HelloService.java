package com.czy.learn.spring.cloud.service;

import com.czy.learn.spring.cloud.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenzhiyuan on 2018/8/14.
 */
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
    @GetMapping("/hello1")
    String hello(@RequestParam("name") String name);
    @GetMapping("/hello2")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);
    @PostMapping("/hello3")
    String hello(@RequestBody User user);
}
