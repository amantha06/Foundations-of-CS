import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
  
public class RightShooter extends Shooter{
    
   public RightShooter(){
      super(1, 1, Display.NORTH, 0);
   }
   public RightShooter(int x, int y, int dir, int beep){
      super(x, y, dir, beep);
   }
   public void shootRight(){
      
      for(int k = 0; k < 6; k++){
      
         while(rightIsClear())
         {  
            if (nextToABeeper())
            {
               pickBeeper();
            }
            turnRight();
            move();
            if (nextToABeeper())
            {
               pickBeeper();
            }
            turnLeft();
         }
         while(!rightIsClear())
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
   
      turnRight();
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
      turnRight();
      move();
      pickBeeper();
      turnLeft();
      move();
      pickBeeper();
      turnRight();
      move();
      pickBeeper();
      turnRight();
      move();
      
      while(hasBeepers()){
         putBeeper();
      }
      turnRight();
      move();
      
   }
   
   public void shootLeft(){
      
   }
} 
