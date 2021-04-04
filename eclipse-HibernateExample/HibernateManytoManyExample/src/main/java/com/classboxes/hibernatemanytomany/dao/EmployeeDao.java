package com.classboxes.hibernatemanytomany.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.classboxes.hibernatemanytomany.entity.Employee;
import com.classboxes.hibernatemanytomany.util.HibernateUtility;

public class EmployeeDao {

	public void saveEmployee(Employee employee)
	{
		Transaction transaction = null;
		
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			//start the transaction
			transaction = session.beginTransaction();
			
			//save the instructor object
			session.save(employee);
			
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
