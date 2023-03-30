package com.company.service.impl;

import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.entity.EmploymentHistory;
import com.company.service.inter.EmploymentHistoryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmploymentHistoryServiceImpl implements EmploymentHistoryServiceInter {
    @Autowired
    @Qualifier("employmentHistoryDao1")
    private EmploymentHistoryDaoInter employmentHistoryDao;

    @Override
    public List<EmploymentHistory> getAllEmploymentHistory() {
        return employmentHistoryDao.getAllEmploymentHistory();
    }
}
