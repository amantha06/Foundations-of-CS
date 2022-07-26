//Anirudh Mantha
//03/09/21
import javax.swing.*;
import java.awt.*;
public class ScoreCard09 extends JPanel
{
   private JTextField[] input;
   public ScoreCard09()
   {
      setLayout(new GridLayout(2, 18));
      
                         
      /* add 18 JLabels */
    
      for(int i = 1; i <= 18; i++){
         add(new JLabel("" + i));
         
      }
       
      /* add an array of 18 JTextFields  */
      input = new JTextField[18];
      for(int i = 0; i < 18; i++){
         input[i] = new JTextField("");
         add(input[i]);
      }
   }
   

   public void randomize()
   {
      for(int i = 0; i < 18; i++){
         input[i].setText(""+(int)(Math.random()*4+1));
         
      }
   }
   public int findTotal()
   {
      int count = 0;
      for(int i = 0; i < 18; i++){
        
         count = count + Integer.parseInt(input[i].getText());
            
      }
      return count;
   }
   public int findAces()
   {
      int count = 0;
      for(int i = 0; i < 18; i++){
         if(input[i].getText().equals("1")){
            count++;
         }
         
   }
      return count;
   }
   
   public int findHardestHole()
   {  
      int count = 0;
      for(int i = 0; i < 18; i++){
         if(input[i].getText().equals("4")){
            count = i+1;
            break;
         }
         
   }
   return count;
   }
}