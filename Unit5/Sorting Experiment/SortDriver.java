//Created by Christina Wallin
//2/28/07
//Period 4
   import javax.swing.*;
   import java.awt.*;
    public class SortDriver 
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame();
         frame.setTitle("Sorts Lab");
         frame.setSize(375, 250);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         SortPanel panel = new SortPanel();
         Container pane = frame.getContentPane();
         pane.add(panel);
         frame.setVisible(true);
      }
   }