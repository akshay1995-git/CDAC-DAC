package validations;

import static com.app.core.Category.valueOf;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.app.core.Category;
import com.app.core.Customer;

import exceptions.CustomerHandlingException;

import static com.app.core.Customer.*;
public class CustomerValidation {
	private static Date checkDate;
	static {
		try {
			checkDate = sdf.parse("1-1-2010");
		} catch (ParseException e) {
			System.out.println("Error in static init block " + e);
		}
	}
	
	/*public static String emailValidation(Customer[] customerArr, String email) throws CustomerHandlingException {
		// Customer testCustomer=new Customer(customerArr);
		for (Customer c : customerArr) {
			if (c != null) {
				if (c.equals(email))
					throw new CustomerHandlingException("Duplicate email is  detected!!!!!!");
				else {
				if (email.contains("@") && email.endsWith(".com")) {
					return email;
				} else {
					throw new CustomerHandlingException("Invalid Email");
				}
				}
			}
		}
		return email;
		
	}*/
	@SuppressWarnings("unlikely-arg-type")
	public static String emailValidation(Customer[] customerArr, String email) throws CustomerHandlingException {
		// Customer testCustomer=new Customer(customerArr);
		for (Customer c : customerArr) {
			if (c != null) {
				if(email.contains("@") && email.endsWith(".com")) {
					if(!(c.equals(email))) {
						return email;
					}
				}
				 else {
						throw new CustomerHandlingException("Invalid Email");
					}
			}
		}
		return email;
	}

//...................................................................................................................................
	public static String passValidation(String pass) throws CustomerHandlingException {
		if ((pass.length() > 4) && (pass.length() < 10)) {
			return pass;
		} else {
			throw new CustomerHandlingException("Please Enter a valid password");
		}
	}

//..........................................................................................................................................
	public static double ammountValidation(double ammount) throws CustomerHandlingException {
		if (ammount % 500 == 0) {
			return ammount;
		} else {
			throw new CustomerHandlingException("Please Enter a valid amount");
		}
	}

	// ...........................................................................................................................................
/*	public static Date dateValidation(Date dob) throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
		Date checkDate = d.parse("01-01-1995");
		
		if (dob.after(checkDate)) {
			return dob;
		} else {
			throw new ParseException("Date is not  Validated SuccessFully...!!!", 0);
		}
	}*/
	// .............................................................................................................................................

	public static Category convertCategory(String category) {
		return valueOf(category.toUpperCase());
	}

	public static Date convertDate(String date) throws ParseException, CustomerHandlingException {
	//	return sdf.parse(date);
		Date d1 = sdf.parse(date);// conversion
		if (d1.before(checkDate))
			throw new CustomerHandlingException("Invalid Date...");
		// valid date => return parsed n validated date to the caller
		return d1;
	}



}
