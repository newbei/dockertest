package com.newbei.caller.controller;

import com.newbei.caller.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallerController {
    @Autowired
    private HiService hiService;

    @RequestMapping("/hi")
    public String hi(){
        return "Caller result : \"" +  hiService.hi() + "\"";
    }
}
