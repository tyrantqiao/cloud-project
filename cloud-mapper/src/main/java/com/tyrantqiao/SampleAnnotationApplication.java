package com.tyrantqiao;

import com.tyrantqiao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@link CommandLineRunner} 表明bean需要spring application或者spring context的支持。
 *
 * @author tyrantqiao
 * date: 2019/5/21
 * blog: tyrantqiao.com
 * contact: tyrantqiao@icloud.com
 */
@SpringBootApplication
public class SampleAnnotationApplication implements CommandLineRunner {
    private final UserMapper userMapper;

    @Autowired
    public SampleAnnotationApplication(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void run(String... args) {
        System.out.println(this.userMapper.select("qiao"));
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleAnnotationApplication.class, args);
    }
}
