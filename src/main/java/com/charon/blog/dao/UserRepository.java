package com.charon.blog.dao;

import com.charon.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-24 10:14
 **/
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUsernameAndPassword(String username,String password);
}
