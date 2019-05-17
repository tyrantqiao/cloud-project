package com.tyrantqiao;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tyrantqiao
 * date: 2019/5/17
 * blog: tyrantqiao.com
 * contact: tyrantqiao@icloud.com
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaApplication.class,args);
    }
}
