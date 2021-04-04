package com.classboxes.hibernateonetooneassignment.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.classboxes.hibernateonetooneassignment.entity.Product;
import com.classboxes.hibernateonetooneassignment.util.HibernateUtil;

public class ProductDao {
	
	public void saveProduct(Product product)
	{
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.save(product);
			transaction.commit();
		}
		catch (Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}
	
	public Product getProduct(int id)
	{
		Transaction transaction = null;
		Product product = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			product = session.get(Product.class, id);
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		return product;
	}

	public Product updateProduct(Product product)
	{
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.update(product);
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		
		return product;
	}
	
}
