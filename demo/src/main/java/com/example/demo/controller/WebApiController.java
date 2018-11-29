package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("api")
public class WebApiController {

    @RequestMapping("hello")
    private String hello() {
        return "index";
    }

}
