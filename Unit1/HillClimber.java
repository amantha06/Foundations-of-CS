//Anirudh Mantha; 10/1/20

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class HillClimber extends Climber{
   public HillClimber(int x){
      super(x);   
   }
   public void climbUpRight(){
      turnLeft();
      move();
      turnRight();
      move();
      move();
   }
   
   public void climbUpLeft(){
      turnRight();
      move();
      turnLeft();
      move();
      move();
   }
   
   public void climbDownLeft(){
      move();
      move();
      turnLeft();
      move();
      turnRight();
   }
   public void climbDownRight(){
      move();
      move();
      turnRight();
      move();
      turnLeft();
   }
   
   
}