/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typingtutor;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
  <applet code="ButtonDemo" width=250 height=150>
  </applet>
 */
public class TypingTutor extends Applet implements ActionListener{

        String msg = "";
        Button StartGame, ViewScore, AdminPanel, Exit;
        DifficultyMenu dm;
        public void init(){
            StartGame= new Button("Start Game");
            ViewScore= new Button("View Score");
            AdminPanel = new Button("Admin Panel");
            Exit = new Button("Exit");
            
            add(StartGame);
            add(ViewScore);
            add(AdminPanel);
            add(Exit);
            
            StartGame.addActionListener(this);
            ViewScore.addActionListener(this);
            AdminPanel.addActionListener(this);
            Exit.addActionListener(this);
        }
    
        public void actionPerformed(ActionEvent ae){
            String str = ae.getActionCommand();
            if(str.equals("Start Game")){
                super.setVisible(false);
                super.getParent().setVisible(false);
                dm = new DifficultyMenu();
                dm.setVisible(true);
            }
            else if(str.equals("No")){
                msg = "You pressed No.";
            }
            else {
                msg = "You pressed Undecided.";
            }
            
            repaint();
        }
        public void paint(Graphics g){
            g.drawString(msg, 6, 100);
        }
}
