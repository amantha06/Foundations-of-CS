import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

   public class Panel02 extends JPanel{
      public void paintComponent(Graphics g){
      
      g.setColor(new Color(212, 175, 55));
      g.fillRect(115, 57, 140, 185);
      
      ImageIcon thomas = new ImageIcon("tj.jpg");
      g.drawImage(thomas.getImage(), 120, 65, null);
      
      
      for(int i = 110; i <=245; i+=15){ 
        g.fillOval(i, 50, 15, 15);
       
         }
      for(int i = 110; i <=245; i+=15){ 
         g.fillOval(i, 235, 15, 15);
       
         }   
      for(int i = 50; i<=235; i+=15){
         g.fillOval(110, i, 15, 15);
      }
      
      for(int i = 50; i<=235; i+=15){
         g.fillOval(245, i, 15, 15);
      }
      
      g.setColor(new Color(255, 255, 255));
      Font f2 = new Font("Serif", Font.BOLD | Font.ITALIC, 30);
      g.setFont(f2);
      g.drawString("Our Fearless Leader", 50, 300);
      
      }
      
}