import javax.swing.*;
import java.awt.*;

   public class Panel00 extends JPanel{
      public void paintComponent(Graphics g){
         g.setColor(Color.BLUE);
         g.fillRect(75, 50, 300, 125);
         g.setFont(new Font("Serif", Font.BOLD, 50));
         g.setColor(new Color(150, 150, 0));
         g.drawString("Hello World", 100, 150);
      }
   }