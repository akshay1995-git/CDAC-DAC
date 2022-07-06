package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
private String id;
private String name;
private String email;
private String password;
private CourseCategory course;
private double gpa;
private Date dob;

public static SimpleDateFormat sdf;

static  {
	 sdf=new SimpleDateFormat("dd-MM-yyyy");
}

public Student(String id, String name, String email, String password, CourseCategory course, double gpa, Date dob) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.course = course;
	this.gpa = gpa;
	this.dob = dob;
}

public Student(String id) {
	// TODO Auto-generated constructor stub
	this.id=id;
}


public void setGpa(double gpa) {
	this.gpa = gpa;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gpa=" + gpa+" Course="+course
			+ ", dob=" +  sdf.format(dob)+ "]";
}


@Override
public boolean equals(Object obj) {
	if(obj instanceof Student) {
		return this.id.equals(((Student)obj).id);
	}
	return false;
}


}
