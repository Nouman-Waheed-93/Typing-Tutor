/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 <applet code = "The Game" width=250 height=150>
 </applet>
 */
public class StartGame extends Applet implements Runnable{

    Difficulty gameDifficulty;
    Thread gameThread = new Thread(this);
    static boolean Running;
    int x,y;
    InputModule im;
    Timer timeMeasure;
    static Frame theFrame;
    
    public StartGame(Difficulty gameDifficulty,Frame theFrame){
        this.gameDifficulty = gameDifficulty;
        System.out.println("in start game");
        this.theFrame = theFrame;
    }
     
    public void init() {
        Running = true;
        gameThread.start();         
        im = new InputModule(this,gameDifficulty);
        addKeyListener(im);
        requestFocus();
        System.out.println("in init method");
        timeMeasure = new Timer();
    }
    
    public void run(){
        while(Running){
          System.out.println("in run method");
          repaint(); 
          try{
          gameThread.sleep(500);
          }catch(InterruptedException e){             
          }
        }
    }
    
    public static void endGame(){
        Running = false;
        System.out.println("Ending");
        System.exit(0);
        SaveScore ss = new SaveScore();
        ss.setFrame(theFrame);
        ss.setVisible(true);
    }
    
    public void paint(Graphics g){
        System.out.println("in paint method");
        if(timeMeasure.currentTime()>60){
            Running = false;
            SaveScore save = new SaveScore();
            save.getDifficulty(gameDifficulty);
            save.setVisible(true);
            save.setFrame(theFrame);
        }
        g.drawString("Time Left : " + (61-timeMeasure.currentTime()), 100, 600);
        g.drawString("Current Score:"+ im.getScore(), 300, 600);
        g.drawString("Mistakes :"+Score.mistakes, 400, 600);
        gameDifficulty.generateOutput(g);
    }
 
    public void destroy(){
        Running = false;       
    }
    
    public void stop(){
        Running = false;               
    }

}
