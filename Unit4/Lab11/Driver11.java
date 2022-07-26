//Anirudh Mantha
//3/18/21

   import javax.swing.JFrame;
   public class Driver11
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Unit4, Lab11: Decimal to Binary");
         frame.setLocation(100, 50);
         frame.setSize(400, 150);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().add(new Panel11());
         frame.setVisible(true);
      }
   }