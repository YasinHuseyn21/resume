package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.UserDaoInter;
import com.company.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UserDaoImpl extends AbstractDao implements UserDaoInter {
    
    
    //NamedQuery      
    public User findByEmail(String email){
    EntityManager em=em();
    Query query=em.createNamedQuery("User.findByEmail", User.class);
    query.setParameter("email",email);
    List<User> list=query.getResultList();
    if(list.size()==1){
    return list.get(0);
    }
    return  null;
    }
    
    
      @Override
    public List<User> getAll() {
       EntityManager em=em();
       Query query =em.createQuery("select u from User u",User.class);
       
        List<User> list= query.getResultList();
        return list;
        
    }
    
    @Override
    public User getById(int userId) {
         EntityManager entitymanager = em();
      User u=entitymanager.find(User.class, userId);
      entitymanager.close();
             return u;
       
    }

    @Override
    public boolean updateUser(User user) {
        
      EntityManager entitymanager = em();
      entitymanager.getTransaction().begin();
      entitymanager.merge(user);
      entitymanager.getTransaction().commit();
      entitymanager.close();
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
      return true;
      
    }

    @Override
    public boolean addUser(User user) {
      EntityManager entitymanager = em();
      entitymanager.getTransaction().begin();
      entitymanager.persist(user);
      entitymanager.getTransaction().commit();
      entitymanager.close();
      return true;
    }

  


}