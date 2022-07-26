//Anirudh Mantha
//4.20.21
   public class EMail
   {
      private String myUserName;
      private String myHostName;
      private String myExtension;
      public EMail(String address)
      {

            int i = address.indexOf("@");      
            myUserName = address.substring(0, i);
          
            int j = address.lastIndexOf(".");
            myHostName = address.substring(i+1, j);
            
            myExtension = address.substring(j+1, address.length());
            
             
      }
      public String getUserName()
      {
         return myUserName;
      }
      public String getHostName()
      {
         return myHostName;
      }
      public String getExtension()
      {
         return myExtension;
      }
      public String toString()
      {
         
      return myUserName + "@" + myHostName + "." + myExtension;
      }
   }