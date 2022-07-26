//Anirudh Mantha
//4.13.21
public class Weight implements Comparable<Weight>
{
   private int myPounds, myOunces;
   public Weight()
   {
      myPounds = myOunces = 0;
   }
   public Weight(int x, int y)
   {
      myPounds = x;
      myOunces = y;
   }
   public int getPounds()
   {
      return myPounds;
   }
   public int getOunces()
   {
      return myOunces;
   }
   public void setPounds(int x)
   {
      myPounds = x;
   }
   public void setOunces(int x)
   {
      myOunces = x;
   }
   public int compareTo(Weight w)
   {
      if(myPounds < w.getPounds())
         return -1;
      if(myPounds > w.getPounds())
         return 1;
      if(myOunces < w.myOunces)
         return -1;
      if(myOunces > w.getOunces())
         return 1;
      return 0;
   }
   public String toString()
   {
      return myPounds + " lbs. " +
                 myOunces + " oz.";
   }
}
