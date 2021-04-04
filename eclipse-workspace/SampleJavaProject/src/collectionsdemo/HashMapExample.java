package collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String...args) 
	{
		// TODO Auto-generated method stub
		
		HashMap<String,String> countries = new HashMap<String,String>();
		
		countries.put("USA", "Washington");
		countries.put("UK", "London");
		countries.put("Japan", "Tokyo");
		countries.put("Singapore", "Singapore");
		//countries.put("USA", "NewJersey");
		System.out.println(countries);
		
		System.out.println("Iterating in the map... ");
		for (Map.Entry me : countries.entrySet())
			System.out.println(me.getKey()+ " " + me.getValue());
		
		System.out.println("");
		countries.putIfAbsent("USA1", "Washington1");
		for (Map.Entry me : countries.entrySet())
			System.out.println(me.getKey()+ " " + me.getValue());
		
		System.out.println("");
		System.out.println("after replacing...");
		countries.replace("USA1", "Delhi");
		for (Map.Entry me : countries.entrySet())
			System.out.println(me.getKey()+ " " + me.getValue());
		System.out.println("");
		
		
		
		// create an Hashmap to store bookname and author?
		HashMap<String, String> books = new HashMap<String, String>();
		books.put("HeadFirstJava","Kathey");
		books.put("The Daughter's Tale","Armando");
		books.put("Himself","Jess");
		books.put("Gorgeous Lies","Martha");
		for (Map.Entry me : books.entrySet())
			System.out.println(me.getKey() + ", " + me.getValue());
		
		System.out.println("");
		books.putIfAbsent("The Complete Stories", "Flanny");
		for (Map.Entry me : books.entrySet())
			System.out.println(me.getKey() + ", " + me.getValue());
		
		
		System.out.println("");
		books.replace("The Complete Stories", "Flannery");
		for (Map.Entry me : books.entrySet())
			System.out.println(me.getKey() + ", " + me.getValue());
		
		
	}

}
