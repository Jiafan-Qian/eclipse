package com.classboxes.hibernateonetooneexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.classboxes.hibernateonetooneexample.entity.Instructor;
import com.classboxes.hibernateonetooneexample.util.HibernateUtil;

public class InstructorDao {
	
	public void saveInstructor(Instructor instructor)
	{
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession())
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
		
		try(Session session = HibernateUtil.getSessionFactory().openSession())
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

	public Instructor updateInstructor(Instructor instructor)
	{
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			//start the transaction
			transaction = session.beginTransaction();
			session.update(instructor);
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		
		return instructor;
	}//close of updateInstructor
	
	//delete the instructor
	public void deleteInstructor(int id)
	{
		Transaction transaction = null;
		Instructor instructor = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			instructor = session.get(Instructor.class, id);
			if (instructor != null)
			{
				session.delete(instructor);
				System.out.println("Instructor deleted");
			}
			transaction.commit();
					
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}

}//close of class
