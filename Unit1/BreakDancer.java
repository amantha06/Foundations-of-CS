import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   public class BreakDancer extends Dancer{
   
   public BreakDancer(){
      super(1, 2, Display.EAST, 0);
   }
   public BreakDancer(int x, int y, int dir, int beep){
      super(x, y, dir, beep);
   }
   public void danceStep(){
      move();
      turnAround();
      move();
      move();
      turnAround();
      move();
      turnRight();
      turnLeft();
   }
} 
