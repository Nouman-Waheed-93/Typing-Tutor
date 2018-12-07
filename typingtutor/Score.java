/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

import bl.dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author All
 */
public class Score {
    
    public static int score=0;
    public static int mistakes=0;
    public static int left=0;
    
    public void incrementScore(){
    score++;
    }
    
    public static void decrementScore(){
        score-=2;
    }
    
    public static void madeAMistake(){
        mistakes++;
    }
    
    public static void left(){
        left++;
    }
    
    public static void SaveScore(String UserName,Difficulty CDiff){
        
        int count = 0;
                    
        try
        {
            Connection con = dbconnection.buildConnection();
            {
            String getQuantity = "select * from tt.userdata";
            PreparedStatement getQ = con.prepareStatement(getQuantity);
            ResultSet result1 = getQ.executeQuery();
            

while (result1.next()) {
    ++count;
    // Get data from the current row and use it
    System.out.println(count);
}

if (count == 0) {
    System.out.println("No records found");
}
            }
            String save = "insert into tt.userdata values("+count+","+"'"+UserName+"'"
                    +","+"'"+CDiff.toString()+"'"+","+0+","+score+","+mistakes+","+left+")";

            PreparedStatement stmt = con.prepareStatement(save);

            stmt.execute();
            con.close();
        }


    catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
