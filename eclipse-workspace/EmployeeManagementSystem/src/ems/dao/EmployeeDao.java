package ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ems.model.Employee;

public class EmployeeDao 
{
	static Connection conn = DBConnectionManager.getDBConnection();
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	List<Employee> employeeList = new ArrayList<Employee>();
	
	public List<Employee> getAllEmployees()
	
	{
		try {
			employeeList.clear(); //make sure nothing in the list
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee;");
			
			while(rs.next())
			{
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setPhoneNo(rs.getInt(3));
				emp.setLocation(rs.getString(4));
				emp.setSalary(rs.getDouble(5));
				employeeList.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employeeList;
	}

	public void addEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement("insert into employee values(?,?,?,?,?);");
			pstmt.setInt(1, employee.getEmpId());
			pstmt.setString(2, employee.getEmpName());
			pstmt.setLong(3, employee.getPhoneNo());
			pstmt.setString(4, employee.getLocation());
			pstmt.setDouble(5, employee.getSalary());
			if (pstmt.execute())
				System.out.println("not inserted");
			else
				System.out.println("inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	//update empID
	public void updateEmployee(int id, int empId) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement("update employee set empId = ? where empId = ?;");
			pstmt.setInt(2, id);
			pstmt.setInt(1, empId);
			int i = pstmt.executeUpdate();
			if (i != 0)
				System.out.println("Employee id updated");
			else
				System.out.println("Employee not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	//update name, location
	public void updateEmployee(int choice, int id, String str) {
		// TODO Auto-generated method stub
		if (choice == 2)
		{
			try {
				String name = str;
				pstmt = conn.prepareStatement("update employee set empName = ? where empId = ?;");
				pstmt.setInt(2, id);
				pstmt.setString(1, name);
				int i = pstmt.executeUpdate();
				if (i != 0)
					System.out.println("Employee name updated");
				else
					System.out.println("Employee not found");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				String location = str;
				pstmt = conn.prepareStatement("update employee set location = ? where empId = ?;");
				pstmt.setInt(2, id);
				pstmt.setString(1, location);
				int i = pstmt.executeUpdate();
				if (i != 0)
					System.out.println("Employee location updated");
				else
					System.out.println("Employee not found");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	//update phone number
	public void updateEmployee(int id, long phone) 
	{
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement("update employee set phoneNo = ? where empId = ?;");
			pstmt.setInt(2, id);
			pstmt.setLong(1, phone);
			int i = pstmt.executeUpdate();
			if (i != 0)
				System.out.println("Employee phone number updated");
			else
				System.out.println("Employee not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement("update employee set salary = ? where empId = ?;");
			pstmt.setInt(2, id);
			pstmt.setDouble(1, salary);
			int i = pstmt.executeUpdate();
			if (i != 0)
				System.out.println("Employee salary updated");
			else
				System.out.println("Employee not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteEmployee(int id) 
	{
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement("delete from employee where empId = ?;");
			pstmt.setInt(1, id);
			int i = pstmt.executeUpdate();
			if (i != 0)
				System.out.println("Employee deleted");
			else
				System.out.println("Employee not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


