import javax.swing.JFrame;
import java.awt.*;

   public class Driver03{
   
      public static void main(String[] args){
         
         JFrame frame = new JFrame("Hailstone Numbers");
         frame.setBackground(new Color(165, 11, 32)   );
         frame.setSize(400, 350);
         frame.setLocation(100, 50);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel03());
         frame.setVisible(true);
      }
   }