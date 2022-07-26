import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

   public class Panel01 extends JPanel{
      public void paintComponent(Graphics g){
         g.setColor(Color.BLUE);
         
         
         g.setColor(Color.RED);
         g.fillRect(100, 200, 150, 150);
         g.setColor(Color.BLACK);
         g.fillRect(150, 275, 50, 75);
         g.setColor(Color.GREEN);
         g.fillRect(0, 350, 400, 350);
         
         int xPoints[] = {175, 275, 75};
         int yPoints[] = {150, 200, 200};
         
         g.setColor(Color.BLUE);
         g.fillPolygon(xPoints, yPoints, 3);
         
         g.setColor(Color.YELLOW);
         g.fillOval(300, 75, 50, 50);
         g.drawLine(325, 50, 325, 150);
         g.drawLine(275, 100, 375, 100);
         g.drawLine(300, 100, 375, 100);
         g.drawLine(275, 50, 375, 150);
         g.drawLine(375, 50, 275, 150);
         
         g.fillOval(193, 315, 5, 5);
         g.setFont(new Font("Serif", Font.BOLD, 16));
         g.setColor(new Color(150, 150, 0));
         g.drawString("Welcome Home", 40, 40);
         
         g.setColor(new Color(255, 255, 255));
         for(int x = 0; x <= 400; x += 10)
            g.drawLine(x, 350, x, 320);


         g.drawLine(0, 335, 400, 335);
         
      
         g.setColor(Color.WHITE);
         
         for(int i = 0; i <=325; i+=200){ 
         g.fillOval(i, 75, 40, 40);
         g.fillOval(i + 25, 75, 40, 40);
         g.fillOval(i + 50, 75, 40, 40);
         g.fillOval(i + 10, 50, 50, 50);
         }
         
         
         
         g.setColor(new Color(0, 171, 255));
         g.fillRect(150, 215, 40, 40);
         
         g.setColor(Color.WHITE);
         g.drawLine(170, 215, 170, 255);
         g.drawLine(150, 235, 190, 235);

 
      }


   
   }