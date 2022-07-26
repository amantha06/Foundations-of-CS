   //Name:    Date:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
    
public class PrizePanel extends JPanel
{
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Polkadot pd;
   private Timer t; 
   private int hits = 0;
          
		//constructor   
   public PrizePanel()
   {
   
   
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, FRAME, FRAME);
      pd = new Polkadot();
      ball = new Ball();
      t = new Timer(1000, new Listener());
      t.start();
   
        
      t = new Timer(0, new Listener());
      t.start();
         
         
      addMouseListener(new Mouse());
      t = new Timer(10, new Listener());
      t.start();
      
      addKeyListener(new Key());
      setFocusable(true);
   }

   private class Mouse extends MouseAdapter{
         
      public void mouseClicked(MouseEvent e){
         
      
         
         if(e.isMetaDown()){ 
            ball.setX(e.getX());
            ball.setY(e.getY());
            
         }
            
         else if(e.isShiftDown()){
            ball.setdx(Math.random());
            ball.setdy(Math.random());
               
         }
            
         
         else{    
            pd.setX(e.getX());
            pd.setY(e.getY());
            
         }
         
            
            
      }
   }

   private class Key extends KeyAdapter{
      public void keyPressed(KeyEvent e){
         
      
         if(pd.getY() <= 400 ){  
            if(e.getKeyCode() == KeyEvent.VK_DOWN)
               pd.setY(pd.getY()+10);
          }
         
         if(pd.getY() >= 0){ 
            if(e.getKeyCode() == KeyEvent.VK_UP)
               pd.setY(pd.getY()-10);
           }
             
          
          if(pd.getX() <= 400){ 
            if(e.getKeyCode() == KeyEvent.VK_RIGHT)
               pd.setX(pd.getX()+10);
          }
          
          if(pd.getX() >= 0){
            if(e.getKeyCode() == KeyEvent.VK_LEFT)
               pd.setX(pd.getX()-10);
           }
                           
            
      }
   }
      
      
       
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
         
   }
 
     
 
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0,0,FRAME,FRAME);
                      
         ball.move(FRAME, FRAME);
         collide(ball, pd);
                      
         ball.draw(myBuffer);
         pd.draw(myBuffer);
              
                      
         myBuffer.setColor(Color.BLACK);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
         
             
         repaint();
      
      
           
      }  
      private void collide(Ball ball, Polkadot pd)
      {
         double d = distance(ball.getX(), ball.getY(), pd.getX(), pd.getY());  
         if(d <= ball.getRadius() + pd.getRadius()){
            
            pd.jump(FRAME, FRAME);
            hits = hits + 1;
            
            
            
         }
          
        
      }
      private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2 - y1, 2));
              
      }
   }
}
  
