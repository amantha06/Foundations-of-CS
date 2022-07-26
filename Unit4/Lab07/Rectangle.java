	/**
	* A Rectangle is a Shape that maintains information about its length and height. 
   * A Rectangle knows how to return its width and height, set its length and height, 
   * calculate and return its area, and calculate and return its perimeter.
	 
	@author Anirudh Mantha 
	@version 2.25.2021 
	**/
    public class Rectangle extends Shape
   {
      private double myLength;
      private double myHeight;
   	
   	/************************************************************* 
   	* Constructs a rectangle with initial length and height specified by x and y.
   	* @param x    initial length
      * @param y    initial height
   	**************************************************************/
       public Rectangle(double x, double y)
      {
         myLength = x;
         myHeight = y;
      }
   	
   	/*************************************************************** 
   	* Returns the rectangles's length
   	* @return	 myWidth
   	**************************************************************/
       public double getLength()
      {
         return myLength;
      }
      
      /*************************************************************** 
   	* Returns the rectangles's height
   	* @return	 myHeight 
   	**************************************************************/
       public double getHeight()
      {
         return myHeight;
      }
		
   	/***************************************************************
   	* Sets the width to the input number.
   	* @param x	 assigns x to myLength
   	**************************************************************/
       public void setLength(double x)
      {
         myLength = x;
      }
      
      /***************************************************************
   	* Sets the length to the input number.
   	* @param y	 assigns y to myHeight
   	**************************************************************/
       public void setHeight(double y)
      {
         myHeight = y;
      }
      
		
   	/***************************************************************
   	* Calculates and returns the rectangles's area.
   	* @return	 area
   	**************************************************************/
       public double findArea()
      {
         return myLength*myHeight;
      }
		
   	/**************************************************************
   	* Calculates and returns the rectangles perimeter.
   	* @return	 perimeter
   	**************************************************************/
       public double findPerimeter()
      {
         return 2*(myLength+myHeight);
      }
      
      /**************************************************************
   	* Calculates and returns the rectangles diagonal.
   	* @return	 diagonal
   	**************************************************************/
       public double findDiagonal()
      {
         return Math.sqrt((myLength*myLength)+(myHeight*myHeight));
      }
   }