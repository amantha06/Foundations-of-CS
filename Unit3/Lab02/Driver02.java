import javax.swing.JFrame;
   public class Driver02{
      public static void main(String[] args){
         JFrame frame = new JFrame("Hello Text Box");
         frame.setSize(420, 120);
         frame.setLocation(200,100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel02());
         frame.setVisible(true);
      }

}