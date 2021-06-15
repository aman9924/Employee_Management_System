// C:\Program Files\MySQL\MySQL Server 8.0\bin

import java.sql.*;
public class conn {

       public Connection c;
       public Statement st;
    public conn(){

        try {

            c = DriverManager.getConnection("jdbc:mysql://localhost/db1", "root", "Aman@9924");
            st =c.createStatement();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}

