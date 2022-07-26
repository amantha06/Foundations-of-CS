//Anirudh Mantha
//5.04.21
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
    public class Koch
   {
      private static Turtle smidge;
      private static int level;
   
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Koch Snowflake");
         frame.setSize(600,600);
         frame.setLocation(100, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.white);
         smidge = 
             new Turtle(400.0, 200.0, 180.0)
            { 
                public void drawShape() 	
               {} 
            };
         level = Integer.parseInt(JOptionPane.showInputDialog("How many levels? (1-7)"));   
         smidge.setCrawl(true);       
         smidge.setSpeed(10);
         koch(smidge, 200.0, 60.0, level);
      }
      
       public static void koch(Turtle t, double size, double angle, int level)
      {
      
      }
     
       public static void setColor(Turtle t, double size)
      {
         if(size < 10.0)
            t.setColor(Color.red);
         else if (size < 40.0)
            t.setColor(Color.green.darker());
         else
            t.setColor(new Color(160, 130, 100));
      }
   }