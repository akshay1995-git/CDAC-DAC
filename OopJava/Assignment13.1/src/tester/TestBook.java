package tester;
import java.util.HashSet;

import com.app.core.Book;
import com.app.core.Category;


import static com.app.core.Category.valueOf;
import static com.app.core.Book.sdf;
import java.text.ParseException;

import java.util.Date;
import java.util.Scanner;



public class TestBook {
	public static class StudentValidation {
		public static Category convertCategory(String course) {
			return valueOf(course.toUpperCase());
		}
		public static Date convertDate(String date) throws ParseException
		{
			return sdf.parse(date);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			HashSet<Book> list = new HashSet<>();// size=0,capa=10
			for(int i=1;i<3;i++) {
				System.out.println("Enter a "+i+"Book Detail : ");
				Book e1=new Book(sc.next(),convertCategory(sc.next()),sc.nextDouble(),convertDate(sc.next()),sc.next(),sc.nextInt());
			list.add(e1);
			System.out.println("Book data Successfully added...");
			}
			System.out.println(list);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	}
}
