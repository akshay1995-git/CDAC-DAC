package tester;

import java.util.HashMap;
import java.util.Scanner;
import com.app.core.*;
import static utils.IoUtils.*;

import static utils.CollectionUtils.populateMap;;

public class BookShop {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			HashMap<String, Book> bookMap = populateMap();
			boolean exit = false;
			CustomerCart cart = new CustomerCart();
			while (!exit) {
				System.out.println("1:View All books in shop\n2:Add book to cart\n3:Show added books incart\n4:check out(Exit)\n");
				switch (scan.nextInt()) {
				case 1:
					
					for (Book b : bookMap.values())
						System.out.println(b);
					break;

				case 2:
					System.out.println("Enter title of the book");
					String title = scan.next().toUpperCase();
					Book book = bookMap.get(title);
					if (book != null)
						cart.addToCart(book);
					else
						System.out.println("Book not Found!");
					break;
				case 3:
					System.out.println("cart item include:");
					cart.printCartItems();
					break;

				case 4:
					if (!cart.cartItems.isEmpty()) {
						cart.checkOutItems();
						System.out.println("enter file name:");
						boolean status = storeCart(cart.cartItems, scan.next());
						if (status) {
							System.out.println("Generator bill successfully");
							exit = true;
						}
					} else {
						System.out.println("Please add some books in the cart");
					}

					break;

				default:
					System.out.println("Invalid Input!!");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
