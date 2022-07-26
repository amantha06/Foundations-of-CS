import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   public class BoxDancer extends Dancer{
   
   public BoxDancer(){
      super(1, 1, Display.EAST, 0);
   }
   public BoxDancer(int x, int y, int dir, int beep){
      super(x, y, dir, beep);
   }
   public void danceStep(){
      turnRight();
      move();
      move();
      turnRight();
      move();
      move();
      turnRight();
      move();
      move();
      turnRight();
      move();
      move();
    
   }
} 