package interfaceexample;

import java.util.Scanner;

public interface Shape 
{
	Scanner sc = new Scanner(System.in);
	
	public void area();
	public void perimeter();
	
	//for circle
	default int readValueOfRadius()
	{
		return sc.nextInt();
	}
	
	//for rectangle
	default int readValueOfLength()
	{
		return sc.nextInt();
	}
	
	default int readValueOfWidth()
	{
		return sc.nextInt();
	}
}
