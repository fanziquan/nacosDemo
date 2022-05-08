package com.example.nacosclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :fanzq
 * @version : demoController.java, v 0.1 2022/05/02 15:31 Exp $
 * @description :
 */

@RestController
public class DemoController {

    @Value("${spring.application.name}")
    private String serverName;

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/getServerName")
    public String getServerName() {
        return serverName + port;
    }
}
