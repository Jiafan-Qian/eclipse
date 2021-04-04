package ems.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ems.model.Employee;
import ems.services.EmployeeService;

public class EmployeeController 
{

	Scanner sc = new Scanner(System.in);
	EmployeeService employeeService = new EmployeeService();
	
	
	public void addEmployee() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the details of Employee: ");
		System.out.println("Enter employee id: ");
		int id = sc.nextInt();
		System.out.println("Enter employee name: ");
		String name = sc.next();
		System.out.println("Enter phone number: ");
		long phone = sc.nextLong();
		System.out.println("Enter location: ");
		String location = sc.next();
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		
		Employee employee = new Employee();
		employee.setEmpId(id);
		employee.setEmpName(name);
		employee.setPhoneNo(phone);
		employee.setLocation(location);
		employee.setSalary(salary);
		
		employeeService.addEmployee(employee);
		
		
		
		
		
	}

	List<Employee> empList = new ArrayList<Employee>();
	public void displayEmployee() 
	{
		// TODO Auto-generated method stub
		empList = employeeService.displayEmployee();
		Iterator<Employee> empItr = empList.iterator();
		while (empItr.hasNext())
		{
			System.out.println(empItr.next());
		}	
		
	}


	public void updateEmployee() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the employee id: ");
		int id = sc.nextInt();
		employeeService.updateEmployee(id);
		
	}


	public void deleteEmployee() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the employee id: ");
		int id = sc.nextInt();
		employeeService.deleteEmployee(id);
		
	}

}
