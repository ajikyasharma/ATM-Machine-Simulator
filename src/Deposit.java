import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Deposit implements ActionListener{

	   static JFrame f;
	   static JLabel l1;
	   static JButton b1, b2; 
	   static JTextField amount;
	   static String pin_no;
	   
	  Deposit(String pinnumber)
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
		 
		 
		 l1= new JLabel("Please Enter the amount to be diposited");
		 l1.setBounds(200,330,400,30);
		 l1.setFont(new Font("Raleway",1,18));
		 l1.setForeground(Color.WHITE);
		 label.add(l1);
		 
		 amount= new JTextField();
		 amount.setFont(new Font("Raleway",1,20));
		 amount.setBounds(210,380,330,30);
		 label.add(amount);
		 
		 b1= new JButton("Deposit");
		 b1.setBounds(420,535,150,30);
		 b1.addActionListener(this);
		 b1.setFont(new Font("Raleway",1,12));
		 label.add(b1);
		 
		 b2= new JButton("Back");
		 b2.setBounds(420,570,150,30);
		 b2.addActionListener(this);
		 b2.setFont(new Font("Raleway",1,12));
		 label.add(b2);
		
		f.setResizable(false); 
		f.setUndecorated(true); 
		f.setSize(1000,1000);
		f.setLocation(300,0);
		f.setVisible(true);
	   }

	   
	   public void actionPerformed(ActionEvent e)
	   {
           if(e.getSource()==b1)
           {
        	   DataHandler d= new DataHandler();
        	   d.deposit();
           }
           else if(e.getSource()==b2)
           {
        	   f.setVisible(false);
        	   new Transaction(pin_no);
           }
	   }
}
