//Anirudh Mantha  3/4/21
import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;

public class Driver08{
   public static void main(String[] args) throws Exception{
      
      //create scanner
      Scanner infile = new Scanner(new File("words.txt")); 
      
      //variables used later
      boolean check = true;
      char c = '"';       
   
      
      //Using this method for Array because we do not need 1st number
      int count = infile.nextInt() + 1;       
      String[] array = new String[count];
          
      for(int x = 0; x < count; x++){
         array[x] = infile.nextLine();   
      }
      
      while(true){
         
         String myWord = JOptionPane.showInputDialog("Word? (Type -1 to quit:)");
      
         if(myWord.equals("-1"))
            break;
         
         //resetting value to true
         check = true;  
                     
         for(int x = 0; x < count; x++){ 
            if(array[x].equals(myWord)){  
               System.out.println("Yes, " + c +  myWord + c + " is a word, #" + x);  
               check = false; //make sure to not print Sorry... 
            }
         
         }
         while(check){ //will be true if something is not already printed
            System.out.println("Sorry, " + c + myWord + c + " is not a word");
            check = false;
         }
         
      }
      System.out.println("Good-bye");
   
   }
            
} 
            
                
           
         
          
         
                   
      
   
