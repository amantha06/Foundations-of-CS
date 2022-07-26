   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 6.17.2003

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PolkaDotPanel extends JPanel
   {
   //constants
      private static final int FRAME = 400;   
      private static final Color BACKGROUND = new Color(204, 204, 204);
   //fields
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Timer t;
      private Polkadot pd;
      private Polkadot dp;
      private int xPos, yPos;
       public PolkaDotPanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME, FRAME);
         pd = new Polkadot();
         dp = new Polkadot(200, 200, 50, Color.GREEN);
         t = new Timer(1000, new Listener());
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
         
         myBuffer.setColor(new Color(204, 204, 204));
         myBuffer.fillRect(0, 0, 400, 400); 
         
         
            pd.jump(FRAME, FRAME);
            pd.draw(myBuffer);
            
            dp.jump(FRAME, FRAME);
            dp.draw(myBuffer);
            
            repaint();
         }
      }
   }