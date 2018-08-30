package com.czy.learn.spring.cloud.service;

import com.czy.learn.spring.cloud.domain.User;
import com.netflix.hystrix.HystrixCommand;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chenzhiyuan on 2018/8/20.
 * 通过继承封装请求调用
 * 同步调用 new UserCommand(restTemplate, lL) . execute ()
 * 异步调用 new UserCommand(restTemplate,lL) .queue()
 *
 */
public class UserCommand extends HystrixCommand<User> {
    private RestTemplate restTemplate;
    private Long id;
    protected UserCommand(Setter setter,RestTemplate restTemplate,Long id) {
        super(setter);
        this.restTemplate = restTemplate;
        this.id = id;
    }

    @Override
    protected User run() throws Exception {
        return null;
    }
}
