//Anirudh Mantha       2/25/2021
import java.io.*;

public class Driver07{
   public static void main(String[] args)throws Exception{
      PrintWriter toFile = new PrintWriter(new FileOutputStream("output.txt"));
      
      double parameterOne = 0.0;
      double parameterTwo = 0.0;
      
      Shape[] array = new Shape[(int)(Math.random()*40+10)];
      for(int i = 0; i < array.length; i++){
         parameterOne = Math.random()*150;
         parameterTwo = Math.random()*150;
         
         int shape = (int)(Math.random()*4);
         
         if(shape == 0){
            array[i] = new Rectangle(parameterOne, parameterTwo); 
         }
         
         else if(shape == 1){
            array[i] = new Circle(parameterOne);
         }
         
         else if(shape == 2){
            array[i] = new Square(parameterOne);
         }
         
         else if(shape == 3){
            array[i] = new Triangle(parameterOne);
         }
         
         
      }
      
      toFile.println("Shapes");
      toFile.println("------");
      for(int i = 0; i < array.length; i++){
         
         toFile.println("area = " + array[i].findArea() + "\t\t\t" + array[i].toString()); 
         //do not need .toString() in line 41, but it is fine if it is there
      }
         toFile.close();      

   }
}
