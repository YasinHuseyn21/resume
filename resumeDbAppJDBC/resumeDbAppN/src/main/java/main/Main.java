/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import dao.impl.UserDaoImpl;
import dao.inter.CountryDaoInter;
import dao.inter.UserDaoInter;
import entity.Country;


/**
 *
 * @author Yasin
 */
public class Main {
    public static void main(String[] args) throws Exception{
        
        CountryDaoInter countryDao=Context.instanceCountryDao();
//    UserDaoInter userDao=Context.instanceUserDao();
Country country= countryDao.getById(1);
        System.out.println(country);
      
}}
