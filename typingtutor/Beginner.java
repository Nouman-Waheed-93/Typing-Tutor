/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

import java.awt.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author All
 */
public class Beginner implements Difficulty {
    
    ArrayList<CharsOnScreen> charsOnScreen; 
    CharsOnScreen currentChar;
    
    public Beginner(){
        charsOnScreen = new ArrayList<CharsOnScreen>();     
    }
    
    public void generateOutput(Graphics g){
        int maxCharCapacity=5;
        Font f= new Font("verdana", 2, 30);
        g.setFont(f);
        g.drawString("Charactes not typed : "+Score.left,500,600);
        
        if(charsOnScreen.size()<maxCharCapacity){
            currentChar = new CharsOnScreen(this.generateCharacter(),this.xAxis());
            charsOnScreen.add(currentChar);
        }
        for(int i= 0;i<charsOnScreen.size();i++)
        {
        if(charsOnScreen.get(i).newYPos() >= 600){
        charsOnScreen.remove(i);
        Score.decrementScore();
        Score.left();
        }
        }
        
        for(int i=0;i<charsOnScreen.size();i++){
            CharsOnScreen currentChar = charsOnScreen.get(i);
        g.drawString(currentChar.toString(), currentChar.xpos, currentChar.ypos);
        }
    }
    
    public char[] getCharsToBeTyped(){
        char[] c2 = new char[charsOnScreen.size()];
        Iterator<CharsOnScreen> it = charsOnScreen.iterator();
        int j = 0;
        
        while(it.hasNext()){
            CharsOnScreen cos = it.next();
            c2[j] = cos.getCharacter();
            j++;
        }

        for(int i=0; i<c2.length; i++)
        System.out.println("c2 is "+ c2[i]);
        return c2;        
    }
    
    public void charTypedCorrect(char crctChar){
        Iterator<CharsOnScreen> it = charsOnScreen.iterator();
        while(it.hasNext()){
            if(it.next().getCharacter() == crctChar){
                it.remove();
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
    
    private char generateCharacter(){
        char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l',
            'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int cInteger;
        Random r = new Random();
        cInteger= r.nextInt(c.length);
        return c[cInteger];
    }
   
    public String toString(){
        return "Beginner";
    }
}
