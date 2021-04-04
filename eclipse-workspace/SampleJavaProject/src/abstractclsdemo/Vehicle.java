package abstractclsdemo;

//class having both implemented and unimplemented
//methods we call it as abstract class
//we have to define a class as abstract if it contains
//abstract methods(unimplemented methods)
public abstract class Vehicle 
{ //vehicle is a general class

	int i = 20;
	
	Vehicle()
	{
		System.out.println("super class constructor");
	}
	
	//abstract method - the method which is not having body
	abstract void drive();
	
	//methods which are common can be implemented in the abstract class
	void about()
	{
		System.out.println("about the vehicle");
	}
}
