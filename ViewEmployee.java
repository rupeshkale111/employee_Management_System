package employeemanagementsystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;



 
public class ViewEmployee extends JFrame implements ActionListener{
    
    
    JTable table;
    Choice cemployeeid;
    JButton search,update,back;
    
    ViewEmployee(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel searchlbl=new JLabel("Search by Employee id");
        searchlbl.setBounds(20, 20, 150, 20);
        add(searchlbl);
        
        cemployeeid = new Choice();
        cemployeeid.setBounds(180,20,150,20);
        add(cemployeeid);
        
        table=new JTable();
        
         try{
            Conn c=new Conn();
            ResultSet rs =c.s.executeQuery("select * from employee");
            
            while(rs.next()){
                cemployeeid.add(rs.getString("empId"));
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            Conn c=new Conn();
            ResultSet rs =c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
           
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);
        
       
        
        search=new JButton("search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);
        
        update=new JButton("update");
        update.setBounds(120,70,80,20);
        update.addActionListener(this);
        add(update);
        
        back=new JButton("back");
        back.setBounds(220,70,80,20);
        back.addActionListener(this);
        add(back);
        
        
        
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==search){
            String query="select * from employee where empid='" +cemployeeid.getSelectedItem()+"'";
            try{
                Conn  c=new Conn();
                ResultSet rs =c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==update){
            setVisible(false);
            new UpdateEmployee(cemployeeid.getSelectedItem());
            
        }
        else{
            setVisible(false);
            new Home();
        }
    }
    
    public static void main(String[]args){
       new ViewEmployee();
        
    }
    
}
