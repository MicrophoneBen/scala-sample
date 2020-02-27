package com.bigdata.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangbingquan
 * @version 2020年02月17日
 * @since 2020年02月17日
 **/
@RestController
public class HelloController {

    @GetMapping("/javaHello")
    public String helloJava(){
        System.out.println("这是一句来自Java的测试");
        return "A Word From Java Context";
    }
}
