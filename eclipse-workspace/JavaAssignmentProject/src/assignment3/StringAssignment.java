package assignment3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringAssignment {

	// function for Question 1
	// s2 is used for displaying answers
	static void permutation(String s1, String s2)
	{
		//base case
		if (s1.length() == 0)
		{
			System.out.print(s2 + " ");
		}
		else
		{
			//used to check which alphabet('a' - 'z') is used already
			boolean[] alphabet = new boolean[26]; 
			
			for (int i=0; i<s1.length(); i++)
			{
				char c = s1.charAt(i); //let the ith character of s1 be the first character of s2
				
				
				// keep going if the alphabet is not used before is not used before
				if (alphabet[Character.toLowerCase(c) - 'a'] == false)
				{
					//rest part of s1
					String rest = s1.substring(0,i) + s1.substring(i+1);
					permutation(rest, s2+c);
				}
					
				// update the boolean array
				alphabet[Character.toLowerCase(c) - 'a'] = true;
			}
		}
			
			
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("Question 1: ");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = scan.next();
		scan.close();
		
		System.out.println("All the permutations are: ");
		
		permutation(str,"");
		
		
		/*
		System.out.println("Question 2: ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = scan.nextLine();
		scan.close();
		
		String s = str; // used for removing duplicates
		for (int i = 0; i<str.length();i++)
		{
			char c = str.charAt(i);
			
			//ignore empty space
			if (c != " ".charAt(0))
			{
				int count = 0; // count the frequency
				for (int j = 0; j<s.length(); j++)
				{
					if (s.charAt(j) == c)
						count++;
					
					if (count > 1)
					{
						char none = 0; // character 0 means ""(null)
						s = s.replace(c,none);
						break;
					}
						
				}
			}
		}
		
		System.out.println("string after removing duplicate is: " + s);
		*/
		
		/*
		System.out.println("Question 3: ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first string: ");
		String str1 = scan.nextLine();
		System.out.println("Input second string: ");
		String str2 = scan.nextLine();
		System.out.println("Input third string: ");
		String str3 = scan.nextLine();
		scan.close();
		
		if (str3.length() != (str1.length() + str2.length()))
			System.out.print("not a valid shuffle");
		else
		{
			String comb = str1 + str2;
			char[] combChArr = comb.toCharArray();
			char[] str3ChArr = str3.toCharArray();
			
			Arrays.sort(combChArr);
			Arrays.sort(str3ChArr);
			
			String newComb = new String(combChArr);
			String newStr3 = new String(str3ChArr);
			
			if (newComb.compareTo(newStr3) == 0)
				System.out.println("a valid shuffle");
			else
				System.out.println("not a valid shuffle");
		}
		*/
		
		/*
		System.out.println("Question 4: ");
		
		System.out.println("Input a string: ");
		Scanner scan =  new Scanner(System.in);
		
		String s = scan.nextLine();// first word in the string 
		
		scan.close();
		
		String[] strArr = s.split(" ");
		
		String longest = "";
		int len = 0;
		
		for (int i = 0; i< strArr.length;i++)
		{
			if (strArr[i].length() > len)
			{
				len = strArr[i].length();
				longest = strArr[i];
			}
		}
		
		System.out.println("the longest substring is: " + longest);
		*/
		
		/*
		System.out.println("Question 5: ");
		
		System.out.println("Input a string: ");
		Scanner scan =  new Scanner(System.in);
		
		String s = scan.nextLine();// first word in the string 
		
		scan.close();
		
		String[] strArr = s.split(" ");
		String reverseStr = "";
		
		//reverse each word
		for (int i = 0; i<strArr.length; i++)
		{
			String word = strArr[i];
			String reverseWord = "";
			for (int j = 0; j<word.length();j++)
			{
				reverseWord += word.substring(word.length()-j-1, word.length()-j);
			}
			
			reverseStr += reverseWord;
			if (i < strArr.length-1)
				reverseStr += " ";
		}

		
		System.out.println("after reversing each word: " + reverseStr);
		*/
		
		/*
		System.out.println("Question 6: ");
		
		System.out.println("Input a string: ");
		Scanner scan =  new Scanner(System.in);
		
		String s = scan.nextLine();// first word in the string 
		
		scan.close();
		
		String[] strArr = s.split(" ");
		
		String[] distinctStr = new String[strArr.length]; //string with no replicate words
		int n = 0; // number of the repeated word
		
		System.out.println("repeated words: ");
		for (int i = 0; i< strArr.length;i++)
		{
			int count = 0; // count frequency 
			String word = strArr[i];
				
			boolean checkedBefore = false; // check whether the current word is detected before
			for (int j = 0; j < n; j++)
			{
				if (word.compareTo(distinctStr[j]) == 0)
				{
					checkedBefore = true;
					break;
				}
				
			}
			if (checkedBefore == true)
				continue;
			
			
			for (int j = 0; j<strArr.length; j++)
			{
				if (word.compareTo(strArr[j]) == 0)
					count++;
			}
			if (count > 1)
			{
				distinctStr[n] = word;
				n++;
				System.out.println(word + " - " + count);
			}
			
		}
		
		if (n == 0)
			System.out.print("no repeated words");
		*/
		
		/*
		System.out.println("Question 7: ");
		
		System.out.println("Input a string: ");
		Scanner scan =  new Scanner(System.in);
		
		String s = scan.nextLine();// first word in the string 
		
		scan.close();
		
		String[] strArr = s.split(", ");
		for (int i = 0; i<strArr.length;i++)
		{
			System.out.println(strArr[i]);
		}
		*/
		
		/*
		System.out.println("Question 8: ");
		
		System.out.println("Input a string: ");
		Scanner scan =  new Scanner(System.in);
		
		String s = scan.nextLine();// first word in the string 
		
		scan.close();
	
		String modified_s = s.replaceAll("[aeiouAEIOU]", "*");
		
		System.out.println(modified_s);
		*/
		
		/*
		System.out.println("Question 9: ");
		
		System.out.println("Input a string: ");
		Scanner scan =  new Scanner(System.in);
		
		String s = scan.nextLine();// first word in the string 
		
		scan.close();
		
		String sLowerCase = s.toLowerCase();
		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i<sb.length();i++)
		{
			char c = Character.toLowerCase(sb.charAt(i));
			if ((c != 'a') && (c != 'e') && (c != 'i') && (c != 'o') && (c != 'u') && (c != ' '))
				sb.setCharAt(i, '$');
		}
		System.out.println(sb);
		*/
		
		/*
		System.out.println("Question 10: ");
		
		System.out.println("Input a string: ");
		Scanner scan =  new Scanner(System.in);
		
		String s = scan.nextLine().toLowerCase();// first word in the string 
		
		scan.close();
		
		int countVowel = 0;
		int countDigit = 0;
		
		for (int i = 0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'))
				countVowel++;
			
			if (Character.isDigit(c) == true)
				countDigit++;
		}
		
		float percentVowel = ((float)countVowel)/s.length() * 100;
		float percentDigit = ((float)countDigit)/s.length() * 100;
		
		System.out.format("Number of vowels: %d (%.2f%%)\n", countVowel, percentVowel);
		System.out.format("Number of digits: %d (%.2f%%)\n", countDigit, percentDigit);
		*/
		
		/*
		System.out.println("Question 11: ");
		
		System.out.println("Enter a plain test string: ");
		Scanner scan =  new Scanner(System.in);
		
		String s = scan.next().toUpperCase();// first word in the string 
		
		scan.close();
		
		char[] chArr = s.toCharArray();
		for (int i = 0; i<chArr.length;i++)
		{
			if (chArr[i] == 'X')
				chArr[i] = 'A';
			else if (chArr[i] == 'Y')
				chArr[i] = 'B';
			else if (chArr[i] == 'Z')
				chArr[i] = 'C';
			else
				chArr[i] = (char) (chArr[i] + 3);
		}
		
		String ciperS = new String(chArr);
		System.out.println("The ciphertext string is: " + ciperS);
		*/
		
	}

}
