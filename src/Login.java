import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;


public class Login extends WindowAdapter implements ActionListener{
      
	static JFrame f;
	static JLabel text, cardno, pin;
	static JTextField cardField;
	static JPasswordField pinField;
	static JButton signin, clear, signup;
	
	Login()
	{
		f= new JFrame("AUTOMATIC TELLER MACHINE");
		f.setLayout(null);
		f.addWindowListener(this);
		f.setLocation(350,200);
		f.setSize(800,450);
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
	    label.setBounds(70,10,100,100);
	    f.add(label);
		
		text= new JLabel("WELCOME TO ATM");
		text.setFont(new Font("Osward",1,38));
		text.setBounds(200,40,400,40);
		f.add(text);
		
		cardno= new JLabel("Card No:");
		cardno.setFont(new Font("Raleway", 1,28));
		cardno.setBounds(120,150,150,30);
		f.add(cardno);
		
		
		cardField= new JTextField();
		cardField.setBounds(300,150,230,30);
		cardField.setFont(new Font("Arial", 1, 14));
		f.add(cardField);
		
		pin = new JLabel("PIN");
		pin.setFont(new Font("Raleway", 1, 28));
		pin.setBounds(120,220,150,30);
		f.add(pin);
		
		pinField= new JPasswordField();
		pinField.setBounds(300, 220,230,30);
		pinField.setFont(new Font("Arial", 1, 14));
		f.add(pinField);
		
		
		signin= new JButton("SIGN IN");
		signin.setBounds(300,300,100,30);
		signin.setBackground(Color.BLACK);
		signin.setForeground(Color.WHITE);
		signin.addActionListener(this);
		f.add(signin);
		
		
		clear= new JButton("CLEAR");
		clear.setBounds(430,300,100,30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		f.add(clear);
		
		
		signup= new JButton("SIGN UP");
		signup.setBounds(300,350,230,30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		f.add(signup);
		
		f.getContentPane().setBackground(Color.WHITE);
		f.setResizable(false);
		f.setVisible(true);
	}
	
	public static void main(String ar[])
	{
		Login l= new Login();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
	  if(e.getSource() == clear)
	  {
		  cardField.setText("");
          pinField.setText("");		  
	  }
	  else if(e.getSource() == signin)
	  {
			 DataHandler d= new DataHandler();
			 d.signin();
	  }
	  else if(e.getSource() == signup)
	  {
		  f.setVisible(false);
		  new SignUpOne();
	  }
	}
	
	@Override
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}

}
