package com.classboxes.hibernateonetooneassignment;

import java.util.Scanner;

import com.classboxes.hibernateonetooneassignment.dao.ProductDao;
import com.classboxes.hibernateonetooneassignment.entity.Product;
import com.classboxes.hibernateonetooneassignment.entity.ProductDetail;

public class MainApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		// save the product
		System.out.println("Enter the values of Product");
		System.out.println("Enter the ProductName");
		String productName = sc.next();
		System.out.println("Enter the Product price");
		float price = sc.nextFloat();
		Product product = new Product(productName,price);
		
		System.out.println("Enter the Product description");
		String productDescription = sc.next();
		System.out.println("Enter the Product quantity");
		int quantity = sc.nextInt();
		ProductDetail productDetail = new ProductDetail(productDescription, quantity);
		
		product.setProdtls(productDetail);
		*/
		ProductDao productDao =new ProductDao();
		//productDao.saveProduct(product);
		
		/*
		//get the product
		System.out.println("Enter the id of the product");
		int productId = sc.nextInt();
		Product product = productDao.getProduct(productId);
		if (product != null)
		{
			System.out.println("product found");
			System.out.println("Details of the product is");
			System.out.println("name of the product " + product.getProductName());
		}
		*/
		
		//update the product
		System.out.println("Enter the values of Product");
		System.out.println("Enter the Product id");
		int productId = sc.nextInt();
		System.out.println("Enter the ProductName");
		String productName = sc.next();
		System.out.println("Enter the Product price");
		float price = sc.nextFloat();
		Product product = new Product(productId,productName,price);
		Product updatedProduct = productDao.updateProduct(product);
		System.out.println(updatedProduct);

	}

}
