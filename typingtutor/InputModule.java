/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

import java.awt.event.*;
import java.applet.*;
/**
 *
 * @author All
 */
public class InputModule extends KeyAdapter {
    StartGame gameInput;
    char checkingCharacter;
    Checking check;
    Difficulty diff;
    Score currScore;
    
    public InputModule(StartGame gameInput,Difficulty diff){
        
        this.gameInput=gameInput;
        System.out.println("InputModule constructor");
        this.diff = diff;
        check = new Checking(diff);
        currScore = new Score();
    }
    
    public void keyTyped(KeyEvent ke){
        
        checkingCharacter = ke.getKeyChar();
        System.out.println("key typed");
        System.out.println(ke.getKeyChar());
        if(check.charCheck(checkingCharacter)){
            System.out.println("checkingCharacter in key typed");
            diff.charTypedCorrect(checkingCharacter);
            currScore.incrementScore();
        }
        else{
            currScore.decrementScore();
            currScore.madeAMistake();
        }
        
    }
    
    public int getScore(){
        return currScore.score;
    }
    
    public void keyPressed(KeyEvent ke){
        int kc = ke.getKeyCode();
        if(kc == KeyEvent.VK_ESCAPE){
            gameInput.endGame();
            System.out.println("Escape pressed");
        }
        else{}
    }
    
}
