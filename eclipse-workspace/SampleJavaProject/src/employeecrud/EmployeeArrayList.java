package employeecrud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class EmployeeArrayList
{
	
	static ArrayList<Employee> empList = new ArrayList<Employee>();
	
	public EmployeeArrayList()
	{
		//TODO Auto-generated constructor stub
	}
	
	public static void main(String...args)
	{
		Employee empOne = new Employee(123, "Tony",23456.78f,3);
		Employee empTwo = new Employee(124, "Tania",13456.78f,1);
		Employee empThree = new Employee(133, "Tina",33456.78f,4);
		Employee empFour = new Employee(143, "Tintu",20456.78f,2);
		
		empList.add(empOne);
		empList.add(empTwo);
		empList.add(empThree);
		empList.add(empFour);
		
		for (Employee e:empList)
			System.out.println(e);
		
		Iterator<Employee> itr = empList.iterator();
		System.out.println("Iterating over the collection using the iterator() method ");
		System.out.println("List of employees are \n");
		System.out.println("======================\n");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			int empId = itr.next().getEmpId();
			if (empId == 123)
				itr.remove();
		}
		
		
		ListIterator<Employee> litr = empList.listIterator();
		System.out.println("Iterating over the collection using the listiterator() method ");
		System.out.println("List of employees are \n");
		
		while(litr.hasNext())
			System.out.println(litr.next());
		
		
		System.out.println("Iterating over the collection in reverse using the listiterator() method ");
		System.out.println("ReverseList of employees are \n");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		
		
		//filtering the data using forEach and filter method in Java 8
		
		Stream<Employee> filtered_data = empList.stream().filter(emp -> emp.getEmpSalary() < 20000);
		
		filtered_data.forEach(emp -> System.out.println(emp.getEmpName()));
		
		// sorting the objects of employees using the Collections.sort() method
		Collections.sort(empList);
		//sorting of user defined objects can be done using
		//compareable or cpmparator
		
		System.out.println("after sorting the list using comparable interface");
		System.out.println(empList);
		for (Employee e1 : empList)
			System.out.println(e1.getEmpName() + "\t" + e1.getEmpSalary());
		
		System.out.println();
		//sorting the employees based on salary
		Collections.sort(empList, new SalaryComparator());
		System.out.println("after sorting the list using comparator interface");
		System.out.println(empList);
		for (Employee e1 : empList)
			System.out.println(e1.getEmpName() + "\t" + e1.getEmpSalary());
		
		System.out.println();
		//sorting the employees based on salary
		Collections.sort(empList, new ExperienceComparator());
		for (Employee e1 : empList)
			System.out.println(e1.getEmpName() + "\t" + e1.getExperience());
		
		
		List<Float> salaryList = new ArrayList<Float>();
		
		for (Employee emp:empList)
		{
			//filtering the salary based on condition
			if (emp.getEmpSalary() > 20000)
				salaryList.add(emp.getEmpSalary());
		}
		
		System.out.println("Salaries greater than 20000 is : " + salaryList);
		
		//Using Stream API filtering the data on salary
		
		List<Float> filteredSalaryList = empList.stream()
												.filter(emp -> emp.getEmpSalary()>20000) //filtering the data
												.map(emp -> emp.getEmpSalary())
												.collect(Collectors.toList());
		
		System.out.println("filtered Salary List using Streams : " + filteredSalaryList);
		
		System.out.println("Maximum salary of the employee is :");
		Employee maxSalaryEmployee = empList.stream()
									   .max((emp1, emp2) -> emp1.getEmpSalary() > emp2.getEmpSalary() ? 1:-1)
									   .get();
		
		System.out.println(maxSalaryEmployee.getEmpName() + "\t" + maxSalaryEmployee.getEmpSalary());
		
		//Using String Joiner to display names of employees
		
		//StringJoiner empNames = new StringJoiner(",");
		StringJoiner empNames = new StringJoiner(",","[","]");
		
		for (int i=0; i<empList.size(); i++)
		{
			//Adding values to StringJoiner
			empNames.add(empList.get(i).getEmpName());
		}
	
		System.out.println("Employee names : " + empNames);
		
		//forEach() method in Java 8
		empList.forEach(emp -> System.out.println(emp));
		
	}

}
