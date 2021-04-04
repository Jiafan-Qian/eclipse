package assignment2;

public class Assignment2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		Student s = new Student("Jiafan","2980 Euclid Ave Apt A07");
		s.addCourseGrade("CSCI", 100);
		s.addCourseGrade("APPM", 99);
		
		double average = s.getAverageGrade();
		System.out.println(average);
		
		Teacher t = new Teacher("Swapni", "New Jersey");
		System.out.println(t.toString());
	}

}
