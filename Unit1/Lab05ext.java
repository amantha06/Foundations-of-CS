import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import java.lang.Runnable;


public class Lab05ext{

   public static void main(String[] args){
   
   Display.openWorld("maps/shuttle.map");
   Display.setSize(10, 10);
   Display.setSpeed(7);
   
   Thread t1 = new Thread(new Racer(1));
   Thread t2 = new Thread(new Racer(4));
   Thread t3 = new Thread(new Racer(7));
   
   t1.start();
   t2.start();
   t3.start();
   }
}