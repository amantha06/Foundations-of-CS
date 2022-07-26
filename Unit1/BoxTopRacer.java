import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class BoxTopRacer extends Racer{
   public BoxTopRacer (int y){
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
      while(!rightIsClear()){
         move();
      }
      turnRight();
      while(frontIsClear()){
         move();
      }
      turnLeft();
   } 
   
   

}

