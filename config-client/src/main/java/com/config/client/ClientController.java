package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Version 1.0.0
 */
@RestController
public class ClientController {

    @Value("${mybatis-plus.mapper-locations}")
    private String profile;

    @Value("${service.paycostUrl}")
    private String name;



    @GetMapping("/profile")
    public String hello() {

        return this.profile + "   :    " + this.name;
    }

}
