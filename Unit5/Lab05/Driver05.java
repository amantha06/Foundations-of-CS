//Anirudh Mantha
//4.15.21
import java.io.*;      //the File class
import java.util.*;    //the Scanner class

public class Driver05 extends Distance
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
      Comparable[] array = new Distance[numitems];
      for(int k = 0; k < numitems; k++)
      {
            int x = infile.nextInt();
            int y = infile.nextInt();
            array[k] = new Distance(x, y);
         }
      
      infile.close();
      return array;
   }
          
   public static void sort(Comparable[] array)
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
         if(array[k].compareTo(array[maxPos]) > 0 && !array[k].equals(array[maxPos])){
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