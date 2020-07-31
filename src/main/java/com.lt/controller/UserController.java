package com.lt.controller;


import com.lt.entity.User;
import com.lt.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger=Logger.getLogger(UserController.class);

    @Resource(name = "UserService")
    private UserService userService;

    @RequestMapping("/login")
    public String index(){
        return "html/login";
    }

    @RequestMapping("/find")
    @ResponseBody
    public Map<String,Object> findUser(User user, HttpServletRequest request){

      Map<String,Object> map=new HashMap();
      System.out.println("======Controller=======");
      User loginuser=userService.findUserByName(user.getName());
      if(loginuser !=null){
         map.put("result","main");
      }else{
          map.put("result","failed");
      }
      return map;
    }

    @RequestMapping("/main")
    public String success(){
        logger.info("login success");
        return "html/main";
    }
    @RequestMapping("/failed")
    public String failed(){
        logger.info("login failed");
        return "html/failed";
    }
}
