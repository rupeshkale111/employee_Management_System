package employeemanagementsystem;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {
	JButton add,view,update,remove;
	Home()
	{
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
		Image i2=i1.getImage().getScaledInstance(1300, 630, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,1300,630);
		add(image);
		
		JLabel heading=new JLabel("Employee Management System");
		heading.setBounds(620, 20,400, 40);
		heading.setFont(new Font("Raleway",Font.BOLD,25));
		image.add(heading);
		
		add =new JButton("Add Employee");
		add.setBounds(650, 80, 150, 40);
		image.add(add);
		add.addActionListener(this);
		
		view =new JButton("view Employee");
		view.setBounds(820, 80, 150, 40);
		image.add(view);
		view.addActionListener(this);
		
	        update =new JButton("update Employee");
		update.setBounds(650, 140, 150, 40);
		image.add(update);
		update.addActionListener(this);
		
		remove =new JButton("remove Employee");
		remove.setBounds(820, 140, 150, 40);
		image.add(remove);
		remove.addActionListener(this);
		
		
		setSize(1120,630);
		setLocation(250,100);
		setVisible(true);
		
	}

	
		
	

	public static void main(String[] args) {
		
		new Home();
		

	}



	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==add){
                    setVisible(false);
                    new Addemployee();
			
		}else if(ae.getSource()==view){
		  setVisible(false);
                   new ViewEmployee();
		}else if(ae.getSource()==update){
                    setVisible(false);
                    new ViewEmployee();
			
		}else{
                    setVisible(false);
                    new RemoveEmployee();
			
		}
		
	}

}
