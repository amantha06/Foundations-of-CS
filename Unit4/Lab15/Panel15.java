//Name______________________________ Date_____________
  
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Panel15 extends JPanel
   {
      private Scoreboard15 scoreboard;
      private Gameboard15 gameboard;
      private JButton reset;
      private JLabel label;
       public Panel15()
      {
         setLayout(new BorderLayout());
      
         scoreboard = new Scoreboard15();
         add(scoreboard, BorderLayout.NORTH);
      
         gameboard = new Gameboard15(new Callback());
         add(gameboard, BorderLayout.CENTER);
      
         JPanel south = new JPanel();
         south.setLayout(new FlowLayout());
         south.setBackground(Color.black);
         add(south, BorderLayout.SOUTH);
      
         reset = new JButton("Reset");
         reset.addActionListener(new Listener());
         reset.setFocusPainted(false);
         reset.setEnabled(false);
         south.add(reset);
      
         label = new JLabel("");
         label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 18));
         label.setForeground(Color.yellow);
         south.add(label);
      }
       private class Callback implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            if(gameboard.winner())
            {
               scoreboard.winner();
               gameboard.freeze();
               reset.setEnabled(true);
               label.setText("Winner!");
            }
            else if(gameboard.filled())
            {
               scoreboard.tie();
               reset.setEnabled(true);
               label.setText("Cat!");
            }
            else
            {
               scoreboard.toggle();
            }
         }
      }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
           //"reset" code goes here
         }
      }
   }