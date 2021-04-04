package polymorphismexample;

public class MainPolymorphism {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//object of a class is created when executing/running the program 
		Girl g = new Girl();
		//as we are creating an object for the girl class
		//following line of code will call eat()
		// according to the object it is created we can easily identify
		// that this line of code will call eat() method of Girl class
		g.eat();
		
		g.sleepingHours(24, 9, "Wednsday"); // girl sleepinghours method will be called
		g.sleepingHours(12.30f, 5.30f); // human class sleepinghours method with float datatype is called
	}

}
