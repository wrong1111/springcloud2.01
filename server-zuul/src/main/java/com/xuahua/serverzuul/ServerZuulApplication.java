package com.xuahua.serverzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServerZuulApplication {
    //网关服务启动类
    public static void main(String[] args) {
        SpringApplication.run(ServerZuulApplication.class, args);
        System.out.print("++++++++++++++++++++++++网关服务启动成功！！++++++++++++++++++++++++");
    }
}
