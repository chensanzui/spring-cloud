package com.czy.learn.spring.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by chenzhiyuan on 2018/8/14.
 */
@FeignClient("HELLO-SERVICE")
public interface RefactorHelloService extends com.czy.learn.spring.cloud.HelloService {
}
