package com.classboxes.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.classboxes.cms.model.Customer;

public class CustomerDao 
{
	static Connection conn = DBConnectionManager.getDBConnection();
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	List<Customer> customerList = new ArrayList<Customer>();
	
	public List<Customer> getAllCustomers()
	{
		try
		{
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customer;");
			
			while (rs.next())
			{
				Customer cust = new Customer();
				cust.setCustId(rs.getInt(1));
				cust.setCustName(rs.getString(2));
				cust.setPhoneNo(rs.getInt(3));
				cust.setLocation(rs.getString(4));
				customerList.add(cust);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				stmt.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		return customerList;
	}
	
	public void addCustomer(Customer customer)
	{
		try
		{
			pstmt = conn.prepareStatement("insert into customer values(?,?,?,?);");
			pstmt.setInt(1,customer.getCustId());
			pstmt.setString(2,customer.getCustName());
			pstmt.setInt(3,customer.getPhoneNo());
			pstmt.setString(4,customer.getLocation());
			if (pstmt.execute())
				System.out.println("not inserted");
			else
				System.out.println("inserted");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void updateCustomer(int id, int phno) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement("update customer set phoneNo = ? where custId = ?;");
			pstmt.setInt(2, id);
			pstmt.setInt(1, phno);
			int i = pstmt.executeUpdate();
			if (i != 0)
				System.out.println("Customer Phone Number updated");
			else
				System.out.println("Customer Not found");
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement("delete from customer where custId = ?;");
			pstmt.setInt(1, id);
			if (pstmt.execute())
				System.out.println("Customer Not Found");
			else
				System.out.println("Customer removed from Database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
