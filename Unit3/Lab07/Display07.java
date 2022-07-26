/* 
 Anirudh Mantha 1/20/21
 Period 1
 1557531@fcpsschools.net
*/   
   import javax.swing.*;
   
   import java.awt.*;
    public class Display07 extends JPanel
   {
      private JLabel label;
      private JTextField box1, box2;
       public Display07()
      {
         setLayout(new FlowLayout());
         setPreferredSize(new Dimension(200, 125));
      
         JPanel subpanel = new JPanel();
         subpanel.setLayout(new FlowLayout());
         subpanel.add(new JLabel("hiiiine: "));
         box1 = new JTextField("", 5);
         box1.setHorizontalAlignment(SwingConstants.CENTER);
         subpanel.add(box1);
         subpanel.add(new JLabel("Two: "));
         box2 = new JTextField("", 5);
         box2.setHorizontalAlignment(SwingConstants.CENTER);
         subpanel.add(box2);
         add(subpanel);
      
         label = new JLabel("?");
         label.setFont(new Font("Serif", Font.BOLD, 75));
         label.setForeground(Color.blue);
         add(label);
      }
       public void showGCD()
      {
         int x = Integer.parseInt(box1.getText());
         int y = Integer.parseInt(box2.getText());
         //calls gcd which is later down
         //calling showGCD calls gcd and assigns it to a variable which is setting a label
         int z = gcd(x, y);
         label.setText("" + z);
      }
       public void showLCM()
      {
         int x = Integer.parseInt(box1.getText());
         int y = Integer.parseInt(box2.getText());
         //calls gcd along with other operations
         //calling showLCM calls gcd and does other operations 
         int z = x * y / gcd(x, y);
         label.setText("" + z);
      }
       private int gcd(int a, int b)
      {
            //method has a, and b
            //give those variables the values from box 1 and 2
         	a = Integer.parseInt(box1.getText());
            b = Integer.parseInt(box2.getText());
            
            // create a variable to store what value to return
            int num = 0; 
            
         
               /*
               Common Denominator (CD) means 2 values divided by a number will have no remainder.
               Go through all numbers less than the values, update the common denominators by using %
               terminate loop when the denominator is the same as either a or b 
               keep changing CD value until the loop is terminated
               last value will be the GREATEST CD 
               */
            
            
            for(int i = 2; i <= a && i <= b; i++){      
               if(a%i == 0 && b%i == 0){
                  num = i;
                
               }
            }
          return num;  
      } 
   }