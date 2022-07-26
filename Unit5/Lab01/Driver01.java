//Name: Anirudh Mantha    
//Date: 4.6.21
  

import java.io.*;
public class Driver01
{
   public static void main(String[] args)
   {
   	//input
      double[] myArray = {2.0, 3.7, 9.9, 8.1, 8.5, 7.4, 1.0, 6.2};
   				      
   	//sort the array
      int maxIndex;
      double temp;
      
   
      
      for(int i = myArray.length - 1; i>=0; i--){
         temp = myArray[i];
         maxIndex = i;
         for(int x = 0; x < i; x++){
            if(myArray[x] > temp){
               temp = myArray[x];
               maxIndex = x;
            }
         } 
         
         if(temp > myArray[i]){
            temp = myArray[i];
            myArray[i] = myArray[maxIndex];
            myArray[maxIndex] = temp;
         }
      }
      
     		  
   
      for(int i = 0; i < myArray.length; i++){
         System.out.print(myArray[i] + " ");
      }
      
      
   	
   }
}