import javax.swing.*;

public class PongProject{

      public static void main(String[] args){
         JFrame frame = new JFrame("Unit2, PongProject");
         frame.setSize(408, 408);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new PongPanel ()); 
         frame.setVisible(true);
      }
} 
