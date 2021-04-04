package com.classboxes.hibernateonetooneassignment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	private int productId;
	
	@Column(name = "productName")
	private String productName;
	
	@Column(name = "price")
	private float price;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productDetails_id")
	private ProductDetail prodtls;

	public Product() {
		super();
	}

	public Product(String productName, float price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	

	public Product(int productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public ProductDetail getProdtls() {
		return prodtls;
	}

	public void setProdtls(ProductDetail prodtls) {
		this.prodtls = prodtls;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", prodtls="
				+ prodtls + "]";
	}
	
	

}
