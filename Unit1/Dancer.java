	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.16.2003

   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public abstract class Dancer extends Athlete implements Runnable
   {
       public Dancer(int x, int y, int dir, int beep)
      {
         super(x, y, dir, beep);
      }
       public Dancer()
      {
         super(1, 1, Display.EAST, 0);
      }
       public abstract void danceStep();
       public void run()
      {
         for(int k = 1; k <= 10; k++)
         {
            danceStep();
         }
      }
   }