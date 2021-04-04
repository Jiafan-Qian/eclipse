package interfaceexample;

import java.util.Scanner;

public interface MathematicalOperations
{
	Scanner sc = new Scanner(System.in);
	int i=0;
	//abstract methods
	//public and abstract keywords are not necessary
	public void add();
	public void sub();
	public void mul();
	public void div();
	
	default int readValueOfA()
	{
		return sc.nextInt();
	}
	
	default int readValueOfB()
	{
		return sc.nextInt();
	}
	
}
