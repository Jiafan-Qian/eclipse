package stringexample;

import java.util.Scanner;

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		// three ways of creating the string
		// the following line creates an empty string object
		String s = new String(); // s is the object of string class
		System.out.println(s);
		
		String city = new String("NewYork");
		System.out.println(city);
		
		// the following line creates a string reference variable
		String name = "Swapna";
		System.out.println(name);
		
		//creating a string using char array
		char[] company = {'c','l','a','s','s','b','o','x','e','s'};
		
		String comp = new String(company);
		
		System.out.println(comp);
		*/
		
		/*
		// String methods
		String str = "Universe";
		//String str = "Universe has 9 planets";
		//String str = "        Universe has 9 planets        ";
		//System.out.println(str.hashCode());
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.hashCode());
		sb.append(" has 9 planets");
		System.out.println(sb.hashCode());
		
		String newStr = sb.toString();
		
		
		StringBuilder sbl = new StringBuilder(str);
		System.out.println(sbl.hashCode());
		sbl.append(" has 9 planets");
		System.out.println(sbl.hashCode());
		
		String newStrs = sbl.toString();
		*/
		
		/*
		str = "universe";
		System.out.println(str.hashCode());
		str = "Galaxy";
		System.out.println(str.hashCode());
		*/
		/*
		char ch = str.charAt(6);
		System.out.println(ch);
		
		String substr = str.substring(3,8); // 8-3 = 5
		System.out.println(substr);
		
		int position = str.indexOf('e'); // first occurance of the given character is returned
		System.out.println("first index of 'e' is " + position);
		
		int lastPosition = str.lastIndexOf('e'); // last occurance of the given character is returned
		System.out.println("last index of 'e' is " + lastPosition);
		
		String replacedStr = str.replace('e', 'E');
		System.out.println("replaced string is: " + replacedStr);
		System.out.println("orginal string is: " + str);
		
		System.out.println(str.compareTo(replacedStr));
		System.out.println(replacedStr.compareTo(str));
		System.out.println(str.compareTo(str));
		System.out.println(str.compareToIgnoreCase(replacedStr));
		
		//lexographically the strings can be compared -> based on dictionary sort
		
		String[] words = str.split("\\s");
		for (int i =0; i< words.length; i++)
			System.out.println(words[i]);
	
		System.out.println(str.startsWith("U"));
		System.out.println(str.endsWith("i"));
		System.out.println(str.endsWith("planets"));
		System.out.println(str.endsWith("s"));
		
		System.out.println(str.concat(replacedStr));
		System.out.println(str.contains("lets"));
		
		System.out.println("length of the string is " + str.length());
		
		char[] chArr = str.toCharArray();
		for (int i = 0; i<chArr.length;i++)
			System.out.println(chArr[i]);
		
		System.out.println(str.trim().length());
		*/
		
		// program practice
		// find occurance of a character in a string
		/*
		// read inputs, make sure they are not case sensitive
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = scan.nextLine().toLowerCase();
		System.out.println("Input a character to search in the string: ");
		char c = scan.next().toLowerCase().charAt(0);
		scan.close();
		
		char[] arr = str.toCharArray(); //
		int count = 0; // count frequency
		for (int i=0; i<arr.length; i++)
		{
			if (c == arr[i])
				count++;
		}
		
		System.out.println("frequency is " + count);
		*/
		
		//check whether the substring appears in the string
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str1 = scan.nextLine().toLowerCase();
		System.out.println("Input a substring that want to check: ");
		String str2 = scan.nextLine().toLowerCase();
		scan.close();
		
		int startPosition = 0;
		int endPosition = str2.length();
		boolean match = false;
		
		while (endPosition <= str1.length())
		{
			if (str1.substring(startPosition,endPosition).compareTo(str2) == 0)
			{
				match = true;
				break;
			}
			else
			{
				startPosition++;
				endPosition++;
			}
		}
		
		
		System.out.println("substring appears in string? " + match);
		
		
	}

}