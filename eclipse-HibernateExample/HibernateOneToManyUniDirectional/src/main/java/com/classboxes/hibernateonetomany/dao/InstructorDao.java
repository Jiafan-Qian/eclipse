package com.classboxes.hibernateonetomany.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.classboxes.hibernateonetomany.entity.Instructor;
import com.classboxes.hibernateonetomany.util.HibernateUtility;
import com.classboxes.hibernateonetomany.util.HibernateUtil;

public class InstructorDao {

	public void saveInstructor(Instructor instructor)
	{
		Transaction transaction = null;
		
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			//start the transaction
			transaction = session.beginTransaction();
			
			//save the instructor object
			session.save(instructor);
			
			//commit transaction
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}
	
	
	public Instructor getInstructor(int id)
	{
		Transaction transaction = null;
		Instructor instructor = null; //instructor reference variable
		
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			instructor = session.get(Instructor.class, id);
			transaction.commit();
			
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		
		return instructor;
		
	}

}
