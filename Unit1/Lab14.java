//Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003

    public class Lab14
   {
       public static void main(String[] args)
      {
         Swimmer weismuller = new Swimmer(2);
         Swimmer fraser = new Swimmer(4);
         Swimmer spitz = new Swimmer(6);
         Swimmer phelps = new Swimmer(8);
         Thread t1 = new Thread( weismuller );
         Thread t2 = new Thread( fraser );
         Thread t3 = new Thread( spitz );
         Thread t4 = new Thread( phelps );
         t1.start();
         t2.start();
         t3.start();
         t4.start();
      }
   }