import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
public class DisplaySampleYard extends JPanel{
   
   private static Yard[] customers;
   private static int number = 0;
   private static double runtotal = 0;    
   private static JTextField[] input = new JTextField[5];
   private String file;


   public DisplaySampleYard(){
      setLayout(new GridLayout(5, 1));
      
      for(int i = 0; i < input.length; i++){
         input[i] = new JTextField();
         add(input[i]);
      }
      
      
      try{
      String file = JOptionPane.showInputDialog("Please enter a file");
      customers = new Yard[5];
      customers = input(file);
      sort(customers);  
      for(int i = 0; i<customers.length; i++){
         System.out.println(customers[i]);
      }
      }
      
      catch(Exception e){
         System.out.println(e);
      }          
   }
   public static Yard[] input(String filename) throws Exception
   {	
      Scanner infile = new Scanner( new File(filename) );
      int numitems = infile.nextInt();
      Yard[] imparray = new Yard[numitems];
      System.out.println(numitems);
      String lname;
      String fname;
         for(int x = 0; x < numitems; x++){
            lname = infile.next();            
            fname = infile.next();
            int size = Integer.parseInt(infile.next());
            
            if(size <= 10000)
                imparray[x] = new CustomerSmallYard(lname, fname, size);
          
             if(size <= 20000 && size > 10000)
                imparray[x] = new CustomerMediumYard(lname, fname, size);
          
             if(size > 20000)
                imparray[x] = new CustomerLargeYard(lname, fname, size);
             return imparray;  
          

      
      
   }
         return imparray;

}
   public static void sort(Yard[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   
   
   public static int findMax(Yard[] array, int upper){
      int maxPos = 0;
      for(int k = 0; k < upper; k++){
         if(array[maxPos] != null && array[k] != null && array[maxPos].compareTo(array[k]) <  0){
            maxPos = k;
         }
      }
      return maxPos;
   }
 
   private static void swap(Yard[] array, int a, int b){
      Yard d = array[a];
      array[a] = array[b];
      array[b] = d;
      
   }
  //  public static Yard[] input(String filename){
//       Yard[] array;
//       try{
//          Scanner infile = new Scanner(new File(filename));
//          String lname;
//          String fname;
//          int numitems = Integer.parseInt(infile.nextLine());
//          array = new Yard[numitems];
//          for(int x = 0; x < numitems; x++){
//             lname = infile.nextLine();
//             fname = infile.nextLine();
//             int size = Integer.parseInt(infile.nextLine());
//          
//             if(size <= 10000)
//                array[x] = new CustomerSmallYard(lname, fname, size);
//          
//             if(size <= 20000 && size > 10000)
//                array[x] = new CustomerMediumYard(lname, fname, size);
//          
//             if(size > 20000)
//                array[x] = new CustomerLargeYard(lname, fname, size);
//             return array;  
//          
//          
//          }
//       }
//       catch(FileNotFoundException e){
//          JOptionPane.showMessageDialog(null, "The file could not be found.");
//          String file = JOptionPane.showInputDialog("Enter a file");
//          input(file);
//       }
//       return null;
//    }
//    public static void sort(Yard[] array){
//       int maxPos;
//       for(int x = 0; x < array.length; x++){
//          maxPos = findMax(array, array.length - x);
//          swap(array, maxPos, array.length - x - 1);
//       }
//    }
//    public static int findMax(Yard[] array, int up){
//       int index = 0;
//       for(int x = 0; x < up; x++){
//          if(array[x].compareTo(array[index]) > 0){
//             index = x;
//          }
//       }
//       return index;
//    }
//    public static void swap(Yard[] array, int a, int b){
//       Yard temp = array[a];
//       array[a] = array[b];
//       array[b] = temp;
//    }
   public static void update(){
   
      input[0].setText(customers[number].getFirstName());
      input[1].setText(customers[number].getLastName());
      input[2].setText(""+customers[number].getSize());
      input[3].setText(""+customers[number].getCost());
      runtotal = runtotal + customers[number].getCost();
      input[4].setText("" + runtotal);
      number++;
      
   }
}
