package com.czy.learn.spring.cloud;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by chenzhiyuan on 2018/8/30.
 */
@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
