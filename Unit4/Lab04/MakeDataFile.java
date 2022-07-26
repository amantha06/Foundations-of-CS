import java.io.*;
public class MakeDataFile
{
   public static void main(String[] args) throws Exception
   {
      PrintWriter outfile = new PrintWriter(new FileWriter("datalist.txt") );
   
      int numitems = (int)(Math.random() * 5000 + 5000);
      outfile.println(numitems);
   
      for(int x = 0; x < numitems; x++)
         outfile.println(Math.random() * 1000);
   
      outfile.close();
   }
}