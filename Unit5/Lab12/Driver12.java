//Anirudh Mantha
//5.04.21
import java.io.*;
import javax.swing.*;
public class Driver12
{
   public static PrintWriter outFile;
   public static void main(String[] args) throws Exception
   {
      String folder = JOptionPane.showInputDialog("Complete path of folder:");
      String filename = "";
      for(int k = 0; k < folder.length(); k++)
      {
         char ch = folder.charAt(k);
         if(Character.isLetterOrDigit(ch))
            filename = filename + ch;
         else
            filename = filename + '_';
      }
      outFile = new PrintWriter(new FileWriter(filename + ".txt"));
      foo(new File(folder));      //call the recursive method
      outFile.close();
      System.exit(0);
   }
   public static void foo(File f)
   {
   
   
//METHOD 1    METHOD 1    METHOD 1    METHOD 1    METHOD 1    METHOD 1    METHOD 1    METHOD 1
      if(f.isDirectory()){
         File[] array = new File[f.listFiles().length];
         array = f.listFiles();
         for(int i = 0; i < array.length; i++){
            foo(array[i]);
         }
      }
      else{
         outFile.println(f.getPath());
      }
      
//METHOD 2    METHOD 2    METHOD 2    METHOD 2    METHOD 2    METHOD 2    METHOD 2    METHOD 2
           
      // File[] array = new File[f.listFiles().length];
      // array = f.listFiles();
      // for(int i = 0; i < array.length; i++){
         // if(!array[i].isDirectory()){
            // outFile.println(array[i].getPath());
         // }
         // else{
            // foo(array[i]);
         // }
      //       
      // }
                           
   }
}