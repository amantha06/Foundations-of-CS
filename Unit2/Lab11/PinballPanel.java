    //Torbert, e-mail: smtorbert@fcps.edu
	//version 6.17.2003
	//Billington, version 7.25.2007

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PinballPanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
   
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Timer t;
       public PinballPanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME,FRAME);
         int xPos = (int)(Math.random()*(FRAME-100) + 50);
         int yPos = (int)(Math.random()*(FRAME-100)+ 50);
         //ball = new Ball(xPos, yPos, 50, Color.BLACK);  //Without Extention
         
         ball = new TJ();  //With Extention
        
         t = new Timer(0, new Listener());
         t.start();
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            myBuffer.setColor(BACKGROUND);    //cover the 
            myBuffer.fillRect(0,0,FRAME,FRAME);   //old ball
            ball.move(FRAME,FRAME);
            ball.draw(myBuffer);     
            repaint();
         }
      }
   }