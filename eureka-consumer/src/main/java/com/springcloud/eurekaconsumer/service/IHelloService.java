package com.springcloud.eurekaconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring-cloud-demo2
 * @description: 配置服务提供者：single-provider 是服务提供者的 application.name
 * @author: yaosh
 * @create: 2021-04-29 14:40
 */
@FeignClient("single-provider")
public interface IHelloService {

    @RequestMapping(value = "/hello")
    String hello();

    @RequestMapping(value = "nice")
    String nice();
}
