package com.classboxes.cms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.classboxes.cms.exception.NotProperNameException;
import com.classboxes.cms.model.Customer;
import com.classboxes.cms.services.CustomerService;

public class CustomerController 
{
	Scanner sc = new Scanner(System.in);
	CustomerService customerService = new CustomerService();
	
	public void addCustomer()
	{
		System.out.println("Enter the details of Customer");
		System.out.println("Enter customer id ");
		int id = sc.nextInt();
		System.out.println("Enter customer name: ");
		String name = sc.next();
		if (name.length() <= 2)
			throw new NotProperNameException("Name shoudl be greater than 2 characters");
		System.out.println("Enter phone number: ");
		int phone = sc.nextInt();
		System.out.println("Enter location: ");
		String loc = sc.next();
		
		Customer customer = new Customer();
		customer.setCustId(id);
		customer.setCustName(name);
		customer.setPhoneNo(phone);
		customer.setLocation(loc);
		
		customerService.addCustomer(customer);
	}
	
	List<Customer> custList = new ArrayList<Customer>();
	public void customersDisplay() {
		// TODO Auto-generated method stub
		custList = customerService.customersDisplay();
		Iterator<Customer> custItr = custList.iterator();
		
		while(custItr.hasNext())
		{
			System.out.println(custItr.next());
		}
		
	}
	public void updateCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Enter the custmer id: ");
		int id = sc.nextInt();
		System.out.println("Enter the phone new phone number: ");
		int phno = sc.nextInt();
		customerService.updateCustomer(id,phno);
		
	}
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Enter the customer id: ");
		int id = sc.nextInt();
		customerService.deleteCustomer(id);
		
	}
}
