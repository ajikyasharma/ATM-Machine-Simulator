import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignUpTwo  extends WindowAdapter implements ActionListener {
	static JFrame f;
	static JLabel PageNo,Religion,Category,Income,Educational,Qualification,Occupation,Pan,Aadhar,Senior,Existing;
	static JTextField PanField, AadharField;
	static JComboBox religion,category,income,education,occupation;
	static JRadioButton syes, sno, eyes, eno;
	static JButton next;
    static int form_no;
	
	SignUpTwo(int formno)
	{
		this.form_no= formno;
		
		
		f= new JFrame("NEW ACCOUNT OPENING FORM - PAGE 2");
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
		
		
		
		PageNo = new JLabel("Page 2: Additional Details");
		PageNo.setFont(new Font("Raleway", 1,20));
		PageNo.setBounds(300, 60, 300, 30);
		f.add(PageNo);
		
		
		 Religion = new JLabel("Religion:");
		 Religion.setFont(new Font("Raleway", 1,20));
		 Religion.setBounds(100, 140, 180, 30);
		f.add(  Religion);
		
		String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christan", "Other"};
		 religion = new JComboBox(valReligion);
		religion.setBounds(300,140,380,30);
		religion.setBackground(Color.WHITE);
		f.add(religion);
		
	
		
		Category = new JLabel("Category:");
		Category.setFont(new Font("Raleway", 1,20));
		Category.setBounds(100, 190, 180, 30);
		f.add( Category);
		
		String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
		category = new JComboBox(valCategory);
		category.setBounds(300,190,380,30);
		category.setBackground(Color.WHITE);
		f.add(category);
		
		
		Income= new JLabel("Income:");
		Income.setFont(new Font("Raleway", 1,20));
		Income.setBounds(100, 240, 180, 30);
		f.add( Income);
		
		
		String IncomeCategory[] = {"0", "< 1,50,000", "< 2,50,000", "< 5,00,000", "upto 10,00,000"};
		income = new JComboBox( IncomeCategory);
		income.setBounds(300,240,380,30);
		income.setBackground(Color.WHITE);
		f.add(income);
		
		Educational= new JLabel("Educational");
		Educational.setFont(new Font("Raleway", 1,20));
		Educational.setBounds(100, 290, 180, 30);
		f.add( Educational);
		
         Qualification= new JLabel("Qualification:");
		 Qualification.setFont(new Font("Raleway", 1,20));
		 Qualification.setBounds(100, 315, 180, 30);
		f.add( Qualification);
		
		String educationValue[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
		education = new JComboBox(educationValue);
		education.setBounds(300,305,380,30);
		education.setBackground(Color.WHITE);
		f.add(education);
		
		Occupation= new JLabel("Occupation:");
		Occupation.setFont(new Font("Raleway", 1,20));
		Occupation.setBounds(100, 370, 180, 30);
		f.add( Occupation);
		
		String occupationValue[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other"};
		occupation = new JComboBox(occupationValue);
		occupation.setBounds(300,370,380,30);
		occupation.setBackground(Color.WHITE);
		f.add(occupation);

		
		Pan= new JLabel("PAN Number:");
		Pan.setFont(new Font("Raleway", 1,20));
		Pan.setBounds(100, 420, 180, 30);
		f.add( Pan);
		
		PanField = new JTextField();
		PanField.setFont(new Font("Raleway", 0,20));
		PanField.setBounds(300,420,380,30);
		f.add(PanField);
		
		Aadhar= new JLabel("AAdhar Number:");
		Aadhar.setFont(new Font("Raleway", 1,20));
		Aadhar.setBounds(100, 470, 180, 30);
		f.add(Aadhar);
		
		AadharField= new JTextField();
		AadharField.setFont(new Font("Raleway", 0,20));
		AadharField.setBounds(300,470,380,30);
		f.add(AadharField);
		
		Senior= new JLabel("Senior Citizen:");
		Senior.setFont(new Font("Raleway", 1,20));
		Senior.setBounds(100, 520, 180, 30);
		f.add(Senior);
		
		syes= new JRadioButton("Yes");
		syes.setBackground(Color.WHITE);
		syes.setBounds(300,520,100,30);
		f.add(syes);
		
		sno= new JRadioButton("No");
		sno.setBackground(Color.WHITE);
		sno.setBounds(450,520,100,30);
		f.add(sno);
		
		ButtonGroup gp1= new ButtonGroup();
		gp1.add(syes);
		gp1.add(sno);
		
		Existing = new JLabel("Existing Account:");
		Existing.setFont(new Font("Raleway", 1,20));
		Existing.setBounds(100, 570, 180, 30);
		f.add(Existing);
		
		
		eyes= new JRadioButton("Yes");
		eyes.setBackground(Color.WHITE);
		eyes.setBounds(300,570,100,30);
		f.add(eyes);
		
		eno= new JRadioButton("No");
		eno.setBackground(Color.WHITE);
		eno.setBounds(450,570,100,30);
		f.add(eno);
		
		ButtonGroup gp2= new ButtonGroup();
		gp2.add(eyes);
		gp2.add(eno);
		
		
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
	

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== next) {
			 
			DataHandler d= new DataHandler();
			d.save2();
			
			f.setVisible(false);
			new SignUpThree(form_no);
		}
	}
	
	@Override
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	
}

