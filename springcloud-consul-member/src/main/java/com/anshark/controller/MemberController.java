package com.anshark.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author GUOYU
 * @Date 2021/1/18
 * @Desc
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Value("${server.port}")
    private String port;

    @Value("${data.info}")
    private String configVal;

    @HystrixCommand(fallbackMethod = "hystrix")
    @RequestMapping("/getMember")
    public String getMember() {
        return "会员服务: " + port;
    }

    String hystrix() {
        return "hystrix";
    }

    @RequestMapping("/test")
    String test() {
        return configVal;
    }


}
