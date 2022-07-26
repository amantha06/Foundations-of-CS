//name:    date:

import javax.swing.JOptionPane;
public class Driver13
{
   public static int first;
   public static int second;
   public static void main(String[] args)
   {
      while(true)
      {
         //create a boolean to check if numbers are valid
         boolean isValid = true;
         
         while(isValid == true){
         
            //getting input number
            int first = Integer.parseInt(JOptionPane.showInputDialog("First Digit? (-1 to quit)"));
            
            if(first == -1){
               System.out.println("Bye - Bye");
               System.exit(0);
            }   
            
            //checking validity
            else if(first < 0 || first > 9){
               System.out.println("That's not a digit");
               isValid = false;
               break;
   
            }
            int second = Integer.parseInt(JOptionPane.showInputDialog("Second Digit"));
            
            //checking validity
            if(second < 0 || second > 9){
               System.out.println("That's not a digit");  
               isValid = false;
               break;
            }
             necklace(first, second);

            }
         
         }
      }
      
   public static void necklace(int a, int b)
   {
      
     
      //Print the initial values
      System.out.print(a + " ");
      System.out.print(b + " ");
      
      //store the values into variables that will not change
      int first = a;
      int second = b;
      
      int c = 0;
      
      int count = 0;
      
      //CONDITIONS: stop if a is the initial value AND b is in initial value
      //BUT: make an exception for the first iteration where c is -5 
      while((a != first || b != second) || (count == 0)){
         
         
         //change c
         c = a+b;
         
         //check if 2 digits long
         if(c < 0 || c > 9){
            //get ones place
            c = c%10;
         }
         
         System.out.print(c + " ");
         
         
         //reassign
         a = b;         
         b = c;


         count ++;
         
      }    
    System.out.println("");
    System.out.println("Iterations: " + count);
    return;
}
}