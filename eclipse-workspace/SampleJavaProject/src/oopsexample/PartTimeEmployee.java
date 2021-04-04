package oopsexample;

public class PartTimeEmployee extends Employee{
	
	int noOfDays = 10;
	
	public void calculateSalary()
	{
		System.out.println("part time salary is " + (noOfDays * 3000));
	}
}
