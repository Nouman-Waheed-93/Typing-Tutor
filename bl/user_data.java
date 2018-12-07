/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Khizar
 */
public class user_data {
    
    public boolean insert_word(int w_id,String word){
        try
        {
         Connection conn=dbconnection.buildConnection();
         String sql=("INSERT INTO tt.word values("+w_id+",'"+word+"')");
            PreparedStatement prepSt=conn.prepareStatement(sql);


            prepSt.executeUpdate();
            conn.close();;
            return true;

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid values");
        } 
        return false;
        }
    
    public boolean update_word(int w_id,String word){
        try
        {
         Connection conn=dbconnection.buildConnection();
         String sql= "update tt.word set word='"+word+"' where w_id="+w_id+"";
            PreparedStatement prepSt=conn.prepareStatement(sql);


            prepSt.executeUpdate();
            conn.close();
            return true;

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid values");
        } 
        return false;
        }
    
    public boolean delete_word(int w_id){
        try
        {
         Connection conn=dbconnection.buildConnection();
         String sql= "delete from tt.word where w_id="+w_id+"";
            PreparedStatement prepSt=conn.prepareStatement(sql);


            prepSt.execute();
            conn.close();
            return true;

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid values");
        } 
        return false;
        }
    
    
    public boolean insert_paragraph(int p_id,String para){
        try
        {
         Connection conn=dbconnection.buildConnection();
         String sql=("INSERT INTO tt.paragraph values("+p_id+",'"+para+"')");
            PreparedStatement prepSt=conn.prepareStatement(sql);


            prepSt.executeUpdate();
            conn.close();;
            return true;

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid values");
        } 
        return false;
        }
    
    public boolean update_paragraph(int p_id,String para){
        try
        {
         Connection conn=dbconnection.buildConnection();
         String sql= "update tt.paragraph set paragraph='"+para+"' where p_id="+p_id+"";
            PreparedStatement prepSt=conn.prepareStatement(sql);


            prepSt.executeUpdate();
            conn.close();
            return true;

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid values");
        } 
        return false;
        }
    
    public boolean delete_paragraph(int p_id){
        try
        {
         Connection conn=dbconnection.buildConnection();
         String sql= "delete from tt.paragraph where p_id="+p_id+"";
            PreparedStatement prepSt=conn.prepareStatement(sql);


            prepSt.execute();
            conn.close();
            return true;

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid values");
        } 
        return false;
        }
    
    }
    
