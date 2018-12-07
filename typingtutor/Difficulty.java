/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

import java.awt.Graphics;

/**
 *
 * @author All
 */
public interface Difficulty {
    
    void generateOutput(Graphics g);
    public char[] getCharsToBeTyped();
    public void charTypedCorrect(char c);
}
