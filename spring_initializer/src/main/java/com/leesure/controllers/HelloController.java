package com.leesure.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/sure")
    public String sayHey(){
        return "li xuan1";
    }
}
