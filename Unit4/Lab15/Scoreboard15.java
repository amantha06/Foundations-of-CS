//Name______________________________ Date_____________
  
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Scoreboard15 extends JPanel
   {
      private JLabel labelX, labelC, labelO;
      private int winX, cat, winO;
      private String current;
       public Scoreboard15()
      {
         winX = cat = winO = 0;
         current = "X";
      
         setLayout(new GridLayout(1, 9));
         setBackground(Color.black);
      
         add(new JLabel(""));
         labelX = new JLabel("X: 0", SwingConstants.CENTER);
         labelX.setOpaque(true);
         labelX.setBackground(Color.yellow);
         labelX.setForeground(Color.black);
         add(labelX);
         add(new JLabel(""));
      
         add(new JLabel(""));
         labelC = new JLabel("Cat: 0", SwingConstants.CENTER);
         labelC.setOpaque(true);
         labelC.setBackground(Color.black);
         labelC.setForeground(Color.white);
         add(labelC);
         add(new JLabel(""));
      
         add(new JLabel(""));
         labelO = new JLabel("O: 0", SwingConstants.CENTER);
         labelO.setOpaque(true);
         labelO.setBackground(Color.black);
         labelO.setForeground(Color.white);
         add(labelO);
         add(new JLabel(""));
      }
       public void toggle()
      {
          // your code goes here
      }
       public void winner()
      {
          // your code goes here
      }
       public void tie()
      {
          // your code goes here
      }
   }