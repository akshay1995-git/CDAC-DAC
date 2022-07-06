package utils;

import static java.time.LocalDate.parse;
import java.time.LocalDate;
import java.util.ArrayList;
import com.app.core.Volunteer;
import custom_exception.VolunteerHandlingException;
public class ValidationUtils {
	
	//DOB of volunteer should not less than 1-1-1990 while adding new record
	public static LocalDate validateDate(ArrayList<Volunteer> list , LocalDate date) throws VolunteerHandlingException{
			for(Volunteer v : list) {
			date = parse("1990-01-01");
			if(v.getDate().isAfter(date))
				throw new VolunteerHandlingException("DOB of volunteer should not less than 1-1-1990 ");
		}
		return date;
	}

	//		While volunteer with having same name and same DOB is not allowed.
	public static String validateInfo(ArrayList<Volunteer> list, String name , LocalDate date) throws VolunteerHandlingException{
		for(Volunteer v : list) {
			if(v.getvNAme().equals(name))
				if(v.getDate().equals(date))
					throw new VolunteerHandlingException("Two person cannot have same name and sam dob..!!(Duplicate Entry)");
		}
		return name;
	}
 
}
