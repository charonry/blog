package com.charon.blog.controller.admin;

import com.charon.blog.po.User;
import com.charon.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-24 10:18
 **/
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登录页面
     *
     * @return
     */
    @GetMapping("")
    public String loginPage(){
        return  "admin/login";
    }

    /**
     * 验证信息
     *
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password,
                        HttpSession session, RedirectAttributes attributes){
        User user=userService.checkUser(username,password);
        // 将信息保存到session中
        if(user!=null){
            // 若将密码返回不安全
            user.setPassword(null);
            session.setAttribute("user",user);
            return "admin/index";
        }
        // 重定向登录页面
        attributes.addFlashAttribute("message","用户名密码错误");
        return  "redirect:/admin";
    }

    /**
     * 登出页面
     *
     * @param session
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return  "redirect:/admin";
    }
}
