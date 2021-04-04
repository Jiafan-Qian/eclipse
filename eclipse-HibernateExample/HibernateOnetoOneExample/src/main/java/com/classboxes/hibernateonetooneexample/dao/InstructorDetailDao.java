package com.classboxes.hibernateonetooneexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.classboxes.hibernateonetooneexample.entity.InstructorDetail;
import com.classboxes.hibernateonetooneexample.util.HibernateUtil;

public class InstructorDetailDao {
	
	Transaction transaction = null;
	
	public void saveInstructorDetail(InstructorDetail instructorDetail)
	{
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.save(instructorDetail);
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}
	
	public void updateInstructorDetail(InstructorDetail instructorDetail)
	{
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.update(instructorDetail);
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}
	
	public InstructorDetail getInstructorDetail(int id)
	{
		InstructorDetail instructorDetail = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			instructorDetail = session.get(InstructorDetail.class, id);
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		return instructorDetail;
	}
}
