//Anirudh Mantha
//03/09/21

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel09 extends JPanel
{
   ScoreCard09 scorecard;
   JLabel output;
   public Panel09()
   {
   
      setLayout(new BorderLayout());
   
      output = new JLabel("------", SwingConstants.CENTER);
      add(output, BorderLayout.NORTH);
   
      scorecard = new ScoreCard09();
      add(scorecard, BorderLayout.CENTER);
   
      JPanel subpanel = new JPanel();
      subpanel.setLayout(new FlowLayout());
      
      
      addButton(subpanel, "Randomize", new Listener1());
      addButton(subpanel, "Total Score", new Listener2());
      addButton(subpanel, "Hole in One", new Listener3());
      addButton(subpanel, "Hardest Hole", new Listener4());
      

      
      
      
      add(subpanel, BorderLayout.SOUTH);
   }
   private void addButton(JPanel p, String s, ActionListener a)
   {
      JButton b = new JButton(s);
      b.addActionListener(a);
      p.add(b);
   }
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         scorecard.randomize();
         output.setText("------");
      }
   }
   private class Listener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if(scorecard.findTotal() != 0)
            output.setText("Total Score: " + scorecard.findTotal());
        
      }
   }
   private class Listener3 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        if(scorecard.findTotal() != 0)
          output.setText("Holes in One: " + scorecard.findAces());
      }
   }
   private class Listener4 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        if(scorecard.findTotal() != 0)
         output.setText("Hardest Hole: " + scorecard.findHardestHole());
      }
   }
}