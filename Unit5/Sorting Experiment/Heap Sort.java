       //HEAPSORT -- the items in the array always start at 1 anyway, so there is no need to recopy the array
       private static void heap(int[] data, int numItems)
      {
         //make the data into a maxHeap
         for(int i = numItems - 1; i>1; i--)
         {
            if(data[i]>data[i/2])
            {
               swap(data, i, i/2);
               heapDown(data, i, numItems - 1);
            }  
         }
         //sort the data
         for(int i = 1; i < numItems-1; i++)
         {
            swap(data, 1, numItems - i);
            heapDown(data, 1, numItems - i -1);
         }
      }
      
       private static void heapDown(int[] data, int k, int size)
      {
         int max = -1;
         if((k*2<=size&&data[k*2]>data[k])||((k*2+1)<=size&&data[(k*2+1)]>data[k]))
         {
            if((k*2+1)<=size&&data[k*2]>data[(k*2+1)])
            { //don't also have to check for k*2 because (k*2+1) is always one more than (k*2+1).
               swap(data, k, k*2);
               max = k*2;
            }
            else if(!((k*2+1)<=size))
            {
               swap(data, k, k*2);
               max = k*2;}
            else {
               swap(data, k, (k*2+1));
               max = (k*2+1);
            }
            heapDown(data, max, size);
         }
      }
  