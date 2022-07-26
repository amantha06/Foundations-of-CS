	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.16.2003

   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
	
    public class Lab18
   {
       public static void main(String[] args)
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/"+filename+".map");
         Display.setSize(8, 8);
         Display.setSpeed(10);
      
         Pirate karel = new Pirate();
         int totalBeepers = 0;
         int numOfBeepers = 0;
         while(numOfBeepers != 5)
         {
            karel.approachPile();
            numOfBeepers = karel.numOfBeepersInPile();
            totalBeepers += numOfBeepers;
            if(numOfBeepers != 5)
            {
               karel.turnAppropriately(numOfBeepers);
            }
         }
         System.out.println("Total beepers: " + totalBeepers);
      }
   }