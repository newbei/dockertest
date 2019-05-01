package com.newbei.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/innerhi")
    public String hi(){
        return "Congratulations! It works!";
    }
}
