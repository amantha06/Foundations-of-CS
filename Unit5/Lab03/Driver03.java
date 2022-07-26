//Anirudh Mantha
//4.09.21

public class Driver03{
   public static void main(String[] args){
      int[] array = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109};
      print(array);
      scramble(array);
      print(array);;
      sort(array);
      print(array); 
   }
   
   public static int[] scramble(int[] inputarray){
      int index = 0; 
      int temp = 0;
      for (int i = inputarray.length - 1; i > 0; i--)
      {
         index = (int)(Math.random()*10);
         temp = inputarray[index];
         inputarray[index] = inputarray[i];
         inputarray[i] = temp;
      }
      return inputarray;
   }
   
   public static void sort(int[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k - 1);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   public static int findMax(int[] array, int upper) //what does "upper" do???
   {
         	int maxInd = 0;
            for(int i = upper; i >=0; i--){
               if(array[i] < array[maxInd]){
                  maxInd = i;
               }  
            }
             
            return maxInd;
   }
   public static void swap(int[] array, int a, int b)//what are "a" and "b" for???
   {
         	int temp = array[b];
            array[b] = array[a];
            array[a] = temp;
          
   }

   public static void print(int[] inputarray){
      for(int i = 0; i < inputarray.length; i++){
         System.out.print(inputarray[i] + ", ");
      }
      System.out.println("\n");
   }  
}

