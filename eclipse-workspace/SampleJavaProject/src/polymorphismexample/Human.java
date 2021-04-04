package polymorphismexample;

public class Human 
{
	//overridden method
	//generic implementation of the method
	//instance method
	
	//final float PI;// = 3.1413f;
	public void eat()
	{
		//PI = 3.1413f;
		System.out.println("Human is eating");
	}
	
	public void sleep(int time)
	{
		System.out.println("Human sleep at " + time);
	}
	
	public void sleepingHours(int stime, int wtime)
	{
		System.out.println("Human sleepingHour is " + (stime - wtime));
	}
	
	//sleeping hours method is overloaded with float data type
	public void sleepingHours(float stime, float wtime)
	{
		System.out.println("Human sleepingHour is " + (stime - wtime));
	}
}
