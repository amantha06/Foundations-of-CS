//Anirudh Mantha
//6.3.2021

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.JFrame;
  
public class DriverSampleYard
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Sample");
      frame.setSize(250, 200);
      frame.setLocation(100, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelSampleYard());
      frame.setVisible(true);
   }
}