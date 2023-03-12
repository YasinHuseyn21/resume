/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.inter;

import entity.User;
import java.util.List;

/**
 *
 * @author Yasin
 */
public interface UserDaoInter {
    public List<User> getAll();
    public User getById(int userId);
    public boolean updateUser(User user);
    public boolean removeUser(int id);
    public boolean addUser(User user);




}