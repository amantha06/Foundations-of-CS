import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   public class Lab15{
   public static void main(String[] args){
   
   
   
      
   BreakDancer bob = new BreakDancer(3, 1, Display.EAST, 0);
   BoxDancer job = new BoxDancer(8, 10, Display.EAST, 0);
   SideToSideDancer lob = new SideToSideDancer(2, 10, Display.EAST, 0);
   
   Thread t1 = new Thread(bob);
   Thread t2 = new Thread(job);
   Thread t3 = new Thread(lob);
  
   t1.start();
   t2.start();
   t3.start();
   
   //threads
 
   
   }

}