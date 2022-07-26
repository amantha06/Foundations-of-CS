//Anirudh Mantha
//5.25.2021

/**
This is Display with other GUI components and also an Update method
this is what is excecuted every time a button is pressed

**/

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class DisplaySampleYard extends JPanel{
   public JLabel label, l1, l2, l3, l4, l5;
   public JTextField t1, t2, t3, t4, t5;
   public int rowNum = 0;
   public double rcount = 0.0;
   
   public CustomerYard yard;
   
   public DisplaySampleYard()
   
   {
      Font f = new Font("Serif", Font.BOLD, 14);
      
      label = new JLabel("Green and Grow Mowing Company");
      label.setFont(f);
      label.setForeground(Color.BLACK);
      label.setHorizontalAlignment(SwingConstants.CENTER);
      add(label, BorderLayout.NORTH);
      
      JPanel centerpanel = new JPanel();
      centerpanel.setLayout(new GridLayout(5, 5));
            
      l1 = new JLabel("Last Name:");
      l1.setFont(f);
      l1.setForeground(Color.BLACK);
      centerpanel.add(l1);
      
      t1 = new JTextField(" ");
     
      centerpanel.add(t1);
      
      l2 = new JLabel("First Name:");
      l2.setFont(f);
      l2.setForeground(Color.BLACK);
      centerpanel.add(l2);
      
      t2 = new JTextField(" ");
      
      centerpanel.add(t2);
           
      l3 = new JLabel("Lawn Size");
      l3.setFont(f);
      l3.setForeground(Color.BLACK);
      centerpanel.add(l3);
      
      t3 = new JTextField(" ");
      
      centerpanel.add(t3);
       
      l4 = new JLabel("Total Cost");
      l4.setFont(f);
      l4.setForeground(Color.BLACK);
      centerpanel.add(l4);
      
      t4 = new JTextField(" ");
      
      centerpanel.add(t4);
      
      l5 = new JLabel("Running Total:");
      l5.setFont(f);
      l5.setForeground(Color.BLACK);
      centerpanel.add(l5);
   
      t5 = new JTextField(" ");
      
      centerpanel.add(t5);
       
       
      add(centerpanel, BorderLayout.WEST);
      
      
   }
   
         
   
   public void update(String fileNameInput) throws Exception{
       
       yard = new CustomerYard(rowNum, fileNameInput);
       //instantiate Decimal formatter
       
       //user here
       t1.setText(yard.getLastName());       
       t2.setText(yard.getFirstName()); 
       t3.setText(""+yard.getSize());
       t4.setText(""+yard.getCost());
       
       rcount = rcount + yard.getCost();
       
       t5.setText(""+rcount);
       
       
       rowNum = rowNum +1;
       
       
    
   }

}





