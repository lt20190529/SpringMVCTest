package com.lt.dao;


import com.lt.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("MenuDao")
public interface MenuDao {

    //@Autowired
    //private JdbcTemplate jdbcTemplate;

   /*public List<Menu> getAllMenu(){
       String sql = "SELECT * FROM sys_menu";
       List<Menu> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper<Menu>(Menu.class));
       return list;
   }*/

    public List<Menu> getAllMenu();


}
