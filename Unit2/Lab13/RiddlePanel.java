   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 6.17.2003

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class RiddlePanel extends JPanel
{
   private static final ImageIcon THOMAS = new ImageIcon("tj.jpg");
   private BufferedImage myImage;
   private Graphics2D myBuffer;
   private Timer t1, t2;
   private int xPos;
   public RiddlePanel()
   {
      xPos = 50;
      myImage =  new BufferedImage(700, 500, BufferedImage.TYPE_INT_RGB);
      myBuffer = (Graphics2D)myImage.getGraphics();
      t1 = new Timer(100, new Listener1());
      t1.start();
      t2 = new Timer(8000, new Listener2());
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         int xPoints[] = {xPos, xPos, xPos + 50, xPos, xPos - 50, 
                  xPos, xPos, xPos - 50, xPos, xPos + 50};
			int yPoints[] = {150, 225, 175, 225, 175, 
         			225, 325, 375, 325, 375};
         myBuffer.setColor(Color.PINK);
         myBuffer.fillRect(0, 0, 700, 360);
         myBuffer.drawImage(THOMAS.getImage(), xPos - 40, 50, 75, 125, null);
            
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
         if(xPos == 200)
         {
            /************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/

            t1.stop();
            t2.start();
         }
         else
         {
            xPos = xPos + 5;
         }
      
         repaint();
      }
   }
   private class Listener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         t2.stop();
         myBuffer.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 24));
      
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
      
         repaint();
      }
   }
}