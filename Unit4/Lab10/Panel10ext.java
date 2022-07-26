// Anirudh Mantha
// 3/16/21

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel10ext extends JPanel
{
   Display10ext display;
   public Panel10ext()
   {
      setLayout(new BorderLayout());
      
      display = new Display10ext();
      add(display, BorderLayout.CENTER);
      
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      add(panel, BorderLayout.SOUTH);
      
      JButton button1 = new JButton("Randomize");
      button1.addActionListener(new Listener1());
      panel.add(button1);
      
      JButton button2 = new JButton("Reverse");
      button2.addActionListener(new Listener2());
      panel.add(button2);
      
      JButton button3 = new JButton("Shift");
      button3.addActionListener(new Listener3());
      panel.add(button3);
      
      JButton button4 = new JButton("Rotate");
      button4.addActionListener(new Listener4());
      panel.add(button4);
      
      
   }
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.randomize();
      }
   }
   private class Listener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.reverse();
      }
   }
   private class Listener3 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.shift();          }
   }
   private class Listener4 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         
         display.rotate();
      
      }
   }
}