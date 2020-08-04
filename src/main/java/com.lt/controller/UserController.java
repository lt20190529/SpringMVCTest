package com.lt.controller;


import com.lt.service.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    private Logger logger=Logger.getLogger(UserController.class);



    @Resource(name = "UserService")
    private UserService userService;



    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
        return "login";
    }


    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, Model model) {

        ModelMap map=new ModelMap();

        String name= request.getParameter("username");
        String pwd=request.getParameter("password");
        Subject subject= SecurityUtils.getSubject();  //获得主体
        UsernamePasswordToken taken = new UsernamePasswordToken(name,pwd);

        try {
            subject.login(taken);
        } catch (UnknownAccountException e){
            String message="未知的账号";
            logger.info("未知的账号");
            map.put("message", message);
            return new ModelAndView("login");    //失败定位登录界面
        } catch (ConcurrentAccessException e){
            logger.info("并发访问异常（多个用户同时登录时抛出）");
            return new ModelAndView("login");    //失败定位登录界面
        } catch (LockedAccountException e){
            logger.info("账号被锁定");
            return new ModelAndView("login");    //失败定位登录界面
        } catch (DisabledAccountException e){
            logger.info("禁用的账号");
            return new ModelAndView("login");   //失败定位登录界面
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return new ModelAndView("login");   //失败定位登录界面
        }
        logger.info("login success");
        return new ModelAndView("main");
    }

}
