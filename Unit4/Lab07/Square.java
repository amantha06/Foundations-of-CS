// Anirudh Mantha
// 2/25/2020

public class Square extends Rectangle{
   
   private double mySide;
   
   public Square(double x){
        super(x,x);
   }
   
   public double getSide(){
      return mySide;
   }
   
   public void setSide(double x){
      mySide = x;
      super.setLength(mySide);
      super.setHeight(mySide);
      
   }
   
   public double findArea(){
      return super.findArea();
   }
   
   public double findPerimeter(){
      return super.findPerimeter();
   }
   
   public double findDiagonal(){
      return super.findDiagonal();
   }
   
   
}