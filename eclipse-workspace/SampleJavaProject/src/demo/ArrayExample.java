package demo;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] age = new int[5];
		
		double[] salary = new double[5];
		
		int j = 1;
		
		// declaring the scanner variable to read the data from keyboard
		Scanner sc = new Scanner(System.in);
		
		//without for loop
		age[0] = 34;
		age[1] = 35;
		age[2] = 30;
		age[3] = 41;
		age[4] = 45;
		
		// to execute the same code more than once we will use for the loop
		for (int i = 0; i < age.length; i++)
		{
			System.out.println("Enter the age of " + i);
			age[i] = sc.nextInt();
			j++; // increment operator which increments the value of j by 1
		}
		
		for (int i = 0; i < age.length; i++)
		{
			System.out.println(age[i]);
		}
		
		// to execute the same code more than once we will use for the loop
		for (int i = 0; i < age.length; i++)
		{
			System.out.println("Enter the age of " + i);
			salary[i] = sc.nextDouble();				
			j++; // increment operator which increments the value of j by 1
		}
		
		for (int i = 0; i < age.length; i++)
		{
			System.out.println(salary[i]);
		}
		
	}

}
