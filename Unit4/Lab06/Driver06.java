//Anirudh Mantha    
//2/25/2021
import java.io.*;
public class Driver06
{
   public static void main(String[] args) throws Exception
   {
      PrintWriter toFile = new PrintWriter(new FileWriter("output.txt"));
   
      //create the objects
      Circle c = new Circle(75);
         Rectangle r = new Rectangle(30.0, 40.0);    
         Square s = new Square(50.0);			 	 	
      	Triangle t = new Triangle(37);          
         
      //test the instance methods
      toFile.println("Circle");
      toFile.println("------");
      toFile.println("Radius: " + c.getRadius());
      toFile.println("Area: " + c.findArea());
      toFile.println("Circumference: " + c.findCircumference());
      toFile.println();
   
      toFile.println("Rectangle");
      toFile.println("---------");
      toFile.println("Length: " + r.getLength());
      toFile.println("Height: " + r.getHeight());
      toFile.println("Area: " + r.findArea());
      toFile.println("Perimeter: " + r.findPerimeter());
      toFile.println("Diagonal: " + r.findDiagonal());
      toFile.println();
         
      toFile.println("Square");
      toFile.println("------");
      toFile.println("Side: " + s.getLength());
      toFile.println("Area: " + s.findArea());
      toFile.println("Perimeter: " + s.findPerimeter());
      toFile.println("Diagonal: " + s.findDiagonal());
                  
      s.setSide(10.0);
      toFile.println("New side: " + s.getSide());
      toFile.println("New area: " + s.findArea());	
      toFile.println(); 
      
      toFile.println("Triangle");
      toFile.println("--------");
      toFile.println("Side " + t.getSide());
      toFile.println("Area: " + t.findArea());
      toFile.println("Perimeter: " + t.findPerimeter());
      toFile.println();      
      toFile.println();
      
      toFile.close();  //necessary!
   }
}