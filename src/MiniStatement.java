import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.*;


public class MiniStatement {
  
	static JFrame f;
	static JLabel l1, l2,l3; 
	static JTable t;
	static DefaultTableModel dm;
	static String pin_no;
	
	MiniStatement(String pinnumber){
		
		
		this.pin_no= pinnumber;
		f= new JFrame("Mini Statement");
	    f.setLayout(null);
	
		

		
		l1= new JLabel("Indian Bank");
		l1.setFont(new Font("Raleway",1,20));
		l1.setBounds(150,40,150,30);
		f.add(l1);
		
		
		l2= new JLabel("card No");
		l2.setFont(new Font("Raleway",1,12));
		l2.setBounds(20,100,200,30);
		f.add(l2);
         
		t= new JTable();
		t.setBounds(10,150,400,280);
		f.add(t);
		
		
		l3= new JLabel("");
		l3.setFont(new Font("Raleway",1,14));
		l3.setBounds(30,450,300,30);
		f.add(l3);
		
		dm= new DefaultTableModel ();
		dm.addColumn("date");
		dm.addColumn("type");
		dm.addColumn("amount");
		
		t.setModel(dm);
	    String str[]= {"Date", "Type","Amount"};
	    dm.addRow(str);
	    
	    t.getColumnModel().getColumn(0).setPreferredWidth(200);
		
		
		
		
		DataHandler d1 = new DataHandler();
		d1.miniStatement();
		
		f.getContentPane().setBackground(Color.WHITE);
		f.setLocation(20,20);
		f.setSize(450,600);
		f.setResizable(false);
		f.setVisible(true);
	}
  
	
}
