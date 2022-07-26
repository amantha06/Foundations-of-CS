// Anirudh Mantha
// 2/9/21
// 1557531@fcpsschools.net


import java.util.Scanner;
public class Driver01{
   
   public static final int NUMITEMS = 10;
   public static void main(String[] args){
      
      //instantiate array
      double[] array = new double[NUMITEMS];
      Scanner s = new Scanner(System.in);
      
      //create variable for sum
      double sum = 0.0;
     
      
      for(int x = 0; x < NUMITEMS; x++){
         
         //get user input & set value to number typed
         System.out.print("#" + (x+1) + ": ");
         array[x] = s.nextDouble();
         
         //periodically update sum
         sum = sum + array[x];     
      }
      
      //create average
      double average = sum/NUMITEMS;
      
      //create minimum and maximum with placeholder values
      double minimum = array[0];
      double maximum = array[0];
      
      
      for(int x = 0; x < NUMITEMS; x++){
         //update minimum based on if minimum is less than number checking
         minimum = Math.min(minimum, array[x]);
         
         //update maximum based on if maximum is greater than number checking
         maximum = Math.max(maximum, array[x]);
      }
      
      
      //print out all values
      System.out.println("Sum: " + sum);
      System.out.println("Avg: " + average);
      System.out.println("Min: " + minimum);
      System.out.println("Max: " + maximum);
   }
}