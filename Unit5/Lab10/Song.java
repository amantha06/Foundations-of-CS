//Anirudh Mantha  
//Date: 4.27.21

public class Song implements Comparable<Song>
{
   	//data fields
   private String myTitle;
   private int myMin, mySec;
   
   	//constructors
   public Song(){
      myMin = 0;
      mySec = 0;
      myTitle = "";
   }
   public Song(String toBeParsed)
   {  
      myMin = Integer.parseInt(toBeParsed.substring(0, toBeParsed.indexOf(":")));
      mySec = Integer.parseInt(toBeParsed.substring(toBeParsed.indexOf(":")+1, toBeParsed.indexOf(":")+3));
      myTitle = toBeParsed.substring(toBeParsed.indexOf(":")+3);
         
   }
     
   public int getMin()
   {
      return myMin;
   }
   public int getSec()
   {
      return mySec;
   }
   public String getTitle()
   {
      return myTitle;
   }

   
   public void setMin(int x)
   {
      myMin = x;
   }
   public void setSec(int x)
   {
      mySec = x;
   }
   public void setTitle(String x)
   {
      myTitle = x;
   }
   
      
   public int compareTo(Song s) 
   {  
      
      int myTotal = myMin * 60 + mySec;   
     
      int sTotal = s.getMin() * 60 + s.getSec(); 
       
      return myTotal - sTotal;
   
   }
   
   public boolean equals(Song arg)
   {
      return compareTo(arg) == 0;
   }
       
   public String toString()
   {
      return myMin + "\' " + mySec + "\" ";
   } 	
}