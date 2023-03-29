package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.UserDaoInter;
import com.company.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UserDaoImpl extends AbstractDao implements UserDaoInter {


    //NamedQuery      
    public User findByEmail(String email) {
        EntityManager em = em();
        Query query = em.createNamedQuery("User.findByEmail", User.class);
        query.setParameter("email", email);
        List<User> list = query.getResultList();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }


    @Override
    public List<User> getAll(String name ,String surname,Integer nationalityId) {
        EntityManager em = em();
//        Query query = em.createQuery("select u from User u  ", User.class);
//        List<User> list = query.getResultList();
//        return list;
        String jpql = "select u from User u  where  2=2";
        if (name != null && !name.trim().isEmpty()) {
            jpql += " and u.name:name";
        }
        if (surname != null && !surname.trim().isEmpty()) {
            jpql += " and u.surname:surname";
        }
        if (nationalityId != null) {
            jpql += " and u.nationality.id:nid";
        }

        Query query = em.createQuery(jpql, User.class);

        if (name != null && !name.trim().isEmpty()) {
            query.setParameter("name", name);
        }
        if (surname != null && !surname.trim().isEmpty()) {
            query.setParameter("surname", surname);
        }
        if (nationalityId != null) {
            query.setParameter("nid", nationalityId);
        }
        em.close();

        return query.getResultList();
    }

    @Override
    public User getById(int userId) {
        EntityManager em = em();
        User u = em.find(User.class, userId);
        em.close();
        return u;

    }


    @Override
    public boolean updateUser(User user) {

        EntityManager em = em();
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean removeUser(int id) {

        EntityManager em = em();
        User u = em.find(User.class, id);
        em.getTransaction().begin();

        em.remove(u);
        em.getTransaction().commit();
        em.close();
        return true;

    }

    @Override
    public boolean addUser(User user) {
        EntityManager em = em();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        return true;
    }


}