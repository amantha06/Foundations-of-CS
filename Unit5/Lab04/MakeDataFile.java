//Anirudh Mantha
//4.13.21
   import java.io.*;
    public class MakeDataFile
   {
       public static void main(String[] args) throws Exception
      {
         PrintWriter pw = new PrintWriter(new FileWriter("data.txt"));
         int numitems = (int)(Math.random() * 25 + 50);
         pw.println(numitems);
         for(int k = 0; k < numitems; k++)
         {
            pw.println((int)(Math.random() * 100));
            pw.println((int)(Math.random() * 16));
         }
         pw.close();
      }
   }