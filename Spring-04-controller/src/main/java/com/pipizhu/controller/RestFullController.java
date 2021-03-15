package com.pipizhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFullController {

    @GetMapping(value = "/add/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果为"+res);

        return "/test";
    }
    @PostMapping(value = "/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){
        int res=Math.abs(a-b);
        model.addAttribute("msg","结果为"+res);

        return "/test";
    }
}
