import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math.*;
import java.util.Random;
import java.util.Date;


public class DataHandler {
    

	static String cardno, pinNumber;
	DataHandler()
	{

	}
	
	
	public Connection getConnect() {
		Connection cn = null;
            try
            {
			 Class.forName("com.mysql.cj.jdbc.Driver");
             cn= DriverManager.getConnection("jdbc:mysql://localhost/Bank_Management_System?user=root&password=kitkat");
            }
            catch(Exception e) {
            	System.out.println(e.getMessage());
            }
		return cn;
	 	
	}
	
	 public void save1()
	 {
		 
		 
		   int	FormNo=SignUpOne.form_no ;
		   String Name= SignUpOne.NameField.getText();
		   String FathersName= SignUpOne.FathersField.getText();
		   String Dob= SignUpOne.DobField.getText();
		   String Gender = null;
			if(SignUpOne.Male.isSelected())
				  Gender= "Male";
			else if(SignUpOne.Female.isSelected())
				Gender= "Female";
			
			String Email= SignUpOne.EmailField.getText();
			String Marital= null;
			if(SignUpOne.Married.isSelected())
				Marital= "Married";
			
			else if(SignUpOne.Unmarried.isSelected())
				Marital= "Unmarried";
			
			else if(SignUpOne.Other.isSelected())
				Marital = "Other";
			
			String Address= SignUpOne.AddressField.getText();
			String City= SignUpOne.CityField.getText();
			String Pin= SignUpOne.PinField.getText();
			String State= SignUpOne.StateField.getText();
		 try {
			 Connection cn= getConnect();
             String query ="insert into client values(?,?,?,?,?,?,?,?,?,?,?)";
             PreparedStatement st= cn.prepareStatement(query);
             st.setInt(1, FormNo);
             st.setString(2,Name);
             st.setString(3,FathersName);
             st.setString(4, Dob);
             st.setString(5,Gender);
             st.setString(6, Email);
             st.setString(7, Marital);
             st.setString(8, Address);
             st.setString(9,City);
             st.setString(10, Pin);
             st.setString(11, State);
             st.executeUpdate();
             cn.close();
             
             
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
	 
	 
	 public void save2()
	 {
		 
		 
		   int	FormNo=SignUpTwo.form_no ;
		   String sreligion= (String) SignUpTwo.religion.getSelectedItem();
		   String scategory= (String)SignUpTwo.category.getSelectedItem();
		   String sincome= (String)SignUpTwo.income.getSelectedItem();
		   String seduaction= (String)SignUpTwo.education.getSelectedItem();
		   String soccupation=(String)SignUpTwo.occupation.getSelectedItem();
			String span=SignUpTwo.PanField.getText();
			String saadhar= SignUpTwo.AadharField.getText();
			
			  String ssenior = null;
				if(SignUpTwo.syes.isSelected())
					ssenior= "Yes";
				else if(SignUpTwo.sno.isSelected())
					ssenior= "No";
				
			  String exist = null;
					if(SignUpTwo.eyes.isSelected())
						exist= "Yes";
					else if(SignUpTwo.eno.isSelected())
						exist= "No";	
		 try {
			 Connection cn= getConnect();
             String query ="insert into client_2 values(?,?,?,?,?,?,?,?,?,?)";
             PreparedStatement st= cn.prepareStatement(query);
             st.setInt(1, FormNo);
             st.setString(2,sreligion);
             st.setString(3,scategory);
             st.setString(4,sincome);
             st.setString(5,seduaction);
             st.setString(6,soccupation);
             st.setString(7, span);
             st.setString(8, saadhar);
             st.setString(9,ssenior);
             st.setString(10, exist);
             st.executeUpdate();
             cn.close();
             
             
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
	 
	 public void save3()
	 {
		 
		 
		   int	FormNo=SignUpThree.form_no ;
		   String account= null;
		   if(SignUpThree.r1.isSelected())
			    account= "Saving Account";
		   else if(SignUpThree.r2.isSelected())
			    account= "Fixed Deposit Account";
		   else if(SignUpThree.r3.isSelected())
			    account= "Current Account";
		   else if(SignUpThree.r4.isSelected())
			    account= "Recurring Deposit Account";
		   
		   Random random= new Random();
		   
		   cardno= ""+Math.abs((random.nextLong() % 90000000L )+ 5040936000000000L);
		   
		   pinNumber = ""+ Math.abs((random.nextLong() % 9000L)+1000L);
		   
		   String service="";
		   if(SignUpThree.c1.isSelected())
	              service= service +"ATM card";
		   if(SignUpThree.c2.isSelected())
	              service= service +" Internet Banking"; 
		   if(SignUpThree.c3.isSelected())
	              service= service +" Mobile Banking"; 
		   if(SignUpThree.c4.isSelected())
	              service= service +" Email & SMS Alert"; 
		   if(SignUpThree.c4.isSelected())
	              service= service +" Cheque Book"; 
		   if(SignUpThree.c6.isSelected())
	              service= service +" E-Statement"; 
	              
		   
		   
		 try {
			 Connection cn= getConnect();
             String query ="insert into client_3 values(?,?,?,?,?)";
             PreparedStatement st= cn.prepareStatement(query);
             st.setInt(1, FormNo);
             st.setString(2,account);
             st.setString(3,cardno);
             st.setString(4,pinNumber);
             st.setString(5,service);
             st.executeUpdate();
   
             
   
             String query1 = "insert into login values(?,?,?)";
             PreparedStatement st1= cn.prepareStatement(query1);
             st1.setInt(1, FormNo);
             st1.setString(2,cardno);
             st1.setString(3,pinNumber);
             st1.executeUpdate();
             cn.close();
            
             
             JOptionPane.showMessageDialog(null, "card Number: "+ cardno+ "\n PIN: " + pinNumber);
           
             
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
	 
	 public void signin()
	 {
		 String cardnumber= Login.cardField.getText();
		 String pinnumber= Login.pinField.getText();
		 
		 try {
			 Connection cn= getConnect();
			 String query = "select * from login where card_no = ? and pin = ?";
			 PreparedStatement st= cn.prepareStatement(query);
			 st.setString(1,cardnumber);
			 st.setString(2,pinnumber);
			 ResultSet rs= st.executeQuery();
			 
			 if(rs.next()) {
				 Login.f.setVisible(false);
				 new Transaction(pinnumber);
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
			 }
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		 
	 }
	 
	 public void deposit()
	 {
		 String amount= Deposit.amount.getText();
		 Date date= new Date();
		 String date1= ""+date;
		 
		 if(Deposit.amount.getText().equals("")) {
			 JOptionPane.showMessageDialog(null, "Please Enter the amount:");
		 }
		 else {
			 try {
				 Connection cn= getConnect();
				 String query = "insert into bank values(?,?,?,?)"; 
				 PreparedStatement st= cn.prepareStatement(query);
				 st.setString(1,Deposit.pin_no);
				 st.setString(2,date1);
				 st.setString(3, "Deposit");
				 st.setString(4, amount);
				 st.executeUpdate();
				 
				 cn.close();
				 
				JOptionPane.showMessageDialog(null,"Rs "+ amount +" Deposited Successfully");
				Deposit.f.setVisible(false);
				new Transaction(Deposit.pin_no);
				
			 }
			 catch(Exception e)
			 {
				 System.out.println(e.getMessage());
			 }

			 
		 }
	 }
	 
	 public void withdraw()
	 {
		 String amount= Withdraw.amount.getText();
		 String pinno = Withdraw.pin_no;
		 try {
			 Connection cn= getConnect();
			 String query = "select * from bank where pin = ?";
			 PreparedStatement st = cn.prepareStatement(query);
			 st.setString(1, pinno);
			 ResultSet rs= st.executeQuery();
			 
			 int balance =0;
			 while(rs.next()) {
				 if(rs.getString("type").equals("Deposit")) {
					 balance += Integer.parseInt(rs.getString("amount"));
					 
				 }
				 else {
					 balance -= Integer.parseInt(rs.getString("amount"));
				 }
			 }
			 
			 if(balance <Integer.parseInt(amount)) {
				 JOptionPane.showMessageDialog(null,"Insufficient Balance");
				 return;
			 }
			 
			 Date date = new Date();
			String date1= ""+date;
			String query1 ="insert into bank values(?,?,?,?)";
			 PreparedStatement st1= cn.prepareStatement(query1);
			 st1.setString(1,pinno);
			 st1.setString(2,date1);
			 st1.setString(3, "Withdraw");
			 st1.setString(4, amount);
			 st1.executeUpdate();
			 
			 cn.close();
			 
			JOptionPane.showMessageDialog(null,"Rs "+ amount +" Withdrawed Successfully");
			Withdraw.f.setVisible(false);
			new Transaction(Withdraw.pin_no);
			 
			 
		 }
			 catch(Exception e)
			 {
				 System.out.println(e.getMessage());
			 }

			 
		 }
	 
	 public void fastCash(String amount)
	 {
		 String amount1= amount;
		 String pinno = FastCash.pin_no;
		 try {
			 Connection cn= getConnect();
			 String query = "select * from bank where pin = ?";
			 PreparedStatement st = cn.prepareStatement(query);
			 st.setString(1, pinno);
			 ResultSet rs= st.executeQuery();
			 
			 int balance =0;
			 while(rs.next()) {
				 if(rs.getString("type").equals("Deposit")) {
					 balance += Integer.parseInt(rs.getString("amount"));
					 
				 }
				 else {
					 balance -= Integer.parseInt(rs.getString("amount"));
				 }
			 }
			 
			 if(balance <Integer.parseInt(amount1)) {
				 JOptionPane.showMessageDialog(null,"Insufficient Balance");
				 return;
			 }
			 
			 Date date = new Date();
			String date1= ""+date;
			String query1 ="insert into bank values(?,?,?,?)";
			 PreparedStatement st1= cn.prepareStatement(query1);
			 st1.setString(1,FastCash.pin_no);
			 st1.setString(2,date1);
			 st1.setString(3, "Withdraw");
			 st1.setString(4, amount1);
			 st1.executeUpdate();
			 
			 cn.close();
			 
			JOptionPane.showMessageDialog(null,"Rs "+ amount1 +" Withdrawed Successfully");
			FastCash.f.setVisible(false);
			new Transaction(FastCash.pin_no);
			 
			 
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.getMessage());
		 }
		 
		
	 }
	 
	 public void pinChange(String pin, String newPin) {
		 String pin1= pin;
		 String npin= newPin;
		 
		 try {
			 Connection cn= getConnect();
			 String query1= "update bank set pin = ? where pin = ?";
			 PreparedStatement st1= cn.prepareStatement(query1);
			 st1.setString(1,npin);
			 st1.setString(2,pin1);
			 
			 String query2= "update login set pin = ? where pin = ?";
			 PreparedStatement st2= cn.prepareStatement(query2);
			 st2.setString(1,npin);
			 st2.setString(2,pin1);
			 
			 String query3= "update client_3 set pin = ? where pin = ?";
			 PreparedStatement st3= cn.prepareStatement(query3);
			 st3.setString(1,npin);
			 st3.setString(2,pin1);
			 
			 st1.executeUpdate();
			 st2.executeUpdate();
			 st3.executeUpdate();
			 
			 cn.close();
			 
			 JOptionPane.showMessageDialog(null,"PIN changed successfully");
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.getMessage());
		 }
	 }
	 
	 public int checkBalance(String pin_no) {
		      
		 String pin= pin_no;
		 int balance =0;
		 try {
			 Connection cn= getConnect();
			 String query = "select * from bank where pin = ?";
			 PreparedStatement st = cn.prepareStatement(query);
			 st.setString(1, pin);
			 ResultSet rs= st.executeQuery();
			 
			 
			 while(rs.next()) {
				 if(rs.getString("type").equals("Deposit")) {
					 balance += Integer.parseInt(rs.getString("amount"));
					 
				 }
				 else {
					 balance -= Integer.parseInt(rs.getString("amount"));
				 }
		 }
	}
		 catch(Exception ex)
		 {
			 System.out.println(ex.getMessage());
		 }
		 
		 return balance;
	 }
	 
	 public void miniStatement() {
		 
		 String pin = MiniStatement.pin_no;
		 try {
			 Connection cn= getConnect();
			 String query= "select * from login where pin = ?";
			 PreparedStatement st= cn.prepareStatement(query);
			 st.setString(1, pin);
			 ResultSet rs= st.executeQuery();
			 while(rs.next()) {
				 String str="Card No: " + rs.getString("card_no").substring(0,4)+ "XXXXXXXX" +  rs.getString("card_no").substring(12);
				 MiniStatement.l2.setText(str);
			 }
			 
			 String query1 = "select * from bank where pin= ?";
			 PreparedStatement st1= cn.prepareStatement(query1);
			 st1.setString(1, pin);
			 ResultSet rs1= st1.executeQuery();
			 
			 while(rs1.next()) {
			     String str1= rs1.getString("date");
			     String str2= rs1.getString("type");
			     String str3= rs1.getString("amount");
			     
			     String data[]= {str1, str2, str3};
			     MiniStatement.dm.addRow(data);
			 }
	       cn.close();
	       
	       
	       int bal = checkBalance(pin);
	       MiniStatement.l3.setText("Your account balance is  Rs. "+ bal);
			 

		 }
		 catch(Exception ex) {
			 System.out.println(ex.getMessage());
		 }
	 }
}
