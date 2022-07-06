package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	private String title;
	private String authors;
	private Category type;
	private double price;
	private LocalDate publishDate;

	public Book(String title, String authors, Category type, double price, LocalDate publishDate) {
		super();
		this.title = title;
		this.authors = authors;
		this.type = type;
		this.price = price;
		this.publishDate = publishDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public Category getType() {
		return type;
	}

	public void setType(Category type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", authors=" + authors + ", type=" + type + ", price=" + price
				+ ", publishDate=" + publishDate + "]";
	}

	//@Override
	/*public String toString() {
		String info = String.format("%-15s %-10s %-10s %-10s %-10s", title, authors, type.toString(), price,
				publishDate.toString());
		return info.replace("[", "").replace("]", "");
	}*/

}
