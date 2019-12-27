package com.charon.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-26 23:03
 **/
@Controller
public class AboutShowController {

    /**
     * 关于我页面
     *
     * @return
     */
    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
