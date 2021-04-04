package com.classboxes.hibernateonetomany;

import com.classboxes.hibernateonetomany.dao.CourseDao;
import com.classboxes.hibernateonetomany.dao.InstructorDao;
import com.classboxes.hibernateonetomany.entity.Course;
import com.classboxes.hibernateonetomany.entity.Instructor;

public class HibernateOneToManyMain {

	public static void main(String[] args)
	{
		InstructorDao idao = new InstructorDao();
		Instructor ins = new Instructor("tina","toni","tina.toni@gmail.com");
		

		//CourseDao cdao = new CourseDao();
		Course Java =new Course("Core Java8");
		ins.getCourses().add(Java);
		
		Course Java14 =new Course("Java14");
		ins.getCourses().add(Java14);
		idao.saveInstructor(ins);
		
		Instructor instr = idao.getInstructor(2);
		if (instr != null)
		{
			System.out.println("Instructor exists");
			System.out.println("Instructor email is: "+ instr.getEmail());
		}
	}
}
