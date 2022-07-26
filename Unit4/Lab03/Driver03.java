   //Anirudh Mantha  2/16/21
   import java.io.*;      //the File class
   import java.util.*;    //the Scanner class
   import java.text.*;    //the Decimal Format class
   
    public class Driver03
   {
      public static final int NUMITEMS = 20;
       public static void main(String[] args) throws Exception
       {
         Scanner infile = new Scanner( new File("data.txt") );
      	
         //create array for far and cel
         double[] cel = new double[NUMITEMS];
         double[] far = new double[NUMITEMS];
         
         //run through textfile and assign values
         for(int x = 0; x < NUMITEMS; x++){
            far[x] = infile.nextDouble();
         }
         infile.close();
         
         //convert to celsius
         for(int i = 0; i < NUMITEMS; i++){
            cel[i] = (far[i]-32)*(5.0/9.0);
         }
         
         //print out top of table
         System.out.print("Fahrenheit" + "\t" + "|Celsius" + "\n" + "-----------------------" + "\n");  
         
         //decimal format
         DecimalFormat d = new DecimalFormat("0.00");         
         
         
         for(int a = 0; a < NUMITEMS; a++){
            
            System.out.println(far[a] + "\t" + "\t" + "|" + d.format(cel[a]));
            
         }

         
      	
      	
      	}
   }
