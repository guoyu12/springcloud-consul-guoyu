package com.anshark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author GUOYU
 * @Date 2021/1/18
 * @Desc
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigConsulApp {

    public static void main(String[] args) {

        SpringApplication.run(ConfigConsulApp.class, args);

    }
}
