       //QUICK SORT
       private static void quick(int[] data, int numItems)
      {
         quickSort(1, numItems - 1, data);
      }
       private static void quickSort(int left, int right, int[] data)
      {
         if(left>=right)
         {
            return;
         }
         int i = left;
         int j = right;
         int pivot = data[(left + right)/2];
         while(i < j)
         {
            while(data[i]<pivot)
               i++;
            while(data[j]>pivot)
               j--;
            if(i<=j)
            {
               swap(data,i,j);
               i++;
               j--;
            }
         }
         quickSort(left, j, data);
         quickSort(i, right, data);
      }
