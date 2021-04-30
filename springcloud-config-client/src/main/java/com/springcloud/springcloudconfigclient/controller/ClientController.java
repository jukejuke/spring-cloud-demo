package com.springcloud.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-demo2
 * @description: 检查配置信息是否获取
 * @author: yaosh
 * @create: 2021-04-30 11:11
 */
@RestController
@RefreshScope
public class ClientController {

    /**
     * @RefreshScope 不能和@Configration在同一个类的注解上
     * @RefreshScope 注解能够保证，我们刷新不会影响到正在进行的业务
     */

    @Value("${word}")
    private String word;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return name+","+this.word;
    }
}
