package com.czy.learn.spring.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.ObservableExecutionMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chenzhiyuan on 2018/8/20.
 */
@Service
public class HystrixHelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback",groupKey = "groupKey",commandKey = "commondKey",threadPoolKey = "threadPoolKey",
    ignoreExceptions = {Exception.class},observableExecutionMode = ObservableExecutionMode.EAGER)
    public String helloService(){
        return restTemplate.getForObject("http://HELLO-SERVICE/hello",String.class);
    }

    public String helloFallback(){
        return "error";
    }
}
