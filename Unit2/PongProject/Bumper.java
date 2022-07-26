// Name: 				Date:

   import java.awt.*;
   
    public class Bumper
   {
    //private fields, all ints, for a Bumper
    //hint: the "location" of the bumper begins at its top left corner.      
	 
      private int myX;
      private int myY;
      private int myW;
      private int myH ;
      private Color myColor;
     
   
      public Bumper()
      {
         myX = 60;
         myY = 30;
         myW = 50;
         myH = 100;
         myColor = Color.BLACK;
     
      }
   
      public Bumper(int x, int y, int w, int h, Color c)
      {
         myX = x;
         myY = y;
         myW = w;
         myH = h;
         myColor = c;
      }
      //accessor methods
      public int getX()
      {    
         return myX;   
      }
      public int getY()
      {    
         return myY;    
      }
      public int getWidth()
      {    
         return myW;     
      }
      public int getHeight()
      {    
         return myH;     
      }
      public Color getColor()
      {    
         return myColor;      
      }
     
     
      //modifier methods
      public void setX(int x)
      {     myX = x;    
      }
      public void setY(int y)
      {     myY = y;    
      }
      public void setWidth(int w)
      {     myW = w;  
      }
      public void setHeight(int h)
      {     myH = h; 
      }
      public void setColor(Color c)
      {     myColor = c;
      }
     
     
      //instance methods
      public void jump(int rightEdge, int bottomEdge)
      {
         myX = (int)(Math.random()* (rightEdge-myW) + myH/2);
         myY = (int)(Math.random()* (bottomEdge-myH) + myW/2);
      }
      
       // draws a rectangular bumper on the buffer
       public void draw(Graphics myBuffer) 
      {
         myBuffer.setColor(getColor());
         myBuffer.fillRect(getX(), getY(), getWidth(), getHeight());
      }   
   	// returns true if any part of the polkadot is inside the bumper
       public boolean inBumper(Polkadot dot)
      {
         for(int x = getX(); x <= getX() + getWidth(); x++)   //starts at upper left corner(x,y)
            for(int y = getY(); y <= getY() + getHeight(); y++)
               if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() ) //checks every point on the bumper
                  return true;            
         return false;
      }  
      // returns distance between (x1, y1) and (x2, y2)
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }	
   }
