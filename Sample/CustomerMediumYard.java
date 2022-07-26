//Anirudh Mantha
//6.3.2021

public class CustomerMediumYard implements Yard{
   String myFirstName;
   String myLastName;
   int mySize;
     
   public CustomerMediumYard(){
      myFirstName = "";
      myLastName = "";
      mySize = 0;
   }
   public CustomerMediumYard(String lname, String fname, int size){
      myFirstName = fname;
      myLastName = lname;
      mySize = size;
   }
   public double getCost(){
      return mySize * 0.004;
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
