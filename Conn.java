package employeemanagementsystem;
import java.sql.*;

public class Conn {
	Statement s;
	
	public Conn(){
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://Localhost:3306/login","root","root");
		     s=c.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	}


