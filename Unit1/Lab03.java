//Anirudh Mantha  9/14/20
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Lab03{
   public static void main(String[] args){
      
      
      Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);  
      Display.setSpeed(7);
      
      Climber karel = new Climber();
      Climber karel2 = new Climber();
      
      karel.putBeeper();
      karel.turnRight();
      karel2.turnRight();
      karel.move();
      karel2.move();
      karel.climbUpRight();
      karel2.climbUpRight();
      karel.climbUpRight();
      karel2.climbUpRight();
      karel.climbUpRight();
      karel2.climbUpRight();
      //made to top of Mountain
      
      karel.climbDownRight();
      karel2.climbDownRight();
      karel.climbDownRight();
      karel2.climbDownRight();
      karel.pickBeeper();
      //got treasure
      
      karel.turnAround();
      karel2.turnAround();
      karel.climbUpLeft();
      karel2.climbUpLeft();
      karel.climbUpLeft();
      karel2.climbUpLeft();
      //made back to top of Mountain
      
      karel.climbDownLeft();
      karel2.climbDownLeft();
      karel.climbDownLeft();
      karel2.climbDownLeft();
      karel.climbDownLeft();
      karel2.climbDownLeft();
      karel.move();
      karel.putBeeper();
      karel2.move();
      karel.move();
      karel2.move();
      //put treasure back 
   }
      
}