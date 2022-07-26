//Anirudh Mantha
//6.3.2021

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class DisplaySampleYard extends JPanel{
   private static int count;
   private static JTextField[] t;
   private static double runtotal;
   private static Yard[] customer;
   public DisplaySampleYard(){
     
      setLayout(new GridLayout(5, 1));
      count = 0;
      runtotal = 0;
      t = new JTextField[5];
      for(int i = 0; i < t.length; i++){
         t[i] = new JTextField();
         add(t[i]);
      }
      String file = JOptionPane.showInputDialog("Enter the name of the file");
      customer = input(file);
      sort(customer);
       
   }
   public static Yard[] input(String filename){
     
      Scanner infile = null;
      try{
         infile = new Scanner(new File(filename));
      }
      catch(FileNotFoundException e){
         JOptionPane.showMessageDialog(null, "The file could not be found");
         String file = JOptionPane.showInputDialog("Enter a file");
         input(file);
      }
      String fname;
      String lname;
          
      int numitems = Integer.parseInt(infile.nextLine());
          
      Yard[] array = new Yard[numitems];
      for(int i = 0; i < array.length; i++){
         lname = infile.nextLine();
         fname = infile.nextLine();
         int size = Integer.parseInt(infile.nextLine());
         if(size <= 10000)
            array[i] = new CustomerSmallYard(lname, fname, size);
         
         else if(size >= 10000 && size <=20000)
         
            array[i] = new CustomerMediumYard(lname, fname, size);
         
         else if(size >= 20000)
         
            array[i] = new CustomerLargeYard(lname, fname, size);
         
            
      }
      infile.close();
      return array;
   }
   public static void sort(Yard[] array){
   
      int maxPos = 0;
      for(int i = 0; i < array.length; i++){
         maxPos = findMax(array, array.length - i);
         swap(array, maxPos, array.length - i - 1);
      }
   }
   public static int findMax(Yard[] array, int upper){
      int maxPos = 0;
      for(int i = 0; i < upper; i++){
         if(array[i].compareTo(array[maxPos]) > 0){
            maxPos = i;
         }
      }
      return maxPos;
   }
   public static void swap(Yard[] array, int a, int b){
      Yard d = array[a];
      array[a] = array[b];
      array[b] = d;
   }
   public static void update()
   {
                
      DecimalFormat df = new DecimalFormat("$0.00");
      
      t[0].setText(customer[count].getLastName());
      t[1].setText(customer[count].getFirstName());
      t[2].setText("" + customer[count].getSize());
      t[3].setText(df.format(customer[count].getCost()));
      runtotal = runtotal + customer[count].getCost();
      t[4].setText(df.format(runtotal));
      count++;
      
   }
}
                  
                  
          
