package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.entity.EmploymentHistory;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EmploymentHistoryDaoImpl extends AbstractDao implements EmploymentHistoryDaoInter {


    @Override
    public List<EmploymentHistory> getAllEmploymentHistory() {

        EntityManager em = em();
        Query query = em.createQuery("select e from EmploymentHistory e");
        List<EmploymentHistory> list = query.getResultList();
        em.close();
        return list;

    }
}
