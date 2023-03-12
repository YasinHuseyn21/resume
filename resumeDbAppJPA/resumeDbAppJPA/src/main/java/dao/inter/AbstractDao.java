package dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDao {

    public  Connection connect() throws Exception {
//        com.mysql.jdbc.Driver cd;

        String url = "jdbc:mysql://localhost:3306/resume";
        String username = "root";
        String password = "232306";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }
    private static EntityManagerFactory emf=null;
    
    public EntityManager em(){
        if(emf==null){
        emf= Persistence.createEntityManagerFactory( "resumeDbAppPU" );
        }
      EntityManager entitymanager = emf.createEntityManager( );
    return entitymanager;
    }
    public void close(EntityManager em){
        em.close();
        em.getEntityManagerFactory().close();
        
    }
}