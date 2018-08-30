package com.czy.learn.spring.cloud;

import com.czy.learn.spring.cloud.domain.User;
import com.netflix.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

/**
 * Created by chenzhiyuan on 2018/8/14.
 */
@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping(value = "/hello",method= RequestMethod.GET)
    public String index(){
        return "hello-service";
    }

    @GetMapping("/hello1")
    public String hello(@RequestParam String name){
        return "hello" + name;
    }
    @GetMapping("/hello2")
    public User hello(@RequestHeader String name,@RequestHeader Integer age){
        return new User(name,age);
    }
    @GetMapping("/hello3")
    public String hello(@RequestBody User user){
        return "Hello "+ user.getName() + ", " + user.getAge();
    }
}
