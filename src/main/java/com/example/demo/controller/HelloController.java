package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping({ "/admin/hello" })
    public String firstPage() {
        return "Hello World";
    }

    @RequestMapping({ "/user/hello" })
    public String firstPage1() {
        return "Hello World";
    }

    @RequestMapping({ "/hello" })
    public String firstPage2() {
        return "Hello World";
    }
}
