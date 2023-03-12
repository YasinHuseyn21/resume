
package dao.impl;

import dao.inter.AbstractDao;
import dao.inter.CountryDaoInter;
import entity.Country;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CountryDaoImpl extends AbstractDao implements CountryDaoInter {
    
    public  Country getCountry(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String nationality = rs.getString("nationality");
        String name = rs.getString("name");
        return new Country(id, name, nationality);
    }

    @Override
    public List<Country> getAllCountry() {
        List<Country> result = new ArrayList<>();
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from country");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                Country country = getCountry(rs);
                result.add(country);


            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;

    }
    @Override
     public Country getById(int countryId) {
        Country result = null;
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("SELECT\n" +
"	* \n" +
"FROM\n" +
"	country \n" +
"WHERE\n" +
"	id = " + countryId);
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                result = getCountry(rs);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;

    }
     @Override
    public boolean uptadeCountry(Country country){
        try(Connection c=connect()){
        PreparedStatement stmt =c.prepareStatement("uptade country set name=?, nationality=? where id=?");
        stmt.setString(1,country.getName());
        stmt.setString(2,country.getNationality());  
        stmt.setInt(3,country.getId());
    return stmt.execute();
    }
    catch(Exception ex){
    return false;
}
}}

