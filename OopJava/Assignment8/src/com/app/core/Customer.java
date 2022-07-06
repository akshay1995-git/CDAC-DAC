package com.app.core;

import java.util.Date;

import java.text.SimpleDateFormat;
//import java.util.Date;
public class Customer {
	private String name;
	private String email;
	private String pass;
	private double ammount;
	private Date dob;

	private Category customerCategory;
	public static SimpleDateFormat sdf;
	
	static  {
		 sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	


	public Customer(String name, String email, String pass, double ammount, Date dob,Category customerCategory) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.ammount = ammount;
		this.dob = dob;
		this.customerCategory = customerCategory;
	}

	

	@Override
	public String toString() {
		return ("Name : " + this.name + " Email : " + this.email + " Password : " + this.pass + " Amount : "
				+ this.ammount + "Date : " + sdf.format(dob) + " Category : " + this.customerCategory);
	}

/*	public boolean equals(Object anotherdetail) {
		if (anotherdetail instanceof Customer) {
			return email.equals(((Customer) anotherdetail).email);
		} else {
			return false;
		}
*/
	public boolean equals(Object anotherdetail) {
		if (email.equals(((Customer) anotherdetail).email)) {
			return true;
		} else {
			return false;
		}
	}
}
