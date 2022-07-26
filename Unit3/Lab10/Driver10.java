   //Name: Anirudh Mantha 
   //Date: 1/28/21
   //Mail: 1557531@fcpsschools.net

   import javax.swing.JFrame;
   public class Driver10
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("High - Low");
         frame.setSize(250, 200);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel10());
         frame.setVisible(true);
      }
   }