package com.yuman.consumer.feign;

import com.zhang.provider.client.HelloWorldClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(contextId = "HelloWorldServiceFeign", name = "provider",
        primary = false, url = "http://localhost:8080/")
/**
 * @Author Yuman.Zhang
 * @Date 2023/3/9 17:54
 * @Description 也可以不继承HelloWorldClient类，自己写方法，只要有请求的方法完整路径，例如注释部分
 */
public interface HelloWorldServiceFeign extends HelloWorldClient {

    /*@PostMapping({"/hello/sayHello"})
    String suiBianXie();*/
}
