import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;



public class SignUpOne extends WindowAdapter implements ActionListener{
    
	static JFrame f;
	static int form_no;
	static JLabel FormNo, PageNo, Name, FathrsName, DOB, Gender, Email, Marital, Address, City, Pin, State;
	static JTextField NameField, FathersField,DobField, EmailField, AddressField, CityField, PinField, StateField;
	static JRadioButton Male, Female, Married, Unmarried, Other;
	static JButton next;
	
	SignUpOne()
	{
		f= new JFrame("NEW ACCOUNT OPENING FORM");
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
	    label.setBounds(40,10,100,100);
	    f.add(label);
	    
	    
	    Random random= new Random();
	    
		 form_no=(int) Math.abs((random.nextLong() % 9000L)+1000L);
		
		FormNo = new JLabel("APPLICATION FORM NO : "+ form_no);
		FormNo.setFont(new Font("Raleway", 1,40));
		FormNo.setBounds(150,20,600,50);
		f.add(FormNo);
		
		PageNo = new JLabel("Page 1: Personal Details");
		PageNo.setFont(new Font("Raleway", 1,20));
		PageNo.setBounds(300, 90, 300, 30);
		f.add(PageNo);
		
		
		 Name = new JLabel("Name:");
		 Name.setFont(new Font("Raleway", 1,20));
		 Name.setBounds(100, 140, 180, 30);
		f.add( Name);
		
		NameField = new JTextField();
		NameField.setFont(new Font("Raleway", 0,20));
		NameField.setBounds(300,140,380,30);
		f.add(NameField);
		
		FathrsName = new JLabel("Father's Name:");
		FathrsName.setFont(new Font("Raleway", 1,20));
		FathrsName.setBounds(100, 190, 180, 30);
		f.add( FathrsName);
		
		FathersField = new JTextField();
		FathersField.setFont(new Font("Raleway", 0,20));
		FathersField.setBounds(300,190,380,30);
		f.add(FathersField);
		
		
		DOB= new JLabel("Date Of Birth:");
		DOB.setFont(new Font("Raleway", 1,20));
		DOB.setBounds(100, 240, 180, 30);
		f.add( DOB);
		
		
		DobField = new JTextField();
		DobField.setFont(new Font("Raleway", 0,20));
		DobField.setBounds(300,240,380,30);
		f.add(DobField);
		
		Gender= new JLabel("Gender:");
		Gender.setFont(new Font("Raleway", 1,20));
		Gender.setBounds(100, 290, 180, 30);
		f.add( Gender);
		
		Male= new JRadioButton("Male");
		Male.setBackground(Color.WHITE);
		Male.setBounds(300,290,100,30);
		f.add(Male);
		
		Female= new JRadioButton("Female");
		Female.setBackground(Color.WHITE);
		Female.setBounds(450,290,100,30);
		f.add(Female);
		
		ButtonGroup gp1= new ButtonGroup();
		gp1.add(Male);
		gp1.add(Female);
		
		
		
		 Email= new JLabel("Email Address:");
		 Email.setFont(new Font("Raleway", 1,20));
		 Email.setBounds(100, 340, 180, 30);
		f.add(  Email);
		
		EmailField = new JTextField();
		EmailField.setFont(new Font("Raleway", 0,20));
		EmailField.setBounds(300,340,380,30);
		f.add(EmailField);
		
		Marital= new JLabel("Marital Status:");
		Marital.setFont(new Font("Raleway", 1,20));
		Marital.setBounds(100, 390, 180, 30);
		f.add( Marital);
		
		 Married= new JRadioButton("Married");
		 Married.setBackground(Color.WHITE);
		 Married.setBounds(300,390,100,30);
		f.add( Married);
		
	    Unmarried= new JRadioButton("Unmarried");
	    Unmarried.setBackground(Color.WHITE);
	    Unmarried.setBounds(400,390,100,30);
		f.add(Unmarried);
		
		Other= new JRadioButton("Other");
		Other.setBackground(Color.WHITE);
		Other.setBounds(540,390,100,30);
		f.add(Other);
		
		ButtonGroup gp2= new ButtonGroup();
		gp2.add(Married);
		gp2.add(Unmarried);
		gp2.add(Other);
		
		Address= new JLabel("Address:");
		Address.setFont(new Font("Raleway", 1,20));
		Address.setBounds(100, 440, 180, 30);
		f.add( Address);
		
		AddressField = new JTextField();
		AddressField.setFont(new Font("Raleway", 0,20));
		AddressField.setBounds(300,440,380,30);
		f.add(AddressField);
		
		City= new JLabel("City:");
		City.setFont(new Font("Raleway", 1,20));
		City.setBounds(100, 490, 180, 30);
		f.add(City);
		
		CityField= new JTextField();
		CityField.setFont(new Font("Raleway", 0,20));
		CityField.setBounds(300,490,380,30);
		f.add(CityField);
		
		Pin= new JLabel("Pin Code:");
		Pin.setFont(new Font("Raleway", 1,20));
		Pin.setBounds(100, 540, 180, 30);
		f.add(Pin);
		
		PinField= new JTextField();
		PinField.setFont(new Font("Raleway", 0,20));
		PinField.setBounds(300,540,380,30);
		f.add(PinField);
		
		State= new JLabel("State:");
		State.setFont(new Font("Raleway", 1,20));
		State.setBounds(100, 590, 180, 30);
		f.add(State);
		
		StateField= new JTextField();
		StateField.setFont(new Font("Raleway", 0,20));
		StateField.setBounds(300,590,380,30);
		f.add(StateField);
		
		
		next= new JButton("NEXT");
		next.setBounds(550,700,100,30);
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		f.add(next);
		
		
		f.setSize(800,850);
		f.getContentPane().setBackground(Color.WHITE);
		f.setResizable(false);
		f.setLocation(350,10);
		f.setVisible(true);
		
	}
	
//	public static void main(String ar[])
//	{
//		new SignUpOne();
//	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== next) {
			 
			DataHandler d= new DataHandler();
			d.save1();
			f.setVisible(false);
			SignUpTwo s= new SignUpTwo(form_no);
		}
	}
	
	@Override
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	
}
