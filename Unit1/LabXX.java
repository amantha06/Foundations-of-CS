	//Torbert, e-mail: smtorbert@fcps.edu
	//version 6.13.2003

   import edu.fcps.karel2.*;
    public class LabXX
   {
       public static void main(String[] args)
      {
         Display.setSize(8, 8);
         Display.setSpeed(10);
         int x = (int)(Math.random() * 6 + 1);
         int y = (int)(Math.random() * (x - 1) + 1);
         WorldBackend.getCurrent().addWall(new Wall(1, 1, x, Display.VERTICAL));
         WorldBackend.getCurrent().putBeepers(2, y, 1);
      	// Display.placeNSWall(1, 1, x);
         // Display.placeBeeper(2, y);
      
         Seeker karel = new Seeker();
         karel.fetchBeeper();
         karel.putBeeper();
      }
   }