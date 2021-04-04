package lambdaexpressions;

public class AddLambdaExpression {

	public static void main(String...a) 
	{
		// TODO Auto-generated method stub
		
		//anonymous class
		Add ad = new Add()
				{

					@Override
					public int add(int a1, int b1) 
					{
						// TODO Auto-generated method stub
						System.out.println("Adding two numbers without lambda expression");
						return(a1+b1);
						
					}
			
				};
		
		int res = ad.add(5,15);
		System.out.println(res);
		
		//with lambda expressions
		
		Add adLambda = (int a1, int b1) ->
		{
			System.out.println("Adding two numbers with lambda expression");
			return(a1+b1);
			
		};
		int res1 = adLambda.add(5,6);
		System.out.println(res1);
		

	}

}
