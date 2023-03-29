package com.company.main;

import com.company.dao.impl.UserDaoImpl;
import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.dao.inter.UserDaoInter;
import com.company.entity.EmploymentHistory;
import com.company.entity.User;

import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        UserDaoInter userDao=Context.instanceUserDao();
       List<User> list=userDao.getAll(null,null,null);
        System.out.println(list);


    }
}
