package com.company.service.impl;

import com.company.dao.inter.UserSkillDaoInter;
import com.company.entity.UserSkill;
import com.company.service.inter.UserSkillServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserSkillServiceImpl implements UserSkillServiceInter {
    @Autowired
    @Qualifier("userSkillDao1")
    private UserSkillDaoInter userSkillDao;

    @Override
    public List<UserSkill> getAllSkill() {
        return userSkillDao.getAllSkill();
    }

}
