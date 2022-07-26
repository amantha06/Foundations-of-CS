//Anirudh Mantha; 10/8/20

import edu.fcps.Digit;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class One extends Digit{
   public One(int x, int y){
      super(x, y);
   }
   
   public void display(){
      segment1_Off();
      segment2_On();
      segment3_On();
      segment4_Off();
      segment5_Off();
      segment6_Off();
      segment7_Off();
   }
}