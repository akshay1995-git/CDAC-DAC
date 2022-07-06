package testCustomer;

import java.text.ParseException;
import java.util.Scanner;
import static validations.CustomerValidation.*;
import com.app.core.Customer;

import exceptions.CustomerHandlingException;

public class TestCustomer {

	/*
	 * public static Date convertDate(String date) throws ParseException { return
	 * sdf.parse(date); }
	 */

	public static void main(String[] args) throws CustomerHandlingException, ParseException {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a count of customer details...");
			Customer[] customers = new Customer[sc.nextInt()];
			int counter = 0;
			boolean flag = true;
			while (flag) {
				System.out.println(
						"Select Option: \n 1.Enter a customer detail. \n 2.Print the enter customer detail.\n 3.Exit From Loop");
				switch (sc.nextInt()) {

				case 1:
					System.out.println("Enter a customer deatil....name-email-password-ammount-date-Category");
					customers[counter++] = new Customer(sc.next(), emailValidation(customers, sc.next()),
							passValidation(sc.next()), ammountValidation(sc.nextDouble()), convertDate(sc.next()),
							convertCategory(sc.next()));

					break;
				case 2:
					for (Customer c : customers) {
						System.out.println(c);
					}
					break;
				case 3:
					flag = false;
					System.out.println("Succesfully Enter a Customer Detail...!!!");
				}
			}

		}
	}
}