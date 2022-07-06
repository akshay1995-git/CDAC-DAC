package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
private String title;
private Category course;
private double price;
private Date date;
private String authorName;
private int quantity;

public static SimpleDateFormat sdf;

static  {
	 sdf=new SimpleDateFormat("dd-MM-yyyy");
}


/*@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}
*/
public Book(String title, Category course, double price, Date date, String authorName, int quantity) {
	super();
	this.title = title;
	this.course = course;
	this.price = price;
	this.date = date;
	this.authorName = authorName;
	this.quantity = quantity;
}

@Override
public String toString() {
	return "Book [title=" + title + ", course=" + course + ", price=" + price + ", date=" + date + ", authorName="
			+ authorName + ", quantity=" + quantity + "]";
}
@Override
public boolean equals(Object obj) {
	System.out.println("In equals Method ");
	if(obj instanceof Book) {
		return title.equals(((Book)obj).title);
		
	}
	return false;	
}
@Override
public int hashCode() {
	System.out.println("in hash code");
	
	return title.hashCode();
	
}

}
