package com.app.core;

import category.Category;

public class Student {
private  int id;
private String name;
private String email;
private String phno;
private Category course;
private double  marks;
public  Student(int id, String name, String email, String phno, Category course, double marks) {

	this.id = id;
	this.name = name;
	this.email = email;
	this.phno = phno;
	this.course = course;
	this.marks = marks;
}
public Student(String email) {
	this.email=email;
}
public Student(int id) {
	this.id=id;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + ", marks=" + marks + ",Course="+course+"]";
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public boolean equals(Object obj) {
	if(obj instanceof Student) {
		return id==((Student)obj).id;
		
	}
	return false;
	
}

/*public boolean equals(Student obj) {
	if(obj instanceof Student) {
	return email.equals(((Student)obj).email);
	}
	return false;
}*/
public String getEmail() {
	return email;
}


}
