//Anirudh Mantha
//4.15.21

public class Distance implements Comparable<Distance>
{
   private int myFeet, myInches;
    public Distance()
       {
       myFeet = 0;
       myInches = 0;
    }
   public Distance(int x, int y)
   {
      myFeet = x;
      myInches = y;
   }
   public int getFeet()
   {
      return myFeet;
   }
   public int getInches()
   {
      return myInches;
   }
   public void setFeet(int x)
   {
      myFeet = x;
   }
   public void setInches(int x)
   {
      myInches = x;
   }
   

   public int compareTo(Distance d) 
   {
   
      
      
      
      int myTotal = myFeet * 12 + myInches;   
     
      int dTotal = d.getFeet() * 12 + d.getInches(); 
       
      return myTotal - dTotal;
  
   }
   
   
    public boolean equals(Distance arg)
   {
       return compareTo(arg) == 0;
    }
  
   public String toString()
   {
      return myFeet + "\' " + myInches + "\" ";
   }
}

