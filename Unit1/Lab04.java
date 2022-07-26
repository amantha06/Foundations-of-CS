import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Lab04{
   public static void takeTheField(Athlete arg){
      
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
   }
   public static void main(String[] args){
      
      Display.openWorld("maps/arena.map");
      Display.setSize(10, 10);
      Display.setSpeed(7);
      
      
      Athlete a = new Athlete();
      Athlete b = new Athlete();
      Athlete c = new Athlete();
      Athlete d = new Athlete();
      Athlete e = new Athlete();
      Athlete f = new Athlete();
      Athlete coach = new Athlete(2, 7, Display.EAST, Display.INFINITY);
      
      takeTheField(a);
      takeTheField(b);
      takeTheField(c);
      takeTheField(d);
      takeTheField(e);
      takeTheField(f);
      
      a.move();
      a.turnLeft();
      a.move();
      a.move();
      a.turnRight();
      a.move();
      a.move();
      a.turnRight();
      //a is in position
      
      b.move();
      b.turnLeft();
      b.move();
      b.turnAround();
      //b is in place
      
      c.move();
      c.move();
      c.move();
      c.move();
      c.move();
      c.turnLeft();
      c.move();
      c.turnAround();
      //c is in place
      
      d.move();
      d.move();
      d.turnRight();
      //d is in place
      
      e.move();
      e.move();
      e.move();
      e.turnRight();
      //e is in place
      
      f.move();
      f.move();
      f.move();
      f.move();
      f.turnRight();
      //f is in place
   }
      
      
}