
package employeemanagementsystem;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Splash extends JFrame implements ActionListener {
	
	Splash(){
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel jl=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		jl.setBounds(130,30,1200,60);
		jl.setFont(new Font("serif",Font.PLAIN,60));
		jl.setForeground(Color.RED);
		add(jl);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
		Image i2=i1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,1400,700);
		add(image);
		
		JButton clickhere= new JButton("clickhere to continue");
		clickhere.setBounds(520, 500, 300, 70);
		clickhere.setBackground(Color.BLACK);
		clickhere.setForeground(Color.white);
		clickhere.addActionListener(this);
		image.add(clickhere);
		
		
		
		setSize(1000,650);
		setLocation(200,50);
		setVisible(true);
		
		
		
	}
	public static void main(String[]args){
		 
		new Splash();
	}
	public void actionPerformed(ActionEvent ae) 
	{
		setVisible(false);
		new Login();
		
	}
	
	

}
