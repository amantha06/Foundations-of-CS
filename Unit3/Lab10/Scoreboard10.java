   //Name: Anirudh Mantha 
   //Date: 1/28/21
   //Mail: 1557531@fcpsschools.net
   import javax.swing.*;
   import java.awt.*;
   public class Scoreboard10 extends JPanel
   {
      private JLabel label1, label2, label3;
      private int run, max;
      public Scoreboard10()
      {
         setLayout(new GridLayout(1, 5));
         run = max = 0;
      
         add(new JLabel("Run: ", SwingConstants.RIGHT));
         label1 = new JLabel(""+run);
         label1.setHorizontalAlignment(SwingConstants.LEFT);
         add(label1);
         label2 = new JLabel("---");
         label2.setHorizontalAlignment(SwingConstants.CENTER);
         label2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
         add(label2);
         add(new JLabel("Max: ", SwingConstants.RIGHT));
         label3 = new JLabel(""+max);
         label3.setHorizontalAlignment(SwingConstants.LEFT);
         add(label3);
      }
      public void update(boolean arg) //if arg is true, the player guessed correctly
      {
      
            if(arg == true){
               label2.setText("YES!");
               run = run + 1;
               if(max < run){
                  max = run;
                  
               }
             
            }
            else{
               label2.setText("-NO-");
               run = 0;
               
            }
            label3.setText("" + max);
            label1.setText("" + run);
         	
      
      }
   }