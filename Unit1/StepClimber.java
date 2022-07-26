//Anirudh Mantha; 10/1/20

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
   public class StepClimber extends Climber{
      public StepClimber(int x){
         super(x);
      }
      public void climbUpRight(){
         turnLeft();
         move();
         turnRight();
         move();
      }
      
      public void climbUpLeft(){
         turnRight();
         move();
         turnLeft();
         move();
      }
      
      public void climbDownLeft(){
         move();
         turnLeft();
         move();
         turnRight();
      }
      
      public void climbDownRight(){
         move();
         turnRight();
         move();
         turnLeft();
      }
   }
