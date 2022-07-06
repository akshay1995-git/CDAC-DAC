package com.app.core;
import java.time.LocalDate;
public class Library {
	
	//Book details : title(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
	private String title;
	private Category ctype;
	private double price;
	private LocalDate publishDate;
	private String authorName;
	private int quantity;
	
	public Library(String title, Category ctype, double price, LocalDate publishDate, String authorName, int quantity) {
		super();
		this.title = title;
		this.ctype = ctype;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Library [Title=" + title + ", Category=" + ctype + ", Price=" + price + ",PublishvDate=" + publishDate
				+ ", Author Name=" + authorName + ", Quantity=" + quantity + "]";
	}
	
	public String getTitle() {
		return title;
	}
	public Category getCtype() {
		return ctype;
	}
	public double getPrice() {
		return price;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public String getAuthorName() {
		return authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCtype(Category ctype) {
		this.ctype = ctype;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		return title.hashCode();
	}
	
	//Unique ID : book title	
}
