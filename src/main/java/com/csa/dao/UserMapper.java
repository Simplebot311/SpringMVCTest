package com.csa.dao;

import com.csa.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yufeng1900
 * @create 2021-04-10 15:25
 */
@Mapper
public interface UserMapper {
    //用户注册
    void register(User user);
    //用户登录
    User login(String mobile, String password);
    //查询用户信息
    User findById(int id);
}