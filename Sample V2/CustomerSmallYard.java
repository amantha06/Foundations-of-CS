import java.io.*;       		 
import java.util.*;     		 
import javax.swing.JOptionPane;
import javax.swing.*;
public class CustomerSmallYard implements Yard, Comparable<Yard>{

   private String fname, lname = "";
   
   private int size;
   private double cost;
   public CustomerSmallYard(String x, String y, int z ){
   
      fname = x;
      lname = y;
      size = z;
      cost = z * 0.005;
   }
   
   public double getCost(){
      return cost;
   }
   public String getFirstName(){
      return fname;
   }
   public String getLastName(){
      return lname;
   }
   public int getSize(){
      return size;
   }
   public int compareTo(Yard y){
      return lname.compareTo(y.getLastName());
   }
   public String toString(){
      return "First Name: " + fname + " Last Name: " + lname + " Yards: " + size;
   }
               
}