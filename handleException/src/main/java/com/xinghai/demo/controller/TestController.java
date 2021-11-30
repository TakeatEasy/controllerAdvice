package com.xinghai.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class TestController {

    @GetMapping("exception")
    public String exceptionController() {

        int i = 1 / 0;
        return "No Problem";
    }
}
