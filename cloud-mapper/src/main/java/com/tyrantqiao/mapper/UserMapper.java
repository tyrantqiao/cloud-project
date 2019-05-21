package com.tyrantqiao.mapper;

import com.tyrantqiao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author tyrantqiao
 */
@Mapper
public interface UserMapper {
    /**
     * 获取user
     *
     * @param username
     * @return
     */
    @Select("select username,id,password from User where username=#{username}")
    User select(@Param("username") String username);
}