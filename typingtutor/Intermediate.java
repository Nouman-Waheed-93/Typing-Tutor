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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author All
 */
public class Intermediate implements Difficulty {
    
        ArrayList<WordsOnScreen> wordsOnScreen; 
        WordsOnScreen currentWord;
        
    public Intermediate(){
        wordsOnScreen = new ArrayList<WordsOnScreen>();     
    }
    
        public void generateOutput(Graphics g){
        int maxWordCapacity=2;
        if(wordsOnScreen.size()<maxWordCapacity){
            currentWord = new WordsOnScreen(this.generateWord(),this.xAxis());
            wordsOnScreen.add(currentWord);
        }
        for(int i= 0;i<wordsOnScreen.size();i++)
        {
        if(wordsOnScreen.get(i).newYPos() >= 600){
        wordsOnScreen.remove(i);
        Score.decrementScore();
        Score.left();
        }
        }
        
        for(int i=0;i<wordsOnScreen.size();i++){
            WordsOnScreen currentWord = wordsOnScreen.get(i);
            
            g.drawString("Words not Typed: "+ Score.left, 500, 600);
            
        g.setColor(Color.RED);    
        g.drawString(currentWord.theWord.substring(0, currentWord.charTyped),
                currentWord.xpos, currentWord.ypos);
        
        String space=" ";
        for(int sp=0;sp<=currentWord.charTyped;sp++){
            space=space+"  ";
        }
        g.setColor(Color.BLACK);
        g.drawString(space + currentWord.theWord.substring(currentWord.charTyped, 
                currentWord.theWord.length()), currentWord.xpos, currentWord.ypos);
        }
    }
        
        public char[] getCharsToBeTyped(){
        char[] c2 = new char[wordsOnScreen.size()];
        Iterator<WordsOnScreen> it = wordsOnScreen.iterator();
        int j = 0;
        
        while(it.hasNext()){
            WordsOnScreen wos = it.next();
            c2[j] = wos.getWord().charAt(wos.charTyped);
            j++;
        }

        for(int i=0; i<c2.length; i++)
        System.out.println("c2 is "+ c2[i]);
        return c2;        
    }
        
        public void charTypedCorrect(char crctChar){
        Iterator<WordsOnScreen> it = wordsOnScreen.iterator();
        while(it.hasNext()){
            WordsOnScreen currWord = it.next();
            if(currWord.getWord().charAt(currWord.charTyped) == crctChar){
                currWord.charDone();
                if(currWord.charTyped == currWord.theWord.length())
                it.remove();
                else
                    break;
            }
        }
    }
        
        public int xAxis(){
        int x;
        Random r = new Random();
        x = r.nextInt(900);
        return x;
    }
        
        private String generateWord(){
            
        int cInteger;
        Random r = new Random();
        String theWord;
       // cInteger= r.nextInt(w.length);
        
      {
       try
        {
            Connection con = dbconnection.buildConnection();
            String getQuantity = "select * from tt.word";
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

            cInteger = r.nextInt(count);
            
            String getWord = "select WORD from TT.WORD where W_ID ="+cInteger;

            PreparedStatement stmt = con.prepareStatement(getWord);

            ResultSet result =  stmt.executeQuery();
            if(result.next())
            theWord = result.getString(1);
            else
                theWord = "Jack";
            con.close();
            return theWord;
        }


    catch(Exception e)
        {
            e.printStackTrace();
            return "Sack";
        }
            }
    }
        public String toString(){
            return "Intermediate";
        }
}
