//Anirudh Mantha
//03.25.21
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Battleship extends JPanel
{
   private JButton[][] board;
   private int[][] matrix;
   private int hits, torpedoes;
   private JLabel label;
   private JButton reset;
   public Battleship()
   {
      setLayout(new BorderLayout());
      hits = 0;
      torpedoes = 25;
   
      JPanel north = new JPanel();
      north.setLayout(new FlowLayout());
      add(north, BorderLayout.NORTH);
      label = new JLabel("Welcome to Battleship -- You have 25 torpedoes.");
      north.add(label);
   
      JPanel center = new JPanel();
      center.setLayout(new GridLayout(10,10));
      add(center, BorderLayout.CENTER);
   
      board = new JButton[10][10];
      matrix = new int[10][10];
      for(int r = 0; r < 10; r++)
         for(int c = 0; c < 10; c++)
         {
            board[r][c] = new JButton();
            board[r][c].setBackground(Color.BLUE);
            board[r][c].addActionListener( new Handler1(r, c) );
            center.add(board[r][c]);
         }
      
      
      reset = new JButton("Reset");
      reset.addActionListener( new Handler2() );
      reset.setEnabled(false);
      add(reset, BorderLayout.SOUTH);
   
      placeShip();
   }
   private void placeShip()
   {
      boolean vert = false;
      boolean hori = false;
      int facing = (int)(Math.random()*2+1);
      if(facing == 1){
         vert = true;
      }
      else if(facing == 2){
         hori = true;
      }
      
      if(hori){
         int r = (int)(Math.random()*6);
         int c = (int)(Math.random()*6);
         for(int i = 0; i <= 3; i++){
            matrix[r][c+i] = 1;
         
         }
      }
      if(vert){
         int r = (int)(Math.random()*7);
         int c = (int)(Math.random()*7);
         for(int i = 0; i <= 3; i++){
            matrix[r+i][c] = 1;
           
         }
      
      }
   
   }
   private class Handler1 implements ActionListener
   {
      private int myRow, myCol;
      public Handler1(int r, int c)
      {
         myRow = r;
         myCol = c;
      }
      public void actionPerformed(ActionEvent e)
      {
         board[myRow][myCol].setEnabled(false);
         torpedoes--;
         if(torpedoes >= 0){
               
            if(matrix[myRow][myCol] == 0){
               label.setText("Miss! " + torpedoes + " torpedoes remaning.");
               board[myRow][myCol].setBackground(Color.WHITE);
            }
            if(matrix[myRow][myCol] == 1){
               label.setText("Hit! " + torpedoes + " torpedoes remaning.");
               board[myRow][myCol].setBackground(Color.RED);
               matrix[myRow][myCol] = 0;
            }
            int count = 0;
            for(int r = 0; r < 10; r++){
               for(int c = 0; c < 10; c++)
               {
                  if(matrix[r][c] == 1){
                     count++;                  
                  }            
               }
            
            }
            if(count == 0){
               label.setText("You sunk my battle ship!");
               torpedoes = 0;
               reset.setEnabled(true);
            }
         }
         if(torpedoes == 0){
            for(int r = 0; r < 10; r++)
               for(int c = 0; c < 10; c++)
               {
                  if(matrix[r][c] == 1){
                     board[r][c].setBackground(Color.BLACK);
                     matrix[r][c] = 0;
                     reset.setEnabled(true);
                  }            
               }
         }
        
      
      }
   }
   private class Handler2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         reset.setEnabled(false);
         label.setText("Welcome to Battleship -- You have 25 torpedoes.");
      
         for(int r = 0; r < 10; r++)
            for(int c = 0; c < 10; c++)
            {
               board[r][c].setBackground(Color.BLUE);
               board[r][c].setEnabled(true);
            }
         torpedoes = 25;
         placeShip();
         
         
      }
   }
}