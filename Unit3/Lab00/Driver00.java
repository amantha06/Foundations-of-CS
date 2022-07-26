import javax.swing.JFrame;
   public class Driver00{
   
      public static void main(String[] args){
         JFrame frame = new JFrame("Hello Button");
         frame.setSize(200, 100);
         frame.setLocation(200,100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel00());
         frame.setVisible(true);
      }
   }