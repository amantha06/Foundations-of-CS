//Anirudh Mantha
//5.25.2021

/**
This is another class that I created where I have my logic of reading the file,
sorting the file into an array, and getting the data for firstname lastname and size

**/

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class YardCalc{
   public String fname, lname, size = "";
   public int z, c2 = 0;
   public String[] apple, banana;
   
   
   
   public static String[] input(String filename) throws Exception
   {	
      Scanner infile = new Scanner( new File(filename) );
      int numitems = infile.nextInt()*3 +1;
      String[] imparray = new String[numitems];
      for(int k = 0; k < numitems; k++)
      {
         String x = infile.nextLine();
         imparray[k] = new String(x);
      }
      
      
      return imparray;
   }

   public static void sort(String[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   
   
   public static int findMax(Comparable[] array, int upper){
      int maxPos = 0;
      for(int k = 0; k < upper; k++){
         if(array[maxPos].compareTo(array[k])<  0){
            maxPos = k;
         }
      }
      return maxPos;
   }
 
   private static void swap(Object[] array, int a, int b){
      Object d = array[a];
      array[a] = array[b];
      array[b] = d;
      
   }
   
   public void computation(int count, String fileNameInput) throws Exception{
   
      
  
      apple = input(fileNameInput);
     
              
      banana = new String[apple.length/3];
         
      for(int i = 0; i < banana.length; i++){
         banana[i] = apple[(i*3) +1]; 
      }
       
      sort(banana);
         
       
       
      lname = banana[count];
         
          
      for(int i = 1; i < apple.length; i++){
         if(lname.equals(apple[i])){
            z = i;
            break;
                
         }
             
      }
      fname = apple[z+1];
      size = apple[z+2];
      count = count+1;
   }
      
      
   
   
}