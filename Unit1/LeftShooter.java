import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   public class LeftShooter extends Shooter{
   
   public LeftShooter(){
      super(10, 1, Display.NORTH, 0);
   }
   public LeftShooter(int x, int y, int dir, int beep){
      super(x, y, dir, beep);
   }
    public void shootRight(){
      }
   public void shootLeft(){
            for(int k = 0; k < 6; k++){
      
         while(leftIsClear())
         {  
            if (nextToABeeper())
            {
               pickBeeper();
            }
            turnLeft();
            move();
            if (nextToABeeper())
            {
               pickBeeper();
            }
            turnRight();
         }
         while(!leftIsClear())
         {
            if (nextToABeeper())
            {
               pickBeeper();
            }
            move();
            if (nextToABeeper())
            {
               pickBeeper();
            }
         }
      }
   
      turnLeft();
      while(frontIsClear()){
         if(nextToABeeper()){
            pickBeeper();
            move();
         }
         else if(!nextToABeeper()){
            move();
         }
      }
      while(!frontIsClear()){
        if(nextToABeeper()){
         pickBeeper();
        }
        else{
         break;
        }
      }
      turnLeft();
      move();
      pickBeeper();
      turnRight();
      move();
      pickBeeper();
      turnLeft();
      move();
      pickBeeper();
      
      
      while(hasBeepers()){
         putBeeper();
      }
      turnLeft();
      move();
      
   }
   }
   
  


