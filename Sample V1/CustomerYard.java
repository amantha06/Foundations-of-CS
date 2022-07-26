//Anirudh Mantha
//5.25.2021

/**
This is a new class I created which has 3 subclasses for Small Medium and Large yards

It has all of the methods and the getCost method calls another method in Small Medium or Large
depending on the size of the yard. 


Im my code I used the built in compareTo method for strings rather than code my own,
so in this class it shows as it returns 0 

**/

public class CustomerYard extends YardCalc implements Yard{
   
   public CustomerYard(int row, String fileNameInput) throws Exception{
      computation(row, fileNameInput);
   }
   
   public CustomerYard(){
   }
   
   
    public double getCost(){
       if(this.getSize() <= 10000){
        
         CustomerSmallYard smallYard = new CustomerSmallYard();
         return smallYard.getCost(getSize());
       
       } 
       
       else if(this.getSize() >= 10000 && this.getSize() <= 20000){
            CustomerMediumYard mediumYard = new CustomerMediumYard();
            return mediumYard.getCost(getSize());
       }  
       
       else if(this.getSize() >= 20000){
            CustomerLargeYard largeYard = new CustomerLargeYard();
            return largeYard.getCost(getSize());
       } 
       return 0;     
    }
      
   public String getFirstName(){
      return super.fname;
      
   }
   
   public String getLastName(){
      return super.lname;
   }
   
   public int compareTo(Yard y){
   
      return 0; 
   
   }
       			
   public String toString(){
      return "" + getCost();
      
   }
   
   public int getSize(){
      String s = super.size;
      s = s.trim();
      return Integer.parseInt(s);
      
   }`
}