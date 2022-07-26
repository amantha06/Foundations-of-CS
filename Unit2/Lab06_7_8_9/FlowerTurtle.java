	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class FlowerTurtle extends Turtle
   {
      private double mySize;
      private Color myColor;
      public FlowerTurtle()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public FlowerTurtle(double x, double n, Color c)
      {
         super(x, 300.0, 90.0);
         mySize = n;
         myColor = c;
      }
      public void setSize(double n)
      {
         mySize = n;
      }
      public void setColor(Color c)
      {
         myColor = c;
      }
      private void drawPetals() //starts and ends at center facing north
      {
      
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      }
      private void drawStem() //starts at top of stem facing south, ends at bottom
      {
      
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      }
      public void drawShape()
      {
         drawPetals();
         drawStem();
      }
   }