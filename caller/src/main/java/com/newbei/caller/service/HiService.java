package com.newbei.caller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiService {
    @Autowired
    private RestTemplate restTemplate ;

    public String hi(){
        String url = "http://com.newbei.helloworld:8888/innerhi";
        return this.restTemplate.getForObject(url,String.class);
    }
}
