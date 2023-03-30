package com.company.dao.impl;

import com.company.dao.inter.CountryDaoInter;
import com.company.entity.Country;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository("countryDao1")
public class CountryDaoImpl  implements CountryDaoInter {
    @PersistenceContext
    EntityManager em;


    @Override
    public List<Country> getAllCountry() {
       Query query=em.createQuery("select c from Country c");
       List<Country> list=query.getResultList();
       return list;
      
}
}
