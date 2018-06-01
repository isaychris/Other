package javaapplication6;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Main
  extends JFrame
{
  int totalminutes;
  int totalTrips;
  int totaltime;
  int steeltotaltrips;
  int steeltotaltime;
  int esttimetotal;
  int coal;
  int steelbartotalPrice;
  int iron;
  int totalorePrice;
  int profitwithore;
  int totalamount;
  int cballtotalprice;
  private JButton jButton2;
  private JButton jButton3;
  private JButton jButton4;
  private JButton jButton5;
  private JComboBox jComboBox1;
  private JLabel jLabel1;
  private JLabel jLabel10;
  private JLabel jLabel11;
  private JLabel jLabel12;
  private JLabel jLabel13;
  private JLabel jLabel14;
  private JLabel jLabel15;
  private JLabel jLabel16;
  private JLabel jLabel17;
  private JLabel jLabel18;
  private JLabel jLabel19;
  private JLabel jLabel2;
  private JLabel jLabel20;
  private JLabel jLabel21;
  private JLabel jLabel22;
  private JLabel jLabel23;
  private JLabel jLabel24;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private JPanel jPanel1;
  private JPanel jPanel2;
  private JPanel jPanel3;
  private JPanel jPanel4;
  private JPanel jPanel5;
  private JScrollPane jScrollPane1;
  private JScrollPane jScrollPane2;
  private JTabbedPane jTabbedPane1;
  private JTextArea jTextArea1;
  private JTextArea jTextArea2;
  private JTextField jTextField1;
  private JTextField jTextField12;
  private JTextField jTextField13;
  private JTextField jTextField14;
  private JTextField jTextField15;
  private JTextField jTextField16;
  private JTextField jTextField2;
  private JTextField jTextField21;
  private JTextField jTextField22;
  private JTextField jTextField23;
  private JTextField jTextField24;
  private JTextField jTextField3;
  private JTextField jTextField4;
  private JTextField jTextField5;
  private JTextField jTextField6;
  private JTextField jTextField7;
  private JTextField jTextField8;
  private JTextField jTextField9;
  
  public Main()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    this.jPanel1 = new JPanel();
    this.jScrollPane2 = new JScrollPane();
    this.jTextArea2 = new JTextArea();
    this.jLabel16 = new JLabel();
    this.jTextField15 = new JTextField();
    this.jPanel5 = new JPanel();
    this.jLabel10 = new JLabel();
    this.jTextField5 = new JTextField();
    this.jLabel20 = new JLabel();
    this.jButton5 = new JButton();
    this.jTextField7 = new JTextField();
    this.jLabel21 = new JLabel();
    this.jTextField8 = new JTextField();
    this.jLabel24 = new JLabel();
    this.jTextField9 = new JTextField();
    this.jLabel3 = new JLabel();
    this.jPanel4 = new JPanel();
    this.jLabel17 = new JLabel();
    this.jButton4 = new JButton();
    this.jTextField13 = new JTextField();
    this.jLabel18 = new JLabel();
    this.jLabel19 = new JLabel();
    this.jTextField16 = new JTextField();
    this.jLabel23 = new JLabel();
    this.jTextField23 = new JTextField();
    this.jTextField24 = new JTextField();
    this.jLabel1 = new JLabel();
    this.jComboBox1 = new JComboBox();
    this.jScrollPane1 = new JScrollPane();
    this.jTextArea1 = new JTextArea();
    this.jLabel6 = new JLabel();
    this.jTabbedPane1 = new JTabbedPane();
    this.jPanel2 = new JPanel();
    this.jLabel7 = new JLabel();
    this.jTextField4 = new JTextField();
    this.jLabel8 = new JLabel();
    this.jButton2 = new JButton();
    this.jTextField1 = new JTextField();
    this.jLabel9 = new JLabel();
    this.jTextField2 = new JTextField();
    this.jLabel11 = new JLabel();
    this.jTextField3 = new JTextField();
    this.jLabel2 = new JLabel();
    this.jPanel3 = new JPanel();
    this.jLabel13 = new JLabel();
    this.jButton3 = new JButton();
    this.jTextField12 = new JTextField();
    this.jLabel14 = new JLabel();
    this.jLabel15 = new JLabel();
    this.jTextField14 = new JTextField();
    this.jLabel22 = new JLabel();
    this.jTextField21 = new JTextField();
    this.jTextField22 = new JTextField();
    this.jLabel4 = new JLabel();
    this.jTextField6 = new JTextField();
    this.jLabel12 = new JLabel();
    
    GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
    this.jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGap(0, 95, 32767));
    
    jPanel1Layout.setVerticalGroup(jPanel1Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGap(0, 72, 32767));
    
    this.jTextArea2.setColumns(20);
    this.jTextArea2.setRows(5);
    this.jScrollPane2.setViewportView(this.jTextArea2);
    
    this.jLabel16.setText("Ores to bars [time]:");
    
    this.jTextField15.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField15ActionPerformed(evt);
      }
    });
    this.jLabel10.setIcon(new ImageIcon("C:\\Users\\Chris\\Desktop\\Cannonball.png"));
    this.jLabel10.setText("Cannonball");
    
    this.jTextField5.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField5ActionPerformed(evt);
      }
    });
    this.jLabel20.setIcon(new ImageIcon("C:\\Users\\Chris\\Desktop\\Iron_ore.png"));
    this.jLabel20.setText("Iron");
    
    this.jButton5.setFont(new Font("Tahoma", 0, 12));
    this.jButton5.setText("Calculate");
    this.jButton5.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jButton5ActionPerformed(evt);
      }
    });
    this.jTextField7.setText("100");
    this.jTextField7.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField7ActionPerformed(evt);
      }
    });
    this.jLabel21.setIcon(new ImageIcon("C:\\Users\\Chris\\Desktop\\Steel_bar.png"));
    this.jLabel21.setText("Steel bar");
    
    this.jTextField8.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField8ActionPerformed(evt);
      }
    });
    this.jLabel24.setIcon(new ImageIcon("C:\\Users\\Chris\\Desktop\\Coal.png"));
    this.jLabel24.setText("Coal");
    
    this.jTextField9.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField9ActionPerformed(evt);
      }
    });
    this.jLabel3.setText("Enter price for each item:");
    
    GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
    this.jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(jPanel5Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel3, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
      .addGroup(jPanel5Layout.createSequentialGroup()
      .addComponent(this.jButton5, -2, 202, -2)
      .addGap(0, 0, 32767))
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
      .addGap(0, 0, 32767)
      .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
      .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel20, -2, 96, -2)
      .addComponent(this.jTextField7, -2, 96, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel24, -2, 96, -2)
      .addComponent(this.jTextField9, -2, 96, -2)))
      .addGroup(jPanel5Layout.createSequentialGroup()
      .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel21, -2, 96, -2)
      .addComponent(this.jTextField8, -2, 96, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel10, -2, 96, -2)
      .addComponent(this.jTextField5, -2, 96, -2))))))
      .addContainerGap()));
    
    jPanel5Layout.setVerticalGroup(jPanel5Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel3, -2, 16, -2)
      .addGap(27, 27, 27)
      .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
      .addComponent(this.jLabel24)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jTextField9, -2, 31, -2)
      .addComponent(this.jTextField7, -2, 31, -2)))
      .addGroup(jPanel5Layout.createSequentialGroup()
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 1, -2)
      .addComponent(this.jLabel20)))
      .addGap(32, 32, 32)
      .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel5Layout.createSequentialGroup()
      .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel21)
      .addComponent(this.jLabel10))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jTextField8, -2, 31, -2))
      .addComponent(this.jTextField5, -2, 31, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(this.jButton5, -2, 60, -2)
      .addContainerGap()));
    
    this.jLabel17.setText("Iron per trip:");
    
    this.jButton4.setFont(new Font("Tahoma", 0, 12));
    this.jButton4.setText("Calculate");
    this.jButton4.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jButton4ActionPerformed(evt);
      }
    });
    this.jTextField13.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField13ActionPerformed(evt);
      }
    });
    this.jLabel18.setText("Steel bars per trip:");
    
    this.jLabel19.setText("Ores to bars [time]:");
    
    this.jTextField16.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField16ActionPerformed(evt);
      }
    });
    this.jLabel23.setText("Bars to cballs [time]:");
    
    this.jTextField23.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField23ActionPerformed(evt);
      }
    });
    this.jTextField24.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField24ActionPerformed(evt);
      }
    });
    GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
    this.jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(jPanel4Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
      .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
      .addComponent(this.jTextField13)
      .addComponent(this.jButton4, GroupLayout.Alignment.LEADING, -1, 202, 32767)
      .addComponent(this.jLabel18, GroupLayout.Alignment.LEADING, -2, 96, -2)
      .addComponent(this.jTextField16, GroupLayout.Alignment.LEADING)
      .addComponent(this.jTextField23, GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel19, GroupLayout.Alignment.LEADING, -1, -1, 32767)
      .addComponent(this.jLabel23, GroupLayout.Alignment.LEADING, -1, -1, 32767)
      .addComponent(this.jLabel17, GroupLayout.Alignment.LEADING, -1, -1, 32767))
      .addGap(0, 0, 32767))
      .addComponent(this.jTextField24))
      .addContainerGap()));
    
    jPanel4Layout.setVerticalGroup(jPanel4Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel17)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jTextField13, -2, 26, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.jLabel18)
      .addGap(4, 4, 4)
      .addComponent(this.jTextField24, -2, 26, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.jLabel19)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jTextField16, -2, 26, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.jLabel23)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jTextField23)
      .addGap(18, 18, 18)
      .addComponent(this.jButton4, -2, 60, -2)
      .addContainerGap()));
    
    this.jLabel1.setIcon(new ImageIcon("C:\\Users\\Chris\\Desktop\\Maxgold.png"));
    
    this.jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    
    setDefaultCloseOperation(3);
    setTitle("Cannon Balls Calculator - Version 1.0");
    setResizable(false);
    
    this.jTextArea1.setColumns(20);
    this.jTextArea1.setFont(new Font("Monospaced", 0, 12));
    this.jTextArea1.setRows(5);
    this.jTextArea1.setText("========================================\nInformation\n========================================\n\nThis program calculates the profit you\ncan make from making cannonballs and \nalso calculates the time it takes\nto make them.\n\nInstructions:\nEnter amount of steel bars to make\nor smelt into cannon balls.\n\nTo calculate the profits\n- Enter the price of each item.\n\nTo calculate the time\n- Enter the amount of iron ore and\nsteel bars you use in your invy.\n\n- Enter the average time it takes\nto complete one trip in seconds.\n\n------------------------------------- \nCoded by Seiya Omega. Copyright 2014.\n");
    this.jScrollPane1.setViewportView(this.jTextArea1);
    
    this.jLabel6.setText("[Output]");
    
    this.jLabel7.setIcon(new ImageIcon(getClass().getResource("/javaapplication6/Cannonball.png")));
    this.jLabel7.setText("Cannon balls");
    
    this.jTextField4.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField4ActionPerformed(evt);
      }
    });
    this.jLabel8.setIcon(new ImageIcon(getClass().getResource("/javaapplication6/Iron_ore.png")));
    this.jLabel8.setText("Iron");
    
    this.jButton2.setFont(new Font("Tahoma", 0, 12));
    this.jButton2.setText("Calculate");
    this.jButton2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jButton2ActionPerformed(evt);
      }
    });
    this.jTextField1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField1ActionPerformed(evt);
      }
    });
    this.jLabel9.setIcon(new ImageIcon(getClass().getResource("/javaapplication6/Steel_bar.png")));
    this.jLabel9.setText("Steel bar");
    
    this.jTextField2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField2ActionPerformed(evt);
      }
    });
    this.jLabel11.setIcon(new ImageIcon(getClass().getResource("/javaapplication6/Coal.png")));
    this.jLabel11.setText("Coal");
    
    this.jTextField3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField3ActionPerformed(evt);
      }
    });
    this.jLabel2.setText("Enter price for each item:");
    
    GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
    this.jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(jPanel2Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel2, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
      .addGroup(jPanel2Layout.createSequentialGroup()
      .addComponent(this.jButton2, -2, 202, -2)
      .addGap(0, 0, 32767))
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
      .addGap(0, 0, 32767)
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel8, -2, 96, -2)
      .addComponent(this.jTextField1, -2, 96, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel11, -2, 96, -2)
      .addComponent(this.jTextField3, -2, 96, -2)))
      .addGroup(jPanel2Layout.createSequentialGroup()
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel9, -2, 96, -2)
      .addComponent(this.jTextField2, -2, 96, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel7, -2, 96, -2)
      .addComponent(this.jTextField4, -2, 96, -2))))))
      .addContainerGap()));
    
    jPanel2Layout.setVerticalGroup(jPanel2Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel2, -2, 16, -2)
      .addGap(20, 20, 20)
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel11)
      .addComponent(this.jLabel8))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jTextField3, -2, 31, -2)
      .addComponent(this.jTextField1, -2, 31, -2))
      .addGap(32, 32, 32)
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel2Layout.createSequentialGroup()
      .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel9)
      .addComponent(this.jLabel7))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jTextField2, -2, 31, -2))
      .addComponent(this.jTextField4, -2, 31, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, 32767)
      .addComponent(this.jButton2, -2, 60, -2)
      .addContainerGap()));
    
    this.jTabbedPane1.addTab("Profits", this.jPanel2);
    
    this.jLabel13.setText("Iron ores per trip:");
    
    this.jButton3.setFont(new Font("Tahoma", 0, 12));
    this.jButton3.setText("Calculate");
    this.jButton3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jButton3ActionPerformed(evt);
      }
    });
    this.jTextField12.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField12ActionPerformed(evt);
      }
    });
    this.jLabel14.setText("Steel bars per trip:");
    
    this.jLabel15.setText("Ores to bars [seconds]:");
    
    this.jTextField14.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField14ActionPerformed(evt);
      }
    });
    this.jLabel22.setText("Bars to cballs [seconds]:");
    
    this.jTextField21.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField21ActionPerformed(evt);
      }
    });
    this.jTextField22.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField22ActionPerformed(evt);
      }
    });
    GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
    this.jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(jPanel3Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
      .addComponent(this.jTextField12)
      .addComponent(this.jButton3, GroupLayout.Alignment.LEADING, -1, 202, 32767)
      .addComponent(this.jTextField14, GroupLayout.Alignment.LEADING)
      .addComponent(this.jTextField21, GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel15, GroupLayout.Alignment.LEADING, -1, -1, 32767)
      .addComponent(this.jLabel22, GroupLayout.Alignment.LEADING, -1, -1, 32767)
      .addComponent(this.jLabel13, GroupLayout.Alignment.LEADING, -1, -1, 32767))
      .addGap(0, 0, 32767))
      .addComponent(this.jTextField22)
      .addComponent(this.jLabel14, -1, -1, 32767))
      .addContainerGap()));
    
    jPanel3Layout.setVerticalGroup(jPanel3Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel13)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jTextField12, -2, 26, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.jLabel14)
      .addGap(4, 4, 4)
      .addComponent(this.jTextField22, -2, 26, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.jLabel15)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jTextField14, -2, 26, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.jLabel22)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jTextField21, -1, 26, 32767)
      .addGap(18, 18, 18)
      .addComponent(this.jButton3, -2, 60, -2)
      .addContainerGap()));
    
    this.jTabbedPane1.addTab("Time", this.jPanel3);
    
    this.jLabel4.setIcon(new ImageIcon(getClass().getResource("/javaapplication6/140440230015530.png")));
    this.jTabbedPane1.addTab("Info", this.jLabel4);
    
    this.jTextField6.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Main.this.jTextField6ActionPerformed(evt);
      }
    });
    this.jLabel12.setIcon(new ImageIcon(getClass().getResource("/javaapplication6/Steel_bar.png")));
    this.jLabel12.setText("Steel bars to make / smelt:");
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jTabbedPane1, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jLabel6, -2, 96, -2)
      .addGap(0, 0, 32767))
      .addComponent(this.jScrollPane1, GroupLayout.Alignment.TRAILING)
      .addComponent(this.jTextField6)
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addGap(0, 59, 32767)
      .addComponent(this.jLabel12, -2, 245, -2)))
      .addContainerGap()));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addGroup(layout.createSequentialGroup()
      .addGap(9, 9, 9)
      .addComponent(this.jLabel12)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jTextField6, -2, 29, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.jLabel6, -2, 14, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jScrollPane1))
      .addComponent(this.jTabbedPane1, -2, 343, -2))
      .addContainerGap(-1, 32767)));
    
    pack();
  }
  
  private void jTextField15ActionPerformed(ActionEvent evt) {}
  
  private void jTextField6ActionPerformed(ActionEvent evt) {}
  
  private void jTextField9ActionPerformed(ActionEvent evt) {}
  
  private void jTextField8ActionPerformed(ActionEvent evt) {}
  
  private void jTextField7ActionPerformed(ActionEvent evt) {}
  
  private void jButton5ActionPerformed(ActionEvent evt) {}
  
  private void jTextField5ActionPerformed(ActionEvent evt) {}
  
  private void jTextField24ActionPerformed(ActionEvent evt) {}
  
  private void jTextField23ActionPerformed(ActionEvent evt) {}
  
  private void jTextField16ActionPerformed(ActionEvent evt) {}
  
  private void jTextField13ActionPerformed(ActionEvent evt) {}
  
  private void jButton4ActionPerformed(ActionEvent evt) {}
  
  private void jTextField22ActionPerformed(ActionEvent evt) {}
  
  private void jTextField21ActionPerformed(ActionEvent evt) {}
  
  private void jTextField14ActionPerformed(ActionEvent evt) {}
  
  private void jTextField12ActionPerformed(ActionEvent evt) {}
  
  private void jButton3ActionPerformed(ActionEvent evt)
  {
    int ironorepertrip = Integer.parseInt(this.jTextField12.getText());
    int steelbarspertrip = Integer.parseInt(this.jTextField22.getText());
    int averageTrip = Integer.parseInt(this.jTextField14.getText());
    int averagetripsteelbars = Integer.parseInt(this.jTextField21.getText());
    int steelBarsN = Integer.parseInt(this.jTextField6.getText());
    
    this.totalTrips = (steelBarsN / ironorepertrip);
    this.totaltime = (this.totalTrips * averageTrip);
    this.totalminutes = (this.totaltime / 60);
    
    int CBALLS = steelBarsN * 4;
    int CballsTrip = steelBarsN / steelbarspertrip;
    
    int STEEL_BARS_XP = steelBarsN * 17;
    int CBALLS_XP = steelBarsN * 25;
    int TOTAL_XP = STEEL_BARS_XP + CBALLS_XP;
    
    this.steeltotaltrips = (steelBarsN / steelbarspertrip);
    this.steeltotaltime = (this.steeltotaltrips * averagetripsteelbars);
    int steeltotaminutes = this.steeltotaltime / 60;
    
    this.esttimetotal = (this.steeltotaltime + this.totaltime);
    int esttotalminutes = this.totalminutes + steeltotaminutes;
    
    this.jTextArea1.setText("Making " + steelBarsN + " steel bars.\n" + "Trips to make: " + this.totalTrips + " \n" + "XP Gained: " + STEEL_BARS_XP + " XP" + " \n" + "Estimated time: " + this.totalminutes + " minutes \n" + " \n" + "Making " + CBALLS + " Cannonballs.\n" + "Trips to make: " + CballsTrip + " \n" + "XP Gained: " + CBALLS_XP + " XP" + " \n" + "Estimated time: " + steeltotaminutes + " minutes \n" + " \n" + "Total Time: " + esttotalminutes + " minutes\n" + "Total XP: " + TOTAL_XP + " XP" + " \n");
  }
  
  private void jTextField3ActionPerformed(ActionEvent evt) {}
  
  private void jTextField2ActionPerformed(ActionEvent evt) {}
  
  private void jTextField1ActionPerformed(ActionEvent evt) {}
  
  private void jButton2ActionPerformed(ActionEvent evt)
  {
    int ironPrice = Integer.parseInt(this.jTextField1.getText());
    
    int coalPrice = Integer.parseInt(this.jTextField3.getText());
    
    int steelbarPrice = Integer.parseInt(this.jTextField2.getText());
    
    int cballPrice = Integer.parseInt(this.jTextField4.getText());
    
    int steelBarsN = Integer.parseInt(this.jTextField6.getText());
    
    int coalamount = steelBarsN * 2;
    
    this.steelbartotalPrice = (steelBarsN * steelbarPrice);
    this.cballtotalprice = (steelBarsN * 4 * cballPrice);
    this.totalamount = (this.cballtotalprice - this.steelbartotalPrice);
    
    this.coal = (steelBarsN * 2 * coalPrice);
    this.iron = (steelBarsN * ironPrice);
    this.totalorePrice = (this.coal + this.iron);
    this.profitwithore = (this.cballtotalprice - this.totalorePrice);
    
    this.jTextArea1.setText("= Prices: \n" + steelBarsN + " steel bars = " + this.steelbartotalPrice + " gp" + " \n" + " \n" + steelBarsN + " iron ore = " + this.iron + " gp" + " \n" + coalamount + " coal ore = " + this.coal + " gp" + " \n" + "Total ore price = " + this.totalorePrice + " gp" + " \n" + " \n" + "= Profits: \n" + "ores -> cballs: " + this.profitwithore + " gp\n" + "steel bars -> cballs: " + this.totalamount + " gp\n" + " \n");
  }
  
  private void jTextField4ActionPerformed(ActionEvent evt) {}
  
  public static void main(String[] args)
  {
    try
    {
      for (UIManager.LookAndFeelInfo info : ) {
        if ("Windows".equals(info.getName()))
        {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Main().setVisible(true);
      }
    });
  }
}
