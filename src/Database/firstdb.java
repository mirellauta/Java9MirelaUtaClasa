/*
 * GNU 3.0
 * Each line should be prefixed with  * 
 */
package Database;

import java.sql.*;

/**
 *
 * @author Mirela
 */
public class firstdb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try { 

        String url = "jdbc:derby://localhost:1527/firstdb"; 
        Connection conn = DriverManager.getConnection(url,"adminescu","admin"); 
        Statement st = conn.createStatement();    
            //create table firsttable
st.executeUpdate("CREATE TABLE FIRSTTABLE (ID INTEGER NOT NULL, \"NAME\" VARCHAR(24), PRIMARY KEY (ID))"); 
//adaug cateva date in prima tabela
st.executeUpdate("INSERT INTO firsttable values(10, 'TEN')"); 
st.executeUpdate("INSERT INTO firsttable values(20, 'TWENTY')"); 
st.executeUpdate("INSERT INTO firsttable values(30, 'THIRTY')"); 

//creaza SECOND TABLE
st.executeUpdate("create table seconddb as select * from FIRSTTABLE with no data");
//adaug ceva date in tabela a doua
st.executeUpdate("insert into seconddb values(100,'ONE HUNDRED')"); 
st.executeUpdate("insert into seconddb values(200,'TWO HUNDRED')"); 
st.executeUpdate("insert into seconddb values(300,'THREE HUNDRED')"); 


            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
    
}
