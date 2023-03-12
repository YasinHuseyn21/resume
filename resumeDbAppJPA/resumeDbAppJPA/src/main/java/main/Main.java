package main;

import dao.inter.UserDaoInter;



public class Main {
    public static void main(String[] args) throws Exception {
        UserDaoInter dao=Context.instanceUserDao();
       dao.removeUser(3);
        
        


    }
}
