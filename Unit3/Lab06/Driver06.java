/* 
 Anirudh Mantha 1/17/21
 Period 1
 1557531@fcpsschools.net
*/

   import javax.swing.JFrame;
   public class Driver06
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Luck of Dice");
         frame.setSize(250, 200);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel06());
         frame.setVisible(true);
      }
   }