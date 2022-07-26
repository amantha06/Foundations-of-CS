//Anirudh Mantha  9/14/20
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   public class Lab02{
      public static void main(String[] args){
      
      
      Display.openWorld("maps/maze.map");
      Display.setSize(8, 8);
      Display.setSpeed(5);
      
      Athlete karel = new Athlete();
      
      karel.putBeeper();
      karel.move();
      karel.putBeeper();
      karel.turnRight();
      karel.move();
      karel.putBeeper();
      karel.turnRight();
      karel.move();
      karel.putBeeper();
      karel.turnLeft();
      karel.move();
      karel.putBeeper();
      karel.turnLeft();                
      karel.move();
      karel.putBeeper();
      karel.turnRight();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.putBeeper();
      karel.turnRight();
      karel.move();
      karel.putBeeper();
      karel.turnLeft();
      karel.move();
      karel.putBeeper();
      karel.turnLeft();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.putBeeper();
      karel.turnRight();
      karel.move();
      karel.putBeeper();
      karel.move();
      

      
      }
   }