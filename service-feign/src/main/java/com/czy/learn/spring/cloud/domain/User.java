package com.czy.learn.spring.cloud.domain;


/**
 * Created by chenzhiyuan on 2018/8/14.
 */

public class User {
    private String name;
    private Integer age;
    public User(){

    }

    public User(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
