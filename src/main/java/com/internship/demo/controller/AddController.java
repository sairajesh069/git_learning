package com.internship.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class AddController {

    @GetMapping("/add")
    public Integer add(@RequestParam int num1, @RequestParam int num2) {
        return num1 + num2;
    }
    
}
