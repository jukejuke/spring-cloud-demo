package com.springcloud.eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring-cloud-demo2
 * @description:
 * @author: yaosh
 * @create: 2021-04-27 09:19
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/demo")
    public Map<String,Object> demo(){
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("msgno","0000");
        retMap.put("msg","OK");
        return retMap;
    }
}
