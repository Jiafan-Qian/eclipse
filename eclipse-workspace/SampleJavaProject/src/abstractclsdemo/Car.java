package abstractclsdemo;

public class Car extends Vehicle{

	float carPrice; //instance variable
	
	// constructor for Car class
	// default constructor
	Car()
	{
		this(450000);
		System.out.println("Car class default constructor");
	}
	
	//parameterized constructor
	Car(float price)
	{
		super();
		//this(); //this will call default constructor
		System.out.println("Parameterized Constructor");
		this.carPrice = price;
	}
	
	Car(float carPrice, String brand)
	{
		System.out.println("two Parameterized Constructor");
		this.carPrice = carPrice;
	}
	
	@Override
	void drive() {
		// TODO Auto-generated method stub
		super.about();
		System.out.println("driver using clutcn and break and steering " + super.i);
		this.licenseNo();
	}
	
	void licenseNo()
	{
		System.out.println("licenseNo is " + Math.round(Math.random()*1000));
	}

}
