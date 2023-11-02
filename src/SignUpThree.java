import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignUpThree extends WindowAdapter implements ActionListener {
     static JFrame f;
     static JLabel PageNo,account,card, cardno,l1,pin,pinno,l2,service;
     static JRadioButton r1,r2,r3,r4;
     static JCheckBox c1,c2,c3,c4,c5,c6,c7;
     static JButton Submit, Cancel;
     static int form_no;
      
      SignUpThree(int formno)
      {
    	  
    	  
    	 this.form_no= formno;
    	  
    	f= new JFrame("NEW ACCOUNT OPENING FORM - PAGE 3");
  		f.setLayout(null);
  		f.addWindowListener(this);
  		f.addWindowListener(new WindowAdapter()
  		{
  		public void windowClosing(WindowEvent e)
  		{
  		f.dispose();
  		}
  		});
  		
  		
  	    JLabel label= new JLabel("");
 	    ImageIcon i1= new ImageIcon("E:\\eclipse\\Bank Management System\\src\\icons\\logo.jpg");
 	    Image i2= i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
 	    ImageIcon i3= new ImageIcon(i2);
 	    label.setIcon(i3);
 	    label.setBounds(150,10,100,100);
 	    f.add(label);
 		
 		
 		
 		PageNo = new JLabel("Page 3: Account Details");
 		PageNo.setFont(new Font("Raleway", 1,20));
 		PageNo.setBounds(300, 60, 300, 30);
 		f.add(PageNo);
 		
 		
 		account = new JLabel("Account Type:");
 		account.setFont(new Font("Raleway",1,22));
 		account.setBounds(100,150,150,30);
 		f.add(account);
 		
 		r1= new JRadioButton("Saving Account");
 		r1.setBackground(Color.WHITE);
 		r1.setFont(new Font("Raleway",1,16));
 		r1.setBounds(120,190,150,25);
 		f.add(r1);
 		
 		r2= new JRadioButton("Fixed Deposite Account");
 		r2.setBackground(Color.WHITE);
 		r2.setFont(new Font("Raleway",1,16));
 		r2.setBounds(350,190,250,25);
 		f.add(r2);
 		
 		r3= new JRadioButton("Current Account");
 		r3.setBackground(Color.WHITE);
 		r3.setFont(new Font("Raleway",1,16));
 		r3.setBounds(120,220,200,25);
 		f.add(r3);
 		
 		r4= new JRadioButton("Recurring Deposite Account");
 		r4.setBackground(Color.WHITE);
 		r4.setFont(new Font("Raleway",1,16));
 		r4.setBounds(350,220,250,25);
 		f.add(r4);
 		
 		card = new JLabel("Card Number:");
 		card.setFont(new Font("Raleway",1,22));
 		card.setBounds(100,270,150,30);
 		f.add(card);
 		
 		cardno = new JLabel("XXXX-XXXX-XXXX-5520");
 		cardno.setFont(new Font("Raleway",1,22));
 		cardno.setBounds(300,270,350,30);
 		f.add(cardno);
 		
 		l1= new JLabel("Your 16 digit Card Number.");
 		l1.setFont(new Font("Raleway",1,15));
 		l1.setBounds(120,310,350,15);
 		f.add(l1);
 		
 		
 		pin = new JLabel("PIN:");
 		pin.setFont(new Font("Raleway",1,22));
 		pin.setBounds(100,350,150,30);
 		f.add(pin);
 		
 		pinno = new JLabel("XXXX");
 		pinno.setFont(new Font("Raleway",1,22));
 		pinno.setBounds(300,350,150,30);
 		f.add(pinno);
 		
 		l2= new JLabel("Your Pin Number.");
 		l2.setFont(new Font("Raleway",1,15));
 		l2.setBounds(120,390,350,15);
 		f.add(l2);
 		
 		service = new JLabel("Services Required:");
 		service.setFont(new Font("Raleway",1,22));
 		service.setBounds(100,430,300,30);
 		f.add(service);
 		
 		c1= new JCheckBox("ATM Card");
 		c1.setBackground(Color.WHITE);
 		c1.setFont(new Font("Raleway",1,18));
 		c1.setBounds(120,480,200,25);
 		f.add(c1);
 		
 		c2= new JCheckBox("Internet Banking");
 		c2.setBackground(Color.WHITE);
 		c2.setFont(new Font("Raleway",1,18));
 		c2.setBounds(350,480,200,25);
 		f.add(c2);
 		
 		
 		c3= new JCheckBox("Mobile Banking");
 		c3.setBackground(Color.WHITE);
 		c3.setFont(new Font("Raleway",1,18));
 		c3.setBounds(120,520,200,25);
 		f.add(c3);
 		
 		c4= new JCheckBox("Email & SMS Alert");
 		c4.setBackground(Color.WHITE);
 		c4.setFont(new Font("Raleway",1,18));
 		c4.setBounds(350,520,200,25);
 		f.add(c4); 
 		
 		c5= new JCheckBox("Cheque Book");
 		c5.setBackground(Color.WHITE);
 		c5.setFont(new Font("Raleway",1,18));
 		c5.setBounds(120,560,200,25);
 		f.add(c5);
 		
 		c6= new JCheckBox("E-Statement");
 		c6.setBackground(Color.WHITE);
 		c6.setFont(new Font("Raleway",1,18));
 		c6.setBounds(350,560,200,25);
 		f.add(c6);
 		
 		c7= new JCheckBox("I hereby declared that the above entered details are correct to the best of my Knowledge.");
 		c7.setBackground(Color.WHITE);
 		c7.setFont(new Font("Raleway",1,14));
 		c7.setBounds(80,620,700,18);
 		f.add(c7);
 		
 		
		Submit= new JButton("Submit");
		Submit.addActionListener(this);
		Submit.setBounds(200,700,100,30);
		Submit.setBackground(Color.BLACK);
		Submit.setForeground(Color.WHITE);
		f.add(Submit);
		
		Cancel= new JButton("Cancel");
		Cancel.addActionListener(this);
		Cancel.setBounds(400,700,100,30);
		Cancel.setBackground(Color.BLACK);
		Cancel.setForeground(Color.WHITE);
		Cancel.addActionListener(this);
		f.add(Cancel);
  		
  		
  		f.setSize(800,850);
		f.getContentPane().setBackground(Color.WHITE);
		f.setResizable(false);
		f.setLocation(350,10);
		f.setVisible(true);
      }
      
      

      
      public void actionPerformed(ActionEvent e)
      {
    	  if(e.getSource()==Submit) {
    		  if( !r1.isSelected() && !r2.isSelected() && !r3.isSelected() && !r4.isSelected()) {
    			  JOptionPane.showMessageDialog(null, "Account Type is Required");
    		  }
    		  if(! c7.isSelected()) {
    			  JOptionPane.showMessageDialog(null, "Please accept the declaration");
    		  }
    		  else {
    			  DataHandler d1 = new DataHandler();
    			  d1.save3();
    			  f.setVisible(false);
    			  new Transaction(d1.pinNumber);
    			  
    		  }
    	  }
      }
}
