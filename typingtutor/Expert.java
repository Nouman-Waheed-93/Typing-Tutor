/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

import bl.dbconnection;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

/**
 *
 * @author All
 */
public class Expert implements Difficulty {
    
    String paragraph ="";
    String lines[];
    int theIndex=0;
    
    public void generateOutput(Graphics g){
        getParagraph();
        g.setColor(Color.RED);
        if(theIndex<paragraph.length())
        g.drawString(paragraph.substring(0, theIndex), 10, 10);
        
        String space=" ";
        for(int sp=0;sp<=theIndex;sp++){
            space=space+"  ";
        }
        
        g.setColor(Color.BLACK);
        g.drawString(space + paragraph.substring(theIndex), 10, 10);
    }
    
    public void getParagraph(){
       Random r = new Random();
       int pInteger;
       // cInteger= r.nextInt(w.length);
        
      {
       try
        {
            Connection con = dbconnection.buildConnection();
            String getQuantity = "select * from tt.paragraph";
            PreparedStatement getQ = con.prepareStatement(getQuantity);
            ResultSet result1 = getQ.executeQuery();
            
            int count = 0;

while (result1.next()) {
    ++count;
    // Get data from the current row and use it
    System.out.println(count);
}

if (count == 0) {
    System.out.println("No records found");
}

            pInteger = r.nextInt(count);
            
            String getWord = "select PARAGRAPH from TT.PARAGRAPH where P_ID ="+pInteger;

            PreparedStatement stmt = con.prepareStatement(getWord);

            ResultSet result =  stmt.executeQuery();
            if(result.next())
            paragraph = result.getString(1);
            else
                paragraph = "Jack was known as the silliest boy of the Weaseltown.";
            con.close();
        }


    catch(Exception e)
        {
            e.printStackTrace();
                   
        paragraph = "class encapsulates the run time state of an object or "
                + "interface objects of type class are created automatically"
                + "when classes are loaded";
        }

    }
    }
    
    public char[] getCharsToBeTyped(){
        char[] word = new char[1];
        if(theIndex<paragraph.length())
        word[0] = paragraph.charAt(theIndex);
        
        return word;
    }
    
    public void charTypedCorrect(char c){
        theIndex++;
        if(theIndex == paragraph.length()){
            StartGame.endGame();
        }
    }
    public String toString(){
        return "Expert";
    }
}
