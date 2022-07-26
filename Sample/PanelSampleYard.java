//Anirudh Mantha
//6.3.2021

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PanelSampleYard extends JPanel
{
   
   DisplaySampleYard display;
   JLabel label;
   public PanelSampleYard()
   {
      setLayout(new BorderLayout());
     
      label = new JLabel("Green and Grow mowing Company", SwingConstants.CENTER);
      add(label, BorderLayout.NORTH);
      
      JPanel west = new JPanel();
      west.setLayout(new GridLayout(5, 1));
      
      //simplified version of creating multiple JLabel
      west.add(new JLabel("Last Name:  "));
      west.add(new JLabel("First Name:  "));
      west.add(new JLabel("Lawn Size:  "));
      west.add(new JLabel("Total Cost:  "));
      west.add(new JLabel("Running Total:  "));
      add(west, BorderLayout.WEST);
      
      display = new DisplaySampleYard();
      add(display, BorderLayout.CENTER);
      
      JPanel southpanel = new JPanel();
      southpanel.setLayout(new FlowLayout());
      
      JButton button = new JButton("Next");
      button.addActionListener(new Listener1());
      southpanel.add(button);
      
      JButton button2 = new JButton("Quit");
      button2.addActionListener(new Listener2());
      southpanel.add(button2);
     
      add(southpanel, BorderLayout.SOUTH);
     
     
   }  
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         try{
            display.update();
         }
         catch(Exception ex){
            System.out.println("All users have been iterated through");
         }
      }
   }
    
   private class Listener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.out.println("Thanks for using our device");
         System.exit(0);
          
      }
   }
  
}
