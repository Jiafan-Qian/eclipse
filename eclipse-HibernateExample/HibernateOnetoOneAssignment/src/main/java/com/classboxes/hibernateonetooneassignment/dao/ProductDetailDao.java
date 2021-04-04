package com.classboxes.hibernateonetooneassignment.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.classboxes.hibernateonetooneassignment.entity.ProductDetail;
import com.classboxes.hibernateonetooneassignment.util.HibernateUtil;

public class ProductDetailDao {
	
	Transaction transaction = null;
	
	public void saveProductDetail(ProductDetail productDetail)
	{
		try(Session session= HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.save(productDetail);
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
