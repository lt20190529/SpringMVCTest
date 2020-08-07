package com.lt.service.impl;

import com.lt.dao.MenuDao;
import com.lt.entity.Menu;
import com.lt.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("MenuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;


    @Override
    public List<Menu> findAllMenu() {
        return menuDao.getAllMenu();

    }
}
