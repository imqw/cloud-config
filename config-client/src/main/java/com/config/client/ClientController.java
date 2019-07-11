package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Version 1.0.0
 */
@RestController
@RefreshScope
public class ClientController {

    @Value("${profile}")
    private String profile;

    @Value("${name}")
    private String name;


    @GetMapping("/profile")
    public String hello(){

        return this.profile +"   :    "+this.name;
    }

}
