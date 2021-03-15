package com.pipizhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo2 {

    @RequestMapping("hello")
    public String HelloControllerDemo2(Model model){

        model.addAttribute("msg","Hello");

        return "test";
    }
}
