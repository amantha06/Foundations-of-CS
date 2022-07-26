/* 
 Anirudh Mantha 1/9/21
 Period 1
 1557531@fcpsschools.net
*/
   import javax.swing.*;
   import java.awt.*;
   public class Display05 extends JPanel
   {
      private JLabel l1, l2, l3, l4, l5;
      private JTextField t1, t2, t3, t4, t5;
      private int value, total, highscore;
      public Display05()
      {
         setLayout(new GridLayout(3, 1));
         Font f = new Font("Serif", Font.BOLD, 30);
         total = value = 0;
      
         label1 = new JLabel("Value: " + value);
         label1.setFont(f);
         label1.setForeground(Color.blue);
         add(label1);
      
         label2 = new JLabel("Total: " + total);
         label2.setFont(f);
         label2.setForeground(Color.blue);
         add(label2);
         
         label3 = new JLabel("High Score: " + highscore);
         label3.setFont(f);
         label3.setForeground(Color.blue);
         add(label3);
         
         
      }
      public void update()
      {
    

            value = (int)(Math.random() * 11 + 1);
            
            
            

            if(value == 0){
              
              total = 0;
              label1.setText("Value: " + value);
              label2.setText("Total: " + total);

            }  
            else if(value == 1){
               
              total = 0;
              label1.setText("Value: " + value);
              label2.setText("Total: " + total);
              
           }
           
           else if(value == 2){
            
              total = 0;
              label1.setText("Value: " + value);
              label2.setText("Total: " + total);
              
            }
            
            else{
               total = total + value;
               label1.setText("Value: " + value);
               label2.setText("Total: " + total);
               if(total > highscore){
                  highscore = total;
                  label3.setText("High Score: " + highscore);
                  
               }
               else{
               label3.setText("High Score: " + highscore);
               }
               
            
            }
            
           
            
      
      }
   }