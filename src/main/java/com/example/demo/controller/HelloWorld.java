package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byron.Y.Y
 * @date 2016年10月12日
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello, SpringBoot!";
    }
}