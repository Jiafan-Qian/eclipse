package collectionsdemo;

import java.util.HashSet;

//HashSet is a class which extends AbstractSet and implements Set interface
public class SetExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		HashSet<String> animals = new HashSet<String>();
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Calf");
		animals.add("Camel");
		animals.add("Cat");
		
		System.out.println(animals);

		
		HashSet<String> birds = new HashSet<String>();
		birds.add("Parrot");
		birds.add("Crow");
		birds.add("Pigeon");
		birds.add("OWL");
		birds.add("KingFisher");
		
		animals.addAll(birds);
		System.out.println(animals);
		System.out.println("After remove OWL: ");
		animals.remove("OWL");
		System.out.println(animals);
		
		
	}

}
