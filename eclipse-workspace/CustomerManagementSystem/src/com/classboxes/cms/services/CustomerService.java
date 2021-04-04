package com.classboxes.cms.services;

import java.util.ArrayList;
import java.util.List;

import com.classboxes.cms.dao.CustomerDao;
import com.classboxes.cms.model.Customer;

public class CustomerService 
{
	ArrayList<Customer> customerList = new ArrayList<Customer>(); 
	CustomerDao cdao = new CustomerDao();
	
	public void addCustomer(Customer customer)
	{
		//customerList.add(customer);
		cdao.addCustomer(customer);
	}

	public List<Customer> customersDisplay() {
		// TODO Auto-generated method stub
		/*
		System.out.println("Customer List is");
		
		for (Customer cust : customerList)
			System.out.println(cust);
		*/
		
		return cdao.getAllCustomers();
	}

	public void updateCustomer(int id, int phno) {
		// TODO Auto-generated method stub
		/*
		boolean found = false;
		for (int i=0; i<customerList.size();i++)
		{
			if (customerList.get(i).getCustId() == id)
			{
				found = true;
				customerList.get(i).setPhoneNo(454445);
			}
		}
		
		if (found)
			System.out.println("Customer found");
		else
		{
			try {
				throw new CustomerNotFoundException("customer does not exist");
			}
			catch(CustomerNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		*/
		cdao.updateCustomer(id, phno);
		
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		/*
		for (int i=0; i<customerList.size();i++)
		{
			if (customerList.get(i).getCustId() == id)
			{
				customerList.remove(i);
			}
		}
		*/
		cdao.deleteCustomer(id);
	}
}
