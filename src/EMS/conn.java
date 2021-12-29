package EMS;

import java.sql.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn{
    
    public Connection c = null;
    PreparedStatement p = null;
    public Statement s;
 
    // connect to database
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ems","root","");
            s = c.createStatement();
            System.out.println("test"); // test message to check connection
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}