package validation;

import java.text.ParseException;
import java.util.Date;

import customeException.ProductValidateException;

import static com.app.core.Product.*;

public class Validation {

	public static Date validateDate(String date) throws ParseException, ProductValidateException {
		Date d1=new Date(01/01/1990);
		if(sdf.parse(date).after(d1)) {
			throw new ProductValidateException("Given date is before 01/01/1990 ");
		}
		return sdf.parse(date);
		
	}
}
