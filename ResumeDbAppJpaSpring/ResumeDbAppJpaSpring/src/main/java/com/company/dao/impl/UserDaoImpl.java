package com.company.dao.impl;

import com.company.dao.inter.UserDaoInter;
import com.company.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDaoInter {

    @PersistenceContext
    EntityManager em;

    //NamedQuery
    @Override
    public User findByEmail(String email) {

        Query query = em.createNativeQuery("SELECT * FROM user WHERE  email =?", User.class);
        query.setParameter(1, email);
        List<User> list = query.getResultList();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }


    @Override

    public List<User> getAll() {
        Query query = em.createQuery("select u from User u  ", User.class);
        List<User> list = query.getResultList();
        return list;
//
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