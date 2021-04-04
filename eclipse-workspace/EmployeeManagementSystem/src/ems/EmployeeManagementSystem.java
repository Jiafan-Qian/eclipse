package ems;

import java.util.Scanner;

import ems.controller.EmployeeController;

public class EmployeeManagementSystem {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		EmployeeController ec = new EmployeeController();
		char ch = 'y';
		
		while (ch == 'y')
		{
			System.out.println("Enter the choice: ");
			System.out.println("1. Add Employee ");
			System.out.println("2. Update Employee ");
			System.out.println("3. Delete Employee ");
			System.out.println("4. Display List of Employee");

			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				ec.addEmployee();
				break;
			case 2:
				ec.updateEmployee();
				break;
			case 3:
				ec.deleteEmployee();
				break;
			case 4:
				ec.displayEmployee();
				break;
				
			default:
				System.out.println("Please enter a number between 1 and 4\n");
				continue;
			}
			
			System.out.println("do you want to continue?(y/n)");
			ch = sc.next().toLowerCase().charAt(0);
			System.out.println("");
			
		}
		
		System.out.println("Exit");

	}

}
