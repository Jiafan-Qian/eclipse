package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("niha");
		names.add("neha");
		names.add("niva");
		System.out.println(names);
		for (int i=0; i<names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		names.remove(2);
		System.out.println("after remove\n\n");
		for (String name : names)
			System.out.println(name);
		
		ArrayList<String> names1 = new ArrayList<String>();
		names.add("niha1");
		names.add("neha1");
		names.add("niva1");
		
		names.addAll(names1);
		
		System.out.println("\n\n");
		System.out.println("after adding a collection using addAll \n\n");
		for (String name : names)
			System.out.println(name);
		
		System.out.println(names.contains("niha"));
		System.out.println(names.isEmpty());
		System.out.println(names.indexOf("niha1"));
		
		/*
		Object[] arr =  names.toArray();
		for (int i=0; i< arr.length; i++)
			System.out.println(arr[i]);
		*/
		/*
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("United States");
		countries.add("China");
		countries.add("India");
		countries.add("Russia");
		countries.add("Germany");
		countries.add("Italy");
		
		for (int i = 0; i<countries.size(); i++)
			System.out.println(countries.get(i));
		*/
		
		ArrayList<String> name1 = new ArrayList<String>();
		System.out.println("for name1 list: ");
		name1.add("niha1");
		name1.add("neha1");
		name1.add("niva1");
		
		name1.forEach(
				
				(name) -> System.out.println(name)
				);
		
		Collections.sort(name1); //String objects, Wrapper class objects, user-defined class objects
		System.out.println(name1);
		
		
		
	}

}
