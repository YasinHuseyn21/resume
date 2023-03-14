package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.UserSkillDaoInter;
import com.company.entity.UserSkill;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UserSkillDaoImpl extends AbstractDao implements UserSkillDaoInter {


    @Override
    public List<UserSkill> getAllSkillByUserId(Integer userId) {
        EntityManager em=em();
        String jpql="select s from UserSkill s where";
        
       
        if ( userId != null){
         jpql += " and s user.id=:sid";
        }
//         if( name!=null && !name.trim().isEmpty()){
//            jpql += " add s name=:name ";
//        }
         Query query =em.createQuery(jpql,UserSkill.class);
         
         
        if ( userId != null){
         query.setParameter("sid", userId);
        }
//        if( name!=null && !name.trim().isEmpty()){
//           query.setParameter("name",name);
//           
//        }
         List<UserSkill> list=query.getResultList();
         
     
//            PreparedStatement stmt = c.prepareStatement("SELECT" +
//                    "\tu.*," +
//                    "\tus.skill_id," +
//                    "\ts.NAME AS skill_name," +
//                    "\tus.power " +
//                    "FROM" +
//                    "\tuser_skill us" +
//                    "\tLEFT JOIN USER u ON us.id = u.id" +
//                    "\tLEFT JOIN skill s ON us.id = s.id " +
//                    "WHERE" +
//                    "\tus.user_id = ?");
        return list;
    }
}
