import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class SteepleChaseRacer extends Racer{
   public SteepleChaseRacer (int y){
      super(y);
   }
   
   public void jumpRight(){
      while(frontIsClear()){
         move();
      }  
      turnLeft();
      while(!rightIsClear()){
         move();
      }
      turnRight();
      move();
      turnRight();
      while(frontIsClear()){
         move();
      }
      turnLeft();
   } 
   
   

}

   
