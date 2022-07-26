 //Torbert, e-mail: smtorbert@fcps.edu
 //version 7.22.2003
 //mlbillington  7.18.2018  update to PrintWriter

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
public class MakeDataFile
{
   public static void main(String[] args) throws Exception
   {
      int numitems = (int)(Math.random() * 3000 + 3000);
      double[] nums = new double[numitems];
      for(int k = 0; k < numitems; k++)
         nums[k] = Math.random() * 10;  //lots of duplicate numbers
         
      Arrays.sort(nums);   
      
      DecimalFormat d = new DecimalFormat("0.0");
      PrintWriter numFile = new PrintWriter(new FileWriter("data.txt"));
      numFile.println( numitems );
      for(int k = 0; k < numitems; k++)
         numFile.println( d.format(nums[k]) );
      numFile.close();
   }
}