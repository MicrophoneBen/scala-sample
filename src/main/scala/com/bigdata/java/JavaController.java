package com.bigdata.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhangbingquan
 * @version 2020年02月17日
 * @since 2020年02月17日
 **/
@Controller
public class JavaController {
    public String redirectUrl = "http://www.baidu.com";

    @GetMapping("/java")
    @ResponseBody
    public String helloJava(){
        System.out.println("这是一句来自Java的测试");
        return "A Word From Java Context";
    }


    @GetMapping("/hello")
    public String helloWorld(){
        System.out.println("这是一句来自Java的测试");
        return "forward:" + redirectUrl;
    }

    @GetMapping("/suntek")
    public String helloSun(HttpServletResponse httpServletResponse){
        System.out.println("这是一句来自Java的测试");
        return "redirect:" + redirectUrl;
//        try {
//            httpServletResponse.sendRedirect(redirectUrl);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
