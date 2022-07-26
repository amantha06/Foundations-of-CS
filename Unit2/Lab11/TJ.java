
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;  
public class TJ extends Ball
   {
      public void draw(Graphics myBuffer)
      {
        ImageIcon Thomas = new ImageIcon("tj.jpg");
        myBuffer.drawImage(Thomas.getImage(), (int)(getX() - getRadius()), (int)(getY()-getRadius()), 40, 40, null);
        }
   }
   
   