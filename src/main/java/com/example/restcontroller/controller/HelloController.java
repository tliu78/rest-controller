package com.example.restcontroller.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "hello!";
    }

    @RequestMapping("/{foo}")
    public String show(@PathVariable String foo) {
        return "hello " + foo;
    }
}
