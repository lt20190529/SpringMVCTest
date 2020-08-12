package com.lt.controller;

import com.lt.entity.Menu;
import com.lt.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/tree")
    public ModelAndView tree() {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("menuTree");
        List<Menu> menuList=menuService.findAllMenu();
        mv.addObject("menuList",menuList);
        return mv;
    }
    @RequestMapping(value = "/test1")
    public String treeN() {
        return "Test";
    }
}
