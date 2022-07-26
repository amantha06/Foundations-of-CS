//Anirudh Mantha
//4.8.21
import java.io.*;      //the File class
import java.util.*;    //the Scanner class
public class Driver02
{
   public static void main(String[] args) throws Exception
   {
      double[] array = input("data.txt");
      sort(array);
      output(array, "output.txt");
   }
   public static double[] input(String filename) throws Exception
   {
        Scanner infile = new Scanner(new File(filename));
        int num = infile.nextInt();
        double[] arr1 = new double[num];
        for(int i = 0; i < num; i++){
            arr1[i] = infile.nextDouble();
        }
        
        infile.close();
        return arr1;
   }
   public static void sort(double[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k - 1);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   public static int findMax(double[] array, int upper) //what does "upper" do???
   {
         	int maxInd = 0;
            for(int i = upper; i >=0; i--){
               if(array[i] > array[maxInd]){
                  maxInd = i;
               }  
            }
             
            return maxInd;
   }
   public static void swap(double[] array, int a, int b)//what are "a" and "b" for???
   {
         	double temp = array[b];
            array[b] = array[a];
            array[a] = temp;
          
   }
   public static void output(double[] array, String filename) throws Exception
   {
         	System.setOut(new PrintStream(new FileOutputStream(filename)));
            for(int i = 0; i < array.length; i++){
               System.out.println(array[i]);
            }
         
   }
}