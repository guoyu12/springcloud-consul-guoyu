package com.anshark.controller;

import com.anshark.feign.MemeberFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author GUOYU
 * @Date 2021/1/18
 * @Desc
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private MemeberFeign memeberFeign;

    @HystrixCommand(fallbackMethod="hystrix")
    @RequestMapping("/getOrder")
    public String getOrder() {
        return memeberFeign.getMember() + " -> getOrder";
    }

    String hystrix(){
        return "hystrix";
    }


}
