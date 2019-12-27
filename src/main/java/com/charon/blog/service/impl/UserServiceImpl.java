package com.charon.blog.service.impl;

import com.charon.blog.dao.UserRepository;
import com.charon.blog.po.User;
import com.charon.blog.service.UserService;
import com.charon.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-24 10:11
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String userName, String passWord) {
        User user=userRepository.findByUsernameAndPassword(userName, MD5Utils.code(passWord));
        return user;
    }
}
