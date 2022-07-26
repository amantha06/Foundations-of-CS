   //Name: Anirudh Mantha           Date: 2/11/21
   import java.util.Scanner;
    public class Driver02
   {
      public static final int NUMITEMS = 10;
       public static void main(String[] args)
      {
         
         
         //instantiate array
         double[] arrayFar = new double[NUMITEMS];
         Scanner s = new Scanner(System.in);
         
    
         
         for(int x = 0; x < NUMITEMS; x++){
            
            //get user input & set value to number typed
            System.out.print("#" + (x+1) + " - Degrees Fahrenheit: ");
            arrayFar[x] = s.nextDouble();
            

 
         }
         //create a variable to store all conversion
         double convert = 0;
         
         //create array for Celsius
         double[] arrayCel = new double[NUMITEMS];
         for(int i = 0; i < NUMITEMS; i++){
            
            //update the conversion
            convert = arrayFar[i];
            convert = (convert - 32)*5;
            convert = convert/9; 
            
            //set value to celsius value
            arrayCel[i] = convert;
            
            
            
         }  
              
         
         //making title of chart
         // "\n" makes a new line
         System.out.print("Fahrenheit" + "\t" + "|Celsius" + "\n" + "-----------------------" + "\n");
         
         for(int a = 0; a < NUMITEMS; a++){
            
            //looping through and adding elements with tabs
            System.out.println(arrayFar[a] + "\t" + "\t" + "|" + arrayCel[a]);
            
         }
         
         
         
        
      }
   }