package com.tyrantqiao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tyrantqiao
 * date: 2019/5/22
 * blog: tyrantqiao.com
 * contact: tyrantqiao@icloud.com
 */
@RestController
//@RequestMapping("/config")
public class ConfigController {
    @Value("${message}")
    private String message;

    @GetMapping("message")
    public String getMessage() {
        return this.message;
    }
}
