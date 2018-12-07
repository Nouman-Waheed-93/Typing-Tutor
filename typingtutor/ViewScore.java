/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hp1
 */
public class ViewScore extends Applet implements ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Frame theFrame;
    Button back;
    public void init() {
        // TODO start asynchronous download of heavy resources
        back = new Button("Back");
        add(back,BorderLayout.NORTH);
        back.addActionListener(this);
    }
    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g){
                int x=10,y=50;
        g.drawString("U_ID", x+=100, y);
        g.drawString("U_Name", x+=100, y);
        g.drawString("Difficulty", x+=100, y);
        g.drawString("TimeTaken", x+=100, y);
        g.drawString("Score", x+=100, y);
        g.drawString("Mistakes", x+=100, y);
        g.drawString("WordsLeft", x+=100, y);
        bl.ViewScore_bl vs = new bl.ViewScore_bl();
        vs.drawRecords(g);
    }
    
    public void setFrame(Frame theFrame){
        this.theFrame = theFrame;
    }
    
    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        if(str.equals("Back"));{
        theFrame.setVisible(false);
        StartMenu sm = new StartMenu();
        sm.setVisible(true);
    }
    }
}
