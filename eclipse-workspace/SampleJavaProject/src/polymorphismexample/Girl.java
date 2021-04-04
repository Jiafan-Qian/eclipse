package polymorphismexample;

public class Girl extends Human
{
	// overriding the method of Human class(super class)
	//specific implementation of sub - class
	//instance method
	public void eat()
	{
		System.out.println("girl is eating pizza");
	}
	
	//overloading the sleep method of human with float data type
	public void sleep(float time)
	{
		System.out.println("Girl sleep at " + time);
	}
	
	//sleeping hours method is overloaded with float data type and a new parameter called day
	public void sleepingHours(int stime, int wtime, String day)
	{
		System.out.println("Girl sleepingHours on " + day + " is "+ (stime - wtime));
	}
	
}

