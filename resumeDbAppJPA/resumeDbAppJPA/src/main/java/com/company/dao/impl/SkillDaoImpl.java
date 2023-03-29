package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.SkillDaoInter;
import com.company.entity.Skill;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class SkillDaoImpl extends AbstractDao implements SkillDaoInter {

 

    @Override
    public List<Skill> getAllSkill() {
        EntityManager em = em();
        Query query =em.createQuery("select s from Skill s",Skill.class);
        List<Skill> list=query.getResultList();
        em.close();
        return list;
    }
}
