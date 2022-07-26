import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public abstract class Shooter extends Athlete{

    public Shooter(int x, int y, int dir, int beep){
      super(x, y, dir, beep);
    }
     
    public Shooter(){
      super(1, 1, Display.NORTH, 0);
    }
    
   public abstract void shootRight();
   public abstract void shootLeft();

}