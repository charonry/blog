package com.charon.blog.service;

import com.charon.blog.po.User;

/**
 * @description: 用户登录
 * @author: charon
 * @create: 2019-12-24 10:09
 **/
public interface UserService {
    User checkUser(String userName,String passWord);
}
