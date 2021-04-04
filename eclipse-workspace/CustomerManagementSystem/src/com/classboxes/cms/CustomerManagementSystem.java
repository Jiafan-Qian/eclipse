package com.classboxes.cms;

import java.util.Scanner;

import com.classboxes.cms.controller.CustomerController;

public class CustomerManagementSystem {
	
	public static void main(String[] args)
	{
		//TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		CustomerController cc = new CustomerController();
		char ch = 'y';
		while (ch == 'y')
		{
			System.out.println("Enter the choice: ");
			System.out.println("1. Add Customer ");
			System.out.println("2. Update Customer ");
			System.out.println("3. Delete Customer ");
			System.out.println("4. Display List of Customer ");
			int choice = sc.nextInt();
		
			switch(choice)
			{
			case 1:
				cc.addCustomer();
				break;
			
			case 2:
				cc.updateCustomer();
				break;
			case 3:
				cc.deleteCustomer();
				break;
				
			case 4:
				cc.customersDisplay();
				break;
				
			default:
				
			}
			System.out.println("do you want to continue?(y/n)");
			ch = sc.next().charAt(0);
		}
		
		
	}
		

}
