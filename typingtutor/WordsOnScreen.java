/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

/**
 *
 * @author All
 */
public class WordsOnScreen {
    public String theWord;
    public int xpos,ypos;
    public int charTyped=0;
    int add=10;
    
    WordsOnScreen(String word, int x){
        theWord = word;
        xpos = x;
        ypos = 0;
    }
    
        public int newYPos(){
        add+=5;
        ypos+=add;
        System.out.println(ypos);
        return ypos;
        }
        
        public String getWord(){
            return theWord;
        }
        
        public void charDone(){
            charTyped++;
        }
            
}
