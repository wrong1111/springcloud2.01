package com.xuahua.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: com.xuahua.configclient
 * author: wyong
 * mail: 343886028@qq.com
 * date: 2018/10/25
 * description :
 */
@RestController
@RefreshScope
public class HiController {
    @Value("${foo}")
    String foo;


    @Value("${moive.name}")
    String name;

    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }


    @RequestMapping(value = "/name")
    public String name() {
        return name;
    }
}
