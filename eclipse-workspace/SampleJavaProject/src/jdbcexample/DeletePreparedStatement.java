package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeletePreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Step 1: load the driver
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			//step 2: Establish the connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Qjf33161136!");
			//Step 3: Create the PreparedStatement
			PreparedStatement pstmt = conn.prepareStatement("delete from student where sid = ?");
			System.out.println("Enter the Employee Values: ");
			System.out.println("Enter the employee id: ");
			int id = sc.nextInt();
	
			//passing above values to the ? in the prepared statement
			pstmt.setInt(1, id);
			
			
			int i = pstmt.executeUpdate();
			pstmt.setInt(1, id);
			if (i!=0)
				//System.out.println("new employee added");
				//System.out.println("update student");
				System.out.println("delete student");
			else
				//System.out.println("not a new employee");
				//System.out.println("not update");
				System.out.println("not delete");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
