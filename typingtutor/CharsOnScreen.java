/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

/**
 *
 * @author All
 */
public class CharsOnScreen {
    public char theCharacter;
    public int xpos, ypos;
    private int add=10;
    CharsOnScreen(char c,int x){
        theCharacter=c;
        xpos=x;
        ypos=0;
    }
    
    public int newYPos(){
        add+=2;
        ypos+=add;
        System.out.println(ypos);
        return ypos;
    }
    
    public String toString(){
        return Character.toString(theCharacter);
    }
    
    public char getCharacter(){
        return theCharacter;
    }
}
