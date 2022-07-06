package validation;

import java.text.ParseException;
import java.util.Date;
import customeException.StudentValidateException;
import static com.app.core.Student.sdf;
public class Validation {

	/*public static Date convertDate(String date) throws ParseException  {
		return sdf.parse(date);
		
	}*/
	//static Date d1=new Date();
	public static Date validateDate(String date) throws ParseException, StudentValidateException {
		Date d1=new Date();
		if(d1.before(sdf.parse(date)))
		return sdf.parse(date);
		throw new StudentValidateException("Registration Date is Not Before Current Date ");
	}
}

