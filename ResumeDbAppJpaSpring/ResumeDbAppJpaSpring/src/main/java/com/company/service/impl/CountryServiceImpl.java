package com.company.service.impl;

import com.company.dao.inter.CountryDaoInter;
import com.company.entity.Country;
import com.company.service.inter.CountryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CountryServiceImpl implements CountryServiceInter {
    @Autowired
    @Qualifier("countryDao1")
    private CountryDaoInter countryDao;


    @Override
    public List<Country> getAllCountry() {
        return countryDao.getAllCountry();
    }
}
