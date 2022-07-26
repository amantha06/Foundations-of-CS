// Anirudh Mantha
// 3/16/21
import javax.swing.*;
import java.awt.*;
public class Display10ext extends JPanel
{
   private JLabel[] bits;
   private JLabel decimal;
   
   public Display10ext()
   {
      setLayout(new GridLayout(1, 9));
            
      
      
      bits = new JLabel[8];
      for(int x = 0; x < bits.length; x++)
      {
         bits[x] = new JLabel("", SwingConstants.CENTER);
         bits[x].setFont(new Font("Serif", Font.BOLD, 50));
         add(bits[x]);
      }
      decimal = new JLabel("");
      add(decimal);
      
      
      randomize();
      
    
   }
   private void convert(){
      int[] array = new int[8];
      int count = 0;
      int decimalval = 0;
      for(int i = array.length - 1; i >= 0; i--){
         decimalval = decimalval + Integer.parseInt(bits[count].getText()) * (int)(Math.pow(2, i));
         count++;
         decimal.setText("" + decimalval);
      }
   }   
   public void randomize()
   {
      for(int i = 0; i < bits.length; i++){
         bits[i].setText("" + (int)(Math.random()*2));
      }
      convert();
   }
   public void reverse()
   {
      int[] temp = new int[bits.length];
      int templength = bits.length;
         
      for(int i = 0; i < bits.length; i++){
         temp[templength - 1] = Integer.parseInt(bits[i].getText());
         templength = templength - 1;     
            
      }
      for(int i = 0; i < bits.length; i++){
         bits[i].setText("" + temp[i]);
      
      }
      convert();         
   }
   public void shift()
   {
            
      for(int i = 0; i < bits.length - 1; i++){
         bits[i].setText(bits[i+1].getText());
      }  
      bits[bits.length - 1].setText("0");
      convert();
   }
     
   public void rotate()
   {
      String store = "";
      boolean check = true;
      while(check){   
         store = bits[0].getText(); 
         for(int i = 0; i < bits.length - 1; i++){
            bits[i].setText(bits[i+1].getText());
         
         }
         bits[(bits.length - 1)].setText(store);
         check = false;
      }
   convert();
            
   }
}
