//Anirudh Mantha
//4.15.21

import java.io.*;      //the File class
import java.util.*;    //the Scanner class

public class Driver06
{
   public static void main(String[] args) throws Exception
   {
      Comparable[] apple = input("data.txt");
      sort(apple);
      output(apple, "output.txt");
   }
   
   public static Comparable[] input(String filename) throws Exception
   {	
      Scanner infile = new Scanner( new File(filename) );
      int numitems = infile.nextInt();
      Comparable[] array = new String[numitems];
      for(int k = 0; k < numitems; k++)
      {
            String x = infile.nextLine();
            array[k] = new String(x);
         }
         
      
      return array;
   }

    public static void sort(Comparable[] array)
   {
      int maximum;
      for(int i = 0; i < array.length; i++)
      {
         maximum = findMax(array, array.length - i);
         swap(array, maximum, array.length - i - 1);
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
   
   public static void output(Object[] array, String filename) throws Exception
   {
      PrintWriter outFile = new PrintWriter(new FileWriter(filename));
      for(int k = 0; k < array.length; k++)
         outFile.println(array[k].toString());
      outFile.close();
   }
   
}