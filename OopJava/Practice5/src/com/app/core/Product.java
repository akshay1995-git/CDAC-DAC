package com.app.core;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int product_id;
	private String product_name;
	private Date expiryDate;
	
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd/MM/yyyy");
	}
	public Product(int product_id, String product_name, Date expiryDate) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", expiryDate=" + sdf.format(expiryDate)
				+ "]";
	}
	public boolean equals(Product obj) {
		return product_id==obj.product_id;
		//return false;
	}
	public int hashCode() {
		
		return product_id;
		
	}
	
}
