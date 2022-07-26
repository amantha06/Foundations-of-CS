//Anirudh Mantha; 10/8/20

import edu.fcps.Digit;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Lab11{
   public static void main(String[] args){
   
   Display.openWorld("maps/default.map");
   Display.setSize(42, 37);  
   Display.setSpeed(10);

   Digit first = new One(1, 9);
   Digit second = new Five(7, 9);
   Digit third = new Five(13, 9);
   Digit fourth = new Seven(19, 9);
   Digit fifth = new Five(25, 9);
   Digit sixth = new Three(31, 9);
   Digit seventh = new One(37, 9);
   
   first.display();
   second.display();
   third.display();
   fourth.display();
   fifth.display();
   sixth.display();
   seventh.display();
   }   
   
}