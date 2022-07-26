/* 
 Anirudh Mantha 1/17/21
 Period 1
 1557531@fcpsschools.net
*/  
  
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel06 extends JPanel
   {
      private Dice dice;
      private JLabel label;
      public Panel06()
      {
         setLayout(new FlowLayout());
      
         dice = new Dice();
         add(dice);
      
         JButton button = new JButton("Roll");
         button.addActionListener(new Listener());
         add(button);
      
         label = new JLabel("");
         label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
         label.setForeground(Color.blue);
         add(label);
      }
      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         
         	int a_plus_b = dice.roll();
            
            if(a_plus_b == 7){
               label.setText("WINNNNER");   
            } 
            else{
               label.setText("");
            }
            
            
            
            
            
            
            
         
         }
      }
   }