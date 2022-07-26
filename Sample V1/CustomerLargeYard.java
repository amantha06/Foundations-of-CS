//Anirudh Mantha
//5.25.2021


import java.util.*;
import java.io.*;

public class CustomerLargeYard extends CustomerYard{
   private String lname, fname;
   private final double cost = 0.003;
   
   public CustomerLargeYard(){
       
   }
   
   public CustomerLargeYard(int x) throws Exception{
   }


   public double getCost(int x){
      double price = x * cost;
      return price;
   }
}