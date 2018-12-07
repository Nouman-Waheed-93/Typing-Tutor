/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

/**
 *
 * @author All
 */
public class Checking {
    
    char[] charsToBeTyped = new char[6];
    Difficulty currentDifficulty;
    
    Checking(Difficulty currentDifficulty){
        this.currentDifficulty = currentDifficulty;
        System.out.println("Checking constructor");
    }
    
    public boolean charCheck(char keyTyped){
        charsToBeTyped = currentDifficulty.getCharsToBeTyped();
        System.out.println("char Check");
        for(char c : charsToBeTyped){
            if(keyTyped == c)
                return true;
        }
        return false;
    }
    
}
