	//Name______________________________ Date_____________
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   public class Panel12 extends JPanel
   {
      private Display12 display;
      private JLabel label;
      private JButton reset;
      private int guess, target, tries;
      public Panel12()
      {
         tries = 4;
         target = (int)(Math.random() * 25 + 1);
      
         setLayout(new BorderLayout());
      
         display = new Display12(new Listener1());
         add(display, BorderLayout.CENTER);
      
         JPanel south = new JPanel();
         south.setLayout(new FlowLayout());
         add(south, BorderLayout.SOUTH);
         label = new JLabel("You have 4 tries to guess the number.");
         south.add(label);
         reset = new JButton("Reset");
         reset.setEnabled(false);
         reset.addActionListener(new Listener2());
         south.add(reset);
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            JButton source = (JButton)e.getSource();
            guess = Integer.parseInt(source.getText());
            tries = tries - 1;
            if(guess == target)
               displayWinner();
            else if(tries == 0)
               displayLoser();
            else if(guess > target)
               displayTooHigh();
            else
               displayTooLow();
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.reset();
            tries = 4;
            target = (int)(Math.random() * 25 + 1);
            label.setText("You have 4 tries to guess the number.");
            reset.setEnabled(false);
         }
      }
      private void displayWinner()
      {
      		/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      private void displayLoser()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      private void displayTooHigh()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      private void displayTooLow()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
   }