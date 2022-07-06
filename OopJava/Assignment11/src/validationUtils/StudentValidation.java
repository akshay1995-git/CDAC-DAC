package validationUtils;
import static com.app.core.CourseCategory.valueOf;
import static com.app.core.Student.sdf;

import java.text.ParseException;
import java.util.Date;

import com.app.core.CourseCategory;

public class StudentValidation {
	public static CourseCategory convertCategory(String course) {
		return valueOf(course.toUpperCase());
	}
	public static Date convertDate(String date) throws ParseException
	{
		return sdf.parse(date);
	}
}
