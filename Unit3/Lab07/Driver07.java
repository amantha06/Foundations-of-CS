/* 
 Anirudh Mantha 1/20/21
 Period 1
 1557531@fcpsschools.net
*/

   import javax.swing.JFrame;
   public class Driver07
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("GCD, LCD");
         frame.setSize(250, 200);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel07());
         frame.setVisible(true);
      }
   }