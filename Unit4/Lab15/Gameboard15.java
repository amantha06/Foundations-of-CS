//Name______________________________ Date_____________
  

   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Gameboard15 extends JPanel
   {
      private JButton[][] board;
      private String gamepiece;
      private Color color;
      private int count;
       public Gameboard15(ActionListener a)
      {
         gamepiece = "X";
         color = Color.green;
         count = 0;
      
         setLayout(new GridLayout(3, 3));
         setBackground(Color.black);
      
         board = new JButton[3][3];
         for(int x = 0; x < 3; x++)
            for(int y = 0; y < 3; y++)
            {
               board[x][y] = new JButton("-");
               board[x][y].setFont(new Font("Monospaced", Font.PLAIN, 20));
               board[x][y].setBackground(Color.white);
               board[x][y].setFocusPainted(false);
               board[x][y].addActionListener(a); // <---Add this one first!!!!!
               board[x][y].addActionListener(new Listener(x, y));
               add(board[x][y]);
            }
      }
       private class Listener implements ActionListener
      {
         private int myX, myY;
          public Listener(int x, int y)
         {
            myX = x;
            myY = y;
         }
          public void actionPerformed(ActionEvent e)
         {
            // your code goes here
         }
      }
       public void freeze()
      {
          // your code goes here
      }
       public void reset()
      {
          // your code goes here
      }
       public boolean filled()
      {
          // your code goes here
      }
       public boolean winner()
      {
         // your code goes here
      }
   }