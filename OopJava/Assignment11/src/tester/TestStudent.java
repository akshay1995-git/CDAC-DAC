package tester;

import java.util.Date;
import java.util.ListIterator;

import static validationUtils.StudentValidation.convertCategory;
import static validationUtils.StudentValidation.convertDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//import java.util.Iterator;

import com.app.core.Student;
import static validationUtils.CollectionUtils.*;
import customException.StudentHandlingException;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Student> studList = new ArrayList<>();// size=0,capa=10
			studList = populatedData();
			System.out.println("AL contents ");
			for (Student s : studList)
				System.out.println(s);
			boolean flag = true;
			while (flag) {
				System.out.println(
						"Options \n1. Add a Student Details \n2. Fetch the perticular Student Detail \n3.  Display all Student Detail."
								+ "\n4. Removing Student Detail. \n5. Update GPA of Student\n6. Get data before some Date\n7. Sort According to ID  "
								+ "\n8. Sort According GPA\n9.Sort as per course and GPA\n10. Remove Fail Student \n"
								+ "11. Display details of the student in reverse order.\n12. Exit from App.\\n");
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
							// int index = studList.indexOf(sd1);
							studList.remove(sd1);
							System.out.println("Student Detail Removed SuccessFully...!!!");
						} else {
							throw new StudentHandlingException(
									"ID is not matching to cancel the student Detail,with all student detail");
						}
						break;
					case 5:
						System.out.println("Enter a ID of student to update GPA of student- ");
						Student sd2 = new Student(sc.next());
						if (studList.contains(sd2)) {
							System.out.println("Enter a newly GPA of given student ...");
							double newGPA = sc.nextDouble();
							studList.get(studList.indexOf(sd2)).setGpa(newGPA);
							// method chaining get method return value of given index and from that value
							// update the GPA of Student
							System.out.println("Sudent GPA updated SuccessFully...!!!");
							// System.out.println(studList.get(studList.indexOf(sd2)));
						} else {
							throw new StudentHandlingException(
									"ID is not matching to update Student GPA ,with all student detail");
						}
						break;
					case 6:
						System.out.println("Enter a date to fetch student list who enrolled course before the date: ");
						Date inputdate = convertDate(sc.next());
						for (Student s : studList) {
							if (s.getDob().before(inputdate)) {
								System.out.println("Name : " + s.getName() + "-" + s.getCourse());
							}
						}
						break;
					case 7:
						// Sort student details as per asc order of PRN ,
						Collections.sort(studList);// compareTo method call which inherit from comparable
						break;
					case 8:
						// Sort student details as per desc / asc GPA , using custom ordering
						Collections.sort(studList, new Comparator<Student>() {// ano inner cls begin
							@Override
							public int compare(Student s1, Student s2) {
								System.out.println("in compare : by GPA in Student");
								if (s1.getGPA() > s2.getGPA()) {
									return 1;
								}
								if (s1.getGPA() < s2.getGPA()) {
									return -1;
								} else {
									return 0;
								}

							}
						});
						/*
						 * Collections.sort(studList,new Comparator<Student>() {
						 * 
						 * @Override public int compare(Student o1, Student o2) { // TODO Auto-generated
						 * method stub return 0; }
						 * 
						 * });
						 */
						break;
					case 9:
						Collections.sort(studList, new Comparator<Student>() {// ano inner cls begin
							@Override
							public int compare(Student s3, Student s4) {
								System.out.println("in compare : by GPA & course in Student");
								if (s3.getCourse().equals(s4.getCourse())) {
									return (int) (s3.getGPA() - s4.getGPA());
								} else {
									return s3.getCourse().compareTo(s4.getCourse());
								}
							}

						});

						/*
						 * int compResult= this.empName.compareTo(e2.empName); if(compResult == 0) {
						 * return this.salary >= e2.salary ? 1 : -1; }
						 * 
						 */
						break;
					case 10:

						ListIterator<Student> iterator = studList.listIterator();
						while (iterator.hasNext()) {
							Student x = iterator.next();
							if (x.getGPA() < 5.5) {

								System.out.println("Failed Student : " + x.getName() + " with " + x.getGPA());
							}
						}

						break;
					case 11:
						// Display details of the student in reverse order.
						Collections.reverse(studList);
						break;
					case 12:
						flag = false;
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
