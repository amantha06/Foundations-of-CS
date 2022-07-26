//Anirudh Mantha
//6.3.2021

public class CustomerLargeYard implements Yard{
   String myFirstName;
   String myLastName;
   int mySize;
     
   public CustomerLargeYard(){
      myFirstName = "";
      myLastName = "";
      mySize = 0;
   }
   public CustomerLargeYard(String lname, String fname, int size){
      myFirstName = fname;
      myLastName = lname;
      mySize = size;
   }
   public double getCost(){
      return mySize * 0.003;
   }
   public int getSize(){
      return mySize;
   }
   public String getLastName(){
      return myLastName;
   }
   public String getFirstName(){
      return myFirstName;
   }
   
   public int compareTo(Yard y){
      return myLastName.compareTo(y.getLastName());
   }
   public String toString(){
      return "First Name: " + myFirstName + " Last Name: " + myLastName + " Yards: " + mySize;
   }
}
