import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transaction implements ActionListener {
	static JFrame f;
	static JLabel l1;
	static JButton b1, b2, b3, b4, b5, b6, b7; 
	static String pin_no;
   
   Transaction(String pinnumber)
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
	 
	 
	 l1= new JLabel("Please select your Transaction");
	 l1.setBounds(200,330,400,30);
	 l1.setFont(new Font("Raleway",1,20));
	 l1.setForeground(Color.WHITE);
	 label.add(l1);
	 
	 b1= new JButton("Deposit");
	 b1.setBounds(180,465,150,30);
	 b1.addActionListener(this);
	 b1.setFont(new Font("Raleway",1,12));
	 label.add(b1);
	 
	 b2= new JButton("Cash Withdrawl");
	 b2.setBounds(420,465,150,30);
	 b2.addActionListener(this);
	 b2.setFont(new Font("Raleway",1,12));
	 label.add(b2);
	 
	 b3= new JButton("Fast Cash");
	 b3.setBounds(180,500,150,30);
	 b3.addActionListener(this);
	 b3.setFont(new Font("Raleway",1,12));
	 label.add(b3);
	 
	 b4= new JButton("Mini Statement");
	 b4.setBounds(420,500,150,30);
	 b4.addActionListener(this);
	 b4.setFont(new Font("Raleway",1,12));
	 label.add(b4);
	 
	 b5= new JButton("Pin Change");
	 b5.setBounds(180,535,150,30);
	 b5.addActionListener(this);
	 b5.setFont(new Font("Raleway",1,12));
	 label.add(b5);
	 
	 b6= new JButton("Balance Enquery");
	 b6.setBounds(420,535,150,30);
	 b6.addActionListener(this);
	 b6.setFont(new Font("Raleway",1,12));
	 label.add(b6);
	 
	 b7= new JButton("Exit");
	 b7.setBounds(420,570,150,30);
	 b7.addActionListener(this);
	 b7.setFont(new Font("Raleway",1,12));
	 label.add(b7);
	 
	 
	 
	 
	 
	   
	 
	f.setResizable(false); 
	f.setUndecorated(true); 
	f.setSize(1000,1000);
	f.setLocation(300,0);
	f.setVisible(true);
   }
//   public static void main(String ar[])
//   {
//	   new Transaction("");
//   }
   
   public void actionPerformed(ActionEvent e)
   {
	   if(e.getSource()== b7) {
		   f.dispose();
	   }
	   else if(e.getSource()==b1)
	   {
		   f.setVisible(false);
		   new Deposit(pin_no);
	   }
	   
	   else if(e.getSource() == b2)
	   {
		   f.setVisible(false);
		   new Withdraw(pin_no);
	   }
	   
	   else if(e.getSource()==b3) {
		   f.setVisible(false);
		   new FastCash(pin_no);
	   }
	   else if(e.getSource()==b5) {
		   f.setVisible(false);
		   new PinChange(pin_no);
	   }
	   
	   else if(e.getSource()==b6) {
		   f.setVisible(false);
		   new BalanceEnquiry(pin_no);
	   }
	   else if(e.getSource()==b4) {
		  
		   new MiniStatement(pin_no);
	   }
   }
}
