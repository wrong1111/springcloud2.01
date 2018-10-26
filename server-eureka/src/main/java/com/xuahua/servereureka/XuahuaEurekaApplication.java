package com.xuahua.servereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class XuahuaEurekaApplication {
    //eureka服务端
    //服务注册中心启动
    public static void main(String[] args) {
        SpringApplication.run(XuahuaEurekaApplication.class, args);
        System.out.print("++++++++++++++++++++++++注册中心启动成功！！++++++++++++++++++++++++");

    }
}
