   //Anirudh Mantha 9/29/20
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
public class Lab06
{
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(13, 10);
      Display.setSpeed(7);
      
      task_01(); //go to the end of the row of beepers
      task_02(); //go to the beeper
      task_03(); //go to the wall
      task_04(); //go to the wall, pick up all the beepers (max one per pile)
      task_05(); //go to the wall, pick up all the beepers
      task_06(); //go to the end of the row of beepers, there is one gap
   }
   public static void task_01()	
   { //go to the end of the row of beepers
      Robot temp = new Robot(1, 1, Display.EAST, 0);
      while(temp.nextToABeeper()){
         temp.move();
      }
   }
   public static void task_02()	
   { //go to the beeper
      Robot temp = new Robot(1, 2, Display.EAST, 0);
      while(!temp.nextToABeeper()){
         temp.move();
      }
   }
   public static void task_03()	
   { //go to the wall
      Robot temp = new Robot(1, 3, Display.EAST, 0);
      while(temp.frontIsClear()){
         temp.move();
      }
   }
   public static void task_04()	
   { //go to the wall, picking up the single beepers 
      Robot temp = new Robot(1, 4, Display.EAST, 0);
      while(temp.frontIsClear()){
         if(temp.nextToABeeper()){
                  
            temp.pickBeeper();
            temp.move();
         }
         else{
            temp.move();
         }
      }
      while(!temp.frontIsClear()){
         if(temp.nextToABeeper()){
            temp.pickBeeper();
         }
         else{
            break;
         }
      }
   }  
   public static void task_05()	
   { //go to the wall, picking up the piles of beepers
      Robot temp = new Robot(1, 5, Display.EAST, 0);
      while(temp.frontIsClear()){
         if(temp.nextToABeeper()){
                  
            temp.pickBeeper();
         }
         else{
            temp.move();
         }
      }
      while(temp.nextToABeeper()){
         temp.pickBeeper();
      }
   }
   public static void task_06()
   { //go to the end of the row of beepers, there is one gap
      Robot temp = new Robot(1, 6, Display.EAST, 0);
      while(temp.nextToABeeper()){ 
         temp.move();
         temp.move();
         if(!temp.nextToABeeper()){
            temp.turnLeft();
            temp.turnLeft();
            temp.move();
            temp.turnLeft();
            temp.turnLeft();
               
         }  
         
         
      }
   }
}
   
   
