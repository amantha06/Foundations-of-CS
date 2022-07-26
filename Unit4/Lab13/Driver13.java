//Anirudh Mantha
//3.23.21

   import javax.swing.JFrame;
   public class Driver13
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Unit4, Lab13: Miniature Golf, Foursome");
         frame.setSize(600, 200);
         frame.setLocation(100, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel13());
         frame.setVisible(true);
      }
   }