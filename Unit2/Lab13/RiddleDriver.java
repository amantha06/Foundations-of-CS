   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 6.17.2003

   import javax.swing.JFrame;
   public class RiddleDriver
   {
      public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit2, Project: Riddle Me This");
         frame.setSize(700, 500);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new RiddlePanel());
         frame.setVisible(true);
      }
   }