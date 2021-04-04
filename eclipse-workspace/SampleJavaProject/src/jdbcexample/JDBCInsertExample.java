package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInsertExample {

	public static void main(String[] args) 
	{
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
			//int i = stmt.executeUpdate("insert into student values(12345,'tintu',21,4);");
			//int i = stmt.executeUpdate("update student set sid = 131 where sname = 'zarna';");
			int i = stmt.executeUpdate("delete from student;");
			if (i!=0)
				//System.out.println("new student added");
				//System.out.println("update student");
				System.out.println("delete student");
			else
				//System.out.println("not a new student");
				//System.out.println("not update");
				System.out.println("not delete");
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
