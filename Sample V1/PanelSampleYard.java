//Anirudh Mantha
//5.25.2021

/**
This is a normal panel which calls the Display
and has 2 buttons with action listeners

**/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class PanelSampleYard extends JPanel{
   private DisplaySampleYard display;
   String filenameInput;
   
   
   public PanelSampleYard(){
      setLayout(new BorderLayout());
      
      display = new DisplaySampleYard();
      add(display);
      
      
      JPanel southpanel = new JPanel();
      southpanel.setLayout(new GridLayout(1, 2));
   
      JButton button = new JButton("Next");
      button.addActionListener(new Listener());
      southpanel.add(button);
     
      
      JButton button2 = new JButton("Quit");
      button2.addActionListener(new Listener2());
      southpanel.add(button2);
      
      add(southpanel, BorderLayout.SOUTH);
      
      
      filenameInput = JOptionPane.showInputDialog("Enter input file: ");
   }
   
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e) 
      {
         try{
            
            display.update(filenameInput);    
                   
         }
         catch(Exception ex){
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "All users have been iterated through");
            //ex.printStackTrace();
         }
      }
   }  
      
   private class Listener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);            
         
      }
   }
}