/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import dao.impl.CountryDaoImpl;
import dao.impl.SkillDaoImpl;
import dao.impl.UserDaoImpl;
import dao.inter.CountryDaoInter;
import dao.inter.SkillDaoInter;
import dao.inter.UserDaoInter;

/**
 *
 * @author Yasin
 */
public class Context {
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }
    public static SkillDaoInter instanceSkillDao(){
        return new SkillDaoImpl();
    }
    public static CountryDaoInter instanceCountryDao(){
        return new CountryDaoImpl();
    }
}
