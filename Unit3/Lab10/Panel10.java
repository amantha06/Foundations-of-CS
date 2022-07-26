   //Name: Anirudh Mantha 
   //Date: 1/28/21
   //Mail: 1557531@fcpsschools.net

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel10 extends JPanel
   {
      private Display10 display;
      private Scoreboard10 scoreboard;
      public Panel10()
      {
         setLayout(new BorderLayout());
      
         scoreboard = new Scoreboard10();
         add(scoreboard, BorderLayout.NORTH);
      
         display = new Display10();
         add(display, BorderLayout.CENTER);
      
         JPanel panel = new JPanel();
         panel.setLayout(new FlowLayout());
         add(panel, BorderLayout.SOUTH);
         JButton button1 = new JButton("High");
         button1.addActionListener(new Listener1());
         panel.add(button1);
         JButton button2 = new JButton("Low");
         button2.addActionListener(new Listener2());
         panel.add(button2);
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            scoreboard.update(display.guessHigh());
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            scoreboard.update(display.guessLow());
         }
      }
   }