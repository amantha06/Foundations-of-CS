import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   public class SideToSideDancer extends Dancer{
   
   public SideToSideDancer(){
      super(1, 1, Display.EAST, 0);
   }
   public SideToSideDancer(int x, int y, int dir, int beep){
      super(x, y, dir, beep);
   }
   public void danceStep(){
      move();
      turnAround();
      move();
      move();
      turnAround();
      move();    
   }
} 