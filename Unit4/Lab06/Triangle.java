//Anirudh Manhta
// 2/25/2021

public class Triangle extends Shape{
   
   private double mySide;
   
   public Triangle(double x){
      mySide = x;
   }
   
   public double getSide(){
      return mySide;
   }
   
   public void setSide(double x){
      mySide = x;
   }
   
   public double findArea(){
      return (Math.sqrt(3.0)/4.0)*(mySide*mySide);
   }
   
   public double findPerimeter(){
      return mySide*3;
   }
}