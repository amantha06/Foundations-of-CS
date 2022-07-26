//Anirudh Mantha
//5.25.2021

/**
Typical Driver which has the main method excecuting all of the code
**/

import javax.swing.JFrame;
public class DriverSampleYard{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Sample");

      
      frame.setSize(250, 250);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelSampleYard());
      frame.setVisible(true);
   }
   
}

