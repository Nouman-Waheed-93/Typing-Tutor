/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

/**
 *
 * @author All
 */
public class Timer {
    
    public long Time;
    public int GameTime;
    
    public Timer(){
        Time = System.currentTimeMillis();
    }
    
    public int currentTime(){
        long endTime;
        int seconds;
        endTime = System.currentTimeMillis();
        seconds = (int)(endTime - Time)/1000;
        
        return seconds;
    }
}
