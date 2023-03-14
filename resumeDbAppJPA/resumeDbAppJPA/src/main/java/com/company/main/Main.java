package com.company.main;

import com.company.dao.impl.UserDaoImpl;
import com.company.entity.User;


public class Main {
    public static void main(String[] args) throws Exception {
        UserDaoImpl dao=new UserDaoImpl();
       User u= dao.findByEmail("yasin.huseyn.dev@gmail.com");
        System.out.println(u);
        


    }
}
