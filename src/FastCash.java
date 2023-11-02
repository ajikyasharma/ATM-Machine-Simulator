import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FastCash implements ActionListener{

	static JFrame f;
	static  JLabel l1;
	static   JButton b1, b2, b3, b4, b5, b6, b7; 
	static  String pin_no;
	   
	   FastCash(String pinnumber)
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
		 
		 
		 l1= new JLabel("Please select the amount");
		 l1.setBounds(200,330,400,30);
		 l1.setFont(new Font("Raleway",1,20));
		 l1.setForeground(Color.WHITE);
		 label.add(l1);
		 
		 b1= new JButton("Rs 100");
		 b1.setBounds(180,465,150,30);
		 b1.addActionListener(this);
		 b1.setFont(new Font("Raleway",1,12));
		 label.add(b1);
		 
		 b2= new JButton("Rs 200");
		 b2.setBounds(420,465,150,30);
		 b2.addActionListener(this);
		 b2.setFont(new Font("Raleway",1,12));
		 label.add(b2);
		 
		 b3= new JButton("Rs 500");
		 b3.setBounds(180,500,150,30);
		 b3.addActionListener(this);
		 b3.setFont(new Font("Raleway",1,12));
		 label.add(b3);
		 
		 b4= new JButton("Rs 2000");
		 b4.setBounds(420,500,150,30);
		 b4.addActionListener(this);
		 b4.setFont(new Font("Raleway",1,12));
		 label.add(b4);
		 
		 b5= new JButton("Rs 5000");
		 b5.setBounds(180,535,150,30);
		 b5.addActionListener(this);
		 b5.setFont(new Font("Raleway",1,12));
		 label.add(b5);
		 
		 b6= new JButton("Rs 10000");
		 b6.setBounds(420,535,150,30);
		 b6.addActionListener(this);
		 b6.setFont(new Font("Raleway",1,12));
		 label.add(b6);
		 
		 b7= new JButton("Back");
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
	   
	   public void actionPerformed(ActionEvent e)
	   {
		   if(e.getSource()== b7) {
			   f.dispose();
			   new Transaction(pin_no);
		   }
		   else {
			   String amount = ((JButton)e.getSource()).getText().substring(3);
			   DataHandler d= new DataHandler();
			   d.fastCash(amount);
		   }
	   }
}
