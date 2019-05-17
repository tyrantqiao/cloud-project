package com.tyrantqiao;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author tyrantqiao
 * date: 2019/5/17
 * blog: tyrantqiao.com
 * contact: tyrantqiao@icloud.com
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class AdminApplication {
    public static void main(String[] args){
        SpringApplication.run(AdminApplication.class,args);
    }
}
