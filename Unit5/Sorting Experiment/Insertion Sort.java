 //INSERTION SORT
       private static void insert(int[] data, int numItems)
      {
         for(int i = 2; i < numItems; i++)
         {
            shift(data, i, data[i]);
         }
      }
       private static void shift(int[] array, int index, int value)
      {
         for(int i = index - 1; i >=1; i--)
         {
            if(array[i]>value)
            {
               array[i+1]=array[i];
               if(i==0)
                  array[i]=value;
            }
            else
            {
               array[i+1]=value;
               return;
            }
         }
      }
