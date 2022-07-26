//Anirudh Mantha
//3.23.21   
import javax.swing.*;
import java.awt.*;
public class ScoreCard13 extends JPanel
{
   private JTextField[][] input;
   public ScoreCard13()
   {
      setLayout(new GridLayout(5, 18));
   
      for(int hole = 1; hole <= 18; hole++)
      {
         add(new JLabel("" + hole, SwingConstants.CENTER));
      }
   
      input = new JTextField[4][18];
      for(int r = 0; r < input.length; r++)
         for(int c = 0; c < input[0].length; c++)
         {
            input[r][c] = new JTextField();
            add(input[r][c]);
         }
   }
   public void randomize()
   {
      for(int r = 0; r < input.length; r++)
         for(int c = 0; c < input[0].length; c++)
         {
            input[r][c].setText("" + (int)(Math.random()*4+1));
         }
   }
   public int findTotal(int r)
   {
      int sum = 0;
      
      for(int c = 0; c < input[0].length; c++)
      {
         sum = sum + Integer.parseInt(input[r][c].getText());           
      }     
   
      return sum;
         
   }
   public int findAces(int r)
   {
      int holeinone = 0;
      for(int c = 0; c < input[0].length; c++)
      {
         if(Integer.parseInt(input[r][c].getText()) == 1){
            holeinone++;
         }           
      }  
      return holeinone; 
   }
   public int findHardestHole(int r)
   {
      int count = 0;
      int value = 0;
      for(int c = 0; c < input[0].length; c++)
      {
         if(Integer.parseInt(input[r][c].getText()) > count){
            count = Integer.parseInt(input[r][c].getText());
            value = c+1;
         }
      } 
      return value;          
   }
   public int findHardestHole()
   {
      int count = 0;
      int check = 0;
      int value = 0;
      
      for(int c = 0; c < input[0].length; c++){
         count = 0;
         for(int r = 0; r < input.length; r++)
         {
            
            count = count + Integer.parseInt(input[r][c].getText());               
         }  
         
         if(count > check){
            check = count;
            value = c + 1;
         }
      }
      return value;            
   }
   
     
}
