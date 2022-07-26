//Anirudh Mantha
//6.3.2021

public class CustomerSmallYard implements Yard{
   String myFirstName;
   String myLastName;
   int mySize;
     
   public CustomerSmallYard(){
      myFirstName = "";
      myLastName = "";
      mySize = 0;
   }
   public CustomerSmallYard(String lname, String fname, int size){
      myFirstName = fname;
      myLastName = lname;
      mySize = size;
   }
   public double getCost(){
      return mySize * 0.005;
   }
   public int getSize(){
      return mySize;
   }
   public String getFirstName(){
      return myFirstName;
   }
   public String getLastName(){
      return myLastName;
   }
   public int compareTo(Yard y){
      return myLastName.compareTo(y.getLastName());
   }
   public String toString(){
      return "First Name: " + myFirstName + " Last Name: " + myLastName + " Yards: " + mySize;
   }
}
