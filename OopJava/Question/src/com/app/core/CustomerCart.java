package com.app.core;

import java.util.ArrayList;

public class CustomerCart {
	
	public ArrayList<Book> cartItems = new ArrayList<Book>();
	
	public void addToCart(Book book)
	{
        cartItems.add(book);
        System.out.println("Added!!");
    }
	
	public void printCartItems() 
	{
		System.out.println("Title and price");
		for(Book b: cartItems)
		{
			System.out.println(b.getTitle()+"  "+b.getPrice());
		}   
	}
	
	public void checkOutItems()
	{
		if(!cartItems.isEmpty())
		{
		double total = 0;
		for (Book book: cartItems)
		{
			total += book.getPrice();
		}
		System.out.println("Hey, Thanks for shopping at BookWorld! Your cart contents,");
		for(Book b: cartItems)
		{
			System.out.println(b);
		} 
		System.out.println("Items Total:"+total+"\nWill be deliverd to you in 7 working days!!");
		
		}else
			 System.out.println("Cart is empty..");
	}

}
