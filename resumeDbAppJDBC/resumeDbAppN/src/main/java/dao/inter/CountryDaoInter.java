/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.inter;

import entity.Country;
import java.util.List;

/**
 *
 * @author Yasin
 */
public interface CountryDaoInter {
    public List<Country> getAllCountry();
    public Country getById(int countryId);
    public boolean uptadeCountry(Country country);

}
