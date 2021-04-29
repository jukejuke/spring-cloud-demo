package com.springcloud.eurekaconsumer.controller;

import com.springcloud.eurekaconsumer.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: spring-cloud-demo2
 * @description:
 * @author: yaosh
 * @create: 2021-04-29 14:42
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IHelloService helloService;

    private static final String applicationName = "single-provider";

    @RequestMapping(value = "feignRequest")
    public Object feignRequest(){
        String s = helloService.nice();
        return s;
    }

    @RequestMapping(value = "commonRequest")
    public Object commonRequest(){
        String url = "http://"+ applicationName +"/hello";
        String s = restTemplate.getForObject(url,String.class);
        return s;
    }
}
