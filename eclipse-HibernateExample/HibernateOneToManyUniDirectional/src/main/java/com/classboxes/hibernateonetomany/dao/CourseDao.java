package com.classboxes.hibernateonetomany.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.classboxes.hibernateonetomany.entity.Course;
import com.classboxes.hibernateonetomany.util.HibernateUtility;

public class CourseDao {
	
	public void saveCourse(Course course)
	{
		Transaction transaction = null;
		
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			//start the transaction
			transaction = session.beginTransaction();
			
			//save the instructor object
			session.save(course);
			
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

}
