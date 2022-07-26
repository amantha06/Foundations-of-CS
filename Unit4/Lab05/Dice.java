	//Name:    Date:
   public class Dice
   {
      private int myOne, myTwo;
      public Dice()
      {
         myOne = random();
         myTwo = random();
      }
      public void roll()
      {
         	myOne = (int)(Math.random()*5 + 1);
            myTwo = (int)(Math.random()*5 + 1);

      }
//TOTAL() NOT USED       -        TOTAL() NOT USED      -         TOTAL() NOT USED      -      TOTAL() NOT USED
    
//      public int total()
//      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
//      }
      
      public boolean doubles()
      {
         	if(myOne == myTwo){
               return true;
            }
            else{
               return false;
            }
      }
      
      public String toString()
      {
         return "{" + myOne + ", " + myTwo + "}";
      }
      private int random()
      {
         return (int)(Math.random() * 6 + 1);
      }
   }