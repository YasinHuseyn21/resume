package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.UserDaoInter;
import com.company.entity.User;



import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl extends AbstractDao implements UserDaoInter {
   @PersistenceContext
    EntityManager em;


    //NamedQuery      
    public User findByEmail(String email) {
        Query query = em.createNamedQuery("User.findByEmail", User.class);
        query.setParameter("email", email);
        List<User> list = query.getResultList();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }


    @Override
    public List<User> getAll() {
        Query query = em.createQuery("select u from User u", User.class);
        List<User> list = query.getResultList();
        return list;

    }

    @Override
    public User getById(int userId) {
        User u = em.find(User.class, userId);
        return u;

    }

    @Override
    public boolean updateUser(User user) {
        em.merge(user);
        return true;
    }

    @Override
    public boolean removeUser(int id) {
        User u = em.find(User.class, id);
        em.remove(u);
        return true;

    }

    @Override
    public boolean addUser(User user) {
        em.persist(user);
        return true;
    }


}