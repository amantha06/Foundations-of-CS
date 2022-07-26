//Created by Christina Wallin
//2/28/07
//Period 4
   import javax.swing.*;
   import javax.swing.event.*;

   import java.awt.*;
   import java.awt.event.*;
    public class SortPanel extends JPanel
   {
      private static final long serialVersionUID = 42L;
   
      private JMenuItem selectedSort, selectedData;
      private JMenuItem bubble, insert, select, merge, quick, heap,
      ascend, descend, random, constant;
      private JMenu sortMenu, dataMenu;
      private JLabel label, time, num;
      private int[] ascending, descending, rand, same;
      private int numItems = 40000;
      private final int MAXITEMS = 400000;
      private JSpinner items;
       public SortPanel()
      {
         setBackground(Color.blue.darker());
         setLayout(new BorderLayout());
         sortMenu  = new JMenu("Choose a sort.");
         addSort(sortMenu, bubble, "Bubble Sort");
         addSort(sortMenu, insert, "Insertion Sort");
         addSort(sortMenu, select, "Selection Sort");
         addSort(sortMenu, merge, "Merge Sort");
         addSort(sortMenu, quick, "Quick Sort");
         addSort(sortMenu, heap, "Heap Sort");
              
         dataMenu = new JMenu("Choose a data order.");
         addData(dataMenu, ascend, "Data in ascending order");
         addData(dataMenu, descend, "Data in descending order");
         addData(dataMenu, random, "Random data");
         addData(dataMenu, constant, "Constant data");
           
         JMenuBar menu = new JMenuBar();
         menu.add(sortMenu);
         menu.add(dataMenu);
         add(menu, BorderLayout.NORTH);
           
      // added RoseS
         JPanel panelSouth = new JPanel();
         panelSouth.setLayout(new FlowLayout());
         add(panelSouth, BorderLayout.SOUTH);
      
         JButton start = new JButton("Start");
         start.addActionListener(new Start());
         panelSouth.add(start);
       //  add(start, BorderLayout.SOUTH);
           
      	// added RoseS
         JButton quit = new JButton("Quit");
         quit.addActionListener(new Quit());
         panelSouth.add(quit);
       
         JPanel panel = new JPanel();
         panel.setLayout(new GridLayout(2,2));
         panel.setBackground(Color.blue.darker());
         
         time = new JLabel("Time in milliseconds: ");
         time.setHorizontalAlignment(SwingConstants.CENTER);
         time.setForeground(Color.white);
         panel.add(time);
         
         items = new JSpinner(new SpinnerNumberModel(40000, 50, MAXITEMS, 100)); //in constructor are starting value, low value, high value, and number it goes when you click the numbers 
         items.addChangeListener(new ItemNumbers());
         panel.add(items);
         
         label = new JLabel("????");
         label.setHorizontalAlignment(SwingConstants.CENTER);
         label.setForeground(Color.white);
         label.setFont(new Font("Ariel", Font.PLAIN, 50));
         panel.add(label);
         
         num = new JLabel("Enter amount of data above.");
         num.setHorizontalAlignment(SwingConstants.CENTER);
         num.setForeground(Color.white);
         panel.add(num);
         
         add(panel, BorderLayout.CENTER);
           
         ascending = new int[MAXITEMS];
         descending = new int[MAXITEMS];
         rand = new int[MAXITEMS];
         same = new int[MAXITEMS];
         fillArrays();
           
      } 
       public void addSort(JMenu menu, JMenuItem item, String label){
         item = new JMenuItem(label);
         item.addActionListener(new SortListener());
         item.setBackground(Color.gray.brighter());
         menu.add(item);
      }
       public void addData(JMenu menu, JMenuItem item, String label){
         item = new JMenuItem(label);
         item.addActionListener(new DataListener());
         item.setBackground(Color.gray.brighter());
         menu.add(item);
      }
       public void fillArrays(){
         for(int i = 1; i < numItems; i++){
            ascending[i] = i;
            descending[i] = numItems - i;
            rand[i] = (int)(Math.random()*numItems);
            same[i] = 1;}   
      }
       public static void display(int[] temp){
         for(int i:temp){
            System.out.print(i + " ");
         }
         System.out.println();
      }
       private class SortListener implements ActionListener{
          public void actionPerformed(ActionEvent e){
            if(selectedSort!=null)
               selectedSort.setBackground(Color.gray.brighter());
            selectedSort = (JMenuItem)e.getSource();
            selectedSort.setBackground(Color.yellow);
            
         }
      }
       private class DataListener implements ActionListener{
          public void actionPerformed(ActionEvent e){
            if(selectedData!=null)
               selectedData.setBackground(Color.gray.brighter());
            selectedData = (JMenuItem)e.getSource();
            selectedData.setBackground(Color.yellow);
         }
      }
   	
       private class Start implements ActionListener{
          public void actionPerformed(ActionEvent e){
            if(selectedSort!=null&&selectedData!=null){
              //  String s = "You chose " + selectedSort.getText() + " with " + selectedData.getText();
//                label.setText(s);
               int[] temp;
               if(selectedData.getText().equals("Data in ascending order"))
                  temp = ascending;
               else if(selectedData.getText().equals("Data in descending order"))
                  temp = descending;
               else if(selectedData.getText().equals("Random data"))
                  temp = rand;
               else
                  temp = same;
               label.setText(""+Sorter.sort(selectedSort.getText(), temp, numItems)); 
               fillArrays();
            }
            if(selectedSort==null)
               JOptionPane.showMessageDialog(sortMenu, "Choose a sort, please.");
            if(selectedData==null)
               JOptionPane.showMessageDialog(dataMenu, "Choose a data order, please.");
         }}
       private class ItemNumbers implements ChangeListener{
          public void stateChanged(ChangeEvent e){
            JSpinner temp = (JSpinner)e.getSource();
            numItems = (Integer)temp.getValue();
         }
      }
   	
       private class Quit implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            System.exit(0);
         }
      }
   
   	
   	
   }
   
