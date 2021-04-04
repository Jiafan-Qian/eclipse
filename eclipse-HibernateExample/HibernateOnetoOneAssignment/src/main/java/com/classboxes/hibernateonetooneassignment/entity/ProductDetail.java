package com.classboxes.hibernateonetooneassignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_detail")
public class ProductDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productDetails_id")
	private int productDetails_id;
	
	@Column(name = "productDescription")
	private String productDescription;
	
	@Column(name = "quantity")
	private int quantity;

	public ProductDetail() {
		super();
	}

	public ProductDetail(String productDescription, int quantity) {
		super();
		this.productDescription = productDescription;
		this.quantity = quantity;
	}

	public int getProductDetails_id() {
		return productDetails_id;
	}

	public void setProductDetails_id(int productDetails_id) {
		this.productDetails_id = productDetails_id;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductDetail [productDetails_id=" + productDetails_id + ", productDescription=" + productDescription
				+ ", quantity=" + quantity + "]";
	}
	
	

}
