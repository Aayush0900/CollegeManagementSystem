package cms;

import java.sql.*;

public class conn {
    public Connection c;
    public Statement s;

    public conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            2402:8100:3867:af36:8864:4cd0:9f0d:2599
            c = DriverManager.getConnection("jdbc:mysql://localhost/ums","root","");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
