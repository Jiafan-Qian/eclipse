package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1: load the driver
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			//step 2: Establish the connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Qjf33161136!");
			//Step 3: Create the statement
			Statement stmt = conn.createStatement();
			//Step 4: Execute the statement
			//ResultSet rs = stmt.executeQuery("select * from student;");
			ResultSet rs = stmt.executeQuery("select * from employee;");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getFloat(4));
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
