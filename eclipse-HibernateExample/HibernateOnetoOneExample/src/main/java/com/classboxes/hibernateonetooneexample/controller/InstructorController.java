package com.classboxes.hibernateonetooneexample.controller;

import java.util.Scanner;

import com.classboxes.hibernateonetooneexample.dao.InstructorDao;
import com.classboxes.hibernateonetooneexample.entity.Instructor;

public class InstructorController 
{
	Scanner sc = new Scanner(System.in);
	InstructorDao instructorDao = new InstructorDao();

	public void getInstructor()
	{
		//read the id and call getInstructor(id) method
		System.out.println("Enter the id of the instructor");
		int instructorId = sc.nextInt();
		Instructor instr = instructorDao.getInstructor(instructorId);
		if (instr != null)
		{
			System.out.println("hurray!!!! Instructor found");
			System.out.println("Details of the instructor is");
			System.out.println("email of the instructor " + instr.getEmail());
		}
		else
			System.out.println("instructor not found");
	}
}
