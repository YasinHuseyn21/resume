package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.entity.Country;
import com.company.dao.inter.CountryDaoInter;

import java.sql.ResultSet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CountryDaoImpl extends AbstractDao implements CountryDaoInter {
    public static Country getCountry(ResultSet rs) throws Exception {
//        int id = rs.getInt("id");
//        String nationality = rs.getString("nationality");
//        String name = rs.getString("name");
//        return new Country(id, name, nationality);
return null;

    }

    @Override
    public List<Country> getAllCountry() {
       EntityManager em=em();
       Query query=em.createQuery("select c from Country c");
       List<Country> list=query.getResultList();
       return list;
      
}
}
