package tester;

import java.util.ArrayList;
import java.util.Scanner;
import static validationUtils.StudentValidation.*;
import com.app.core.Student;

import customException.StudentHandlingException;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Student> studList = new ArrayList<>();// size=0,capa=10
			System.out.println("AL contents ");
			for (Student s : studList)
				System.out.println(s);
			boolean flag = true;
			while (flag) {
				System.out.println(
						"Options \n1. Add a Student Details \n2. Fetch the perticular Student Detail \n 3.  Display all Student Detail."
								+ "\n 4. Removing Student Detail. \n 5. Update GPA of Student \n6. Exit from App");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(" Enter a Student  id-name-email-password-course-gpa-dob...!!!");
						studList.add(new Student(sc.next(), sc.next(), sc.next(), sc.next(), convertCategory(sc.next()),
								sc.nextDouble(), convertDate(sc.next())));
						System.out.println("Student detail updated Successfully...!!!");
						break;
					case 2:
						System.out.println("Enter a ID of student to fetch details- ");
						Student sd = new Student(sc.next());
						if (studList.contains(sd)) {
							int index = studList.indexOf(sd);
							System.out.println(studList.get(index));
						} else {
							throw new StudentHandlingException("ID is not matching with all student detail");
						}
						break;
					case 3:
						for (Student d : studList) {
							System.out.println(d);
						}
						break;
					case 4:
						System.out.println("Enter a ID of student to cancel details of student- ");
						Student sd1 = new Student(sc.next());
						if (studList.contains(sd1)) {
							//int index = studList.indexOf(sd1);
							studList.remove(sd1);
							System.out.println("Student Detail Removed SuccessFully...!!!");
						} else {
							throw new StudentHandlingException("ID is not matching to cancel the student Detail,with all student detail");
						}
						break;
					case 5:
						System.out.println("Enter a ID of student to update GPA of student- ");
						Student sd2 = new Student(sc.next());
						if (studList.contains(sd2)) {
							System.out.println("Enter a newly GPA of given student ...");
							double newGPA= sc.nextDouble();
							studList.get(studList.indexOf(sd2)).setGpa(newGPA);
						//method chaining get method return value of given index and from that value update the GPA of Student
							System.out.println("Sudent GPA updated SuccessFully...!!!");
							//System.out.println(studList.get(studList.indexOf(sd2)));
						}
						else {
							throw new StudentHandlingException("ID is not matching to update Student GPA ,with all student detail");
						}
                          break;
					case 6:
						 flag=false;
						 System.out.println("Exit From Student App SuccessFully...!!!");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

	}
}
//ab101 akshay akshay@gmail.com asdfg react 9.45 23-3-1995
//ab103 parth  parth@gmail.com asdfg react 7.45 13-3-1993
//ab102 akash akash@gmail.com asdfg react 8.5 12-3-1995
//
