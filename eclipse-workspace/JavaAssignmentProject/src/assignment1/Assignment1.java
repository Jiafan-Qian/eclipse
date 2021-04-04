package assignment1;

import java.util.Scanner;

/**
 * 
 * @author Jiafan
 *
 */


public class Assignment1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//1.
		/*
		System.out.println("Question 1: ");
		System.out.println("Hello");
		System.out.println("Jiafan");
		*/
		
		//2.
		/*
		System.out.println("Question 2: ");
		int division = 50 / 3;
		System.out.println(division);
		*/
		
		//3.
		/*
		System.out.println("Question 3: ");
		System.out.println(74 + 36);
		*/
		
		//4.
		/*
		System.out.println("Question 4: ");
		System.out.println(8 * 6 - 5);
		System.out.println((55+9) % 9);
		System.out.println(20 - 3*5/8);
		System.out.println(5 + 15/3*2 - 8%3);
		*/
		
		//5.
		/*
		System.out.println("Question 5: ");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input first number: ");
		int firstNumber = scan.nextInt();
		System.out.print("Input second number: ");
		int secondNumber = scan.nextInt();
		
		System.out.println(firstNumber * secondNumber);
		
		scan.close();
		*/
		
		//6.
		/*
		System.out.println("Question 6: ");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input first number: ");
		int firstNumber = scan.nextInt();
		System.out.print("Input second number: ");
		int secondNumber = scan.nextInt();
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));
		System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber-secondNumber));
		System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber*secondNumber));
		System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber/secondNumber));
		System.out.println(firstNumber + " mod " + secondNumber + " = " + (firstNumber%secondNumber));
		
		scan.close();
		*/
		
		//7.
		/*
		System.out.println("Question 7: ");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number: ");
		int number = scan.nextInt();
		
		for (int i = 1; i<11; i++)
		{
			System.out.println(number + " x " + i + " = " + (number*i));
		}
		
		scan.close();
		*/
		
		//8.
		/*
		System.out.println("Question 8: ");
		System.out.println("   J    a   v     v  a");
		System.out.println("   J   a a   v   v  a a");
		System.out.println("J  J  aaaaa   V V  aaaaa");
		System.out.println(" JJ  a     a   V  a     a");
		*/
		
		//9.
		/*
		System.out.println("Question 9: ");
		double expression = (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5);
		System.out.println(expression);
		*/
		
		//10.
		/*
		System.out.println("Question 10: ");
		double formula = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println(formula);
		*/
		
		//11.
		/*
		System.out.println("Question 11: ");
		
		double Radius = 7.5;
		System.out.println("Perimeter is " + (2*Math.PI*Radius));
		System.out.println("Area is " + (Math.PI*Math.pow(Radius, 2)));
		*/
		
		//12.
		/*
		System.out.println("Question 12: ");
		
		//create array
		double[] array = new double[5];
		
		double sum = 0; //used to store the sum of array
		
		//input numbers
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<array.length; i++)
		{
			System.out.print("Input a number: ");
			array[i] = scan.nextDouble();
			sum = sum + array[i];
		}
		
		//calculate mean
		double mean = sum/array.length;
		
		System.out.println("the average of the numbers: " + mean);
		
		scan.close();
		*/
		
		//13.
		/*
		System.out.println("Question 13: ");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of sides on the polygon: ");
		int n = scan.nextInt();
		System.out.print("Input the length of one of the sides: ");
		double s = scan.nextDouble();
		scan.close();
		
		double p = 10;
		double area = (n + Math.pow(s, 2)) / (4 * Math.tan(p/n));
		
		System.out.println("Area is: " + area);
		*/
		
		//14.
		/*
		System.out.println("Question 14: ");
		
		// create an array
		double[] array = new double[5];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<array.length; i++)
		{
			System.out.print("Input a number: ");
			array[i] = scan.nextDouble();
		}
		
		double[] sortedArray = new double[array.length]; // sort array in ascending order
		
		int[] sorted = new int[array.length]; // check whether the element is sorted or not
		
		//sorted array: 0 - not sorted 	1 - sorted
		for (int i = 0; i<sorted.length; i++)
		{
			sorted[i] = 0;
		}
		
		// find the smallest value
		double smallest = array[0];
		int index = 0; //index of the smallest value in the array
		for (int i = 1; i< array.length; i++)
		{
			if (array[i] < smallest)
			{
				smallest = array[i];
				index = i;
			}
		}
		
		//put the smallest value in the sorted array & update the sorted array
		sortedArray[0] = smallest;
		sorted[index] = 1;
		
		//sort the rest elements
		for (int i = 1; i<sortedArray.length; i++)
		{
			//check identical values
			for (int j = 0; j < array.length; j++)
			{
				if ((sorted[j] == 0) && (array[j] == sortedArray[i-1]))
				{
					sortedArray[i] = array[j];
					sorted[j] = 1;
					i++;
				}
			}
			
			// used to check if all the elements in the array are the same
			if (i == sortedArray.length)
			{
				break;
			}
			
			smallest = 999999999;
			for (int j = 0; j < array.length; j++)
			{
				if ((sorted[j] == 0) && (array[j] > sortedArray[i-1]) && (array[j] < smallest) )
				{
					smallest = array[j];
					index = j;
				}
			}
			sortedArray[i] = smallest;
			sorted[index] = 1;
			
		}
		
		System.out.println("Sorted array is: ");
		for (int i = 0; i < sortedArray.length; i++)
		{
			System.out.print(sortedArray[i] + " ");
		}
		
		scan.close();
		*/
		
		//15.
		/*
		System.out.println("Question 15: ");
		
		Scanner scan = new Scanner(System.in);
		
		// create an array
		double[] array = new double[5];
		for (int i = 0; i< array.length; i++)
		{
			System.out.print("Input a number in array : ");
			array[i] = scan.nextDouble();
		}
		
		// give a specific value
		System.out.print("Give a specific number: ");
		double number = scan.nextDouble();
		
		//check whether the array contains value
		boolean contain = false;
		for (int i = 0; i<array.length; i++)
		{
			if (array[i] == number)
			{
				contain = true;
				break;
			}
		}
		
		System.out.println(contain);
		
		scan.close();
		*/
		
		//16. 
		/*
		System.out.println("Question 16: ");
		
		// create two arrays of float
		float[] array1 = new float[4];
		float[] array2 = new float[2];
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array1.length; i++)
		{
			System.out.print("Input number in first array: ");
			array1[i] = scan.nextFloat();
		}
		
		for (int i = 0; i < array2.length; i++)
		{
			System.out.print("Input number in second array: ");
			array2[i] = scan.nextFloat();
		}
		scan.close();
		
		//check for common values
		System.out.println("common values are: ");
		if (array2.length < array1.length)
		{
			for (int i = 0; i < array2.length; i++)
			{
				for (int j = 0; j < array1.length; j++)
				{
					if (array2[i] == array1[j])
					{
						System.out.println(array2[i]);
						break;
					}
				}
			}
		}
		else
		{
			for (int i = 0; i < array1.length; i++)
			{
				for (int j = 0; j < array2.length; j++)
				{
					if (array1[i] == array2[j])
					{
						System.out.println(array1[i]);
						break;
					}
				}
			}
		}
		
		*/
		
		//17.
		/*
		System.out.println("Question 17: ");
		
		// create an array
		double[] array = new double[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i<array.length; i++)
		{
			System.out.print("Input a number: ");
			array[i] = scan.nextDouble();
		}
		
		scan.close();
		//find the smallest value
		double smallest = array[0];
		for (int i = 1; i<array.length; i++)
		{
			if (array[i] < smallest)
			{
				smallest = array[i];
			}
		}
		
		// find the second smallest
		double secondSmallest = 999999999;
		for (int i = 0; i<array.length; i++)
		{
			if ((array[i] > smallest) && array[i] < secondSmallest)
			{
				secondSmallest = array[i];
			}
		}
		
		System.out.println("The second smallest number is: " + secondSmallest);
		*/
		
		//18.
		/*
		System.out.println("Question 18: ");
		
		// create an integer array
		int[] array = new int[5];
		
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<array.length; i++)
		{
			System.out.print("Input a number: ");
			array[i] = scan.nextInt();
		}
		
		scan.close();
		
		int countEven = 0;
		int countOdd = 0;
		
		// find the number of even and odd integers
		for (int i=0; i<array.length;i++)
		{
			// if even number
			if (array[i] % 2 == 0)
			{
				countEven++;
			}
			else
			{
				countOdd++;
			}
		}
		
		System.out.println("Number of even integer: " + countEven);
		System.out.println("Number of odd integer: " + countOdd);
		*/
		
		//19.
		/*
		System.out.println("Question 19: ");
		
		// create an array
		double[] array = new double[5];
				
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<array.length; i++)
		{
			System.out.print("Input a number: ");
			array[i] = scan.nextDouble();
		}
				
		scan.close();
		
		boolean contain65 = false;
		boolean contain77 = false;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 65)
			{
				contain65 = true;
			}
			else if (array[i] == 77)
			{
				contain77 = true;
			}	
		}
		
		if ((contain65 == true) && (contain77 == true))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		*/
		
		//20.
		/*
		System.out.println("Question 20: ");
		
		// create an array
		double[] array = new double[7];
				
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<array.length; i++)
		{
			System.out.print("Input a number: ");
			array[i] = scan.nextDouble();
		}
				
		scan.close();
		
		double[] distinctArray = new double[array.length]; // store distinct values
		distinctArray[0] = array[0];
		int count = 1; // number of distinctArray
		
		for (int i = 1; i < array.length; i++)
		{
			boolean duplicate = false;
			
			// check whether is duplicate or not
			for (int j = 0; j < count; j++)
			{
				if (array[i] == distinctArray[j])
				{
					duplicate = true;
					break;
				}
			}
			
			if (duplicate == false)
			{
				distinctArray[count] = array[i];
				count++;
			}
		}
		
		System.out.println("length after removing duplicate elements: " + count);
		*/
		
	}
	

}
