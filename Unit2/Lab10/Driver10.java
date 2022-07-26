   //Torbert, e-mail: smtorbert@fcps.edu
	//version 6.17.2003

   import javax.swing.JFrame;
    public class Driver10
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit2, Lab10: Polka Dots");
         frame.setSize(400, 400);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new PolkaDotPanel());
         frame.setVisible(true);
      }
   }