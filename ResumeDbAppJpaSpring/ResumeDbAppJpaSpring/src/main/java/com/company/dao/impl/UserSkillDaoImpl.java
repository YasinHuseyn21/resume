package com.company.dao.impl;

import com.company.dao.inter.UserSkillDaoInter;
import com.company.entity.UserSkill;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository
public class UserSkillDaoImpl implements UserSkillDaoInter {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<UserSkill> getAllSkill() {

        Query query = em.createQuery("select us from UserSkill us");
        return query.getResultList();
    }
}
