/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Khizar Fayyaz
 */
public class dbconnection {
    public static Connection buildConnection()
    {
         String url = "jdbc:derby://localhost:1527/";    
         String dbName = "tt";        
         String userName = "tt";     
         String password = "tt"; 
         
        try
        {
          //  Class.forName("org.apache.derby.jdbc.ClientDriver");         // driver name
   //         String host = "jdbc:derby://localhost:1527/tt";
       //     String host = "jdbc:odbc://localhost:1527/tt";
    //        String userName  = "tt";
      //      String password  = "tt";
            
            Connection con = DriverManager.getConnection(url+dbName, userName, password);
            System.out.println("Connected to the database");
            return con;
            
        }
        catch(Exception e)
        {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return null;
    }
}
