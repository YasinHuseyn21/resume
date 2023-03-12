package main;

import dao.inter.UserDaoInter;
import entity.User;

public class Main {
    public static void main(String[] args) throws Exception {

        UserDaoInter userDao = Context.instanceUserDao();
        User user=userDao.getById(1);
        user.setName("Yasin");
        userDao.updateUser(user);



    }
}
