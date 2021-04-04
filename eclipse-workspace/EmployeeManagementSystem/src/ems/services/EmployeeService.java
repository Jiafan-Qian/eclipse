package ems.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ems.dao.EmployeeDao;
import ems.model.Employee;

public class EmployeeService 
{
	List<Employee> employeeList = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);
	EmployeeDao edao = new EmployeeDao();

	public void addEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
		//employeeList.add(employee);
		edao.addEmployee(employee);
		
	}

	public List<Employee> displayEmployee() 
	{
		// TODO Auto-generated method stub
		/*
		System.out.println("The employee list is: ");
		for (int i=0; i<employeeList.size();i++)
			System.out.println(employeeList.get(i));
		*/
		return edao.getAllEmployees();
		
	}

	public void updateEmployee(int id) 
	{
		// TODO Auto-generated method stub
		employeeList = edao.getAllEmployees();
		boolean exist = false; // check whether the employee id is in the list
		for (Employee emp:employeeList)
		{
			if (emp.getEmpId() == id)
			{
				exist = true;
				char ch = 'y';
				while (ch == 'y')
				{
					System.out.println("Enter the choice: ");
					System.out.println("1. update employee id ");
					System.out.println("2. update name");
					System.out.println("3. update phone number");
					System.out.println("4. update location");
					System.out.println("5. update salary");
					
					int choice = sc.nextInt();
					
					
					switch(choice)
					{
					case 1:
						System.out.println("Enter employee id: ");
						int empId = sc.nextInt();
						//emp.setEmpId(empId);
						edao.updateEmployee(id, empId);
						break;
					case 2:
						System.out.println("Enter employee name: ");
						String name = sc.next();
						//emp.setEmpName(name);
						edao.updateEmployee(choice,id,name);
						break;
					case 3:
						System.out.println("Enter phone number: ");
						long phone = sc.nextLong();
						//emp.setPhoneNo(phone);
						edao.updateEmployee(id, phone);
						break;
					case 4:
						System.out.println("Enter location: ");
						String location = sc.next();
						//emp.setLocation(location);
						edao.updateEmployee(choice, id, location);
						break;
					case 5:
						System.out.println("Enter salary: ");
						double salary = sc.nextDouble();
						//emp.setSalary(salary);
						edao.updateEmployee(id,salary);
						break;
					default:
						System.out.println("Please enter a number between 1 and 5");
						break;
					}
					
					
					System.out.println("do you want to continue updating? (y/n)");
					ch = sc.next().toLowerCase().charAt(0);
				}
				
			}
		}
		
		if (exist == false)
		{
			System.out.println("The employee id is not in the list");
			System.out.println("Employee id in the lists are: ");
			for(Employee emp : employeeList)
				System.out.println(emp.getEmpId());
		}
		
		System.out.println("return to the main menu");
		
	}

	public void deleteEmployee(int id) 
	{
		// TODO Auto-generated method stub
		/*
		boolean exist = false;
		for (int i=0; i<employeeList.size(); i++)
		{
			if (employeeList.get(i).getEmpId() == id)
			{
				exist = true;
				employeeList.remove(i);
				System.out.println("employee is removed");
			}
		}
		
		if (exist == false)
		{
			System.out.println("The employee id is not in the list");
			System.out.println("Employee id in the lists are: ");
			for(Employee emp : employeeList)
				System.out.println(emp.getEmpId());
		}
		*/
		edao.deleteEmployee(id);
		
	}
	
	
	
}
