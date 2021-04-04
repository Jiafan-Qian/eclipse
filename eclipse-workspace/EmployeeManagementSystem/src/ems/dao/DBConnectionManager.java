package ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionManager {

	
	static Connection conn = null;
	
	public static Connection getDBConnection()
	{
		//step1:
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			//step2:
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","Qjf33161136!");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
