import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
  
public class PongPanel extends JPanel
{
   private static final int FRAME = 408;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private static final Color BALL_COLOR = Color.BLACK;
   private static final Color BUMPER_COLOR = Color.BLUE;
   private static final double BALL_DIAM = 5;
   private static final double PRIZE_DIAM = 25;
   private static final int BUMPER_WIDTH = 75;
   private static final int BUMPER_HEIGHT = 125;
  
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Bumper paddleL;   //the left paddle
   private Bumper paddleR;   //the right paddle
   private int scoreL;  // making the left score
   private int scoreR;  // making the right score
   private Timer timer;           
        
   public PongPanel()
   {
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics(); 
           
               
      ball = new Ball(204, 204, 15, Color.BLACK);
      ball.jump(FRAME, FRAME);
    
      // Where we made paddle instead of making the resource class           
      paddleL = new Bumper(0, 75, 10, 75, Color.BLUE);
      paddleR = new Bumper(390, 75, 10, 75, Color.RED);
     
         // ensure ball is outside the paddle
      if(!paddleL.inBumper(ball) && !paddleR.inBumper(ball))
      {
         scoreR = 0;
         scoreL = 0;
      
         timer = new Timer(3, new Listener());
         timer.start();
           
         setFocusable(true);
      }
        
      addMouseListener(new Mouse());
   
      addKeyListener(new Key());
    
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
        
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
            // clear buffer and move ball
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0,0,FRAME,FRAME);
         ball.move(FRAME, FRAME);
         
         for(int y = 0; y <= 408; y += 8)
         {
            myBuffer.setColor(Color.BLACK);
            myBuffer.drawLine(200, y, 200, y);
         }
           
         BumperCollision.collide(paddleL, ball);
         BumperCollision.collide(paddleR, ball);
        
            // draw ball & PADDLE
         ball.draw(myBuffer);
         paddleL.draw(myBuffer);
         paddleR.draw(myBuffer);
          
           
            // Make the ball reset when the ball goes through the right barrier
         if(ball.getX() - ball.getRadius() <= 0){
              
               //increment score
            scoreL = scoreL + 1;
              
            ball.setX(204 + Math.random() * 20 - 10);
            ball.setY(204 + Math.random() * 20 - 10);
            ball.setdx(Math.random() * 12 - 2);
            ball.setdy(Math.random() * 12 - 2);                
         }
           
            //Make the ball reset when the ball goes through the left barrier
         if(ball.getX() + ball.getRadius() >= 400){
            
               //increment score
            scoreR = scoreR + 1;
              
            ball.setX(204 + Math.random() * 20 - 10);
            ball.setY(204 + Math.random() * 20 - 10);
            ball.setdx(Math.random() * 12 - 2);
            ball.setdy(Math.random() * 12 - 2);
         }
         //end game screen
         if(scoreL>10)
         {
            myBuffer.setColor(Color.BLACK);
            myBuffer.fillRect(0, 0, FRAME, FRAME);
            myBuffer.setColor(Color.WHITE);
            myBuffer.setFont(new Font("Serif", Font.BOLD, 35));
            myBuffer.drawString("GAME OVER",100, 150);
            myBuffer.setFont(new Font("Sanserif", Font.BOLD, 25));
            myBuffer.drawString("RIGHT PLAYER WINS!", 60, 185);
            myBuffer.setFont(new Font("Sanserif", Font.BOLD, 15));
            myBuffer.drawString("please left click to restart", 85, 220); 
         }
         //end game screen
         if(scoreR>10)
         {
            myBuffer.setColor(Color.BLACK);
            myBuffer.fillRect(0, 0, FRAME, FRAME);
            myBuffer.setColor(Color.WHITE);
            myBuffer.setFont(new Font("Serif", Font.BOLD, 35));
            myBuffer.drawString("GAME OVER",100, 150);
            myBuffer.setFont(new Font("Sanserif", Font.BOLD, 25));
            myBuffer.drawString("LEFT PLAYER WINS!", 60, 185);
            myBuffer.setFont(new Font("Sanserif", Font.BOLD, 15));
            myBuffer.drawString("please left click to restart", 85, 220); 

         }
      
            // update hits on buffer
         myBuffer.setColor(Color.black);
         myBuffer.setFont(new Font("Serif", Font.BOLD, 15));
         myBuffer.drawString("Score: " + scoreL, FRAME - 150, 25);
         myBuffer.drawString("Score: " + scoreR, FRAME - 350, 25);
          
         repaint();
      }
   }
     
   private class Mouse extends MouseAdapter{
        
      public void mouseClicked(MouseEvent e){
        
          //change ball speed and trajectory on right click
         if(e.isMetaDown()){
            ball.setdx(Math.random());
            ball.setdy(Math.random());
         }
         
          //reset ball location and change speed and trajectory on shift+left click
         else if(e.isShiftDown()){
            ball.setX(200 + Math.random() * 20 - 10);
            ball.setY(200 + Math.random() * 20 - 10);
            ball.setdx(Math.random() * 12 - 2);
            ball.setdy(Math.random() * 12 - 2);    
         }
           //reset the pong game completely on left click
         else{
            scoreR = 0;
            scoreL = 0;
           
            ball.setX(200 + Math.random() * 20 - 10);
            ball.setY(200 + Math.random() * 20 - 10);
            ball.setdx(Math.random() * 12 - 2);
            ball.setdy(Math.random() * 12 - 2);
         }  
      }
   }  
     
   private class Key extends KeyAdapter{
      public void keyPressed(KeyEvent e){
      
      //Making left paddle move down 
         if(paddleL.getY() + 75 <= 400){
            if(e.getKeyCode() == KeyEvent.VK_S)
               paddleL.setY(paddleL.getY()+20);    
         }
         
      //Making left paddle move up
         if(paddleL.getY() >= 0){       
            if(e.getKeyCode() == KeyEvent.VK_W)
               paddleL.setY(paddleL.getY()-20);
         }
         
      //moving right paddle up 
         if(paddleR.getY() >= 0){       
            if(e.getKeyCode() == KeyEvent.VK_UP)
               paddleR.setY(paddleR.getY()-20);          
         }     
         
      //moving right paddle down  
         if(paddleR.getY() + 75 <= 400){
            if(e.getKeyCode() == KeyEvent.VK_DOWN)
               paddleR.setY(paddleR.getY()+20);
         }             
      }
   }   
}






