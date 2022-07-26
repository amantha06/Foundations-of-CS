/**
 *  Bugs are simple creatures that only know how to walk towards other bugs.
 *  Bugs maintain information about their (x, y) position.
 *  Bugs can tell if they are standing next to other bugs.
 *
 *  @author Shane Torbert
 *  @version 25 Nov 2002
 *  emphasis changed on 18 Nov 2009 mlbillington@fcps.edu
 **/
   public class Bug
   {
      private int myX;
      private int myY;
	/** Default constructor, initializes both private fields to 0.
    *
    **/
      public Bug()
      {
         myX = 0;
         myY = 0;
      }
   /** Constructs a bug with initial position specified by x and y.
    *
    **/
      public Bug(int x, int y)
      {
         myX = x;
         myY = y;
      }
    /** Answers the question, "What is your x-coordinate?"
     *  Accessor method for the private field myX.
     *  @return       x coordinate of this bug
     **/
      public int getX()
      {
         return myX;
      }
    /** Answers the question, "What is your y-coordinate?"
     *  Accessor method for the private field myY.
     *  @return       y coordinate of this bug
     **/
      public int getY()
      {
         return myY;
      }
   /** Changes this bug's position by walking some percentage of the way towards arg.
    *  Imagine a straight line connecting this bug with arg.  The method causes this
    *  bug to walk along that straight line.  The distance traveled by this bug along
    *  that straight line is equal to the specified percentage of the entire length.
    *  @param arg			bug to walk towards
    *  @param percent	percent of the total distance between this bug and arg that this bug actually walks
    **/
      public void walkTowards(Bug arg, double percent)
      {
         if(percent < 0 || percent > 1)
            return;
         myX = (int)(getX() + percent * (arg.myX - myX));  //"private" is private to the class, not to the object
			myY = (int)(getY() + percent * (arg.getY() - getY()));
      }
    /** Answers the question, "Are you at the same position as arg?"
     *  @param arg	 bug whose position is compared to this bug's position
     *  @return       true if this bug's (x, y) equals arg's (x, y)
     **/
      public boolean sameSpot(Bug arg)
      {
         return getX() == arg.getX() && getY() == arg.getY();
      }
   }