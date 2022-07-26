	//Name: Anirudh Mantha    Date: 2/23/21
    public class Driver05
   {
      public static final int TRIALS = 100000;
       public static void main(String[] args)
      {
      double count = 0.0;
      double doublescount = 0.0;
      Dice d = new Dice();
         
         
         do{
            d.roll();
            if(d.doubles()){
               doublescount++;
            }
            count++;
            
         }while(doublescount <= TRIALS);
         
      
     System.out.println("The average number of rolls to get doubles: " +  count/doublescount);
      
         
         
      }
   }
