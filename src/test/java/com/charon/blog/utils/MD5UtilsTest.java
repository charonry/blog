package com.charon.blog.utils;

import com.charon.blog.util.MD5Utils;
import org.junit.Test;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-24 11:18
 **/
public class MD5UtilsTest {
    @Test
    public void test(){
        System.out.println(MD5Utils.code("admin"));
    }
}
