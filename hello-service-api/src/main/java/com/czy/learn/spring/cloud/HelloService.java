package com.czy.learn.spring.cloud;

import com.czy.learn.spring.cloud.domain.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenzhiyuan on 2018/8/14.
 */
@RequestMapping("/refactor")
public interface HelloService {
    @GetMapping("/hello4")
    String hello(@RequestParam("name") String name);
    @GetMapping("/hello5")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);
    @PostMapping("/hello6")
    String hello(User user);
}
