package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.UserSkillDaoInter;
import com.company.entity.UserSkill;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


public class UserSkillDaoImpl extends AbstractDao implements UserSkillDaoInter {


    @Override
    public List<UserSkill> getAllSkill() {
        EntityManager em = em();
        Query query = em.createQuery("select us from UserSkill us");
        em.close();
        return query.getResultList();


    }
}
