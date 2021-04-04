package demo;

public class DataTypesExample {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		
		float length = 5.57f;
		float breadth = 6.435f;
		/*
		int area;
		short ar;
		double areA;
		
		char choice = 'a';
		boolean bool = true;
		
		area = (int) (length * breadth); // explicit type casting
		
		ar = (short) area; // explicit type casting
		areA = area; // implicit type casting
		
		System.out.println("Area of rectangle is " + area);
		
		*/
		
		if (length > breadth)
		{
			System.out.println("length is greater than breadth");
		}
		else if (length < breadth)
		{
			System.out.println("length is smaller than breadth");
		}
		else
		{
			System.out.println("");
		}
	}
}