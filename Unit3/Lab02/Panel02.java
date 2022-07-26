import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel02 extends JPanel{
   
   private JLabel label;
   
   public Panel02(){
         
      setLayout(new FlowLayout());         
      
      label = new JLabel("0.000000000000000000");
      label.setFont(new Font("Serif", Font.BOLD, 40));
      label.setForeground(Color.blue);
      add(label);
      
      
      JButton random = new JButton("Random");
      
      random.addActionListener(new Listener1());
      add(random);
      
      
      
      JButton cubeRoot = new JButton("Cube Root");
      
      cubeRoot.addActionListener(new Listener2());
      add(cubeRoot);
      
      
      JButton reciprocal = new JButton("Reciprocal");
      
      reciprocal.addActionListener(new Listener3());
      add(reciprocal);
      
      
      JButton quit = new JButton("Quit");
      
      quit.addActionListener(new Listener4());
      add(quit);
      
      
   }
   
   
   private class Listener1 implements ActionListener{
      public void actionPerformed(ActionEvent e){
         
         double d = Math.random() * 10;
         label.setText("" + d); 
      }
   
   }
   
   private class Listener2 implements ActionListener{
      public void actionPerformed(ActionEvent e){
         
         double d = Double.parseDouble(label.getText());
         
         d = Math.pow(d, 1.0/3.0);
         label.setText("" + d);
      
      }
      
    
   
   }
   
   private class Listener3 implements ActionListener{
      public void actionPerformed(ActionEvent e){
         
         double d = Double.parseDouble(label.getText());
         
         d = 1/d;
         label.setText("" + d);
      }
   
   }
   
   private class Listener4 implements ActionListener{
      public void actionPerformed(ActionEvent e){
         System.exit(0);
      }
   
   }
}