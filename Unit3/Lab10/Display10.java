   //Name: Anirudh Mantha 
   //Date: 1/28/21
   //Mail: 1557531@fcpsschools.net
   import javax.swing.*;
   import java.awt.*;
   public class Display10 extends JPanel
   {
      private JLabel label;
      private int last, next;
      public Display10()
      {
         next = 5;
      
         label = new JLabel("5");
         label.setFont(new Font("Serif", Font.BOLD, 100));
         label.setHorizontalAlignment(SwingConstants.CENTER);
         label.setForeground(Color.blue);
         add(label);
      }
      private void pickNext()
      {
            last = next;
            while(last == next){
               next = (int)(Math.random() * 9 + 1);
            }
            label.setText("" + next);
           
               
            
      
      }
      public boolean guessHigh()
      {
         pickNext();
         return next > last;
      }
      public boolean guessLow()
      {
         pickNext();
         return next < last;
      }
   }