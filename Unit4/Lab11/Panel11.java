//Anirudh Mantha
//3/18/21

   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Panel11 extends JPanel
   {
      private JTextField box;
      private JLabel label;
      private Display11 display;
      private JButton button2;
       public Panel11()
      {
         setLayout(new BorderLayout());
      
         JPanel north = new JPanel();
         north.setLayout(new FlowLayout());
         add(north, BorderLayout.NORTH);
         
         label = new JLabel("Enter an Integer from 0 to 255:");
         north.add(label);
         box = new JTextField("     ");
         north.add(box);
         
         display = new Display11();
         add(display, BorderLayout.CENTER);
      	
         JPanel south = new JPanel();
         south.setLayout(new FlowLayout());
         add(south, BorderLayout.SOUTH);
         
         JButton button1 = new JButton("Convert");
         button1.addActionListener(new Listener1());
         south.add(button1);
         button2 = new JButton("Step");
         button2.addActionListener(new Listener2());
         south.add(button2);
         button2.setEnabled(false);
         label = new JLabel("");
         south.add(label);
      }
       private class Listener1 implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            button2.setEnabled(false);
            int x;
            try
            {
               x = Integer.parseInt(box.getText());
            }
                catch(NumberFormatException f)
               {
                  label.setText("That's not a number!");
                  display.setBlank();
                  return;
               }
            if( x > 255 || x < 0 )
            {
               label.setText("Number must be from 0 to 255.");
               display.setBlank();
               return;
            }
            label.setText("");
            display.setValue(x);
            button2.setEnabled(true);
         }
      }
       private class Listener2 implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            int x;
            x = Integer.parseInt(box.getText());
            //checking with 255 because 8 1's in binary is 255
            //we want it to go to 0 when adding 1 to 255
            if(x == 255){
               x = 0;
               box.setText("" + x);
               display.setValue(x);
            }
            else{
               x++;
               box.setText("" + x);
               display.setValue(x);
            }
             
         }
      }
   }