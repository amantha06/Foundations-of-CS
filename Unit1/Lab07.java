  	//Anirudh Mantha, 10/1/20

   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
   
    public class Lab07
   {
       public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         String type = JOptionPane.showInputDialog("What type of climber?");
         String avenue = JOptionPane.showInputDialog("What x-coordinate?");
         
         int x = Integer.parseInt(avenue);
      
         Display.openWorld("maps/"+filename+".map");
         Display.setSize(17, 15);
         Display.setSpeed(5);
      
         if(type.equals("Climber"))
         {
            Mountain.explore( new Climber(x) );
         }
         else if(type.equals("HillClimber"))
         {
            Mountain.explore( new HillClimber(x) );
         }
         else if(type.equals("StepClimber"))
         {
            Mountain.explore( new StepClimber(x) );
         }
         else
         {
            System.out.println("Invalid robot type.");
         }
         
       
  }
  }