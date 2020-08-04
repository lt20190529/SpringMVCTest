package com.lt.controller;


import com.lt.service.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger=Logger.getLogger(UserController.class);

    @Resource(name = "UserService")
    private UserService userService;



    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String loginuserName, String passwd, Model model) {

        Subject subject= SecurityUtils.getSubject();  //获得主体
        UsernamePasswordToken taken = new UsernamePasswordToken("zhangsan","123");

        try {
            subject.login(taken);
        } catch (AuthenticationException e) {
            //e.printStackTrace();
            return "login";    //失败定位登录界面
            //return e.getMessage();login
        }

        logger.info("login success");
        return "main";
    }

}
