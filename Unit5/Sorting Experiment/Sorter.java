//Created by Christina Wallin
//Period 4; 3/1/07

    public class Sorter{
       public static long sort(String sort, int[] data, int numItems){
         long time = System.currentTimeMillis();
         if(sort.equals("Bubble Sort"))
            bubble(data, numItems);
         else if(sort.equals("Insertion Sort"))
            insert(data, numItems);
         else if(sort.equals("Selection Sort"))
            select(data, numItems);
         else if(sort.equals("Merge Sort"))
            merge(data, numItems);
         else if(sort.equals("Quick Sort"))
            quick(data, numItems);
         else 
            heap(data, numItems);
         return System.currentTimeMillis() - time;
      }
   //BUBBLE SORT - non-optimized
       private static void bubble(int[] data, int numItems)
      {
         System.out.println("Bubble Sort has not been implemented.");
     }
   
   //INSERTION SORT
       private static void insert(int[] data, int numItems)       
      {        
			 System.out.println("Insertion Sort has not been implemented.");
       }
         
   //SELECTION SORT
       private static void select(int[] data, int numItems)
      {
		    System.out.println("Selection Sort has not been implemented.");
      }
         
   //MERGE SORT
       private static void merge(int[] data, int numItems)
      {
		    System.out.println("Merge Sort has not been implemented.");
      }
      
       //QUICK SORT
       private static void quick(int[] data, int numItems)
      {
		    System.out.println("Quick Sort has not been implemented.");
      }
     
       //HEAPSORT -- the items in the array always start at 1 anyway, so there is no need to recopy the array
       private static void heap(int[] data, int numItems)
      {
		   System.out.println("Heap Sort has not been implemented.");
       }

       //private method swap - used for many of the sorts
       private static void swap(int[] data, int a, int b)
      {
		   System.out.println("Swap Method has not been implemented.");
      }
   }