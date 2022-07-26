/* 
 Anirudh Mantha 1/17/21
 Period 1
 1557531@fcpsschools.net
*/
import javax.swing.*;
import java.awt.*;
public class Dice extends JPanel
{
   private JLabel label1, label2;
   public Dice()
   {
      setLayout(new GridLayout(1, 2, 5, 5));
      
      label1 = new JLabel();
      label1.setIcon(new ImageIcon("one.jpg"));
      add(label1);
      
      label2 = new JLabel();
      label2.setIcon(new ImageIcon("one.jpg"));
      add(label2);
      
   }
   public int roll()
   {
      int a = rollOne(label1);
      int b = rollOne(label2);
      
      
         
      return a + b;
      
      
      
   }
   private int rollOne(JLabel label)
   {
      
      int num = (int)(Math.random()*6 + 1);
            
      if(num == 1){
         ImageIcon one = new ImageIcon("one.jpg");
         label.setIcon(one);
      }
            
      else if(num == 2){
         ImageIcon two = new ImageIcon("two.jpg");
         label.setIcon(two);
               
      }
            
      else if(num == 3){
         ImageIcon three = new ImageIcon("three.jpg");
         label.setIcon(three);
      }
            
      else if(num == 4){
         ImageIcon four = new ImageIcon("four.jpg");
         label.setIcon(four);
      }
            
      else if(num == 5){
         ImageIcon five = new ImageIcon("five.jpg");
         label.setIcon(five);
      }
            
      else if(num == 6){
         ImageIcon six = new ImageIcon("six.jpg");
         label.setIcon(six);
      }
     
     
     
     
     return num;
      
   }
  
}