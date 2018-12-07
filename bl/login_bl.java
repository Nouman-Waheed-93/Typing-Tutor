/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Khizar Fayyaz
 */
public class login_bl {
    public boolean processlogin(String pw)

    {
        try
        {
            Connection con = dbconnection.buildConnection();
            String login = "select admin_pw from tt.admin";

            PreparedStatement stmt = con.prepareStatement(login);

            ResultSet result =  stmt.executeQuery();
            while(result.next())
            {
                if( result.getString(1).matches(pw))
                {
                    return true;
                }
            }
            con.close();
        }


    catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    } 

}