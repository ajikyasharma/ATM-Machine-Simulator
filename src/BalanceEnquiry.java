import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BalanceEnquiry implements ActionListener{

	static JFrame f;
	static JLabel l1;
	static JButton b1; 
	static String pin_no;
   
   BalanceEnquiry(String pinnumber)
   {
	   
	  this.pin_no= pinnumber;
	 f= new JFrame();
	 f.setLayout(null);
	 
	 
	 JLabel label= new JLabel("");
	 ImageIcon i1= new ImageIcon("E:\\eclipse\\Bank Management System\\src\\icons\\atm.jpg");
	 Image i2= i1.getImage().getScaledInstance(1000, 1000, Image.SCALE_DEFAULT);
	 ImageIcon i3= new ImageIcon(i2);
	 label.setIcon(i3);
	 label.setBounds(0,0,1000,1000);
	 f.add(label);
	 
	 DataHandler d= new DataHandler();
	 int balance = d.checkBalance(pin_no);
	 
	 
	 l1= new JLabel("Your account balance is Rs "+ balance);
	 l1.setBounds(200,330,400,30);
	 l1.setFont(new Font("Raleway",1,20));
	 l1.setForeground(Color.WHITE);
	 label.add(l1);
	 

	 
	 b1= new JButton("Back");
	 b1.setBounds(420,570,150,30);
	 b1.addActionListener(this);
	 b1.setFont(new Font("Raleway",1,12));
	 label.add(b1);
	 
	f.setResizable(false); 
	f.setUndecorated(true); 
	f.setSize(1000,1000);
	f.setLocation(300,0);
	f.setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e)
   {
       f.setVisible(false);
       new Transaction(pin_no);
   }
}
