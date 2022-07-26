//Anirudh Mantha
//3/18/21

import javax.swing.*;
import java.awt.*;
public class Display11 extends JPanel
{
   private JLabel[] output;
   private int[] bits;
   public Display11()
   {
      setLayout(new GridLayout(1, 8));
      
      output = new JLabel[8];
      bits = new int[8];
      for(int x = 0; x <= 7; x++)
      {
         output[x] = new JLabel("", SwingConstants.CENTER);
         output[x].setFont(new Font("Serif", Font.BOLD, 50));
         add(output[x]);
      }
      setBlank();
   }
   public void setBlank()
   {    
      for(int i = 0; i < 8; i++)
         output[i].setText("-");
        
   }
   public void setValue( int num )
   {
      int val;
        
        
      for(int i = bits.length - 1; i >= 0; i--){
         val = num/2;
         bits[i] = num%2;
         num = val;
      }
      
      for(int i = 0; i < output.length; i++){
         output[i].setText("" + bits[i]);
      }
      
   } 
        
        
}
 