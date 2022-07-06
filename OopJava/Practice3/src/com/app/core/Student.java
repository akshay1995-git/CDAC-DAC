package com.app.core;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
//	private String course; 
	private int age;
	private Date regDate;
	
	public static SimpleDateFormat sdf;
	static {
		//sdf=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		sdf=new SimpleDateFormat("dd/MM/yy");
	}
	static int counter=1;
	public Student(String name,int age, Date regDate) {
		super();
		this.name = name;
		this.id = counter++;
	//	this.course=course;
		this.age = age;
		this.regDate = regDate;
	}

	public Student(Date date) {
		
		this.regDate = date;
	}





	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id +", age=" + age + ", regDate=" + sdf.format(regDate) + "]";
	}

	

	public Date getRegDate() {
		return regDate;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In equals Method ");
		if(obj instanceof Student) {
			return id==(((Student)obj).id);
			
		}
		return false;	
	}
	@Override
	public int hashCode() {
		System.out.println("in hash code");
		
		return id;
		
	}
	
	
	
}
