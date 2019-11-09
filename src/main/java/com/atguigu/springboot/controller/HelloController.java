package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jiangyf
 * @create 2019-11-08 15:25
 */
@Controller
public class HelloController {
    @GetMapping("/abc")
    public String hello(Model model){


        model.addAttribute("msg","你好");
        return "success";
    }
}
