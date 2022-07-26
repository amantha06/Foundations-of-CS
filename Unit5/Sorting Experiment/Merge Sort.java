   //MERGE SORT
       private static void merge(int[] data, int numItems)
      {
         int[] helper = new int[numItems];
         mergeHelper(data, helper, 1, numItems -1);
      }
       private static void mergeHelper(int[] data, int[] copy, int low, int high)
      {
         if(low<high)
         {
            int mid = (high + low)/2;
            mergeHelper(data, copy, low, mid);
            mergeHelper(data, copy, mid + 1, high);
            mergeLists(data, copy, low, mid, high);
         }
      }
       private static void mergeLists(int[] data, int[] copy, int low, int mid, int high)
      {
         int s1 = low;
         int s2 = mid + 1;
         for(int i = low; i <=high; i++)
         {
            if(s1>mid)
            {
               copy[i] = data[s2];
               s2++;
            }
            else if(s2>high)
            {
               copy[i] = data[s1];
               s1++;
            }
            else if(data[s1]<data[s2])
            {
               copy[i] = data[s1];
               s1++;}
            else{
               copy[i] = data[s2];
               s2++;
            }
         
         }
      //copy ==> data
         for(int i = low; i <= high; i++)
         {
            data[i] = copy[i];
         }
      } 
   