import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

   public class LabProj{
   public static void main(String[] args){
   
      String filename = JOptionPane.showInputDialog("What is the map name?");
      String type = JOptionPane.showInputDialog("What is the robot type?");
      
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(1);

        if(type.equals("RightShooter"))
         {
            Shooter Curry = new RightShooter() ;
            Curry.shootRight();
         }
         else if(type.equals("LeftShooter"))
         {
            Shooter Harden = new LeftShooter() ;
            Harden.shootLeft();
         }
         else
         {
            System.out.println("Invalid robot type.");
         }
      
      
     
      
      }
      
}
     