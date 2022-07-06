package tester;

import com.app.core.Book;
import com.app.core.Category;

import customException.BookHandlingException;

import static com.app.core.Category.valueOf;


import static com.app.core.Book.sdf;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.HashMap;

public class TestBook {

	public static Category convertCategory(String course) {
		return valueOf(course.toUpperCase());
	}

	public static Date convertDate(String date) throws ParseException {
		return sdf.parse(date);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Book> listMap = new HashMap<>();
			boolean flag = true;
			while (flag) {
				System.out.println(
						"Options :\n1. Add Book in Liabrary.\n2. Display all Book.\n3. Issue out a book\n4. Return a book.\n5 .Remove Book."
								+ "\n6. Exit  ");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter a book title: ");
						String title = sc.next();
						if (listMap.containsKey(title)) {
							throw new BookHandlingException("Book Title is already is List...");
						} else {
							System.out.println("Enter a book Detail : Title-Category-Price-Date-Author Name-Quantity");
							Book e1 = new Book(title, convertCategory(sc.next()), sc.nextDouble(),
									convertDate(sc.next()), sc.next(), sc.nextInt());
							listMap.put(title, e1);
							System.out.println("Book data Successfully added...");
						}
						break;
					case 2:
						System.out.println(listMap);// Map's toString {k1:v1,k2:v2....}
						for (Book a : listMap.values())// Collection<BankAccount>
							System.out.println(a);

						break;
					case 3:
                    
						System.out.print("Enter title of book : ");
						String name1 = sc.next();
						 
						if(listMap.containsKey(name1)) {
							System.out.print("Enter quantity : ");
							int qnt = sc.nextInt();
							Book book = listMap.get(name1);
							if(book.getQuantity() == 0)
								throw new BookHandlingException("Book is not availble for now...");
							if(qnt > book.getQuantity()) {
								throw new BookHandlingException("Book quantity is larger than available books...");
							}
							System.out.println(name1 +" book quantity : "+(book.getQuantity()-qnt));
							book.setQuantity(book.getQuantity()-qnt);		
						}
						else {
							throw new BookHandlingException("Book not available in library");
						}
						break;
                              
					case 4:
						System.out.print("Enter title of book : ");
						String name2 = sc.next();
						System.out.print("Enter quantity : ");
						int qnt1 = sc.nextInt();
						if(listMap.containsKey(name2)) {
							Book book = listMap.get(name2);
							System.out.println(name2 +" book quantity : "+(book.getQuantity()+qnt1));
							book.setQuantity(book.getQuantity()+qnt1);	
						}
						else {
							throw new BookHandlingException("Book not available in library");
						}
						break;
					case 5:
						System.out.print("Enter title of book : ");
						String name3 = sc.next();
						System.out.println("Book removed : "+listMap.remove(name3));				
						break;
					case 6:
						flag=false;
						System.out.println("Thankyou for Visiting Book Store...!!!");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}
}
