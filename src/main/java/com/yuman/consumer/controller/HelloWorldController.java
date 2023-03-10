package com.yuman.consumer.controller;

import com.yuman.consumer.feign.HelloWorldServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorldController {

    @Autowired
    private HelloWorldServiceFeign helloWorldServiceFeign;

    @RequestMapping("sayHelloConsumer")
    public String sayHelloConsumer() {
        return helloWorldServiceFeign.sayHello();
    }
}
