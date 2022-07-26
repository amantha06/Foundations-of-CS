//Anirudh Mantha
//5.04.21

   import edu.fcps.Turtle;
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
    public class TurtlePanel extends JPanel
   {
       public TurtlePanel()
      {
         Timer t = new Timer(10, new Listener());
         t.start();
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(Turtle.getImage(), 0, 0, getWidth(), getHeight(), null);
      }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            repaint();
         }
      }
   }