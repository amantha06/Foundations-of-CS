//Anirudh Mantha
//5.25.2021


import java.util.*;
import java.io.*;

public class CustomerMediumYard extends CustomerYard{
   private String lname, fname;
   private final double cost = 0.004;
   
   public CustomerMediumYard(){
       
   }
   
   public CustomerMediumYard(int x) throws Exception{
   }


   public double getCost(int x){
      double price = x * cost;
      return price;
   }
}