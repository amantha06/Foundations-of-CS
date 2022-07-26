   /* 
 Anirudh Mantha 1/20/21
 Period 1
 1557531@fcpsschools.net
*/
   
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel07 extends JPanel
   {
      private Display07 display;
      public Panel07()
      {
         setLayout(new FlowLayout());
         
         //Making a variable display to store the value from Display07 method
         display = new Display07();
         add(display);
         
         //Making a listener for GCD
         JButton button = new JButton("GCD");
         button.addActionListener(new Listener());
         add(button);
         
         //Making a listener for LCM
         JButton buttonL = new JButton("LCM");
         buttonL.addActionListener(new Listener1());
         add(buttonL);
         
         
      }
      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            //calling showGCD from display
            display.showGCD();
            
         
         }
      }
      
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            // calling showLCM from display
            display.showLCM();
            
         
         }
      }
   }