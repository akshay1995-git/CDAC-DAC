package validationUtils;

import java.text.ParseException;
import java.util.ArrayList;
import static validationUtils.StudentValidation.*;
import com.app.core.Student;
import static com.app.core.CourseCategory.*;

public class CollectionUtils {
	

public static ArrayList<Student> populatedData(){
	ArrayList<Student> studList=new ArrayList<>();
	try {
		studList.add(new Student("101","Akshay","akshay@gmail.com","akshay",ANGULAR,9.34,convertDate("28-5-1995")));
		studList.add(new Student("103","Akash","akash@yahoo.com","akash",REACT,10.6,convertDate("23-5-2000")));
		studList.add(new Student("102","Rohan","rohan@facebook.com","rohan",DBT,5.2,convertDate("8-8-1995")));
		studList.add(new Student("105","Akshay","sagar@gmail.com","sagar",HIBERNATE,4.69,convertDate("12-5-2012")));
		studList.add(new Student("104","Rahul","rahul@hotmaill.com","rahul",SPRING,7.84,convertDate("8-12-1999")));
	}
catch(ParseException e)
	{
	System.out.println("err in sample data " + e);
}
	return studList;

}}
