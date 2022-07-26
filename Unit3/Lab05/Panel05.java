/* 
 Anirudh Mantha 1/9/21
 Period 1
 1557531@fcpsschools.net
*/ import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel05 extends JPanel
   {
      private Display05 display;
      public Panel05()
      {
         setLayout(new FlowLayout());
      
         display = new Display05();
         add(display);
      
         JButton button = new JButton("Press Your Luck");
         button.addActionListener(new Listener());
         add(button);
      }
      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         
            display.update();           
            
         
         }
      }
   }