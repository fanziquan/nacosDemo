package com.example.nacoscunsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author :fanzq
 * @version : DemoController.java, v 0.1 2022/05/02 16:28 Exp $
 * @description :
 */
@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/sendmessage")
    public String sendmessage() {
       return restTemplate.getForObject("http://nacos-provider/getServerName", String.class);
    }
}
