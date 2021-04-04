package demo;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a - addition");
		System.out.println("s - substraction");
		System.out.println("m - multiplication");
		System.out.println("d - division");
		
		
		char c = 'n';
		
		do
		{
			System.out.println("Enter the choice");
			char ch = sc.next().charAt(0);
			System.out.println("Enter the value of a");
			int a = sc.nextInt();
			System.out.println("Enter the value of b");
			int b = sc.nextInt();
			
			switch(ch)
			{
			case 'a':
				System.out.println("addition of two numbers is: " +(a + b));
				break;
			case 's':
				System.out.println("substraction of two numbers is: " + (a - b));
				break;
			case 'd':
				System.out.println("division of two numbers is: " + (a / b));
				break;
			case 'm':
				System.out.println("multiplication of two numbers is: " + (a * b));
				break;
			default :
				System.out.println("no match found");
				
			}
			
			System.out.println("do you want to continue(y-yes/n-no)");
			c = sc.next().charAt(0);
		}while(c == 'y');
		
		
		System.out.println("after switch");
	}

}
