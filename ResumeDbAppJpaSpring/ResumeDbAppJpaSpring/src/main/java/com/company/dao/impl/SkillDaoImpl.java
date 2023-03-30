package com.company.dao.impl;

import com.company.dao.inter.SkillDaoInter;
import com.company.entity.Skill;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository("skillDao1")
public class SkillDaoImpl  implements SkillDaoInter {


    @PersistenceContext
    EntityManager em;
    @Override
    public List<Skill> getAllSkill() {
        Query query =em.createQuery("select s from Skill s",Skill.class);
        List<Skill> list=query.getResultList();
        return list;
    }
}
