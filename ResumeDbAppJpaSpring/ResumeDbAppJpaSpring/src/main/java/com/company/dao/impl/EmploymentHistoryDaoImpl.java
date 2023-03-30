package com.company.dao.impl;

import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.entity.EmploymentHistory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository("employmentHistoryDao1")
public class EmploymentHistoryDaoImpl implements EmploymentHistoryDaoInter {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<EmploymentHistory> getAllEmploymentHistory() {


        Query query = em.createQuery("select e from EmploymentHistory e");
        List<EmploymentHistory> list = query.getResultList();
        em.close();
        return list;

    }
}
