package com.classboxes.hibernateonetooneexample;

import java.util.Scanner;

import com.classboxes.hibernateonetooneexample.controller.InstructorController;
import com.classboxes.hibernateonetooneexample.dao.InstructorDao;
import com.classboxes.hibernateonetooneexample.dao.InstructorDetailDao;
import com.classboxes.hibernateonetooneexample.entity.Instructor;
import com.classboxes.hibernateonetooneexample.entity.InstructorDetail;

public class MainApp {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		InstructorController ic = new InstructorController();
		InstructorDao instructorDao = new InstructorDao();
		InstructorDetailDao instructorDetailDao = new InstructorDetailDao();
		String fname,lname,email,wurl,hobby;
		int instructorId;
		int choice = 1;
		while (choice == 1)
		{
			System.out.println("Choose the transaction");
			System.out.println("Save");
			System.out.println("Update");
			System.out.println("Get");
			System.out.println("Delete");
			String transaction = sc.next();
			
			switch(transaction)
			{
			case "Save":
			case "save":
				System.out.println("Enter the details of Instructor");
				System.out.println("Enter the instructor website_url");
				wurl = sc.next();
				System.out.println("Enter the instructor hobby");
				hobby = sc.next();
				InstructorDetail instructorDetail = new InstructorDetail(wurl,hobby);
				
				System.out.println("Enter the values of Instructor");
				System.out.println("Enter the Instructor firstName");
				fname = sc.next();
				System.out.println("Enter the Instructor lastName");
				lname = sc.next();
				System.out.println("Enter the Instructor email");
				email = sc.next();
				Instructor instructor = new Instructor(fname,lname,email);
				instructor.setInsdtls(instructorDetail);
				instructorDao.saveInstructor(instructor);
				break;
			case "Update":
			case "update":
				System.out.println("Enter the entity to update: Instructor - 1/Instructordtls - 2");
				int ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					//code for updating the instructor details
					System.out.println("Enter the values of Instructor");
					System.out.println("Enter the Instructor id");
					int id = sc.nextInt();
					System.out.println("Enter the Instructor firstName");
					fname = sc.next();
					System.out.println("Enter the Instructor lastName");
					lname = sc.next();
					System.out.println("Enter the Instructor email");
					email = sc.next();
					Instructor instructor1 = new Instructor(id,fname,lname,email);
					Instructor updatedInstructor = new Instructor();
					updatedInstructor = instructorDao.updateInstructor(instructor1);
					System.out.println(updatedInstructor);
					break;
				case 2:
					System.out.println("Enter the details of Instructor");
					System.out.println("Enter the Instructor Details Id");
					int detailId = sc.nextInt();
					InstructorDetail found = instructorDetailDao.getInstructorDetail(detailId);
					if (found != null)
					{
						System.out.println("Enter the instructor website_url");
						wurl = sc.next();
						System.out.println("Enter the instructor hobby");
						hobby = sc.next();
						InstructorDetail instructorDetail1 = new InstructorDetail(detailId,wurl,hobby);
						instructorDetailDao.updateInstructorDetail(instructorDetail1);
					}
					else
						System.out.println("Instructor Details not found");
					break;
				}
				break;
			case "Get":
			case "get":
				ic.getInstructor();
				break;
			case "Delete":
			case "delete":
				System.out.println("Enter the id of the instructor");
				instructorId = sc.nextInt();
				instructorDao.deleteInstructor(instructorId);
				break;
			default:
				System.out.println("Enter the valid transaction");
				
			}//switch close
			
			System.out.println("Do you want to continue? press 1 for yes || press 0 for no");
			choice = sc.nextInt();
		}//while close
		
		
		
	
		
		
	}//main close
	

}//class close
