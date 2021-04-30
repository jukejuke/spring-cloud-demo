package com.springcloud.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
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
public class ClientController {

    @Value("${word}")
    private String word;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return name+","+this.word;
    }
}
