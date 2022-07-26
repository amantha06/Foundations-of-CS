//Anirudh Mantha 9/14/20
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   public class Climber extends Athlete {
      public Climber(){
         super(8, 1, Display.NORTH, 1);
         }
      public Climber(int x){
         super(x, 1, Display.NORTH, 1);
      }
      
      public void climbUpRight(){
         turnLeft();
         move();
         move();
         turnRight();
         move();
      }
      
      public void climbUpLeft(){
         turnRight();
         move();
         move();
         turnLeft();
         move();
      }
      
      public void climbDownRight(){
         move();
         turnRight();
         move();
         move();
         turnLeft();
      }
      
      public void climbDownLeft(){
         move();
         turnLeft();
         move();
         move();
         turnRight();
      }
         
      }
   