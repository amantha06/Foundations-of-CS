//Anirudh Mantha
//5.6.21
import java.io.*;     					 //the File class
import java.util.*;    				    //the Scanner class
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.lang.Math;
public class Driver15
{
   public static int comparisons = 2;
   public static int linear(double[] array, double target)
   {
      for(int i = 2; i < array.length; i++){
         if(array[i] == target){
            comparisons = i+1;
            return i+1;
         }
      }
      comparisons = 0;
      return -1;
                  
   }
            
            
   
   public static int binary(double[] array, double target, int first, int last)
   {
      comparisons = 0;
      while(first <= last){
         int len = (first + last)/2;
         if(array[len] == target){
            return len;
         }  
         
         if(array[len] > target){
            last = len;
         }
         
         else{
            first = len;
         }
         
       comparisons++;
         
      }
      
      return -1;      
   }
   public static void main(String[] args) throws Exception
   {
      Scanner infile = new Scanner(new File("data.txt"));
      int numitems = infile.nextInt();
      double[] array = new double[numitems];
      for(int k = 1; k < numitems; k++)
         array[k] = infile.nextDouble();
      Arrays.sort(array);
      
      int choice = 0, position;
      double target;
      while(choice != 3)
      {
         String message = "Size = " + numitems + "\n";
         message = message + "\n1. Linear Search.";
         message = message + "\n2. Binary Search.";
         message = message + "\n3. Quit.";
         choice = (int)Double.parseDouble(JOptionPane.showInputDialog(message));
         switch(choice)
         {
            case 1: 
               target = Double.parseDouble(JOptionPane.showInputDialog("Decimal Target between 0.0 and 10.0: "));
               position = linear(array, target);
               JOptionPane.showMessageDialog(null, 
                                       "" + target + (position == -1 ? " not found" : 
                                                        (" found at position " + 
                                                        position)) +
                                       " using " + comparisons + " comparisons.");
               comparisons = 0;
               break;
            case 2: 
               target = Double.parseDouble(JOptionPane.showInputDialog("Decimal Target between 0.0 and 10.0: "));
               position = binary(array, target, 1, array.length - 1);
               JOptionPane.showMessageDialog(null, 
                                       "" + target + (position == -1 ? " not found" :
                                                        (" found at position " + 
                                                        position)) +
                                       " using " + comparisons + " comparisons.");
               comparisons = 0;
               break;
            case 3: 
               JOptionPane.showMessageDialog(null, "Bye-bye!");
               break;
            default: 
               JOptionPane.showMessageDialog(null, "Not a valid selection.");
               break;
         }
      }
      
      System.exit(0);
   }
     
}