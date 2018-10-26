package com.xuahua.xuahuaprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@EnableEurekaClient
@RestController
public class XuahuaProviderApplication {
    //eureka客户端
    //服务提供者启动
    public static void main(String[] args) {
        SpringApplication.run(XuahuaProviderApplication.class, args);
        System.out.print("++++++++++++++++++++++++服务提供者启动成功！！++++++++++++++++++++++++");
    }



    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
