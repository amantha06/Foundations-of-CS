//Anirudh Mantha
//4.27.21

import java.io.*;       		 //the File class
import java.util.*;     		 //the Scanner class
import javax.swing.JOptionPane;
public class Driver10 extends Song{


   public static void main(String[] args) throws Exception
   {
      Song[] songList = input();
      int totalTime = calcTime(songList);
      int longestSong = searchLongestSong(songList);
      display(songList, totalTime, longestSong);
      System.exit(0);
      
      
      
   }
   	
   public static Song[] input() throws Exception
   {
      String song = JOptionPane.showInputDialog("What file?");
      Scanner infile = new Scanner(new File(song));            
      String songpart = infile.nextLine();
      
      int numitems = Integer.parseInt(songpart);
      Song[] array = new Song[numitems];
      
      for(int k = 0; k < numitems; k++)
      {
         String x = infile.nextLine();
         array[k] = new Song(x);
      }
      
      infile.close();
      return array;
      
      
            
   }
   
   public static int calcTime(Song[] songs)
   {
         
      int totalMin = 0;
      int totalSec = 0;
      int totaltime = 0;
      for(int i = 0; i < songs.length; i++){
           
         totalMin = totalMin + songs[i].getMin();
         totalSec = totalSec + songs[i].getSec();
          
      }
            
      if(totalSec > 60){
         totalMin = totalMin + totalSec/60;
         totalSec = totalSec - 60*(totalSec/60);
      }
            
      String t = "" + totalMin;
      String t2 = "" + totalSec;
            
      String add = t + t2;
    
      totaltime = Integer.parseInt(add);
            
            
      return totaltime;
   }
      
   public static int searchLongestSong(Comparable[] songs)
   {
      int maxPos = 0;
      for(int k = 0; k < songs.length; k++){ 
         if(songs[k].compareTo(songs[maxPos]) > 0 && !songs[k].equals(songs[maxPos])){
            maxPos = k;
         }
      }
         
      
 
            
      return maxPos;
   } 
      
   public static void display(Song[] array, int total, int longestSong)
   {
      String temp = "" + total; 
      String p2 = temp.substring(temp.length()-2);
      String p1 = temp.substring(0, temp.length()-2);
      
      
      
      
      System.out.println("Total Time: " + p1 + "\' " + p2 + "\" ");
      
      
      System.out.println("Longest Song: " + array[longestSong].getTitle() + " (" + array[longestSong].getMin() + "\' " + array[longestSong].getSec() + "\") ");
       
   }
   
}