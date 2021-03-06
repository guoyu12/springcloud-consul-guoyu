package com.anshark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author GUOYU
 * @Date 2021/1/14
 * @Desc springcloud整合consul
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
@EnableHystrix
@RequestMapping("/app")
public class ConsulOrderApp {

    public static void main(String[] args) {

        SpringApplication.run(ConsulOrderApp.class, args);

    }

    @RequestMapping("/hello")
    String hello(){
        return "order - hello";
    }
}
