package com.company.service.impl;

import com.company.dao.inter.SkillDaoInter;
import com.company.entity.Skill;
import com.company.service.inter.SkillServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillServiceImpl implements SkillServiceInter {
    @Autowired
    @Qualifier("skillDao1")
    private SkillDaoInter skillDao;

    @Override
    public List<Skill> getAllSkill() {
        return skillDao.getAllSkill();

    }
}
