package com.tyrantqiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author tyrantqiao
 * date: 2019/5/18
 * blog: tyrantqiao.com
 * contact: tyrantqiao@icloud.com
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTurbine
public class TurbineApplication {
    public static void main(String[] args){
        SpringApplication.run(TurbineApplication.class,args);
    }
}
