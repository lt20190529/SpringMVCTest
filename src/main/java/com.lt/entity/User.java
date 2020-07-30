package com.lt.entity;

import java.io.Serializable;

public class User  implements Serializable {


    private static final long serialVersionUID = -7342483694222229480L;

    private String id;

    private String name;

    private String password;

    private String sex;


    public User() {
    }


    public User(String id, String name, String password, String sex) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }


}
