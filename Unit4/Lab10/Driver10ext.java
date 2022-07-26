// Anirudh Mantha
// 3/16/21

import javax.swing.JFrame;
public class Driver10ext
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Unit4, Lab10: Binary Reversal");
      frame.setSize(400, 150);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel10ext());
      frame.setVisible(true);
   }
}