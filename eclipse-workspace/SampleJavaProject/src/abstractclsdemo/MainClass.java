package abstractclsdemo;

public class MainClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*
		Car c = new Car(); // object of the class is created
		//Car c1 = new Car(500000);
		//Car c2 = new Car(500000, "BWF");
		
		c.drive();
		*/
		
		Simple s1 = new Simple(21,22); //this calls normal parameterized constructor
		Simple s2 = new Simple(s1); // this calls copy constructor
		
		System.out.println(s2);
	}

}
