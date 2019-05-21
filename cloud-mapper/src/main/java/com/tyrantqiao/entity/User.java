package com.tyrantqiao.entity;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author tyrantqiao
 */
@Mapper
@Data
public class User {
    private Long id;

    private String username;

    private String password;
}