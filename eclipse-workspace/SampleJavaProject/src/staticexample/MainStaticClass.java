package staticexample;

public class MainStaticClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		*/
		//above code can be replaced using array
		Employee[] empArray = new Employee[5]; // array is created
		for(int i=0; i<empArray.length; i++)
		{
			empArray[i] = new Employee(); // creates the objects inside the array
		}
		for(int i=0; i<empArray.length; i++)
		{
			System.out.println(empArray[i]);
		}
		
		empArray[0].display();
		for (int i=0; i<empArray.length; i++)
		{
			System.out.println(empArray[0].companyName.hashCode());
		}
		
		//creating an object for nested class
		Outer.Inner oi = new Outer.Inner();
		oi.display();
		
	}

}
