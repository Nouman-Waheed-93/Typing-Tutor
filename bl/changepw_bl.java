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
public class changepw_bl {
    
public boolean change_pw(String pw){
       try
        {
            Connection conn=dbconnection.buildConnection();
            String sql="update tt.admin set admin_pw = '"+pw+"'";
            PreparedStatement prepSt=conn.prepareStatement(sql);


            prepSt.executeUpdate();
            return true;

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
        
}
    
}
