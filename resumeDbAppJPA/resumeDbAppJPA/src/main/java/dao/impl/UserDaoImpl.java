package dao.impl;

import dao.inter.AbstractDao;
import dao.inter.UserDaoInter;
import entity.User;

import java.util.List;
import javax.persistence.EntityManager;

public class UserDaoImpl extends AbstractDao implements UserDaoInter {
    
    @Override
    public User getById(int userId) {
         EntityManager entitymanager = em();
      User u=entitymanager.find(User.class, userId);
      entitymanager.close();
      close(entitymanager);
       return u;
       
    }

    @Override
    public boolean updateUser(User user) {
        
        EntityManager entitymanager = em();
       entitymanager.getTransaction().begin();
      entitymanager.merge(user);
      entitymanager.getTransaction().commit();
      entitymanager.close();
      close(entitymanager);
      return true;
    }

    @Override
    public boolean removeUser(int id) {
      
      EntityManager entitymanager = em();
       User u=entitymanager.find(User.class,id);
       entitymanager.getTransaction().begin();

      entitymanager.remove(u);
      entitymanager.getTransaction().commit();
      entitymanager.close();
      close(entitymanager);
      return true;
      
    }

    @Override
    public boolean addUser(User user) {
      EntityManager entitymanager = em();
       entitymanager.getTransaction().begin();
      entitymanager.persist(user);
      entitymanager.getTransaction().commit();
      entitymanager.close();
      close(entitymanager);      
      return true;
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }







}