//Anirudh Mantha 9/24/20
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
  
   public class Lab05{  
      public static void runTheRace(Racer arg){
         arg.move();
         arg.jumpRight();
         arg.sprint(2);
         arg.pick(7);
         arg.turnAround();
         arg.sprint(2);
         arg.jumpLeft();
         arg.move();
         arg.put(7);
         arg.turnAround();
         arg.move();
         //first stretch done
         
         arg.jumpRight();
         arg.sprint(4);
         arg.pick(5);
         arg.turnAround();
         arg.sprint(4);
         arg.jumpLeft();
         arg.move();
         arg.put(5);
         arg.turnAround();
         arg.move();
         //second stretch done
         
         arg.jumpRight();
         arg.sprint(6);
         arg.pick(3);
         arg.turnAround();
         arg.sprint(6);
         arg.jumpLeft();
         arg.move();
         arg.put(3);
         arg.turnAround();
         arg.move();
         //final stretch done
         
      }
    public static void main(String[] args){
    
      Display.openWorld("maps/shuttle.map");
      Display.setSize(10, 10);
      Display.setSpeed(8);
      
      
         Racer bolt = new Racer(1);
         Racer usain = new Racer(4);
         Racer usainBolt = new Racer(7);
         
         runTheRace(bolt);
         runTheRace(usain);
         runTheRace(usainBolt);


      }
}