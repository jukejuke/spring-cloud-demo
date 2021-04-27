package com.springcloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-demo2
 * @description:
 * @author: yaosh
 * @create: 2021-04-27 10:31
 */
@RestController
public class SystemController {

    /**
     * 根据指定的微服务名称，获取它的实例信息
     * @param applicationName
     * @return
     */
    @GetMapping("eureka-instance")
    public String getEurekaInstance(String applicationName) {

    }
