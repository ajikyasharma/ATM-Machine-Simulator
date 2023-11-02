import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PinChange implements ActionListener{
        
	static JFrame f;
	static JLabel l1,l2,l3;
	static JButton b1, b2; 
	static JPasswordField pf1, pf2;
	static String pin_no;
	
   
   PinChange(String pinnumber)
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
	 
	 
	 l1= new JLabel("Change your PIN");
	 l1.setBounds(220,330,400,30);
	 l1.setFont(new Font("Raleway",1,25));
	 l1.setForeground(Color.WHITE);
	 label.add(l1);
	 
	 
	 l2= new JLabel("Enter new PIN:");
	 l2.setBounds(180,390,200,25);
	 l2.setFont(new Font("Raleway",1,18));
	 l2.setForeground(Color.WHITE);
	 label.add(l2);
	 
	  pf1= new JPasswordField();
      pf1.setBounds(350, 390,210,30);
      pf1.setFont(new Font("Arial", 1, 14));
	  label.add(pf1);
	  

		
	 
	 
	 l3= new JLabel("Renter new PIN:");
	 l3.setBounds(180,440,200,25);
	 l3.setFont(new Font("Raleway",1,18));
	 l3.setForeground(Color.WHITE);
	 label.add(l3);
	 
	  pf2= new JPasswordField();
      pf2.setBounds(350, 440,210,30);
      pf2.setFont(new Font("Arial", 1, 14));
	  label.add(pf2);
	 
	 
	 
	 b1= new JButton("Change");
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
		  String npin= pf1.getText();
		  String rpin= pf2.getText();
		  
		  if( !npin.equals(rpin)) {
			  JOptionPane.showMessageDialog(null,"Both PIN does not match");
			  return;
		  }
		  else if(npin.equals("")) {
			  JOptionPane.showMessageDialog(null, "Please enter the pin");
			  return;
		  }
		  
		  else if(rpin.equals("")) {
			  JOptionPane.showMessageDialog(null, "Please renter the pin");
			  return;
		  }
		  else
		  {
			  DataHandler d= new DataHandler();
			  d.pinChange(pin_no,npin);
			  f.setVisible(false);
			  new Transaction(pin_no);
		  }
	   }
	   
	   else {
		   f.setVisible(false);
		   new Transaction(pin_no);
	   }
   }
}
