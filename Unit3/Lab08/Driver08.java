   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.4.2003

   import javax.swing.JFrame;
   public class Driver08
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Sum the Series");
         frame.setSize(200, 200);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel08());
         frame.setVisible(true);
      }
   }