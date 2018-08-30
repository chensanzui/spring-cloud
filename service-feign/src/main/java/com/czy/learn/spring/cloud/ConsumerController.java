package com.czy.learn.spring.cloud;

import com.czy.learn.spring.cloud.domain.User;
import com.czy.learn.spring.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenzhiyuan on 2018/8/14.
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @GetMapping("/feign-consumer")
    public String helloConsumer(){
        return helloService.hello();
    }

    @GetMapping("/feign-consumer2")
    public String helloConsumer2(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello("czy")).append("\n")
           .append(helloService.hello("czy",18)).append("\n")
           .append(helloService.hello(new User("czy",18))).append("\n");
        return sb.toString();
    }
}
