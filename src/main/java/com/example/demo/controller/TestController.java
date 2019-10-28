package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhuhui
 * @Date: 2019/10/28 15:08
 * @Version: 1.0
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/hello")
    public String test(){
        return "hello world";
    }
}
